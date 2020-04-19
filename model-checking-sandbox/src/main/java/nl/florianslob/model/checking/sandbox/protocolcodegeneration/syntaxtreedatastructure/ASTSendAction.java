package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class ASTSendAction extends ASTEnvironmentActionFromState {

    public final ASTCommunicationChannel communicationChannel;
    public final int nextStateId;

    public ASTSendAction(ISyntaxWriter<ASTSendAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int nextStateId) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
    }
}
