package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTSendAction extends ASTEnvironmentActionFromState<ASTSendAction> {

    public final ASTCommunicationChannel communicationChannel;
    public final int nextStateId;
    public final String messageContentType;


    public ASTSendAction(ISyntaxWriter<ASTSendAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int nextStateId, String messageContentType) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
        this.messageContentType = messageContentType;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != ASTSendAction.class){
            return false;
        }
        var castedObject = (ASTSendAction)obj;
        // Return true if all conditions are met
        return this.communicationChannel == castedObject.communicationChannel
                &&
                this.nextStateId == castedObject.nextStateId
                &&
                this.messageContentType.equals(castedObject.messageContentType);
    }
}
