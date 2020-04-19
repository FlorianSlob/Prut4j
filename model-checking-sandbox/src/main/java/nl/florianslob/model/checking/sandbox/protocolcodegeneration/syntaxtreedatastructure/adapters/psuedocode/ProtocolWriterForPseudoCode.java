package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import jdk.jshell.spi.ExecutionControl;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;

public class ProtocolWriterForPseudoCode implements ISyntaxWriter<ASTProtocol> {

    public ProtocolWriterForPseudoCode() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Need to add Java 11 support");
    }

    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTProtocol SyntaxTreeItem) {
        builder.append("public class blabla! \n");

        for(ASTCommunicationChannel ASTCommunicationChannel : SyntaxTreeItem.ASTCommunicationChannels){
            ASTCommunicationChannel.buildSyntax(builder,0);
        }

        builder.append("\n");

        for(ASTEnvironment ASTEnvironment : SyntaxTreeItem.environments){
            ASTEnvironment.buildSyntax(builder,0);
        }

        builder.append("End class \n");
    }
}
