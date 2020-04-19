package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public abstract class ASTEnvironmentActionFromState<T extends ASTEnvironmentActionFromState> extends SyntaxTreeItemBase<T> {

    public ASTEnvironmentActionFromState(ISyntaxWriter<T> syntaxWriter){
        super(syntaxWriter);
    }
}
