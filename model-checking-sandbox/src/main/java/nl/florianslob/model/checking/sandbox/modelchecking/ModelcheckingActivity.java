package nl.florianslob.model.checking.sandbox.modelchecking;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.LoggingLevel;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlFormulla;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.ModelcheckingAlphabet;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.StateNode;

/**
 *
 * @author FlorianSlob
 */
public class ModelcheckingActivity implements ISandboxingActivity {

    // Some constants to easily switch between models and ltl formullas during development.
    public static final int SIMPLE_MODEL = 0;
    public static final int SIMPLE_LTL_FORMULLA = 0;

    @Override
    public void runActivity() throws Exception {
        // Set logging level here.
        LoggingHelper.loggingLevel = LoggingLevel.INFO;

        LoggingHelper.logInfo("Starting model checking Sandbox activity.");

        // get the initial state of a model.
        StateNode ModelS0 = getStartingNode(SIMPLE_MODEL);

        // get ltl tree (this is supposed to be the negation of given property)
        // The initial node only exists to simulate the first incomming edges to the initial states of the ltl tree
        Set<LtlGraphNode> LtlS0Set = generateLtlAutomatonAndReturnInitialState(SIMPLE_LTL_FORMULLA).childNodes;

        LoggingHelper.logInfo("We now have our model and LTL formulla as automata.");
        LoggingHelper.logInfo("Lets check some models 8-).");

        // start in S0
        boolean doesFormullaHold = ModelS0.checkDepthFirst(LtlS0Set);

        LoggingHelper.logInfo("Does the formulla hold for the model: " + doesFormullaHold);

        // get all succesors
        // check per successor depth firts if there is a corresponding successor in the ltl tree.
        //  return true if the mem-efficient algorithm finds a cycle that remains true.
        // What to do with ending traces?? We cannot easily ignore parts of the state that are not referenced in the formulla... question for meeting?
        // check whether transactions
    }

    /**
     * *
     * Example: For the formula aOrb it will return a node that has two child
     * nodes.Those are the initial states for a and for b.
     *
     * @param modelNumber
     * @return a surrogate node to simulate the initial edges into the starting
     * states.
     * @throws Exception
     */
    public LtlGraphNode generateLtlAutomatonAndReturnInitialState(int modelNumber) throws Exception {
        // We start with an empty set, that will contain all nodes
        Set<LtlGraphNode> graphNodeSet = new HashSet<>();

        // In a real world situation the formulla is parsed from some kind of user friendly notation
        // We use a strongly typed representation for now.
        LtlFormulla formulla = null;

        switch (modelNumber) {
            case SIMPLE_LTL_FORMULLA:
                formulla = OnTheFlyLtlTestMethods.getTestFormulla_aOrb();
        }

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
        state8.AtomicPropositions.add(ModelcheckingAlphabet.A);
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
        StateNode state14 = new StateNode(14);
        state14.AtomicPropositions.add(ModelcheckingAlphabet.A);

        state0.Successors.add(state1);
        state1.Successors.add(state2);
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

        return state0;
    }

}
