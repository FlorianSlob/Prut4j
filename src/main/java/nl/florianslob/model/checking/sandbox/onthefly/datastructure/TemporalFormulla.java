package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

/**
 *
 * @author FlorianSlob TODO Add getters and setters with validation rules!
 */
public class TemporalFormulla {

    public String name;
    public TemporalProperty expression;
    public TemporalFormulla leftOperantFormulla; // A parsed version would be nice!
    public TemporalOperator operator;
    public TemporalFormulla rightOperantFormulla;
    public boolean isNegation;
    public Boolean truthValue = null;

    public TemporalFormulla(TemporalFormulla original) {
        // copy the object
        this.name = original.name;
        this.expression = original.expression;
        this.isNegation = original.isNegation;
        if (original.leftOperantFormulla != null) {
            this.leftOperantFormulla = new TemporalFormulla(original.leftOperantFormulla);
        }
        this.operator = original.operator;
        if (original.rightOperantFormulla != null) {
            this.rightOperantFormulla = new TemporalFormulla(original.rightOperantFormulla);
        }
        this.truthValue = original.truthValue;
    }

    public TemporalFormulla(String name) {
        this.name = name;
    }

    public TemporalFormulla(String name, String expression) {
        this.name = name;
        this.expression = new TemporalProperty(expression);
    }

    boolean isLeafFormulla() {
        return expression != null || truthValue != null;
    }

    TemporalFormulla getNegation() {
        TemporalFormulla negation = new TemporalFormulla(this);
        negation.isNegation = !negation.isNegation;
        return negation;
    }

    public void printRecursive() {
        System.out.println("Printing TemporalFormulla.");

        System.out.println("Name: " + name);
        
        if (expression != null){
            System.out.println("Printing Expression");
            expression.Print();
        }

        if (leftOperantFormulla != null) {
            System.out.println("Printing Left part.");
            leftOperantFormulla.printRecursive();
        }
        
        if (operator != null){
            System.out.println("Operator: " + operator);
        }
        
        if (rightOperantFormulla != null) {
            System.out.println("Printing Right part.");
            rightOperantFormulla.printRecursive();
        }

    }
}
