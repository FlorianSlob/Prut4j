package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannel;

import java.util.HashSet;

public class UniqueCommunicationChannelFinderVisitor implements IVisitor<ProtocolStateNode> {

    public HashSet<CommunicationChannel> communicationChannels = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode host) {
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            CommunicationChannel channel = new CommunicationChannel(transaction.fromRole, transaction.toRole, transaction.messageContentType);
            if(!communicationChannels.contains(channel)){
                communicationChannels.add(channel);
            }
        }
    }
}
