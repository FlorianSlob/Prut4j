package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class StringBuilderSyntaxHelperForJava11 {

    public static void addCodeInBlock(StringBuilder builder, String startOfBlock, String endOfBlock, int numberOfPrependingTabs, ICodeBlockWriter codeBlockWriter){
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, startOfBlock);
        numberOfPrependingTabs++;
        codeBlockWriter.writeBlock(numberOfPrependingTabs);
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, endOfBlock);
    }

    public static void addScopedBlock(StringBuilder builder, String startingLine, int numberOfPrependingTabs, ICodeBlockWriter codeBlockWriter){
        addCodeInBlock(builder, startingLine+ "{", "}", numberOfPrependingTabs, codeBlockWriter);
    }

    public static void addMethodOverride(StringBuilder builder, String startingLine, int numberOfPrependingTabs, ICodeBlockWriter codeBlockWriter) {
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        addCodeInBlock(builder, startingLine+ "{", "}", numberOfPrependingTabs, codeBlockWriter);
    }

    public static void addMethod(StringBuilder builder, String startingLine, int numberOfPrependingTabs, ICodeBlockWriter codeBlockWriter) {
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        addCodeInBlock(builder, startingLine+ "{", "}", numberOfPrependingTabs, codeBlockWriter);
    }

}
