package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author FlorianSlob
 */
public class StateNode {

    public Set<AtomicProposition> AtomicPropositions = new HashSet<>();
    private boolean IsAlreadyPrinted;
    public boolean MarkedAsVisitedPass1 = false;
//    public boolean MarkedAsVisitedPass2 = false; // TODO Use in
    public int HashingNumber;
    public Set<StateNode> Successors = new HashSet<>();

    public static Stack<StateNode> StateTrace = new Stack<>();

    public StateNode(final int HashingNumber) {
        this.IsAlreadyPrinted = false;
        this.HashingNumber = HashingNumber;
    }

    public void reportThisNodeAsReturningTrue() {
        StateTrace.add(this);
    }

    public boolean checkDepthFirst(final Set<LtlGraphNode> ltlGraphNodes) {

        for (final LtlGraphNode ltlNode : ltlGraphNodes) {
            if (doesLtlNodeHoldInThisState(ltlNode)) {
                if (this.MarkedAsVisitedPass1) {
                    reportThisNodeAsReturningTrue();
                    return true; // Cycle detected! Formula does hold!
                }
                this.MarkedAsVisitedPass1 = true;

                if (ltlNode.nextFormulas.isEmpty()) {
                    // No cycle detected,
                    // but the formulas hold in this state
                    // and there are no formulas that have to hold in next states.
                    reportThisNodeAsReturningTrue();
                    return true;
                }

                final Set<LtlGraphNode> ltlChildNodes = ltlNode.childNodes;

                // TODO Do we need this? For debugging only?
                for (final StateNode childNode : this.Successors) {
                    if (childNode.checkDepthFirst(ltlChildNodes)) {
                        reportThisNodeAsReturningTrue();
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
