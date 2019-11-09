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
        TemporalFormulla formulla = getTestFormulla_Complex();

        GraphNode initialNode = new GraphNode("InitialNode");
        initialNode.isInitialState = true;
        
        GraphNode rootNode = new GraphNode("RootNode", formulla);
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
    
    public TemporalFormulla getTestFormulla_aUb(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.U;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_aVb(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_aOrb(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.Or;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_aAndb(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = new TemporalFormulla("LeftProperty", "a");
        formulla.operator = TemporalOperator.And;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "b");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_Xa(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.operator = TemporalOperator.X;
        formulla.rightOperantFormulla = new TemporalFormulla("RightProperty", "a");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_a(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla", "a");
        return formulla;
    }
    
    public TemporalFormulla getTestFormulla_Complex(){
        TemporalFormulla formulla = new TemporalFormulla("RootFormulla");
        formulla.leftOperantFormulla = getTestFormulla_aUb();
        formulla.operator = TemporalOperator.V;
        formulla.rightOperantFormulla = getTestFormulla_Xa();
        return formulla;
    }
    
}
