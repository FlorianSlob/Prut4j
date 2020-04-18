package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

import java.util.HashSet;

public class ProtocolSyntaxTreeItem extends AbstractSyntaxTreeItem<ProtocolSyntaxTreeItem> {

    public final HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems;
    public final HashSet<EnvironmentSyntaxTreeItem> environments;
    public String protocolName;

    public ProtocolSyntaxTreeItem(String protocolName, HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems, HashSet<EnvironmentSyntaxTreeItem> environments, ISyntaxBuilderAdapter<ProtocolSyntaxTreeItem> syntaxTreeItemISyntaxBuilderAdapter){
        super(syntaxTreeItemISyntaxBuilderAdapter);
        this.protocolName = protocolName;
        this.communicationChannelSyntaxTreeItems = communicationChannelSyntaxTreeItems;
        this.environments = environments;
    }
}
