package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransition;

public class TriedTransitionTuple {

    private final String stateId;
    private final StateSpaceExploringAction exploringAction;
    private final String threadName;
    private final LtlTransition ltlTransition;

    public TriedTransitionTuple(String stateId, StateSpaceExploringAction exploringAction, String threadName, LtlTransition ltlTransition) {
        this.stateId = stateId;
        this.exploringAction = exploringAction;
        this.threadName = threadName;
        this.ltlTransition = ltlTransition;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == TriedTransitionTuple.class) {
            var castedObj = (TriedTransitionTuple) obj;
            if(castedObj.stateId.equals(this.stateId)
                    && castedObj.threadName == this.threadName
                    && castedObj.exploringAction.equals(this.exploringAction)
                    && castedObj.ltlTransition.equals(this.ltlTransition)
            ){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return " ( State: "+this.stateId +" Exploring action: "+ exploringAction.toString()+")";
    }
}
