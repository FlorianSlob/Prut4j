package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ISyntaxTreeItem;

public interface ISyntaxWriter<T extends ISyntaxTreeItem>{
    void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, T SyntaxTreeItem );
}
