package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransitionExpressionAtomicProposition {
    public LtlTransitionExpressionAtomicPropositionDirection Direction;
    public String MessageType;
    public String Receiver;
    public String Participant;


    public LtlTransitionExpressionAtomicProposition
            (LtlTransitionExpressionAtomicPropositionDirection direction, String messageType,String participant, String receiver) {
        this.Direction = direction;
        this.MessageType = messageType;
        this.Participant = participant;
        this.Receiver = receiver;
    }

    public LtlTransitionExpressionAtomicProposition() {
        // keep empty constructor, we also want to mutate objects after creation.
    }
}
