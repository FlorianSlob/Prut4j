package nl.florianslob.modelchecking.base.runtime.v2;

public class StateSpaceExploringAction {
    public final String participant;
    public final ParticipantActionType actionType;
    public final Object dummy;
    public final Class<?> messageClass;

    private StateSpaceExploringAction(String participant, ParticipantActionType actionType, Object dummy, Class<?> messageClass){

        this.participant = participant;
        this.actionType = actionType;
        this.dummy = dummy;
        this.messageClass = messageClass;
    }

    public static StateSpaceExploringAction CreateSendStateSpaceExploringAction(String participant, Object dummy){
        return new StateSpaceExploringAction(participant,ParticipantActionType.SEND, dummy, dummy.getClass());
    }

    public static StateSpaceExploringAction CreateReceiveStateSpaceExploringAction(String participant, Class<?> messageClass){
        return new StateSpaceExploringAction(participant,ParticipantActionType.RECEIVE, null, messageClass);
    }

    public void Print(){
        System.out.println("Action from "+this.participant+" with type "+this.actionType.toString()+" with dummy: "+this.dummy +" + with class "+this.messageClass);
    }

    // TODO Check necessity
    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == StateSpaceExploringAction.class) {
            var castedObj = (StateSpaceExploringAction) obj;
            if(
                        castedObj.participant == this.participant
                                &&
                        castedObj.actionType == this.actionType
                                &&
                        castedObj.messageClass == this.messageClass
                                &&
                        (
                                (castedObj.dummy == null && this.dummy== null)
                                        ||
                                castedObj.dummy.equals(this.dummy)
                        )
            ){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}
