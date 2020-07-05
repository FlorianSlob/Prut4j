package nl.florianslob.modelchecking.base.runtime.v2;

public class TriedTransitionTuple {

    private final int stateId;
    private final StateSpaceExploringAction exploringAction;
    private final String threadName;

    public TriedTransitionTuple(int stateId, StateSpaceExploringAction exploringAction, String threadName) {
        this.stateId = stateId;
        this.exploringAction = exploringAction;
        this.threadName = threadName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == TriedTransitionTuple.class) {
            var castedObj = (TriedTransitionTuple) obj;
            if(castedObj.stateId == this.stateId && castedObj.threadName == this.threadName && castedObj.exploringAction.equals(this.exploringAction)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
