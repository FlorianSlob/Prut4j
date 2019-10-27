package nl.florianslob.model.checking.sandbox.onthefly;

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
        // TODO Extract this with parser!
        TemporalProperty property = new TemporalProperty("RootProperty");
        property.leftProperty = new TemporalProperty("LeftProperty", "True");
        property.operator = TemporalOperator.U;
        property.rightProperty = new TemporalProperty("RightProperty", "SomeProperty");
        
        GraphNode rootNode = new GraphNode("RootNode", property);
        
        rootNode.expand(); // This is where the magic happens
        
        rootNode.printTreeDepthFirst(); // This is where the magic is printed
        
        System.out.println("Done OnTheFlyLtl Sandbox activity.");
    }    
}
