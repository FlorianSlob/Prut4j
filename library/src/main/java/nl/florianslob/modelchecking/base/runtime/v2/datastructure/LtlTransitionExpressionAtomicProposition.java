package nl.florianslob.modelchecking.base.runtime.v2.datastructure;

public class LtlTransitionExpressionAtomicProposition {
    public LtlTransitionExpressionAtomicPropositionDirection Direction;
    public String MessageType;
    public String Receiver;
    private String Participant;

    public void setParticipant(String participant){
        this.Participant = participant;
    }

    public String getParticipant(){
        return this.Participant;
    }

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

    @Override
    public String toString(){
        return  "Direction: "+Direction +" Type:"+MessageType+" Participant:"+Participant+" Receiver:"+Receiver;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == LtlTransitionExpressionAtomicProposition.class) {
            var castedObj = (LtlTransitionExpressionAtomicProposition) obj;
            if (castedObj.Direction == this.Direction
                &&
                    // TODO Static helper for null sensitive comparison
                    ((castedObj.MessageType == null && this.MessageType == null) || (!(castedObj.MessageType == null || this.MessageType == null) && castedObj.MessageType.equals(this.MessageType)))
                &&
                    ((castedObj.Participant == null && this.Participant == null) || (!(castedObj.Participant == null || this.Participant == null) && castedObj.Participant.equals(this.Participant)))
                &&
                    ((castedObj.Receiver == null && this.Receiver == null) || (!(castedObj.Receiver == null || this.Receiver == null) && castedObj.Receiver.equals(this.Receiver)))
            ) {
                return true;
            }
        }
        return false;
    }

}
