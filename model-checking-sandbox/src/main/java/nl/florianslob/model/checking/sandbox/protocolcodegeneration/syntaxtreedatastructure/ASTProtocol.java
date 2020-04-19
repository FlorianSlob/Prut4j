package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.HashSet;

public class ASTProtocol extends SyntaxTreeItemBase<ASTProtocol> {

    public final HashSet<ASTCommunicationChannel> ASTCommunicationChannels;
    public final HashSet<ASTEnvironment> environments;
    public String protocolName;

    public ASTProtocol(ISyntaxWriter<ASTProtocol> syntaxWriter, String protocolName, HashSet<ASTCommunicationChannel> ASTCommunicationChannels, HashSet<ASTEnvironment> environments){
        super(syntaxWriter);
        this.protocolName = protocolName;
        this.ASTCommunicationChannels = ASTCommunicationChannels;
        this.environments = environments;
    }
}
