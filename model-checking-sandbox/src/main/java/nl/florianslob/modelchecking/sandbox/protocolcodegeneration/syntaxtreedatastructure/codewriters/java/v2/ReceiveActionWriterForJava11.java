package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTReceiveAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class ReceiveActionWriterForJava11 implements ISyntaxWriter<ASTReceiveAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTReceiveAction SyntaxTreeItem) {
//        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (!"+SyntaxTreeItem.communicationChannel.queueName+".isEmpty() && "+SyntaxTreeItem.communicationChannel.queueName+".peek().getClass() == "+SyntaxTreeItem.messageContentType+".class) {", "}", tabCount,
       StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (objectToGet.getClass() == "+SyntaxTreeItem.messageContentType+".class) {", "}", tabCount,
                (tabCountLvl0) -> {
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "setState("+SyntaxTreeItem.nextLocalStateId+");");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "//"+SyntaxTreeItem.communicationChannel.queueName+");");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "// Disabling unchecked inspection: We did check the class in the if statement above");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "//noinspection unchecked");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.of(objectToGet);");
                }
        );
    }
}
