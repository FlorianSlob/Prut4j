package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTReceiveAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class ReceiveActionWriterForJava11 implements ISyntaxWriter<ASTReceiveAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTReceiveAction SyntaxTreeItem) {

//        "+SyntaxTreeItem.communicationChannel.messageType+">

        // TODO Replace Move.class with fully qualified name
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if ("+SyntaxTreeItem.communicationChannel.queueName+".peek() != null && "+SyntaxTreeItem.communicationChannel.queueName+".peek().message.getClass() == Move.class) {", "}", tabCount,
                (tabCountLvl0) -> {
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "monitor.notifyAll();");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "state = "+SyntaxTreeItem.nextStateId+";");
//                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "ProtocolMessage m"+SyntaxTreeItem.currentStateId+" = ;");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.of("+SyntaxTreeItem.communicationChannel.queueName+".take());");
                }
        );



    }
}
