package nl.florianslob.model.checking.sandbox.modelchecking;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.LoggingLevel;
import nl.florianslob.model.checking.sandbox.modelchecking.datastructure.*;

/**
 *
 * @author FlorianSlob
 */
public class ModelCheckingActivity implements ISandboxingActivity {



    @Override
    public void runActivity() throws Exception {
        // Set logging level here.
        LoggingHelper.loggingLevel = LoggingLevel.INFO;

        LoggingHelper.logInfo("Starting model checking Sandbox activity.");

        // get the initial state of a model.
        StateNode ModelS0 = ModelCheckingDemoData.getStartingNode(ModelCheckingDemoData.SIMPLE_MODEL);

        // get ltl tree (this is supposed to be the negation of given property)
        // The initial node only exists to simulate the first incoming edges to the
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

        Set<LtlGraphNode> LtlS0Set = generateLtlAutomatonAndReturnInitialState(OnTheFlyLtlTestFormulas.getTestFormula(OnTheFlyLtlTestFormulaName.XXXXaAndB)).childNodes;

        LoggingHelper.logInfo("We now have our model and LTL formula as automata.");
        LoggingHelper.logInfo("Lets check some models 8-).");

        TraceInformation traceInformation = new TraceInformation();
        // start in S0
        boolean doesFormulaHold = Objects.requireNonNull(ModelS0).checkDepthFirst(LtlS0Set, traceInformation);

        LoggingHelper.logInfo("Does the formula hold for the model: " + doesFormulaHold);

        if (doesFormulaHold) {
            LoggingHelper.logInfo("Printing the trace in the program: ");

            while (traceInformation.currentTraceNode != null) {
                traceInformation.currentTraceNode.VisitAndLogRecursively();
            }
        }

        // get all successors
        // check per successor depth first if there is a corresponding successor in the
        // ltl tree.
        // return true if the mem-efficient algorithm finds a cycle that remains true.
        // What to do with ending traces?? We cannot easily ignore parts of the state
        // that are not referenced in the formula... question for meeting?
        // check whether transactions
    }

    /**
     * * Example: For the formula aOrb it will return a node that has two child
     * nodes.Those are the initial states for a and for b.
     *
     * @param formula The abstract syntax tree of the formula
     * @return a surrogate node to simulate the initial edges into the starting
     *         states.
     * @throws Exception Propagate all exceptions to calling method.
     */
    public static LtlGraphNode generateLtlAutomatonAndReturnInitialState(LtlFormula formula) throws Exception {
        // We start with an empty set, that will contain all nodes
        Set<LtlGraphNode> graphNodeSet = new HashSet<>();

        if (formula == null) {
            throw new Exception("No formula found for given id.");
        }

        LtlGraphNode initialNode = new LtlGraphNode("InitialLtlNode");
        initialNode.isInitialState = true;

        LtlGraphNode rootNode = new LtlGraphNode("RootLtlNode", formula);
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

}
