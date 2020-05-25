package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransaction {
    public String Expression;
    public String AcceptanceSet;
    public LtlState ltlTargetState;

    public LtlTransaction(LtlState ltlTargetState) {

        this.ltlTargetState = ltlTargetState;
    }
}
