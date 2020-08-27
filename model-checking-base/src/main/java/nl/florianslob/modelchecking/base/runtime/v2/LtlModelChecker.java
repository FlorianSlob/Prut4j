package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;

import java.util.*;

public class LtlModelChecker {
    private final IProtocol protocolUnderVerification;
    private List<StateSpaceExploringAction> exploringActions = new ArrayList<>();
    private List<LtlState> initialStatesForNegatedFormula;

    public LtlModelChecker(IProtocol protocolUnderVerification) {
        this.protocolUnderVerification = protocolUnderVerification;
    }

    public boolean CheckProtocolForLtlFormula(String ltlFormulaString) {
        this.initialStatesForNegatedFormula = OwlHelper.GetInitialLtlStatesForFormula(ltlFormulaString, true);
        var hasAcceptingCycles = CheckForAcceptingCycles();
        return !hasAcceptingCycles;
    }

    private boolean CheckForAcceptingCycles() {
        System.out.println("Participants: ");
        for (var threadName : protocolUnderVerification.threadNames()) {
            System.out.println(threadName);
        }

        System.out.println("Dummy objects: ");
        for (var dummy : protocolUnderVerification.dummies()) {
            System.out.println(dummy);
        }

        this.exploringActions = StateSpaceExplorerHelper.getExploringActions(protocolUnderVerification);
        for (var exploringAction : exploringActions) {
            exploringAction.Print();
        }

        try {
            return executeModelCheckingAlgorithm();
        } catch (Exception e) {
            e.printStackTrace();

            // TODO what should we do here?
            return false;
        }
    }

    private boolean executeModelCheckingAlgorithm() throws Exception {
        for (var ltlStateNode : this.initialStatesForNegatedFormula) {
            var result =
                    travelStateSpaceGuided(this.protocolUnderVerification, ltlStateNode);
            if (result) {
                return true;
            }
        }
        // none of the paths starting in an initial state found an accepting cycle.
        return false;
    }

    private boolean travelStateSpaceGuided(IProtocol startingProtocolCopy, LtlState currentLtlState) throws Exception {
        // Try all outgoing transitions for the current ltl state
        for (var transition : currentLtlState.OutgoingTransitions) {
            for (var exploringAction : StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,this.exploringActions)) {
                // We have selected an action to explore (a possible transition on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, exploringAction.participant);
//                if (!detectCycle(newTriedTransitionTuple,allTriedTransitions)) {
                    System.out.println("Trying transition from state " + startingProtocolCopy.getState());
                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = GetThreadForAction(exploringAction);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<IProtocol> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transition in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        if (detectCycle(newTriedTransitionTuple,allTriedTransitions)) {
                            System.out.println("Detected cycle in state " + startingProtocolCopy.getState());
                            System.out.println("Starting inner cycle");

                            // We detected a transition that has been taken before.
                            var resultFromCycle2 = doCycleDetectionPhaseTwo(currentLtlState, transition, exploringAction, startingProtocolCopy);
                            // Case where we did detect a cycle:
                            // ?
                            // Store protocol clone, transition to be taken, action to be done, ltl state?
                            // OR do second cycle directy to be able to report on the fly
                            if (resultFromCycle2) {
                                return true; // Only return true if a cycle is found, continue otherwise.
                            }
                        } else {

                            // we were able to take this transition, add to list to enable cycle detection
                            allTriedTransitions.add(newTriedTransitionTuple);

                            var protocolStateAfterTransition = optionalResultProtocol.get();
                            System.out.println("Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState());


                            // TODO Should we check for acceptance set 0 here?  and then return true??????
                            // Acc set 0 = finite...
                            // Acc set 1 = infinite .... --> Need cycle
                            // Call recursively to travel the whole protocol
                            var recursiveResult = travelStateSpaceGuided(protocolStateAfterTransition, transition.ltlTargetState);
                            if (recursiveResult) {
                                return true;
                            }
                        }
                    }
            }
        }
        return false; // Returning false, we took all possible transitions and did not find any accepting cycles.
    }

    private boolean travelStateSpaceGuidedForSecondCycle(IProtocol startingProtocolCopy,
                                                         LtlState currentLtlState,
                                                         Set<TriedTransitionTuple> locallyTriedTransitions,
                                                         TriedTransitionTuple markedTransitionTuple,
                                                         boolean isAcceptingCycle)
            throws Exception {
        // Try all outgoing transitions for the current ltl state
        for (var transition : currentLtlState.OutgoingTransitions) {
            var possibleExploringActions =  StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,this.exploringActions);
            for (var exploringAction :  possibleExploringActions) {
                // We have selected an action to explore (a possible transition on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, exploringAction.participant);
                System.out.println("Trying transition from state " + startingProtocolCopy.getState());
                System.out.println("Trying direction:"+ exploringAction.direction );
                System.out.println("Trying dummy:"+ exploringAction.dummy );
                System.out.println("Trying receiver:"+ exploringAction.receiver );
                System.out.println("Trying messageClass:"+ exploringAction.messageClass );
                System.out.println("Trying participant:"+ exploringAction.participant );

                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = GetThreadForAction(exploringAction);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<IProtocol> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transition in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        var protocolStateAfterTransition = optionalResultProtocol.get();
                        System.out.println("Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState());

                        if (detectCycle(newTriedTransitionTuple, locallyTriedTransitions)) {
                            System.out.println("Detected Cycle in state, We are already in inner cycle!" + startingProtocolCopy.getState());

//                    // Need as parameters, starting state info to check here....
                            //                  var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, threadName);
                            // are we in the starting state again?
                            // Yes? Return value of isAccepting...
                            var messageForDebugging = " This is what we were checking: Marked: " + markedTransitionTuple.toString() + " newTried: " + newTriedTransitionTuple.toString();

                            if (newTriedTransitionTuple.equals(markedTransitionTuple)) {
                                System.out.println("It is the state we are checking! ");
                                System.out.println(messageForDebugging);


                                if((transition.AcceptanceSet0 || transition.AcceptanceSet1) && isAcceptingCycle)
                                    return true;
                                else{
                                    return false;
                                }
//                                return isAcceptingCycle;
                            } else {
                                System.out.println("It is not the state we were checking for, we are ignoring this cycle!" );
                                System.out.println(messageForDebugging);

                            }
                        } else {


                            locallyTriedTransitions.add(newTriedTransitionTuple);

                            if (transition.AcceptanceSet0 || transition.AcceptanceSet1) {
                                // TODO do we need to check the first transition(before starting the recursive behavior)?
                                System.out.println("Transition we took was part of an accepting cycle.");
                                isAcceptingCycle = true; // Mark the cycle we are checking as accepting.
                            }
                            // Call recursively to travel the whole protocol
                            var recursiveResult = travelStateSpaceGuidedForSecondCycle(
                                    protocolStateAfterTransition,
                                    transition.ltlTargetState,
                                    locallyTriedTransitions,
                                    markedTransitionTuple,
                                    isAcceptingCycle);
                            if (recursiveResult) {
                                return true;
                            }
                        }
                    }
//                } else {
//
//                    // No? end recursion but continue, we could be in a sub cycle
//                }
            }
        }
        System.out.println("Returning false, we took all possible transitions and did not find any accepting cycles.");
        return false; // Returning false, we took all possible transitions and did not find any accepting cycles.
    }


    public boolean doCycleDetectionPhaseTwo(LtlState currentLtlState,
                                            LtlTransition transition,
                                            StateSpaceExploringAction exploringAction,
                                            IProtocol startingProtocolCopy) throws Exception {
        System.out.println("Found potential cycle");
        System.out.println("Starting inner cycle");

        // starting phase 2
//        var isAcceptingCycle = false;
        Set<TriedTransitionTuple> locallyTriedTransitions = new HashSet<>();

        // Also add normal cycle detection... --> then ignore, will hit this one in checking cycle 1
        //Take transition (And mar isAcceptingCycle if this transition is accepting)
        // Are we in the start state again?
        // --> Yes? Return isAcceptingCycle
        // --> No select all possible exploring actions again an

        System.out.println("Taking transition from state " + startingProtocolCopy.getState());

        System.out.println("From now on, we will try to detect if this transition will be taken again.");
        exploringAction.Print();

        // get the participating thread
        var participatingThread = GetThreadForAction(exploringAction);

        // set the protocol of the thread to a clone of the protocol
        participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

        // try to execute the action
        Optional<IProtocol> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

        // if there is a result, we just took a transition in the protocol automaton
        if (optionalResultProtocol.isPresent()) {
            var protocolStateAfterTransition = optionalResultProtocol.get();
            System.out.println("Took transition from state "
                    + startingProtocolCopy.getState()
                    + " to "
                    + protocolStateAfterTransition.getState());

            // Add transition to tried transition, so when taken again a cycle will be detected.
            var markedTransitionTuple =
                    new TriedTransitionTuple(
                            startingProtocolCopy.getState()
                            , exploringAction
                            , exploringAction.participant);
            locallyTriedTransitions.add(markedTransitionTuple);

            var firstAcceptingValue = false;
            if(transition.AcceptanceSet0 || transition.AcceptanceSet1){
                firstAcceptingValue = true;
            }

            // Call recursively to travel the whole protocol
            var recursiveResult = travelStateSpaceGuidedForSecondCycle(
                    protocolStateAfterTransition,
                    transition.ltlTargetState,
                    locallyTriedTransitions,
                    markedTransitionTuple,
                    firstAcceptingValue // start with value from current transition
            );

            return recursiveResult;
        } else {
            // TODO give decent exception message (Do for all exceptions!)
            throw new Exception("This should not have happened, we already tries this before!");
        }
    }

    private StateSpaceExploringThread GetThreadForAction(StateSpaceExploringAction action) {
        return new StateSpaceExploringThread(action.participant);
    }

    private final Set<TriedTransitionTuple> allTriedTransitions = new HashSet<>();

    // Simple Cycle detection to travel the whole protocol automaton
    private boolean detectCycle(TriedTransitionTuple newTriedTransitionTuple,
                                       Set<TriedTransitionTuple> triedTransitionsToCheckAgainst) {
        if (triedTransitionsToCheckAgainst
                .stream()
                .anyMatch(triedTransitionTuple -> triedTransitionTuple.equals(newTriedTransitionTuple))) {
            return true;
        }

        return false;
    }
}
