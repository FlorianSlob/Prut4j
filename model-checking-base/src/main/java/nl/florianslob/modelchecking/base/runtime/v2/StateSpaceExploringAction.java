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
        System.out.println("Action from "+this.participant+" with type "+this.direction.toString()+" with dummy: "+this.dummy +" + with class "+this.messageClass);
    }
}
