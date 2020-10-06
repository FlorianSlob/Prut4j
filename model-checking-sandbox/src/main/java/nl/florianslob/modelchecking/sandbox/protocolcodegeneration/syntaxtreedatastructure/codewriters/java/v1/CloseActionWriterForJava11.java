package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCloseAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class CloseActionWriterForJava11 implements ISyntaxWriter<ASTCloseAction> {

    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTCloseAction SyntaxTreeItem) {
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (box.isPresent() && box.get().getClass() == "+SyntaxTreeItem.messageContentType+".class ) {", "}", tabCount,
                (tabCountLvl0) -> {
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "monitor.notifyAll();");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "state = "+SyntaxTreeItem.nextStateId+";"); // will never get there?
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, SyntaxTreeItem.environmentName+"IsActive = false;");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.empty();");
                }
        );
    }
}
