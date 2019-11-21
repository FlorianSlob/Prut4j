package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class LtlFormulla {

    public String name;
    public TemporalProperty expression;
    public LtlFormulla leftOperantFormulla; // A parsed version would be nice!
    public TemporalOperator operator;
    public LtlFormulla rightOperantFormulla;
    public boolean isNegation;
    public Boolean truthValue = null;

    public LtlFormulla(LtlFormulla original) {
        // copy the object
        this.name = original.name;
        this.expression = original.expression;
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

    public LtlFormulla(String name, String expression) {
        this.name = name;
        this.expression = new TemporalProperty(expression);
    }

    boolean isLeafFormulla() {
        return expression != null || truthValue != null;
    }

    LtlFormulla getNegation() {
        LtlFormulla negation = new LtlFormulla(this);
        negation.isNegation = !negation.isNegation;
        return negation;
    }

    public void printRecursive() {

        if (expression != null) {
            expression.Print();
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
