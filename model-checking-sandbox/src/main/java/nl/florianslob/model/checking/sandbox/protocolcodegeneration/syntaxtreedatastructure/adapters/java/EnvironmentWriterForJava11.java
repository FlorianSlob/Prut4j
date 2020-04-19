package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;


public class EnvironmentWriterForJava11 implements ISyntaxWriter<ASTEnvironment> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTEnvironment SyntaxTreeItem) {

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "case \""+SyntaxTreeItem.roleName+"\": return new IEnvironment(){");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public String getName() {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return environmentName;");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public Optional exchange(Optional box) throws Exception{");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "synchronized (monitor) {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "while (true) {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "switch (state) {");

        // TODO Add some default methods;
        numberOfPrependingTabs++;

        for(ASTStateCaseStatement stateCaseStatement : SyntaxTreeItem.ASTStateCaseStatements)
            stateCaseStatement.buildSyntax(builder,numberOfPrependingTabs);


        // Add default to switch case statement.
//        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "default: throw new Exception(\"State number out of bounds\");");

        // add closing tags // TODO Implement Automatic wrapper with lambda function?
        numberOfPrependingTabs --;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs --;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs --;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs --;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs --;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "};");
    }
}