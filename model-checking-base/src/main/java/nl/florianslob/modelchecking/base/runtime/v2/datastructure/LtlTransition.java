package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransition {

    public LtlTransitionExpression Expression;
    public boolean AcceptanceSet0; // TODO Find out what this means
    public boolean AcceptanceSet1; // TODO Find out what this means
    public LtlState ltlTargetState;

    public LtlTransition(LtlState ltlTargetState) {

        this.ltlTargetState = ltlTargetState;
    }
}
