package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.helpers;

import discourje.core.graph.Edge;
import discourje.core.graph.Graph;
import discourje.core.graph.Vertex;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;

import java.util.*;

public class ClojureGraphToDtoHelper {

    private HashMap<Integer, ProtocolStateNode> allProtocolStateNodes;

    public ClojureGraphToDtoHelper(){

    }
    public ProtocolStateNode parseGraphAndReturnInitialState(Graph graph) {
        if (graph.getRoots().size() != 1) {
            throw new IllegalStateException();
        }
        allProtocolStateNodes = new HashMap<>();
        var sortedVertices = new ArrayList<Vertex>(graph.getVertices());
        // Sort is not as 'Order by'. It wil sort the list itself and
        sortedVertices.sort(Comparator.comparingInt(key -> (int)graph.vertexIds.get(key))); // TODO Add order??
        for (Vertex v : sortedVertices) {
            parseVertexToAddProtocolStateNodes(v);
            // Do stuff recursively? --> No
        }

        for (Vertex v : sortedVertices) {
            parseVertexToAddTransitions(v);
            // Do stuff recursively
        }

        var root = graph.getRoots().iterator().next();
        // root.toString prints the id?
        var rootState = allProtocolStateNodes.get(Integer.parseInt(root.toString()));
//        b.append("return state").append(root).append(";");

        return rootState;
    }

    private void parseVertexToAddProtocolStateNodes(Vertex vertex){
        //vertex.expand();// TODO We might need this.
        var nodeId = Integer.parseInt(vertex.toString());
        var stateToAppend =  new ProtocolStateNode(nodeId);
        allProtocolStateNodes.put(nodeId, stateToAppend);
    }

    private void parseVertexToAddTransitions(Vertex vertex){
        vertex.expand();;

        var nodeId = Integer.parseInt(vertex.toString());

        var stateToAddTransitionsTo = allProtocolStateNodes.get(nodeId);
        for (Edge edge : (Collection<Edge>)vertex.getEdges().get()) {
            stateToAddTransitionsTo.outgoingTransactions.add(
                    parseEdgeToTransition(edge)
            );
        }

    }

    private ProtocolTransition parseEdgeToTransition(Edge edge){
        var targetStateNode = allProtocolStateNodes.get(Integer.parseInt(edge.target.toString()));
        ProtocolMessageActionType action;

        String op, type;

        var actionOnEdge = (clojure.lang.IPersistentVector) edge.label.action;

        switch (actionOnEdge.nth(0).toString()) {
            case ":send":
                action = ProtocolMessageActionType.SEND;
                type = edge.label.name.substring(edge.label.name.indexOf("(") + 1, edge.label.name.indexOf(","));
                break;
            case ":receive":
                action = ProtocolMessageActionType.RECEIVE;
                type = "Object";
                break;
            default:
                throw new IllegalStateException();
        }

        String sender = actionOnEdge.nth(1).toString();
        String receiver = actionOnEdge.nth(2).toString();

        return new ProtocolTransition(
                targetStateNode,
                action,
                sender,
                receiver,
                type);
    }

    // TODO move to separate class
    public static String toJava(Graph graph) {
        if (graph.getRoots().size() != 1) {
            throw new IllegalStateException();
        }

        var b = new StringBuilder();
        b.append("private static ProtocolStateNode getInitialState() {");

        var sortedVertices = new ArrayList<Vertex>(graph.getVertices());
        // Sort is not as 'Order by'. It wil sort the list itself and
        sortedVertices.sort(Comparator.comparingInt(key -> (int)graph.vertexIds.get(key))); // TODO Add order??
        for (Vertex v : sortedVertices) {
            b.append(System.lineSeparator());
            b.append(toJava(v));
        }

        var root = graph.getRoots().iterator().next();
        b.append(System.lineSeparator());
        b.append("return state").append(root).append(";");
        b.append(System.lineSeparator());
        b.append("}");

        return b.toString();
    }

    public static String toJava(Vertex v) {
        v.expand();

        var b = new StringBuilder();
        b.append("var state").append(v).append(" = new ProtocolStateNode(").append(v).append(");");

        for (Edge e : (Collection<Edge>)v.getEdges().get()) {
            b.append(System.lineSeparator());
            b.append("state").append(v).append(".AddOutgoingTransaction(").append(toJava(e)).append(");");
        }
        return b.toString();
    }

    public static String toJava(Edge e) {
        var v = (clojure.lang.IPersistentVector) e.label.action;

        String op, type;
        switch (v.nth(0).toString()) {
            case ":send":
                op = "SEND";
                type = e.label.name.substring(e.label.name.indexOf("(") + 1, e.label.name.indexOf(","));
                break;
            case ":receive":
                op = "RECEIVE";
                type = "Object";
                break;
            default:
                throw new IllegalStateException();
        }

        String sender = v.nth(1).toString();
        String receiver = v.nth(2).toString();

        var b = new StringBuilder();
        b.append("new ProtocolTransaction(");
        b.append("state").append(e.target);
        b.append(", ");
        b.append("ProtocolMessageActionType.").append(op);
        b.append(", ");
        b.append("\"").append(sender).append("\"");
        b.append(", ");
        b.append("\"").append(receiver).append("\"");
        b.append(", ");
        b.append("\"").append(type).append("\"");
        b.append(")");
        return b.toString();
    }
}
