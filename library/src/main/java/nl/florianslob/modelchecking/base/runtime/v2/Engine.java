package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.api.v2.Pr;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlState;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.LtlFormulaDefinitionHelper;
import nl.florianslob.modelchecking.base.runtime.v2.ltlautomaton.OwlHelper;

import java.util.*;

public class Engine {
    public static boolean IsProtocolOptimized = true;
    public static boolean IsLoggingEnabled = false;

    public static boolean exec(String owlFilename, Pr protocolUnderVerification, Object[] dummies ) {
        HashMap<String,String> shortTypeNameToFullClassNameMap = new HashMap<>();
        return exec(owlFilename,protocolUnderVerification,dummies, shortTypeNameToFullClassNameMap);
    }

    public static boolean exec(String owlFilename, Pr protocolUnderVerification, Object[] dummies , HashMap<String,String> shortTypeNameToFullClassNameMap ){
        var engineObject = new Engine(protocolUnderVerification);
        var formulaString = LtlFormulaDefinitionHelper.GetFormulaStringFromFile(owlFilename, shortTypeNameToFullClassNameMap);

        return engineObject.exec(formulaString,dummies);
    }

    public static void LogTest(Object logObject){
        if(IsLoggingEnabled){
            System.out.println(logObject);
        }
    }

    public static void LogResult(Object logObject){
            System.out.println(logObject);
    }

    private final Pr protocolUnderVerification;
    private List<StateSpaceExploringAction> exploringActions = new ArrayList<>();
    private List<LtlState> initialStatesForNegatedFormula;
    private Object[] dummies;

    public Engine(Pr protocolUnderVerification) {
        this.protocolUnderVerification = protocolUnderVerification;
    }



    public boolean exec(String ltlFormulaString, Object[] dummies) {
        this.dummies = dummies;
        this.initialStatesForNegatedFormula = OwlHelper.GetInitialLtlStatesForFormula(ltlFormulaString, true);

        var hasAcceptingCycles = CheckForAcceptingCycles(dummies);
        return !hasAcceptingCycles;
    }

    private boolean CheckForAcceptingCycles(Object[] dummies) {
        Stack<TriedTransitionTuple> triedTransitionsStack = new Stack<>();

        Engine.LogTest("Participants: ");
        for (var threadName : protocolUnderVerification.threadNames()) {
            Engine.LogTest(threadName);
        }

        Engine.LogTest("Dummy objects: ");
        for (var dummy : this.dummies) {
            Engine.LogTest(dummy);
        }

        this.exploringActions = StateSpaceExplorerHelper.getExploringActions(protocolUnderVerification, this.dummies);
        for (var exploringAction : exploringActions) {
            exploringAction.Print();
        }

        try {
            var result = executeModelCheckingAlgorithm(triedTransitionsStack);
            if(result){
                for (var trace : triedTransitionsStack) {
                 System.out.println(trace);
                }
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();


            // TODO what should we do here?
            return false;
        }
    }

    private boolean executeModelCheckingAlgorithm(Stack<TriedTransitionTuple> triedTransitionsStack) throws Exception {
        for (var ltlStateNode : this.initialStatesForNegatedFormula) {
            var result =
                    travelStateSpaceGuided(this.protocolUnderVerification, ltlStateNode, triedTransitionsStack);
            if (result) {
                Engine.LogResult("Found an accepting Cycle");
                return true;
            }
        }
        // none of the paths starting in an initial state found an accepting cycle.
        return false;
    }

    private boolean travelStateSpaceGuided(Pr startingProtocolCopy, LtlState currentLtlState, Stack<TriedTransitionTuple> triedTransitionsStack) throws Exception {
        // Try all outgoing transitions for the current ltl state
        for (var transition : currentLtlState.OutgoingTransitions) {
            for (var exploringAction : StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,this.exploringActions)) {
                // We have selected an action to explore (a possible transition on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, exploringAction.participant, transition);
//                if (!detectCycle(newTriedTransitionTuple,allTriedTransitions)) {
                    Engine.LogTest("Trying transition from state " + startingProtocolCopy.getState());
                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = GetThreadForAction(exploringAction);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<Pr> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transition in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        if (detectCycle(newTriedTransitionTuple,allTriedTransitions)) {
                            Engine.LogTest("Detected cycle in state " + startingProtocolCopy.getState());
                            Engine.LogTest("Starting inner cycle");

//                            var protocolStateAfterTransition = optionalResultProtocol.get();
//                            triedTransitionsStack.push(
//                                    "A: Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState() + " Exploring Action: "+exploringAction.toString() + " LTL: "+ transition.toString());

                            // We detected a transition that has been taken before.
                            var resultFromCycle2 = doCycleDetectionPhaseTwo(currentLtlState, transition, exploringAction, startingProtocolCopy, triedTransitionsStack);
                            // Case where we did detect a cycle:
                            // ?
                            // Store protocol clone, transition to be taken, action to be done, ltl state?
                            // OR do second cycle directy to be able to report on the fly
                            if (resultFromCycle2) {
                                return true; // Only return true if a cycle is found, continue otherwise.
                            }else{
//                                triedTransitionsStack.pop();
                            }
                        } else {

                            // we were able to take this transition, add to list to enable cycle detection
                            allTriedTransitions.add(newTriedTransitionTuple);

                            var protocolStateAfterTransition = optionalResultProtocol.get();
                            Engine.LogTest("B: Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState());
//                            triedTransitionsStack.push("B: Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState() + " Exploring Action: "+exploringAction.toString() + " LTL: "+ transition.toString());

                            triedTransitionsStack.push(newTriedTransitionTuple);
                            // Acc set 0 = finite...
                            // Acc set 1 = infinite .... --> Need cycle
                            // Call recursively to travel the whole protocol
                            var recursiveResult = travelStateSpaceGuided(protocolStateAfterTransition, transition.ltlTargetState, triedTransitionsStack);
                            if (recursiveResult) {
                                return true;
                            }else{
//                                allTriedTransitions.remove(newTriedTransitionTuple);
                                triedTransitionsStack.pop();
                            }

                        }
                    }
            }
        }
        return false; // Returning false, we took all possible transitions and did not find any accepting cycles.
    }

    private boolean travelStateSpaceGuidedForSecondCycle(Pr startingProtocolCopy,
                                                         LtlState currentLtlState,
                                                         Set<TriedTransitionTuple> locallyTriedTransitions,
                                                         TriedTransitionTuple markedTransitionTuple,
//                                                         boolean isAcceptingCycle,
                                                         Stack<TriedTransitionTuple> triedTransitionsStack)
            throws Exception {
        // Try all outgoing transitions for the current ltl state
        for (var transition : currentLtlState.OutgoingTransitions) {
            var possibleExploringActions =  StateSpaceExploringActionsHelper.GetPossibleExploringActions(transition,this.exploringActions);
            for (var exploringAction :  possibleExploringActions) {
                // We have selected an action to explore (a possible transition on the protocol automaton)
                // If no cycle is detected, we will try this action.
                // Otherwise the exploration stops here, we found a cycle and we can stop exploring the graph for this sub trace.
                var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, exploringAction.participant, transition);
                Engine.LogTest("Trying transition from state " + startingProtocolCopy.getState());
                Engine.LogTest("Trying direction:"+ exploringAction.direction );
                Engine.LogTest("Trying dummy:"+ exploringAction.dummy );
                Engine.LogTest("Trying receiver:"+ exploringAction.receiver );
                Engine.LogTest("Trying messageClass:"+ exploringAction.messageClass );
                Engine.LogTest("Trying participant:"+ exploringAction.participant );

                    exploringAction.Print();

                    // get the participating thread
                    var participatingThread = GetThreadForAction(exploringAction);

                    // set the protocol of the thread to a clone of the protocol
                    participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

                    // try to execute the action
                    Optional<Pr> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

                    // if there is a result, we just took a transition in the protocol automaton
                    if (optionalResultProtocol.isPresent()) {
                        var protocolStateAfterTransition = optionalResultProtocol.get();
                        Engine.LogTest("Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState());
//                        triedTransitionsStack.push("C: Took transition from state " + startingProtocolCopy.getState() + " to " + protocolStateAfterTransition.getState() + " Exploring Action: "+exploringAction.toString() + " LTL: "+ transition.toString());
                        triedTransitionsStack.push(newTriedTransitionTuple);
                        if (detectCycle(newTriedTransitionTuple, locallyTriedTransitions)) {
                            Engine.LogTest("Detected Cycle in state, We are already in inner cycle!" + startingProtocolCopy.getState());

//                    // Need as parameters, starting state info to check here....
                            //                  var newTriedTransitionTuple = new TriedTransitionTuple(startingProtocolCopy.getState(), exploringAction, threadName);
                            // are we in the starting state again?
                            // Yes? Return value of isAccepting...
                            var messageForDebugging = " This is what we were checking: Marked: " + markedTransitionTuple.toString() + " newTried: " + newTriedTransitionTuple.toString();

                            if (newTriedTransitionTuple.equals(markedTransitionTuple)) {
                                Engine.LogTest("It is the state we are checking! ");
                                Engine.LogTest(messageForDebugging);

//                                triedTransitionsStack.push(newTriedTransitionTuple);
                                var isAccepting  = isAccepting(triedTransitionsStack);
                                if(isAccepting) {
                                    Engine.LogResult("It is the state we are checking! And it was part of an accepting cycle ");
                                    Engine.LogResult(messageForDebugging);

                                    return true;
                                }
                                else{
                                    triedTransitionsStack.pop();
                                    return false;
                                }
//                                return isAcceptingCycle;
                            } else {
                                Engine.LogTest("It is not the state we were checking for, we are ignoring this cycle!" );
                                Engine.LogTest(messageForDebugging);
                                triedTransitionsStack.pop();

                            }
                        } else {

                            locallyTriedTransitions.add(newTriedTransitionTuple);
//                            triedTransitionsStack.push(newTriedTransitionTuple);

//                            if (transition.AcceptanceSet0 || transition.AcceptanceSet1) {
//                                // TODO do we need to check the first transition(before starting the recursive behavior)?
//                                Engine.LogTest("Transition we took was part of an accepting cycle.");
//                                isAcceptingCycle = true; // Mark the cycle we are checking as accepting.
//                            }
                            // Call recursively to travel the whole protocol
                            var recursiveResult = travelStateSpaceGuidedForSecondCycle(
                                    protocolStateAfterTransition,
                                    transition.ltlTargetState,
                                    locallyTriedTransitions,
                                    markedTransitionTuple,
//                                    isAcceptingCycle,
                                    triedTransitionsStack);
                            if (recursiveResult) {
                                return true;
                            }else{
//                                locallyTriedTransitions.remove(newTriedTransitionTuple);
                                triedTransitionsStack.pop();
                            }
                        }
                    }
            }
        }
        Engine.LogTest("Returning false, we took all possible transitions and did not find any accepting cycles.");
        return false; // Returning false, we took all possible transitions and did not find any accepting cycles.
    }

    private boolean isAccepting(Stack<TriedTransitionTuple> triedTransitionsStack) {
        return triedTransitionsStack.stream().anyMatch(item -> { return item.ltlTransition.AcceptanceSet0 || item.ltlTransition.AcceptanceSet1;});
    }

    public boolean doCycleDetectionPhaseTwo(LtlState currentLtlState,
                                            LtlTransition transition,
                                            StateSpaceExploringAction exploringAction,
                                            Pr startingProtocolCopy,
                                            Stack<TriedTransitionTuple> triedTransitionsStack
                                            ) throws Exception {
        Engine.LogTest("Found potential cycle");
        Engine.LogTest("Starting inner cycle");

        // starting phase 2
//        var isAcceptingCycle = false;
        Set<TriedTransitionTuple> locallyTriedTransitions = new HashSet<>();

        // Also add normal cycle detection... --> then ignore, will hit this one in checking cycle 1
        //Take transition (And mar isAcceptingCycle if this transition is accepting)
        // Are we in the start state again?
        // --> Yes? Return isAcceptingCycle
        // --> No select all possible exploring actions again an

        Engine.LogTest("Taking transition from state " + startingProtocolCopy.getState());

        Engine.LogTest("From now on, we will try to detect if this transition will be taken again.");
        exploringAction.Print();

        // get the participating thread
        var participatingThread = GetThreadForAction(exploringAction);

        // set the protocol of the thread to a clone of the protocol
        participatingThread.SetProtocolClone(StateSpaceExplorerHelper.deepClone(startingProtocolCopy));

        // try to execute the action
        Optional<Pr> optionalResultProtocol = participatingThread.ExecuteAction(exploringAction);

        // if there is a result, we just took a transition in the protocol automaton
        if (optionalResultProtocol.isPresent()) {
            var protocolStateAfterTransition = optionalResultProtocol.get();
            Engine.LogTest("Took transition from state "
                    + startingProtocolCopy.getState()
                    + " to "
                    + protocolStateAfterTransition.getState());

//            triedTransitionsStack.push("D: Took transition from state "
//                    + startingProtocolCopy.getState()
//                    + " to "
//                    + protocolStateAfterTransition.getState()+ " Exploring Action: "+exploringAction.toString() + " LTL: "+ transition.toString());
//            triedTransitionsStack.push()
            // Add transition to tried transition, so when taken again a cycle will be detected.
            var markedTransitionTuple =
                    new TriedTransitionTuple(
                            startingProtocolCopy.getState()
                            , exploringAction
                            , exploringAction.participant
                            , transition);

            triedTransitionsStack.push(markedTransitionTuple); // Not 100% sure here!
            locallyTriedTransitions.add(markedTransitionTuple);


//            if(transition.AcceptanceSet0 || transition.AcceptanceSet1){
//                firstAcceptingValue = true;
//            }

            // Call recursively to travel the whole protocol
            var recursiveResult = travelStateSpaceGuidedForSecondCycle(
                    protocolStateAfterTransition,
                    transition.ltlTargetState,
                    locallyTriedTransitions,
                    markedTransitionTuple,
//                    firstAcceptingValue, // start with value from current transition
                    triedTransitionsStack
            );

            if(!recursiveResult){
                triedTransitionsStack.pop();
            } else{
//                locallyTriedTransitions.remove(markedTransitionTuple);
            }
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
