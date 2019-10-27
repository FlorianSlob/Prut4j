package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author FlorianSlob
 */
public class GraphNode {

    public GraphNode fatherNode; // We only need this for proof of correctness.
    
    public Set<GraphNode> childNodes = new HashSet<>();

    public String name;
    public Set<GraphNode> incomingEdges;
    public Set<TemporalProperty> newTemporalProperties = new HashSet<>();
    public Set<TemporalProperty> oldTemporalProperties = new HashSet<>();
    public Set<TemporalProperty> nextTemporalProperties = new HashSet<>();

    public GraphNode(String name, TemporalProperty property) {
        this.name = name;
        newTemporalProperties.add(property);
    }

    public void printTreeDepthFirst() {
        System.out.println(MessageFormat.format("Printing from {0}", name));
        childNodes.forEach((childNode)->childNode.printTreeDepthFirst());
    }

    public void expand(Set<GraphNode> graphNodeSet) {
        System.out.println("Expanding graphNode "+this.name);
        if(this.newTemporalProperties.isEmpty()){
            // Do C1
            System.out.println("New temporal properties are empty graphNode.");
        }
        else{
            // C2
        }
    }
}
