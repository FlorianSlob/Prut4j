package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

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
