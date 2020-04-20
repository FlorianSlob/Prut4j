package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class SendActionWriterForJava11 implements ISyntaxWriter<ASTSendAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTSendAction SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.notifyAll();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "state = "+SyntaxTreeItem.nextStateId+";");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, ""+SyntaxTreeItem.communicationChannel.queueName+".put(box.get());");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return Optional.empty();");
    }
}
