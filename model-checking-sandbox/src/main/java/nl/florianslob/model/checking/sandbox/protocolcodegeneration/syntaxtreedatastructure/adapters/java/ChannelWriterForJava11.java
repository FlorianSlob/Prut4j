package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class ChannelWriterForJava11 implements ISyntaxWriter<ASTCommunicationChannel> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTCommunicationChannel SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addIndentation(builder, numberOfPrependingTabs);
        builder.append("private final BlockingQueue<");
        builder.append(SyntaxTreeItem.messageType);
        builder.append("> ");
        builder.append(SyntaxTreeItem.queueName);
        builder.append(" = new LinkedBlockingQueue(); \n");
    }
}
