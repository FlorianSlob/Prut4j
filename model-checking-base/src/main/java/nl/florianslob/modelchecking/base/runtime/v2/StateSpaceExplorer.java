package nl.florianslob.modelchecking.base.runtime.v2;

import com.rits.cloning.Cloner;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;

import java.util.*;

public class StateSpaceExplorer {
    private final IProtocol protocolUnderVerification;
    private List<StateSpaceExploringAction> exploringActions = new ArrayList<>();
    private HashMap<String, StateSpaceExploringThread> threadPerParticipant = new HashMap<>();

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

        this.exploringActions = StateSpaceExplorerHelper.getExploringActions(protocolUnderVerification);
        System.out.println("Logging all available state space exploring actions: ");

        for (var exploringAction : this.exploringActions) {
            exploringAction.Print();
        }

        this.threadPerParticipant = StateSpaceExplorerHelper.startExploringThreads(this.protocolUnderVerification);

        try {
            travelStateSpace(this.protocolUnderVerification);
        } catch (Exception e) {
            e.printStackTrace();
        }

   }
    private final Set<TriedTransactionTuple> allTriedTransactions = new HashSet<>();

    // Simple Cycle detection to travel the whole protocol automaton
    private boolean detectCycle(int stateId, StateSpaceExploringAction exploringAction, String threadName) {
        var newTriedTransactionTuple = new TriedTransactionTuple(stateId, exploringAction, threadName);

        if (allTriedTransactions.stream().anyMatch(triedTransactionTuple -> triedTransactionTuple.equals(newTriedTransactionTuple))) {
            return true;
        }

        allTriedTransactions.add(newTriedTransactionTuple);

        return false;
    }



    private void travelStateSpaceGuided(IProtocol startingProtocolCopy, LtlState currentLtlState) throws Exception {

        // Try all outgoing transactions for the current ltl state
        for(var transition : currentLtlState.OutgoingTransactions){
            for (var exploringAction : getPossibleExploringActions(transition)){
                var threadName = exploringAction.participant; // TODO is this correct??
                // We have selected an action to explore (a possible transaction on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                if (!detectCycle(startingProtocolCopy.getState(), exploringAction, threadName)) {
                    System.out.println("Trying transaction from state " + startingProtocolCopy.getState());
                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = threadPerParticipant.get(threadName);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<IProtocol> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transaction in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        var protocolStateAfterTransaction = optionalResultProtocol.get();
                        System.out.println("Took transaction from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransaction.getState());
                        // Call recursively to travel the whole protocol
                        travelStateSpaceGuided(protocolStateAfterTransaction, transition.ltlTargetState);
                    }
                }
            }
        }
   }

    private List<StateSpaceExploringAction> getPossibleExploringActions(LtlTransition transition) {
        return null;
    }

    private void travelStateSpace(IProtocol startingProtocolCopy) throws Exception {

        // We will try all available actions for every available threadNames (participants)
        for (var threadName : this.protocolUnderVerification.threadNames()) {
            for (var exploringAction : this.exploringActions) {
                // We have selected an action to explore (a possible transaction on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                if (!detectCycle(startingProtocolCopy.getState(), exploringAction, threadName)) {
                    System.out.println("Trying transaction from state " + startingProtocolCopy.getState());
                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = threadPerParticipant.get(threadName);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<IProtocol> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transaction in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        var protocolStateAfterTransaction = optionalResultProtocol.get();
                        System.out.println("Took transaction from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransaction.getState());
                        // Call recursively to travel the whole protocol
                        travelStateSpace(protocolStateAfterTransaction);
                    }
                }
            }
        }
    }
}
