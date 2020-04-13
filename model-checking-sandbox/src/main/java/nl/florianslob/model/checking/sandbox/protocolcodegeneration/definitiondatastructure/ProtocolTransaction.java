package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

public class ProtocolTransaction {
    public final ProtocolStateNode targetState;
    public final ProtocolMessageAction action;
    public final String fromRole;
    public final String toRole;
    public final String messageContentType;

    public ProtocolTransaction(ProtocolStateNode targetState, ProtocolMessageAction action, String fromRole, String toRole, String messageContentType){
        this.targetState = targetState;
        this.action = action;
        this.fromRole = fromRole;
        this.toRole = toRole;
        this.messageContentType = messageContentType;
    }
}
