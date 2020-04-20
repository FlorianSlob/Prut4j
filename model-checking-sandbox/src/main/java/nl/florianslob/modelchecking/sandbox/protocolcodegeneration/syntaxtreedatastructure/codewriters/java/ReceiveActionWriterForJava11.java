package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTReceiveAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class ReceiveActionWriterForJava11 implements ISyntaxWriter<ASTReceiveAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTReceiveAction SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.notifyAll();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "state = "+SyntaxTreeItem.nextStateId+";");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, ""+SyntaxTreeItem.communicationChannel.messageType+" m"+SyntaxTreeItem.currentStateId+" = "+SyntaxTreeItem.communicationChannel.queueName+".take();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return Optional.of(m"+SyntaxTreeItem.currentStateId+");");
    }
}
