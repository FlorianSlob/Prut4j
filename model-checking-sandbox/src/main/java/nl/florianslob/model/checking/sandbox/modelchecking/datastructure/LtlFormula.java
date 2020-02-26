package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class LtlFormula {

    public String name;
    public AtomicProposition atomicProposition;
    public LtlFormula leftOperandFormula;
    public TemporalOperator operator;
    public LtlFormula rightOperandFormula;
    public boolean isNegation;
    public Boolean truthValue = null;
    // needed for parsing.
    public LtlFormula parent;

    public LtlFormula(LtlFormula original) {
        // copy the object
        this.name = original.name;
        this.atomicProposition = original.atomicProposition;
        this.isNegation = original.isNegation;
        if (original.leftOperandFormula != null) {
            this.leftOperandFormula = new LtlFormula(original.leftOperandFormula);
        }
        this.operator = original.operator;
        if (original.rightOperandFormula != null) {
            this.rightOperandFormula = new LtlFormula(original.rightOperandFormula);
        }
        this.truthValue = original.truthValue;
    }

    public LtlFormula(String name) {
        this.name = name;
    }

    public LtlFormula(String name, AtomicProposition atomicProposition) {
        this.name = name;
        this.atomicProposition = atomicProposition;
    }

    boolean isLeafFormula() {
        return atomicProposition != null || truthValue != null;
    }

    LtlFormula getNegation() {
        LtlFormula negation = new LtlFormula(this);
        negation.isNegation = !negation.isNegation;
        return negation;
    }

    public void printRecursive() {

        if (atomicProposition != null) {
            atomicProposition.Print();
        }

        if (leftOperandFormula != null) {
            leftOperandFormula.printRecursive();
        }

        if (operator != null) {
            LoggingHelper.logInfo(" " + operator);
        }

        if (rightOperandFormula != null) {
            rightOperandFormula.printRecursive();
        }

    }

    public String getDisplayValueRecursive() {
        String value = "";
        if (atomicProposition != null) {
            return atomicProposition.getDisplayValue();
        }

        if (leftOperandFormula != null) {
            value += leftOperandFormula.getDisplayValueRecursive();
        }

        if (operator != null) {
            value += operator;
        }

        if (rightOperandFormula != null) {
            value += rightOperandFormula.getDisplayValueRecursive();
        }

        return value;
    }
}
