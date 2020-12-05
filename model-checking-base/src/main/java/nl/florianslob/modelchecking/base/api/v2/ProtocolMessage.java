package nl.florianslob.modelchecking.base.api.v2;

public class ProtocolMessage {
    public ProtocolMessage(Object message, int originalTargetStateId){
        Message = message;
        OriginalTargetStateId = originalTargetStateId;
    }

    public int OriginalTargetStateId;
    public Object Message;

}
