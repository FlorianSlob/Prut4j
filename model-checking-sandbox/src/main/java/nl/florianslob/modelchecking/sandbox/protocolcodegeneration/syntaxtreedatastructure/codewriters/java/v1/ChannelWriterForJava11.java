package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class ChannelWriterForJava11 implements ISyntaxWriter<ASTCommunicationChannel> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTCommunicationChannel SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addIndentation(builder, numberOfPrependingTabs);
        builder.append("private final BlockingQueue<ProtocolMessage> ");
        builder.append(SyntaxTreeItem.queueName);
        builder.append(" = new LinkedBlockingQueue(); \n");
    }
}
