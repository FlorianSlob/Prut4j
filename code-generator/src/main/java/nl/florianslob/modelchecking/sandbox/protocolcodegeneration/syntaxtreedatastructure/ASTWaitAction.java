package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public class ASTWaitAction extends ASTEnvironmentActionFromState<ASTWaitAction> {
    public ASTWaitAction(ISyntaxWriter<ASTWaitAction> syntaxWriter) {
        super(syntaxWriter);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != ASTSendAction.class){
            return false;
        }
        // all wait actions are the same, no parameters to check.
        return true;
    }
}
