package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

public class TraceInformation {


    public TraceNode currentTraceNode = null;

    public void reportNodeAsReturningTrue(StateNode node, LtlGraphNode ltlGraphNode) {

        TraceNode newTraceNode = new TraceNode(node,ltlGraphNode);

        newTraceNode.nextNode = currentTraceNode;
        currentTraceNode = newTraceNode;
    }
}
