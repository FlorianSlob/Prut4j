package nl.florianslob.modelchecking.base.runtime.v2;

public class GenericParticipantAction {

    public static GenericParticipantAction GetReceiveAction(){
        return new GenericParticipantAction();
    }

    public static GenericParticipantAction GetSendAction(Object message){
        return new GenericParticipantAction(message);
    }

    private GenericParticipantAction() {
        this.type = GenericParticipantActionType.RECEIVE;
    }

    private GenericParticipantAction(Object message) {
        this.type = GenericParticipantActionType.SEND;
        this.message = message;
    }

    public final GenericParticipantActionType type;
    public Object message;
}
