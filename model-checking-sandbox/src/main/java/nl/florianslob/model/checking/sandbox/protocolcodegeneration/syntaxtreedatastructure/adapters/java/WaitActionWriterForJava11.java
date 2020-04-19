package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTWaitAction;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class WaitActionWriterForJava11 implements ISyntaxWriter<ASTWaitAction> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTWaitAction SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.wait();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "break;");
    }
}
