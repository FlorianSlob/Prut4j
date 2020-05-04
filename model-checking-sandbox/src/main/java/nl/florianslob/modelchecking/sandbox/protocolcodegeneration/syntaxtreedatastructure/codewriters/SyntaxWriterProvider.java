package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.psuedocode.ProtocolWriterForPseudoCode;

public class SyntaxWriterProvider {
    public SyntaxWriterProvider(String targetLanguage) throws UnsupportedOperationException {
        // TODO Replace with some for of Dependency Injection
        // Autofac alternative for Java = ???

        if(targetLanguage.equals("Java11")){
            ProtocolWriter = new ProtocolWriterForJava11();
            ChannelWriter = new ChannelWriterForJava11();
            EnvironmentWriter = new EnvironmentWriterForJava11();
            CaseStatementWriter = new CaseStatementWriterForJava11();
            WaitActionWriter = new WaitActionWriterForJava11();
            SendActionWriter = new SendActionWriterForJava11();
            ReceiveActionWriter = new ReceiveActionWriterForJava11();
            // init fields
        }
        else if (targetLanguage.equals("PseudoCode")){
            ProtocolWriter = new ProtocolWriterForPseudoCode();
            // TODO NEEDS IMPLEMENTATION:
            EnvironmentWriter = null;
            CaseStatementWriter = null;
            WaitActionWriter = null;
            SendActionWriter = null;
            ReceiveActionWriter = null;
        }
    }

    public ISyntaxWriter<ASTProtocol> ProtocolWriter = null;
    public ISyntaxWriter<ASTCommunicationChannel> ChannelWriter = null;
    public ISyntaxWriter<ASTEnvironment> EnvironmentWriter = null;
    public ISyntaxWriter<ASTStateCaseStatement> CaseStatementWriter = null;
    public ISyntaxWriter<ASTWaitAction> WaitActionWriter = null;
    public ISyntaxWriter<ASTSendAction> SendActionWriter = null;
    public ISyntaxWriter<ASTReceiveAction> ReceiveActionWriter = null;
}
