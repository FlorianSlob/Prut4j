package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author FlorianSlob
 */
public class StateNode {

    public Set<AtomicProposition> AtomicPropositions = new HashSet<>();
    private boolean IsAlreadyPrinted;
    public boolean MarkedAsVisitedPass1 = false;
    public boolean MarkedAsVisitedPass2 = false;

    public StateNode(int HashingNumber) {
        this.IsAlreadyPrinted = false;
        this.HashingNumber = HashingNumber;
    }

    public int HashingNumber;
    public Set<StateNode> Successors = new HashSet<>();

    public boolean checkDepthFirst(Set<LtlGraphNode> ltlGraphNodes) {

        for (LtlGraphNode ltlNode : ltlGraphNodes) {
            if (doesLtlNodeHoldInThisState(ltlNode)) {
                if (this.MarkedAsVisitedPass1) {
                    return true; // Cycle detected! Formulla does hold!
                }
                this.MarkedAsVisitedPass1 = true;

                if (ltlNode.nextFormullas.isEmpty()) {
                    // No cycle detected,
                    // but the formullas hold in this state
                    // and there are no formullas that have to hold in next states.
                    return true;
                }

                Set<LtlGraphNode> ltlChildNodes = ltlNode.childNodes;

                for (StateNode childNode : this.Successors) {
                    if (childNode.checkDepthFirst(ltlChildNodes)) {
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

    public boolean doesLtlNodeHoldInThisState(LtlGraphNode ltlNode) {

        for (LtlFormulla formulla : ltlNode.oldFormullas) {
            // only check on the atomic proposition level.
            // Other formullas are present for the LTL expansion algorithm, but can be ignored?
            // TODO Check this in the paper.

            if (formulla.atomicProposition != null) {
                // This formulla must hold for this state
                // This could be a negation!
                if (formulla.isNegation) {
                    if (this.AtomicPropositions.contains(formulla.atomicProposition)) {
                        return false;
                    }
                } else if (!this.AtomicPropositions.contains(formulla.atomicProposition)) {
                    return false;
                }
            }
        }

        // return true if all formullas hold in this state.
        return true;
    }

    public void printRecursively() {
        if (!IsAlreadyPrinted) {
            IsAlreadyPrinted = true;
            Successors.forEach((node) -> {
                System.out.println("Node:" + this.HashingNumber + " --> ChildNode:" + node.HashingNumber);
            });

            Successors.forEach((node) -> {
                node.printRecursively();
            });
        }
    }
}
