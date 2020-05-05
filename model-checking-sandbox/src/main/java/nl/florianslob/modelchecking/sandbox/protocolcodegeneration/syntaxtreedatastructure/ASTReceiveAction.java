package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTReceiveAction extends ASTEnvironmentActionFromState<ASTReceiveAction> {

    public final ASTCommunicationChannel communicationChannel;

    public final int nextStateId;
    public final int currentStateId;
    public final String messageContentType;

    public ASTReceiveAction(ISyntaxWriter<ASTReceiveAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int currentStateId, int nextStateId, String messageContentType) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
        this.currentStateId = currentStateId;
        this.messageContentType = messageContentType;
    }
}
