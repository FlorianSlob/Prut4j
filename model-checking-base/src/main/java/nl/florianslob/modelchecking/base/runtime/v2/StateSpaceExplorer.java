package nl.florianslob.modelchecking.base.runtime.v2;

import com.rits.cloning.Cloner;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

import java.util.*;

public class StateSpaceExplorer {
    private final IProtocol protocolUnderVerification;
    private final List<StateSpaceExploringAction> exploringActions = new ArrayList<>();
    private final HashMap<String, StateSpaceExploringThread> threadPerParticipant = new HashMap<>();

    public StateSpaceExplorer(IProtocol protocolUnderVerification) {

        this.protocolUnderVerification = protocolUnderVerification;
    }

    public void ExploreStateSpace() {
        
        // TODO How do we visualize the results?
        
        System.out.println("Starting to explore state space for protocol. ");
        System.out.println("Logging Participants: ");

        for (var threadName : this.protocolUnderVerification.threadNames()) {
            System.out.println(threadName);
        }

        System.out.println("Logging Dummy objects: ");
        for (var dummy : this.protocolUnderVerification.dummies()) {
            System.out.println(dummy);
        }

        fillExploringActions();
        System.out.println("Logging all available state space exploring actions: ");

        for(var exploringAction: this.exploringActions){
            exploringAction.Print();
        }
        
        startExploringThreads();

        try {
            travelStateSpace(this.protocolUnderVerification);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void fillExploringActions() {
        for (var threadName : this.protocolUnderVerification.threadNames()) {
            // Add all receive and send actions for every dummy
            for (var dummy : this.protocolUnderVerification.dummies()) {
                exploringActions.add(StateSpaceExploringAction.CreateReceiveStateSpaceExploringAction(threadName,dummy.getClass()));
                exploringActions.add(StateSpaceExploringAction.CreateSendStateSpaceExploringAction(threadName, dummy));
            }
        }
    }

    private void startExploringThreads() {
        for (var threadName : this.protocolUnderVerification.threadNames()) {
            threadPerParticipant.put(threadName,new StateSpaceExploringThread(threadName));
        }
    }

    private final Set<TriedTransactionTuple> allTriedTransactions = new HashSet<>();

    // Simple Cycle detection to travel the whole protocol automaton
    private boolean detectCycle(int stateId, StateSpaceExploringAction exploringAction, String threadName){
        var newTriedTransactionTuple = new TriedTransactionTuple(stateId, exploringAction, threadName);

        if(allTriedTransactions.stream().anyMatch(triedTransactionTuple -> triedTransactionTuple.equals(newTriedTransactionTuple))){
            return true;
        }

        allTriedTransactions.add(newTriedTransactionTuple);

        return false;
    }


    private void travelStateSpace(IProtocol startingProtocolCopy) throws Exception {

        for (var threadName : this.protocolUnderVerification.threadNames()) {
            for(var exploringAction: this.exploringActions){
                if(!detectCycle(startingProtocolCopy.getState(), exploringAction, threadName)) {
                    System.out.println("Trying transaction from state " + startingProtocolCopy.getState());
                    exploringAction.Print();

                    var thread = threadPerParticipant.get(threadName);
                    thread.SetProtocolClone(deepClone(startingProtocolCopy));
                    Optional<IProtocol> optionalResultProtocol = thread.ExecuteAction(exploringAction);

                    if (optionalResultProtocol.isPresent()) {
                        var protocolStateAfterTransaction = optionalResultProtocol.get();
                        System.out.println("Took transaction from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransaction.getState());
                        // Call recursive to travel the whole protocol
                        travelStateSpace(protocolStateAfterTransaction);
                    }
                }
            }
        }
    }

    private IProtocol deepClone(IProtocol protocol){

        Cloner cloner=new Cloner();
        return cloner.deepClone(protocol);
    }
}
