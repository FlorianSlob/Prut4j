package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTReceiveAction extends ASTEnvironmentActionFromState {

    public final ASTCommunicationChannel communicationChannel;

    public final int nextStateId;
    public final int currentStateId;

    public ASTReceiveAction(ISyntaxWriter<ASTReceiveAction> syntaxWriter, ASTCommunicationChannel communicationChannel, int currentStateId, int nextStateId) {
        super(syntaxWriter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
        this.currentStateId = currentStateId;
    }
}
