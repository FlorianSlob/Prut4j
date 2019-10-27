package nl.florianslob.model.checking.sandbox.onthefly;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.GraphNode;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalOperator;
import nl.florianslob.model.checking.sandbox.onthefly.datastructure.TemporalProperty;

/**
 *
 * @author FlorianSlob
 */
public class OnTheFlyLtlSandboxActivity implements ISandboxingActivity {

    @Override
    public void runActivity() {
        System.out.println("Starting OnTheFlyLtl Sandbox activity.");
        
        // We start with an empty set, that will contain all nodes
        // TODO Is this for cycle detection?
        Set<GraphNode> graphNodeSet = new HashSet<>();
        // TODO Extract this with parser!
        TemporalProperty property = new TemporalProperty("RootProperty");
        property.leftProperty = new TemporalProperty("LeftProperty", "True");
        property.operator = TemporalOperator.U;
        property.rightProperty = new TemporalProperty("RightProperty", "SomeProperty");
        
        GraphNode rootNode = new GraphNode("RootNode", property);
        
        rootNode.expand(graphNodeSet); // This is where the magic happens
        
        rootNode.printTreeDepthFirst(); // This is where the magic is printed
        
        System.out.println("Done OnTheFlyLtl Sandbox activity.");
    }    
}
