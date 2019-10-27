package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

/**
 *
 * @author FlorianSlob
 */
public class TemporalProperty {
    public String name; 
    public TemporalLogicExpression expression;
    public TemporalProperty leftProperty; // A parsed version would be nice!
    public TemporalOperator operator;
    public TemporalProperty rightProperty;

    public TemporalProperty(String name) {
        this.name = name;
    }

    public TemporalProperty(String leftProperty, String expression) {
        this.name = name;
        this.expression = new TemporalLogicExpression(expression);
    }
}
