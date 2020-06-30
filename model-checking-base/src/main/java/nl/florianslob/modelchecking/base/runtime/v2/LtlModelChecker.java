package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;

import java.util.HashMap;
import java.util.List;

public class LtlModelChecker {

    private IProtocol protocol;
    private List<LtlState> initialStatesForNegatedFormula;
    private List<StateSpaceExploringAction> exploringActions;
    private HashMap<String, StateSpaceExploringThread> threadPerParticipant;

    public LtlModelChecker(IProtocol protocolUnderVerification){

        this.protocol = protocolUnderVerification;
    }

    public boolean CheckProtocolForLtlFormula(String ltlFormulaString){

        this.initialStatesForNegatedFormula = OwlHelper.GetInitialLtlStatesForFormula(ltlFormulaString, true);

        var hasAcceptingCycles = CheckForAcceptingCycles();

        return !hasAcceptingCycles;
    }

    private boolean CheckForAcceptingCycles() {
        System.out.println("Participants: ");
        for (var threadName : protocol.threadNames()) {
            System.out.println(threadName);
        }

        System.out.println("Dummy objects: ");
        for (var dummy : protocol.dummies()) {
            System.out.println(dummy);
        }

        this.exploringActions = StateSpaceExplorerHelper.getExploringActions(protocol);
        for (var exploringAction : exploringActions) {
            exploringAction.Print();
        }

        this.threadPerParticipant = StateSpaceExplorerHelper.startExploringThreads(protocol);

        try {
            return executeModelCheckingAlgorithm();
        } catch (Exception e) {
            e.printStackTrace();

            // TODO what should we do here? Throw the exception?
            return true;
        }
    }

    private boolean executeModelCheckingAlgorithm() throws Exception {
        for (var ltlStateNode :                this.initialStatesForNegatedFormula) {
            var result = executeModelCheckingAlgorithmRecursively(this.protocol, ltlStateNode);
            if(result){
                return true;
            }
        }
        // none of the paths starting in an initial state found an accepting cycle.
        return false;
    }

    private boolean executeModelCheckingAlgorithmRecursively(IProtocol protocol, LtlState ltlStateNode) throws Exception {
        // TODO Detect cycle!

        for (var transaction :
                ltlStateNode.OutgoingTransactions) {

            // Detect cycle with: transaction, protocolClone.state, ltlStateNode
            var action = GetDummyActionForTransaction();
            var protocolClone = StateSpaceExplorerHelper.deepClone(protocol);

            var threadToExecuteAction = GetThreadForAction(action);
            threadToExecuteAction.SetProtocolClone(protocolClone);
            var optionalUpdatedProtocol = threadToExecuteAction.ExecuteAction(action);

            if(optionalUpdatedProtocol.isPresent()){
                // Add to cycle detection: transaction, protocolClone.state, ltlStateNode

                var updatedProtocol = optionalUpdatedProtocol.get();
                // Apply recursively
                if(executeModelCheckingAlgorithmRecursively(updatedProtocol, transaction.ltlTargetState)){
                    return true;
                }
            }else{
                // stop execution
            }


        }

        return false;
    }

    private StateSpaceExploringThread GetThreadForAction(StateSpaceExploringAction action) {
        return this.threadPerParticipant.get(action.participant);
    }

    private StateSpaceExploringAction GetDummyActionForTransaction() {
        return this.exploringActions.get(0);// TODO Don't return something random!
    }
}
