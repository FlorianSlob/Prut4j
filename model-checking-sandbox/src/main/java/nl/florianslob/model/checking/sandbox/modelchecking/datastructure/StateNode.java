package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.base.GraphNode;

import java.util.*;

/**
 *
 * @author FlorianSlob
 */
public class StateNode extends GraphNode {


    private boolean nodeVisitedBefore = false;

    public String getName(){
        return ""+this.HashingNumber;
    }

    @Override
    public String getPlantUmlNodesRecursively() {
        // Add data fields
        String returnString = this.getName() + "\n"; // finish current row.

        if (!nodeVisitedBefore) {
            returnString += this.getName() + " : "+this.getDisplayValuesForAtomicPropositions()+" \n";
            nodeVisitedBefore = true;

            if (this.Successors != null && !this.Successors.isEmpty()) {
                for (StateNode childNode : this.Successors) {
                    returnString += this.getName() +" --> "+ childNode.getPlantUmlNodesRecursively();
                }
            }

        }
        return returnString;
    }

    // TODO use concat string function!
    public String getDisplayValuesForAtomicPropositions(){
        String returnString = "";

        for(AtomicProposition proposition : AtomicPropositions){
            returnString += proposition.getDisplayValue();
        }
        return returnString;
    }


    public Set<AtomicProposition> AtomicPropositions = new HashSet<>();
    private boolean IsAlreadyPrinted;
    public boolean MarkedAsVisitedPass1 = false;
//    public boolean MarkedAsVisitedPass2 = false; // TODO Use in
    public int HashingNumber;
    public Set<StateNode> Successors = new HashSet<>();


    public StateNode(final int HashingNumber) {
        this.IsAlreadyPrinted = false;
        this.HashingNumber = HashingNumber;
    }

    public Set<LtlGraphNode> VisitedByLtlNodes = new HashSet<>();

    public boolean checkDepthFirst(final Set<LtlGraphNode> ltlGraphNodes, TraceInformation traceInformation) {

        for (final LtlGraphNode ltlNode : ltlGraphNodes) {
            if (doesLtlNodeHoldInThisState(ltlNode)) {
                if (this.MarkedAsVisitedPass1 && this.VisitedByLtlNodes.contains(ltlNode)) {
                    traceInformation.reportNodeAsReturningTrue(this, ltlNode);
                    return true; // Cycle detected! Formula does hold! !!
                    // Not a real cycle!!! It's a product, LTL nodes can
                }
                this.MarkedAsVisitedPass1 = true;
                this.VisitedByLtlNodes.add(ltlNode); // Detect repetitions

                if (ltlNode.nextFormulas.isEmpty()) {
                    // No cycle detected,
                    // but the formulas hold in this state
                    // and there are no formulas that have to hold in next states.
                    traceInformation.reportNodeAsReturningTrue(this, ltlNode);
                    return true;
                }

                final Set<LtlGraphNode> ltlChildNodes = ltlNode.childNodes;

                // TODO Do we need this? For debugging only?
                for (final StateNode childNode : this.Successors) {
                    if (childNode.checkDepthFirst(ltlChildNodes,traceInformation)) {
                        traceInformation.reportNodeAsReturningTrue(this, ltlNode);
                        return true;
                    }
                }
            }
        }

        // no ltlStateNode does hold in the current state AND
        // no Cycles are detected in successor states AND
        // no final states have been found.
        return false;
    }

    public boolean doesLtlNodeHoldInThisState(final LtlGraphNode ltlNode) {

        for (final LtlFormula formula : ltlNode.oldFormulas) {
            // only check on the atomic proposition level.
            // Other formulas are present for the LTL expansion algorithm, but can be ignored?
            // TODO Check this in the paper.

            if (formula.atomicProposition != null) {
                // This formula must hold for this state
                // This could be a negation!
                if (formula.isNegation) {
                    if (this.AtomicPropositions.contains(formula.atomicProposition)) {
                        return false;
                    }
                } else if (!this.AtomicPropositions.contains(formula.atomicProposition)) {
                    return false;
                }
            }
        }

        // return true if all formulas hold in this state.
        return true;
    }

    public void printRecursively() {
        if (!IsAlreadyPrinted) {
            IsAlreadyPrinted = true;

            Successors.forEach((node) -> System.out.println("Node:" + this.HashingNumber + " --> ChildNode:" + node.HashingNumber));
            Successors.forEach(StateNode::printRecursively);
        }
    }
}
