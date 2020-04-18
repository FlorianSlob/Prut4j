package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ISyntaxTreeItem;

public interface ISyntaxBuilderAdapter<T extends ISyntaxTreeItem>{
    void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, T SyntaxTreeItem );
}
