package nl.florianslob.model.checking.sandbox.onthefly;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.LtlGraphNode;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.LtlFormulla;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlSandboxActivity implements ISandboxingActivity {

    @Override
    public void runActivity() throws Exception {
        LoggingHelper.logDebug("Starting OnTheFlyLtl Sandbox activity.");

        // We start with an empty set, that will contain all nodes
        Set<LtlGraphNode> graphNodeSet = new HashSet<>();

        // In a real world situation the formulla is parsed from some kind of user friendly notation
        // We use a strongly typed representation for now. 
        LtlFormulla formulla = OnTheFlyLtlTestMethods.getTestFormulla_aOrb();

        LtlGraphNode initialNode = new LtlGraphNode("InitialNode");
        initialNode.isInitialState = true;
        
        LtlGraphNode rootNode = new LtlGraphNode("RootNode", formulla);
        rootNode.fatherNode = initialNode;
                
        try {
            rootNode.expand(graphNodeSet);
        } catch (Exception e) {
            LoggingHelper.logInfo("Exception message: " + e.getMessage());
            throw e;
        }
        
        // Print the whole tree (exception or not, for debuggin purposes).
        initialNode.printTreeDepthFirst();

        LoggingHelper.logDebug("Done OnTheFlyLtl Sandbox activity.");
    }
}
