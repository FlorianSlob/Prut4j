package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public abstract class EnvironmentActionFromState<T extends EnvironmentActionFromState> extends AbstractSyntaxTreeItem<T>{

    public EnvironmentActionFromState(ISyntaxWriter<T> syntaxBuilderAdapter){
        super(syntaxBuilderAdapter);
    }
}
