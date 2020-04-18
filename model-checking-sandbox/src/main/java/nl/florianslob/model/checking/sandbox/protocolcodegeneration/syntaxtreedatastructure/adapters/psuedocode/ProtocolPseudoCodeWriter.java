package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannelSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class ProtocolPseudoCodeWriter implements ISyntaxBuilderAdapter<ProtocolSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ProtocolSyntaxTreeItem SyntaxTreeItem) {
        StringBuilderSyntaxHelper.addIndentation(builder, 0);
        builder.append("class ");
        builder.append(SyntaxTreeItem.protocolName);
        builder.append(" extends IProtocol\n");

        StringBuilderSyntaxHelper.addIndentation(builder, 0);
        builder.append("{");
        builder.append("\n");

        for(CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem : SyntaxTreeItem.communicationChannelSyntaxTreeItems){
            communicationChannelSyntaxTreeItem.buildSyntax(builder,1);
        }

        builder.append("\n");

        for(EnvironmentSyntaxTreeItem environmentSyntaxTreeItem: SyntaxTreeItem.environments){
            environmentSyntaxTreeItem.buildSyntax(builder,1);
        }

        builder.append("}\n");

    }
}
