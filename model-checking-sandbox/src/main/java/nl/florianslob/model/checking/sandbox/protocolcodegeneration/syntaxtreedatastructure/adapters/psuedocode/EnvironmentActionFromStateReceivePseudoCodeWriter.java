package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentActionFromStateReceiveSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateReceivePseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentActionFromStateReceiveSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentActionFromStateReceiveSyntaxTreeItem SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "monitor.notifyAll();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "state = "+SyntaxTreeItem.targetStateId+";");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "Object<TODOTYPE> m = "+SyntaxTreeItem.queuName+".take();");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return Optional.of(m);");
    }
}
