package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class SendActionWriterForJava11 implements ISyntaxWriter<ASTSendAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTSendAction SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.notifyAll();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "state = "+SyntaxTreeItem.nextStateId+";");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, ""+SyntaxTreeItem.communicationChannel.queueName+".put(("+SyntaxTreeItem.communicationChannel.messageType+")box.get());");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return Optional.empty();");
    }
}
