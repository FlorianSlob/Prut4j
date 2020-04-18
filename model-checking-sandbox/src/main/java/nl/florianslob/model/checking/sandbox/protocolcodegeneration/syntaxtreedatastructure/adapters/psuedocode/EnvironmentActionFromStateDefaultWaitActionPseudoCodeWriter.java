package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateDefaultWaitActionPseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem SyntaxTreeItem) {
        builder.append("Syntax for default wait action;\n");
    }
}
