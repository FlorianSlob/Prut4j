package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v4;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class SendActionWriterForJava11 implements ISyntaxWriter<ASTSendAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTSendAction SyntaxTreeItem) {
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (receiver.equals(\""+SyntaxTreeItem.communicationChannel.toRole+"\")) {", "}", tabCount,
                (tabCountLvl0) -> {
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "setState("+SyntaxTreeItem.nextLocalStateId+");");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, ""+SyntaxTreeItem.communicationChannel.toRole+"Queue.put(new ProtocolMessage(box.get(),"+SyntaxTreeItem.nextStateId+"));");
//                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "monitor.notifyAll();");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.empty();");
                }
        );
    }
}
