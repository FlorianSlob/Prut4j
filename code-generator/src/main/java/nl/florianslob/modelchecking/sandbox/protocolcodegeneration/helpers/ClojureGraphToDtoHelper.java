package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.helpers;

import discourje.core.graph.Edge;
import discourje.core.graph.Graph;
import discourje.core.graph.Vertex;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.ProtocolStateNodesResult;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;

import java.util.*;

public class ClojureGraphToDtoHelper {

    private HashMap<Integer, ProtocolStateNode> allProtocolStateNodes;

    public ClojureGraphToDtoHelper(){

    }
    public ProtocolStateNodesResult parseGraphAndReturnInitialState(Graph graph) {
        if (graph.getRoots().size() != 1) {
            throw new IllegalStateException();
        }
        this.allProtocolStateNodes = new HashMap<>();
        var sortedVertices = new ArrayList<Vertex>(graph.getVertices());
        // Sort is not as 'Order by'. It wil sort the list itself and
        sortedVertices.sort(Comparator.comparingInt(key -> (int)graph.vertexIds.get(key))); // TODO Add order??

        // Create all nodes
        for (Vertex v : sortedVertices) {
            parseVertexToAddProtocolStateNodes(v);
        }

        // Couple all nodes through transitions
        for (Vertex v : sortedVertices) {
            parseVertexToAddTransitions(v);
        }

        //return the root node
        var root = graph.getRoots().iterator().next();
        var result = new ProtocolStateNodesResult();
        result.InitialState= this.allProtocolStateNodes.get(Integer.parseInt(root.toString()));

        // Why does this work this way?
        result.AllProtocolStateNodes  =this.allProtocolStateNodes.values().toArray(new ProtocolStateNode[0]);
        return result;
    }

    private void parseVertexToAddProtocolStateNodes(Vertex vertex){
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
        String type;

        var actionOnEdge = (clojure.lang.IPersistentVector) edge.label.action;

        var actionString = actionOnEdge.nth(0).toString();
        switch (actionString) {
            case ":send":
                action = ProtocolMessageActionType.SEND;
                type = edge.label.name.substring(edge.label.name.indexOf("(") + 1, edge.label.name.indexOf(","));
                break;
            case ":receive":
                action = ProtocolMessageActionType.RECEIVE;
                type = "nope!";
                break;
            case ":close":
                action = ProtocolMessageActionType.CLOSE;
                type = "CloseMessage";
                break;
            default:
                throw new IllegalStateException("The following action is not supported: "+actionString);
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
}
