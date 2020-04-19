package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public abstract class AbstractSyntaxTreeItem<T extends ISyntaxTreeItem> implements ISyntaxTreeItem  {
    private final ISyntaxWriter<T> syntaxBuilderAdapter;

    public AbstractSyntaxTreeItem(ISyntaxWriter<T> syntaxBuilderAdapter){
        this.syntaxBuilderAdapter = syntaxBuilderAdapter;
    }

    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs) {
        this.syntaxBuilderAdapter.buildSyntax(builder, numberOfPrependingTabs, (T)this);
    }
}
