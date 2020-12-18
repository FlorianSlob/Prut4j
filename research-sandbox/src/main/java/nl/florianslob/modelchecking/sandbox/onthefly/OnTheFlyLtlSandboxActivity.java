package nl.florianslob.modelchecking.sandbox.onthefly;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.modelchecking.sandbox.ISandboxingActivity;
import nl.florianslob.modelchecking.sandbox.LoggingHelper;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.LtlFormula;
import nl.florianslob.modelchecking.sandbox.modelchecking.datastructure.LtlGraphNode;
import nl.florianslob.modelchecking.sandbox.modelchecking.OnTheFlyLtlTestFormulas;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlSandboxActivity implements ISandboxingActivity {

    @Override
    public void runActivity() {
        LoggingHelper.logDebug("Starting OnTheFlyLtl Sandbox activity.");

        // We start with an empty set, that will contain all nodes
        final Set<LtlGraphNode> graphNodeSet = new HashSet<>();

        // In a real world situation the formula is parsed from some kind of user
        // friendly notation
        // We use a strongly typed representation for now.
        final LtlFormula formula = OnTheFlyLtlTestFormulas.getTestFormula_aOrb();

        final LtlGraphNode initialNode = new LtlGraphNode("InitialNode");
        initialNode.isInitialState = true;

        final LtlGraphNode rootNode = new LtlGraphNode("RootNode", formula);
        rootNode.fatherNode = initialNode;

        try {
            rootNode.expand(graphNodeSet);
        } catch (final Exception e) {
            LoggingHelper.logInfo("Exception message: " + e.getMessage());
            throw e;
        }

        // Print the whole tree (exception or not, for debugging purposes).
        initialNode.printTreeDepthFirst();

        LoggingHelper.logDebug("Done OnTheFlyLtl Sandbox activity.");
    }
}
