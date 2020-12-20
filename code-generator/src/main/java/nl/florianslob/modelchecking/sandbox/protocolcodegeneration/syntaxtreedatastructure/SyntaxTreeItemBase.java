package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;

public abstract class SyntaxTreeItemBase<T>{
    private final ISyntaxWriter<T> syntaxBuilderAdapter;

    public SyntaxTreeItemBase(ISyntaxWriter<T> syntaxBuilderAdapter){
        this.syntaxBuilderAdapter = syntaxBuilderAdapter;
    }

    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs) {
        // We need to do this unchecked cast... why? --> Java
        //noinspection unchecked
        this.syntaxBuilderAdapter.buildSyntax(builder, numberOfPrependingTabs, (T)this);
    }
}
