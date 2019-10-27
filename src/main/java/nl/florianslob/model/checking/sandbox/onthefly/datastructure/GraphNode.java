package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import java.text.MessageFormat;
import java.util.LinkedList;

/**
 *
 * @author FlorianSlob
 */
public class GraphNode {

    public GraphNode fatherNode;
    public LinkedList<GraphNode> childNodes = new LinkedList<>();

    public String name;
    public String[] incomingEdges;
    public LinkedList<TemporalProperty> newTemporalProperties = new LinkedList<>();
    public LinkedList<TemporalProperty> oldTemporalProperties = new LinkedList<>();
    public LinkedList<TemporalProperty> nextTemporalProperties = new LinkedList<>();

    public GraphNode(String name, TemporalProperty property) {
        this.name = name;
        newTemporalProperties.add(property);
    }

    public void expand() {
        System.out.println("nl.florianslob.model.checking.sandbox.onthefly.datastructure.GraphNode.expand()");
    }

    public void printTreeDepthFirst() {
        System.out.println(MessageFormat.format("Printing from {0}", name));
        childNodes.forEach((childNode)->childNode.printTreeDepthFirst());
    }
}
