package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.visitors.IProtocolDefinitionVisitor;

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

    /**
     * Implementation of the Visitor Pattern with a simple cycle detection to prevent infinite execution.
     */
    public void Accept(List<? extends IProtocolDefinitionVisitor> visitors) throws Exception {
        // Stop execution if visited before
        if(visitedBefore) {
            // Resetting to enable multiple passes.
            visitedBefore = false;
            return;
        }

        // Prevent second visits
        visitedBefore = true;

        // Do visit action for all visitors
        for(IProtocolDefinitionVisitor visitor : visitors){
            visitor.Visit(this);
        }

        // Recursively visit the whole tree
        for(ProtocolTransaction transaction : outgoingTransactions){
            transaction.targetState.Accept(visitors);
        }

        // Resetting to enable multiple passes.
        visitedBefore = false;

    }
}
