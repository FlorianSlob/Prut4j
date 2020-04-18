package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentActionFromStateSendSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateSendPseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentActionFromStateSendSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentActionFromStateSendSyntaxTreeItem SyntaxTreeItem) {
        builder.append("Syntax for Send Action;\n");
    }
}
