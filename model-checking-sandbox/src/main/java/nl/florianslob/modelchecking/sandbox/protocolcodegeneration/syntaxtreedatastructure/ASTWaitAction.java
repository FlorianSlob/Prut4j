package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTWaitAction extends ASTEnvironmentActionFromState<ASTWaitAction> {
    public ASTWaitAction(ISyntaxWriter<ASTWaitAction> syntaxWriter) {
        super(syntaxWriter);
    }
}
