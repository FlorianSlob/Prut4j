package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public abstract class AbstractSyntaxTreeItem<T extends ISyntaxTreeItem> implements ISyntaxTreeItem  {
    private final ISyntaxBuilderAdapter<T> syntaxBuilderAdapter;

    public AbstractSyntaxTreeItem(ISyntaxBuilderAdapter<T> syntaxBuilderAdapter){
        this.syntaxBuilderAdapter = syntaxBuilderAdapter;
    }

    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs) {
        this.syntaxBuilderAdapter.buildSyntax(builder, numberOfPrependingTabs, (T)this);
    }
}
