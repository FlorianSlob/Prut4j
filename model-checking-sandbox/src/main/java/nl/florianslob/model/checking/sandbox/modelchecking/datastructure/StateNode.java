package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.base.GraphNode;

import java.util.*;
import java.util.stream.Collectors;

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
        StringBuilder returnString = new StringBuilder(this.getName() + "\n"); // finish current row.

        if (!nodeVisitedBefore) {
            returnString.append(this.getName()).append(" : ").append(this.getDisplayValuesForAtomicPropositions()).append(" \n");
            nodeVisitedBefore = true;

            if (!this.Successors.isEmpty()) {
                for (StateNode childNode : this.Successors) {
                    returnString.append(this.getName()).append(" --> ").append(childNode.getPlantUmlNodesRecursively());
                }
            }

        }
        return returnString.toString();
    }

    public String getDisplayValuesForAtomicPropositions(){
        return AtomicPropositions.stream().map(ap -> ap.content).collect(Collectors.joining(", "));
    }

    public final Set<AtomicProposition> AtomicPropositions = new HashSet<>();
    public boolean MarkedAsVisitedPass1 = false;
//    public boolean MarkedAsVisitedPass2 = false; // TODO Implement second pass.
    public final int HashingNumber;
    public final Set<StateNode> Successors = new HashSet<>();


    public StateNode(final int HashingNumber) {
        this.HashingNumber = HashingNumber;
    }

    public final Set<LtlGraphNode> VisitedByLtlNodes = new HashSet<>();

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
                Boolean hasSameAtomicProposition = hasSameAtomicProposition(formula.atomicProposition);

                if (formula.isNegation) {
                    if (hasSameAtomicProposition) {
                        return false;
                    }
                } else if (!hasSameAtomicProposition) {
                    return false;
                }
            }
        }

        // return true if all formulas hold in this state.
        return true;
    }

    private Boolean hasSameAtomicProposition(AtomicProposition atomicProposition) {
        for(AtomicProposition at : this.AtomicPropositions){
            if(at.content.equals(atomicProposition.content)){
                return true;
            }
        }
        return false;
    }

    public String GetHashingNumberKey() {
        return ""+HashingNumber;
    }
}
