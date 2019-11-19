package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author FlorianSlob
 */
public class StateNode {

    public Set<AtomicProposition> AtomicPropositions = new HashSet<>();
    private boolean isAlreadyPrinted = false;
    public boolean MarkedAsVisitedPass1 = false;    
    public boolean MarkedAsVisitedPass2 = false;

    public StateNode(int HashingNumber) {
         this.HashingNumber = HashingNumber;
    }
    
    public int HashingNumber;
    public Set<StateNode> Successors = new HashSet<>();
    
    public void printRecursively(){
        if(!isAlreadyPrinted){
            isAlreadyPrinted = true;
            Successors.forEach((node)-> {
                System.out.println("Node:"+this.HashingNumber+ " --> ChildNode:"+node.HashingNumber);
            });

            Successors.forEach((node)-> {
                node.printRecursively(); // TODO Add depth!
            });
        }
    }
}
