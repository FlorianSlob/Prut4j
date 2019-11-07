package nl.florianslob.model.checking.sandbox.onthefly;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.GraphNode;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalOperator;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalFormulla;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlSandboxActivity implements ISandboxingActivity {

    @Override
    public void runActivity() throws Exception {
        System.out.println("Starting OnTheFlyLtl Sandbox activity.");

        // We start with an empty set, that will contain all nodes
        // TODO Is this for cycle detection?
        Set<GraphNode> graphNodeSet = new HashSet<>();
        // TODO Extract this with parser!
        TemporalFormulla property = new TemporalFormulla("RootProperty");
        property.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        property.operator = TemporalOperator.U;
        property.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");

        GraphNode initialNode = new GraphNode("InitialNode");
        initialNode.isInitialState = true;
        
        GraphNode rootNode = new GraphNode("RootNode", property);
        rootNode.fatherNode = initialNode;
                
        try {
            rootNode.expand(graphNodeSet); // This is where the magic happens
        } catch (Exception e) {
            // Print but do not throw.
            System.out.println("Exception message: " + e.getMessage());
            throw e;
        }
        
        // Print the whole tree (exception or not, for debuggin purposes).
        initialNode.printTreeDepthFirst();


        System.out.println("Done OnTheFlyLtl Sandbox activity.");
    }
}
