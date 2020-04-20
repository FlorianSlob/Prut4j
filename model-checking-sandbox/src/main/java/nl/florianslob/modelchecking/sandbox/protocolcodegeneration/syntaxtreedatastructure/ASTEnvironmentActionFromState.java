package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public abstract class ASTEnvironmentActionFromState<T extends ASTEnvironmentActionFromState> extends SyntaxTreeItemBase<T> {

    public ASTEnvironmentActionFromState(ISyntaxWriter<T> syntaxWriter){
        super(syntaxWriter);
    }
}
