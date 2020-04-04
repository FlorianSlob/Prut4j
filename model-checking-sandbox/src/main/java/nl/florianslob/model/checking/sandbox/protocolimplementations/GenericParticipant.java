package nl.florianslob.model.checking.sandbox.protocolimplementations;

import java.util.*;

public class GenericParticipant {

    private static int depth = 0;
    private static int maxDepth = 99;
    private GenericParticipantAction currentExecutingAction;

    private static boolean maxDepthReached(){
        depth++;
        if(depth > maxDepth){
            return true;
        }
        return false;
    }

    private Set<GenericParticipantAction> StartupActions = new HashSet<>();
    private Map<Class,Set<GenericParticipantAction>> AfterReceiveActionsPerMessageClass = new HashMap<>();
    private Map<GenericParticipantAction,Set<GenericParticipantAction>> AfterSendActionsPerSendAction = new HashMap<>();

    private Random random = new Random();
    public GenericParticipantAction getRandomActionFromSet(Set<GenericParticipantAction> setWithPossibleActions){
        int size = setWithPossibleActions.size();
        int item = random.nextInt(size); // In real life, the Random object should be rather more shared than this
        int i = 0;
        for(GenericParticipantAction action : setWithPossibleActions)
        {
            if (i == item)
                return action;
            i++;
        }
        return null;
    }

    public void run(IEnvironment environment) throws Exception {
        this.currentExecutingAction = getRandomActionFromSet(StartupActions);
        while(true) {
            if(maxDepthReached()){
                return;
            }
            executeAction(environment);
        }
    }

    // chose for a non recursive implementation, otherwise we will encouter stack overflow exceptions.
    private void executeAction(IEnvironment environment) throws Exception {

        if(this.currentExecutingAction.type == GenericParticipantActionType.SEND){
            System.out.println("Sending message from "+environment.getName()+" to "+this.currentExecutingAction.message.receiver);
            environment.send(this.currentExecutingAction.message);
            var actionSet = AfterSendActionsPerSendAction.get(this.currentExecutingAction);

            if(actionSet != null && actionSet.size() > 0){
                // Set action to execute next.
                this.currentExecutingAction = getRandomActionFromSet(actionSet);
                return;
            }
        }

        if(this.currentExecutingAction.type == GenericParticipantActionType.RECEIVE){
            System.out.println("Receiving message in "+environment.getName());
            ProtocolMessage protocolMessage = (ProtocolMessage) environment.receive();
            var actionSet = AfterReceiveActionsPerMessageClass.get(protocolMessage.message.getClass());

            if(actionSet != null && actionSet.size() > 0){
                this.currentExecutingAction = getRandomActionFromSet(actionSet);
                return; // Yes keeping it here, we really don't want further execution.
            }
        }
    }

    public void AddStartupAction(GenericParticipantAction action) {
        StartupActions.add(action);
    }

    public void AddAfterReceiveActions(Class<Move> moveClass, GenericParticipantAction afterReceiveAction) {
        Set<GenericParticipantAction> afterReceiveActions =  AfterReceiveActionsPerMessageClass.get(moveClass);
        if(afterReceiveActions ==  null){
            afterReceiveActions = new HashSet<>();
            AfterReceiveActionsPerMessageClass.put(moveClass, afterReceiveActions);
        }

        afterReceiveActions.add(afterReceiveAction);
    }

    public void AddAfterSendAction(GenericParticipantAction sendAction, GenericParticipantAction afterSendAction) {
        Set<GenericParticipantAction> afterSendActions =  AfterSendActionsPerSendAction.get(sendAction);
        if(afterSendActions ==  null){
            afterSendActions = new HashSet<>();
            AfterSendActionsPerSendAction.put(sendAction, afterSendActions);
        }

        afterSendActions.add(afterSendAction);
    }
}
