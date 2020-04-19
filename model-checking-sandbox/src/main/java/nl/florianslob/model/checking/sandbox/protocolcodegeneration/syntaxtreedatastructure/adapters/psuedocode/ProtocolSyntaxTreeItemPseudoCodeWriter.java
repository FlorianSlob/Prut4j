package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import jdk.jshell.spi.ExecutionControl;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannelSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;

public class ProtocolSyntaxTreeItemPseudoCodeWriter implements ISyntaxWriter<ProtocolSyntaxTreeItem> {

    public ProtocolSyntaxTreeItemPseudoCodeWriter() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Need to add Java 11 support");
    }

    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ProtocolSyntaxTreeItem SyntaxTreeItem) {
        builder.append("public class blabla! \n");

        for(CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem : SyntaxTreeItem.communicationChannelSyntaxTreeItems){
            communicationChannelSyntaxTreeItem.buildSyntax(builder,0);
        }

        builder.append("\n");

        for(EnvironmentSyntaxTreeItem environmentSyntaxTreeItem: SyntaxTreeItem.environments){
            environmentSyntaxTreeItem.buildSyntax(builder,0);
        }

        builder.append("End class \n");
    }
}
