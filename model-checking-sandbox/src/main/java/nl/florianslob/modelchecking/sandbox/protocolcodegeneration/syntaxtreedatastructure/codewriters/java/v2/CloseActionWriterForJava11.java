package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCloseAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

public class CloseActionWriterForJava11 implements ISyntaxWriter<ASTCloseAction> {

    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTCloseAction SyntaxTreeItem) {
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"if (isCloseAction) {", "}", tabCount,
                (tabCountLvl0) -> {
//                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "monitor.notify();");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "setState("+SyntaxTreeItem.nextLocalStateId+");");
                    StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "return Optional.empty();");
                }
        );
    }
}
