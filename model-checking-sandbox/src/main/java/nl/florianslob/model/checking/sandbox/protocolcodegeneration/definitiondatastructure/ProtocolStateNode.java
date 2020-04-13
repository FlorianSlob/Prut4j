package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import java.util.HashSet;
import java.util.List;

public class ProtocolStateNode {
    public HashSet<ProtocolTransaction> outgoingTransactions = new HashSet<>();
    public int stateId;
    private boolean visitedBefore = false;

    public ProtocolStateNode(int stateId){
        this.stateId = stateId;
    }

    public void AddOutgoingTransaction(ProtocolTransaction outgoingTransaction){
        this.outgoingTransactions.add(outgoingTransaction);
    }

    public void Accept(List<IVisitor<ProtocolStateNode>> visitors){
        // Stop execution if visited before
        if(visitedBefore) return;

        // Prevent second visits
        visitedBefore = true;

        // Do visit action for all visitors
        for(IVisitor<ProtocolStateNode> visitor : visitors){
            visitor.Visit(this);
        }

        // Recursively visit the whole tree
        for(ProtocolTransaction transaction : outgoingTransactions){
            transaction.targetState.Accept(visitors);
        }
    }
}
