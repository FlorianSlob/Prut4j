package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class LtlFormula {

    public String name;
    public AtomicProposition atomicProposition;
    public LtlFormula leftOperantFormulla;
    public TemporalOperator operator;
    public LtlFormula rightOperantFormulla;
    public boolean isNegation;
    public Boolean truthValue = null;

    public LtlFormula(LtlFormula original) {
        // copy the object
        this.name = original.name;
        this.atomicProposition = original.atomicProposition;
        this.isNegation = original.isNegation;
        if (original.leftOperantFormulla != null) {
            this.leftOperantFormulla = new LtlFormula(original.leftOperantFormulla);
        }
        this.operator = original.operator;
        if (original.rightOperantFormulla != null) {
            this.rightOperantFormulla = new LtlFormula(original.rightOperantFormulla);
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

    boolean isLeafFormulla() {
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

        if (leftOperantFormulla != null) {
            leftOperantFormulla.printRecursive();
        }

        if (operator != null) {
            LoggingHelper.logInfo(" " + operator);
        }

        if (rightOperantFormulla != null) {
            rightOperantFormulla.printRecursive();
        }

    }
}
