package nl.florianslob.model.checking.sandbox.protocolimplementations;

public class GenericParticipantAction {

    public static GenericParticipantAction GetReceiveAction(){
        return new GenericParticipantAction();
    }

    public static GenericParticipantAction GetSendAction(ProtocolMessage message){
        return new GenericParticipantAction(message);
    }

    private GenericParticipantAction() {
        this.type = GenericParticipantActionType.RECEIVE;
    }

    private GenericParticipantAction(ProtocolMessage message) {
        this.type = GenericParticipantActionType.SEND;
        this.message = message;
    }

    public final GenericParticipantActionType type;
    public ProtocolMessage message;
}
