package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTReceiveAction extends ASTEnvironmentActionFromState<ASTReceiveAction> {

    public final ASTCommunicationChannel communicationChannel;

    public final int currentStateId;
    public String messageContentType;

    public ASTReceiveAction(ISyntaxWriter<ASTReceiveAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int currentStateId, int nextStateId, String messageContentType) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
        this.currentStateId = currentStateId;
        this.messageContentType = messageContentType;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != ASTReceiveAction.class){
            return false;
        }
        var castedObject = (ASTReceiveAction)obj;
        // Return true if all conditions are met
        return this.communicationChannel == castedObject.communicationChannel
                &&
                this.nextStateId == castedObject.nextStateId
                &&
                this.currentStateId == castedObject.currentStateId
                &&
                this.messageContentType.equals(castedObject.messageContentType);
    }
}
