package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public abstract class EnvironmentActionFromState<T extends EnvironmentActionFromState> extends AbstractSyntaxTreeItem<T>{

    public EnvironmentActionFromState(ISyntaxBuilderAdapter<T> syntaxBuilderAdapter){
        super(syntaxBuilderAdapter);
    }
}
