package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTWaitAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class WaitActionWriterForJava11 implements ISyntaxWriter<ASTWaitAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTWaitAction SyntaxTreeItem) {
        // a wait action is always the default
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.wait();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "break;");
    }
}
