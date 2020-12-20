package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionAtomicPropositionDirection;

public class StateSpaceExploringAction {
    public final String participant;
    public final LtlTransitionExpressionAtomicPropositionDirection direction;
    public final Object dummy;
    public final Class<?> messageClass;
    public final String receiver;

    private StateSpaceExploringAction(String participant, LtlTransitionExpressionAtomicPropositionDirection direction, Object dummy, Class<?> messageClass, String receiver){
        this.participant = participant;
        this.direction = direction;
        this.dummy = dummy;
        this.messageClass = messageClass;
        this.receiver = receiver;
    }

    public static StateSpaceExploringAction CreateSendStateSpaceExploringAction(String participant, Object dummy, String receiver){
        return new StateSpaceExploringAction(
                participant,
                LtlTransitionExpressionAtomicPropositionDirection.SEND,
                dummy,
                dummy.getClass(),
                receiver);
    }

    public static StateSpaceExploringAction CreateReceiveStateSpaceExploringAction(String participant, Class<?> messageClass){
        return new StateSpaceExploringAction(
                participant,
                LtlTransitionExpressionAtomicPropositionDirection.RECEIVE,
                null,
                messageClass,
                participant);
    }

    public void Print(){
        Engine.LogTest("Action from "+this.participant+" with type "+this.direction.toString()+" with dummy: "+this.dummy +" + with class "+this.messageClass);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == StateSpaceExploringAction.class) {
            var castedObj = (StateSpaceExploringAction) obj;
            if(castedObj.participant.equalsIgnoreCase(this.participant)
                    && castedObj.direction == this.direction
                    // TODO Wow, this needs simplification
                    && (
                            (castedObj.dummy == null && this.dummy == null)
                                    ||
                            (castedObj.dummy != null && this.dummy != null && castedObj.dummy.getClass() == this.dummy.getClass())
                        )
                    && castedObj.messageClass == this.messageClass
                    && castedObj.receiver.equalsIgnoreCase(this.receiver)){
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
        return "(Participant: "+this.participant+", Action: "+this.direction+", Receiver: "+this.receiver+")";
    }
}
