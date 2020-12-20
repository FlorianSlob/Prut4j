package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters;

public interface ISyntaxWriter<T>{
    void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, T SyntaxTreeItem );
}
