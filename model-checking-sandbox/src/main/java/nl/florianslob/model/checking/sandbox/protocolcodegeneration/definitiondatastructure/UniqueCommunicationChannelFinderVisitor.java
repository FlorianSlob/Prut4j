package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannelSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.SyntaxBuilderAdapterProvider;

import java.util.HashSet;

public class UniqueCommunicationChannelFinderVisitor implements IVisitor<ProtocolStateNode> {

    private SyntaxBuilderAdapterProvider syntaxBuilderAdapterProvider;

    public UniqueCommunicationChannelFinderVisitor(SyntaxBuilderAdapterProvider syntaxBuilderAdapterProvider){

        this.syntaxBuilderAdapterProvider = syntaxBuilderAdapterProvider;
    }
    public HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode host) {
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            CommunicationChannelSyntaxTreeItem channel = new CommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole, transaction.messageContentType, this.syntaxBuilderAdapterProvider.CommunicationChannelSyntaxTreeItemWriter);
            if(!communicationChannelSyntaxTreeItems.contains(channel)){
                communicationChannelSyntaxTreeItems.add(channel);
            }
        }
    }
}
