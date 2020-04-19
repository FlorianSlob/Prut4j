package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTWaitAction extends ASTEnvironmentActionFromState<ASTWaitAction> {
    public ASTWaitAction(ISyntaxWriter<ASTWaitAction> syntaxWriter) {
        super(syntaxWriter);
    }
}
