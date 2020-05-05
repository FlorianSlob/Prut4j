package nl.florianslob.modelchecking.base.runtime.v2;

public class TriedTransactionTuple {

    private final int stateId;
    private final StateSpaceExploringAction exploringAction;
    private final String threadName;

    public TriedTransactionTuple(int stateId, StateSpaceExploringAction exploringAction, String threadName) {
        this.stateId = stateId;
        this.exploringAction = exploringAction;
        this.threadName = threadName;
    }

    // TODO Check necessity
    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == TriedTransactionTuple.class) {
            var castedObj = (TriedTransactionTuple) obj;
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
