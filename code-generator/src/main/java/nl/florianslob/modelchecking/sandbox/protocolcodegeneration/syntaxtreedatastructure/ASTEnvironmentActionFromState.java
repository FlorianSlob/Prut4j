package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

import java.util.HashSet;
import java.util.Set;

public abstract class ASTEnvironmentActionFromState<T extends ASTEnvironmentActionFromState> extends SyntaxTreeItemBase<T> {

    public int nextStateId;
    public int nextLocalStateId;
    public Set<Integer> allNextStatesForLocalType = new HashSet<>();
    public boolean isLocalAction = false;

    public ASTEnvironmentActionFromState(ISyntaxWriter<T> syntaxWriter){
        super(syntaxWriter);
    }
}
