package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob TODO Add getters and setters with validation rules!
 */
public class LtlFormulla {

    public String name;
    public AtomicProposition atomicProposition;
    public LtlFormulla leftOperantFormulla;
    public TemporalOperator operator;
    public LtlFormulla rightOperantFormulla;
    public boolean isNegation;
    public Boolean truthValue = null;

    public LtlFormulla(LtlFormulla original) {
        // copy the object
        this.name = original.name;
        this.atomicProposition = original.atomicProposition;
        this.isNegation = original.isNegation;
        if (original.leftOperantFormulla != null) {
            this.leftOperantFormulla = new LtlFormulla(original.leftOperantFormulla);
        }
        this.operator = original.operator;
        if (original.rightOperantFormulla != null) {
            this.rightOperantFormulla = new LtlFormulla(original.rightOperantFormulla);
        }
        this.truthValue = original.truthValue;
    }

    public LtlFormulla(String name) {
        this.name = name;
    }

    public LtlFormulla(String name, AtomicProposition atomicProposition) {
        this.name = name;
        this.atomicProposition = atomicProposition;
    }

    boolean isLeafFormulla() {
        return atomicProposition != null || truthValue != null;
    }

    LtlFormulla getNegation() {
        LtlFormulla negation = new LtlFormulla(this);
        negation.isNegation = !negation.isNegation;
        return negation;
    }

    public void printRecursive() {

        if (atomicProposition != null){
            atomicProposition.Print();
        }

        if (leftOperantFormulla != null) {
            leftOperantFormulla.printRecursive();
        }
        
        if (operator != null){
            LoggingHelper.logInfo(" " + operator);
        }
        
        if (rightOperantFormulla != null) {
            rightOperantFormulla.printRecursive();
        }

    }
}
