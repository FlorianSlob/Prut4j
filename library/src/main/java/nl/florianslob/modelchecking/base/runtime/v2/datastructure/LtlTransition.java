package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

import nl.florianslob.modelchecking.base.runtime.v2.TriedTransitionTuple;

public class LtlTransition {

    public LtlTransitionExpression Expression;
    public boolean AcceptanceSet0; // TODO Find out what this means
    public boolean AcceptanceSet1; // TODO Find out what this means
    public LtlState ltlTargetState;

    public LtlTransition(LtlState ltlTargetState) {
        this.ltlTargetState = ltlTargetState;
    }

    @Override
    public String toString(){
        return Expression.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(obj.getClass() == LtlTransition.class) {
            var castedObj = (LtlTransition) obj;
            if(
                    castedObj.Expression.equals(this.Expression)
                    &&
                    castedObj.AcceptanceSet0 == this.AcceptanceSet0
                    &&
                    castedObj.AcceptanceSet1 == this.AcceptanceSet1
                    &&
                    castedObj.ltlTargetState.stateNumber == this.ltlTargetState.stateNumber
            ){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }

}
