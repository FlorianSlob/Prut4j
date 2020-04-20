package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTSendAction extends ASTEnvironmentActionFromState<ASTSendAction> {

    public final ASTCommunicationChannel communicationChannel;
    public final int nextStateId;

    public ASTSendAction(ISyntaxWriter<ASTSendAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int nextStateId) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
    }
}
