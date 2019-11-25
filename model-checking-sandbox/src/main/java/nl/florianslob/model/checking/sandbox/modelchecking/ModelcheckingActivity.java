package nl.florianslob.model.checking.sandbox.modelchecking;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.LoggingLevel;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.ModelcheckingAlphabet;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.StateNode;

/**
 *
 * @author FlorianSlob
 */
public class ModelcheckingActivity implements ISandboxingActivity {

    // Some constants to easily switch between models and ltl formullas during
    // development.
    public static final int SIMPLE_MODEL = 0;

    @Override
    public void runActivity() throws Exception {
        // Set logging level here.
        LoggingHelper.loggingLevel = LoggingLevel.INFO;

        LoggingHelper.logInfo("Starting model checking Sandbox activity.");

        // get the initial state of a model.
        StateNode ModelS0 = getStartingNode(SIMPLE_MODEL);

        // get ltl tree (this is supposed to be the negation of given property)
        // The initial node only exists to simulate the first incomming edges to the
        // initial states of the ltl tree
        // aOrB // Should return path 0
        // Xb // Should return path 0 --> 15
        // Xa // Should return path 0 --> 1
        // aUb // Should return true with path: (!if taking random paths!)
        // 0 -> 15 (if you remove 0 -> 1 path)
        // or 0 -> 1 -> 2 -> 3 -> 4 -> 7 -> 8 (if you remove 0 -> 15 path)
        // or 0 -> 1 -> 11 -> 12 -> 13  (if you remove 0 -> 15 and 4 -> 7 path)
        // or 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 (if you remove 0 -> 15 and 4 -> 7 and 1 -> 11 path)
        // aAndB // Should return false
        // bVa // Should return true
        // 0 -> 1 -> 11 -> 12 -> 13
        // 0 -> 1 -> 11 -> 12 -> 13 -> 14
        // or 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6
        // a // Should return true with path 0
        // b // Should return false

        Set<LtlGraphNode> LtlS0Set = generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName.XXXXaAndB).childNodes;

        LoggingHelper.logInfo("We now have our model and LTL formulla as automata.");
        LoggingHelper.logInfo("Lets check some models 8-).");

        // start in S0
        boolean doesFormullaHold = ModelS0.checkDepthFirst(LtlS0Set);

        LoggingHelper.logInfo("Does the formulla hold for the model: " + doesFormullaHold);

        if (doesFormullaHold) {
            LoggingHelper.logInfo("Printing the trace in the program: ");

            while (!StateNode.StateTrace.isEmpty()) {
                StateNode topOfStackStateNode = StateNode.StateTrace.pop();
                LoggingHelper.logInfo("State hash number:  " + topOfStackStateNode.HashingNumber);
            }
        }

        // get all succesors
        // check per successor depth firts if there is a corresponding successor in the
        // ltl tree.
        // return true if the mem-efficient algorithm finds a cycle that remains true.
        // What to do with ending traces?? We cannot easily ignore parts of the state
        // that are not referenced in the formulla... question for meeting?
        // check whether transactions
    }

    /**
     * * Example: For the formula aOrb it will return a node that has two child
     * nodes.Those are the initial states for a and for b.
     *
     * @param formulaName
     * @return a surrogate node to simulate the initial edges into the starting
     *         states.
     * @throws Exception
     */
    public LtlGraphNode generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulaName formulaName) throws Exception {
        // We start with an empty set, that will contain all nodes
        Set<LtlGraphNode> graphNodeSet = new HashSet<>();

        // In a real world situation the formulla is parsed from some kind of user
        // friendly notation
        // We use a strongly typed representation for now.
        LtlFormula formulla = OnTheFlyLtlTestFormulas.getTestFormula(formulaName);

        if (formulla == null) {
            throw new Exception("No formulla found for given id.");
        }

        LtlGraphNode initialNode = new LtlGraphNode("InitialNode");
        initialNode.isInitialState = true;

        LtlGraphNode rootNode = new LtlGraphNode("RootNode", formulla);
        rootNode.fatherNode = initialNode;

        // execute the expanding algorithm
        try {
            rootNode.expand(graphNodeSet);
        } catch (Exception e) {
            LoggingHelper.logInfo("Exception message: " + e.getMessage());
            throw e;
        }

        return initialNode; // Is this S0 or S-1 (because of structure of algorithm?)
    }

    public StateNode getStartingNode(int modelNumber) {
        switch (modelNumber) {
        case SIMPLE_MODEL:
            return generateSimpleModelAndReturnInitialState();
        default:
            return null;
        }
    }

    public StateNode generateSimpleModelAndReturnInitialState() {
        StateNode state0 = new StateNode(0);
        state0.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state1 = new StateNode(1);
        state1.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state2 = new StateNode(2);
        state2.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state3 = new StateNode(3);
        state3.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state4 = new StateNode(4);
        state4.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state5 = new StateNode(5);
        state5.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state6 = new StateNode(6);
        state6.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state7 = new StateNode(7);
        state7.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state8 = new StateNode(8);
        state8.AtomicPropositions.add(ModelcheckingAlphabet.B);
        StateNode state9 = new StateNode(9);
        state9.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state10 = new StateNode(10);
        state10.AtomicPropositions.add(ModelcheckingAlphabet.A);

        StateNode state11 = new StateNode(11);
        state11.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state12 = new StateNode(12);
        state12.AtomicPropositions.add(ModelcheckingAlphabet.A);
        StateNode state13 = new StateNode(13);
        state13.AtomicPropositions.add(ModelcheckingAlphabet.A);
        state13.AtomicPropositions.add(ModelcheckingAlphabet.B);
        StateNode state14 = new StateNode(14);
        state14.AtomicPropositions.add(ModelcheckingAlphabet.A);

        StateNode state15 = new StateNode(15);
        state15.AtomicPropositions.add(ModelcheckingAlphabet.A);

        state0.Successors.add(state1);
        state0.Successors.add(state15);

        // state1.Successors.add(state2);
        state2.Successors.add(state3);
        state3.Successors.add(state4);
        state4.Successors.add(state5);
        state5.Successors.add(state6);
        state6.Successors.add(state2);

        state4.Successors.add(state7);
        state7.Successors.add(state8);
        state8.Successors.add(state9);
        state9.Successors.add(state10);
        state10.Successors.add(state5);

        state1.Successors.add(state11);
        state11.Successors.add(state12);
        state12.Successors.add(state13);
        state13.Successors.add(state14);
        state14.Successors.add(state14);
        state15.Successors.add(state15);

        return state0;
    }

}
