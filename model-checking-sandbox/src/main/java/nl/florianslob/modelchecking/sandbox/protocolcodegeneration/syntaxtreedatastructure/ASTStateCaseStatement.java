package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.*;
import java.util.stream.Collectors;

public class ASTStateCaseStatement extends SyntaxTreeItemBase<ASTStateCaseStatement> {
    public int stateIdCondition;
    public List<ASTEnvironmentActionFromState<?>> actionsFromState = new LinkedList<>();

    public boolean isInLocalType = false;

    public ASTStateCaseStatement(ISyntaxWriter<ASTStateCaseStatement> syntaxWriter, int stateIdCondition){
        super(syntaxWriter);
        this.stateIdCondition = stateIdCondition;
    }

    public void addAction(ASTEnvironmentActionFromState<?> actionFromState){
        // Only add action if it is not already present in the list.
        var existingActionFromState
                = actionsFromState.stream().filter(a -> a.equals(actionFromState)).findAny();
        if(existingActionFromState.isEmpty()){
            actionsFromState.add(actionFromState);
        }
    }

    public void FillAllNextStatesForLocalType(List<ASTStateCaseStatement> allStateCaseStatements, Set<Set<Integer>> combinedLocalStates){
        for (var actionFromState: actionsFromState
             ) {
            var nextState =
                    allStateCaseStatements
                            .stream()
                            .filter(state -> state.stateIdCondition == actionFromState.nextStateId)
                            .findFirst()
                            .get();

            HashSet<Integer> visitedStates = new HashSet<>();

            String sendingMessageType = "";
            if(actionFromState.getClass() == ASTSendAction.class){
                sendingMessageType = ((ASTSendAction) actionFromState).messageContentType;
            }
            // recursively get all possible next global states that are also in the local state.
            var nextStatesForLocalTypeForAction = nextState.FindAllPossibleGlobalStateIdsForLocalType(allStateCaseStatements, visitedStates, sendingMessageType);
            combinedLocalStates.add(nextStatesForLocalTypeForAction);

            actionFromState.allNextStatesForLocalType.addAll(nextStatesForLocalTypeForAction);
        }
    }

    public Set<Integer> FindAllPossibleGlobalStateIdsForLocalType(List<ASTStateCaseStatement> allStateCaseStatements, Set<Integer> visitedStates, String sendingMessageType) {
    // return directly to prevent nesting.
        if(visitedStates.contains(this.stateIdCondition)){
            return new HashSet<>();
        }

        visitedStates.add(this.stateIdCondition);

        var returnList = new HashSet<Integer>();
        if(isInLocalType){
            returnList.add(this.stateIdCondition);
        }

        for (var localAction: this.actionsFromState.stream().filter(a -> a.isLocalAction).collect(Collectors.toList())) {
            if(localAction.getClass() == ASTReceiveAction.class){
                ((ASTReceiveAction) localAction).messageContentType = sendingMessageType;
            }
        }

        for (var actionFromState: this.actionsFromState.stream().filter(a -> !a.isLocalAction).collect(Collectors.toList())) {

            var nextStateOptional =
                    allStateCaseStatements
                            .stream()
                            .filter(state -> state.stateIdCondition == actionFromState.nextStateId)
                            .findFirst();

            if(actionFromState.getClass() == ASTSendAction.class){
                 sendingMessageType = ((ASTSendAction) actionFromState).messageContentType;
            }

            if(nextStateOptional.isPresent()){
                var nextState = nextStateOptional.get();
                returnList.addAll(nextState.FindAllPossibleGlobalStateIdsForLocalType(allStateCaseStatements, visitedStates, sendingMessageType));
            }
        }
        return returnList;
    }

}
