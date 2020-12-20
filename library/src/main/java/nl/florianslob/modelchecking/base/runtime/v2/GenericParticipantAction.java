package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionAtomicPropositionDirection;

public class GenericParticipantAction {

    public static GenericParticipantAction GetReceiveAction(){
        return new GenericParticipantAction();
    }

    public static GenericParticipantAction GetSendAction(Object message){
        return new GenericParticipantAction(message);
    }

    private GenericParticipantAction() {
        this.direction = LtlTransitionExpressionAtomicPropositionDirection.RECV;
    }

    private GenericParticipantAction(Object message) {
        this.direction = LtlTransitionExpressionAtomicPropositionDirection.SEND;
        this.message = message;
    }

    public final LtlTransitionExpressionAtomicPropositionDirection direction;
    public Object message;
}
