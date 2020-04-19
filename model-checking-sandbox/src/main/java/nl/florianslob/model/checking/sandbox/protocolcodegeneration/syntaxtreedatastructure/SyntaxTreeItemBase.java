package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public abstract class SyntaxTreeItemBase<T extends ISyntaxTreeItem> implements ISyntaxTreeItem  {
    private final ISyntaxWriter<T> syntaxBuilderAdapter;

    public SyntaxTreeItemBase(ISyntaxWriter<T> syntaxBuilderAdapter){
        this.syntaxBuilderAdapter = syntaxBuilderAdapter;
    }

    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs) {
        this.syntaxBuilderAdapter.buildSyntax(builder, numberOfPrependingTabs, (T)this);
    }
}
