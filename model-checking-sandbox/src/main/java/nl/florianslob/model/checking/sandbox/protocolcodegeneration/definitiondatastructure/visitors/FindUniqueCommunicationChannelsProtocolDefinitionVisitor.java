package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransaction;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.HashSet;

public class FindUniqueCommunicationChannelsProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    private ISyntaxWriter<ASTCommunicationChannel> syntaxWriter;

    public FindUniqueCommunicationChannelsProtocolDefinitionVisitor(ISyntaxWriter<ASTCommunicationChannel> syntaxWriter){
        this.syntaxWriter = syntaxWriter;
    }

    public HashSet<ASTCommunicationChannel> ASTCommunicationChannels = new HashSet<>();

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) {
        for(ProtocolTransaction transaction : protocolStateNode.outgoingTransactions){
            ASTCommunicationChannel channel =
                new ASTCommunicationChannel(this.syntaxWriter, transaction.fromRole, transaction.toRole, transaction.messageContentType);
            if(!ASTCommunicationChannels.contains(channel)){
                ASTCommunicationChannels.add(channel);
            }
        }
    }
}
