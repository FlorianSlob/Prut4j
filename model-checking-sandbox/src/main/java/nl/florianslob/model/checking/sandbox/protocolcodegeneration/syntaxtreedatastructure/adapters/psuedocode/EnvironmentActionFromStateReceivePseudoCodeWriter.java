package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentActionFromStateReceiveSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateReceivePseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentActionFromStateReceiveSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentActionFromStateReceiveSyntaxTreeItem SyntaxTreeItem) {
        builder.append("Syntax for Receive Action;\n");
    }
}
