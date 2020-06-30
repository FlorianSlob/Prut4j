package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransition {

    public LtlTransitionExpression Expression;
    public Boolean AcceptanceSet0; // TODO Find out what this means
    public Boolean AcceptanceSet1; // TODO Find out what this means
    public LtlState ltlTargetState;

    public LtlTransition(LtlState ltlTargetState) {

        this.ltlTargetState = ltlTargetState;
    }
}
