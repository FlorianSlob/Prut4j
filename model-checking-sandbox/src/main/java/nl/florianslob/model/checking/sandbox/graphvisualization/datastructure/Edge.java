package nl.florianslob.model.checking.sandbox.graphvisualization.datastructure;

public class Edge {
    public Node fromNode, toNode;

    public Edge(Node from, Node to) {
        this.fromNode = from;
        this.toNode = to;
    }
}
