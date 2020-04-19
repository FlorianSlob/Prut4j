package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.HashSet;

public class ProtocolSyntaxTreeItem extends AbstractSyntaxTreeItem<ProtocolSyntaxTreeItem> {

    public final HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems;
    public final HashSet<EnvironmentSyntaxTreeItem> environments;
    public String protocolName;

    public ProtocolSyntaxTreeItem(String protocolName, HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems, HashSet<EnvironmentSyntaxTreeItem> environments, ISyntaxWriter<ProtocolSyntaxTreeItem> syntaxTreeItemISyntaxWriter){
        super(syntaxTreeItemISyntaxWriter);
        this.protocolName = protocolName;
        this.communicationChannelSyntaxTreeItems = communicationChannelSyntaxTreeItems;
        this.environments = environments;
    }
}
