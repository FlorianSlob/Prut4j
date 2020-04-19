package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters;

import jdk.jshell.spi.ExecutionControl;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode.ProtocolSyntaxTreeItemPseudoCodeWriter;

public class SyntaxWriterProvider {
    public SyntaxWriterProvider(String targetLanguage) throws ExecutionControl.NotImplementedException {
        // TODO Replace with some for of Dependency Injection
        // Autofac alternative for Java = ???

        if(targetLanguage.equals("Java11")){
            ProtocolWriter = new ProtocolJava11Writer();
            CommunicationChannelSyntaxTreeItemWriter = new CommunicationChannelJava11Writer();
            EnvironmentSyntaxTreeItemWriter = new EnvironmentJava11Writer();
            EnvironmentStateCaseStatementSyntaxTreeItemWriter = new EnvironmentStateCaseStatementJava11Writer();
            EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = new EnvironmentActionFromStateDefaultWaitActionJava11Writer();
            EnvironmentActionFromStateSendSyntaxTreeItemWriter = new EnvironmentActionFromStateSendJava11Writer();
            EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = new EnvironmentActionFromStateReceiveJava11Writer();

            // init fields
        }
        else if (targetLanguage.equals("PseudoCode")){
            ProtocolWriter = new ProtocolSyntaxTreeItemPseudoCodeWriter();
            // TODO NEEDS IMPLEMENTATION:
            EnvironmentSyntaxTreeItemWriter = null;
            EnvironmentStateCaseStatementSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateSendSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = null;
        }


    }

    public ISyntaxWriter<ProtocolSyntaxTreeItem> ProtocolWriter = null;
    public ISyntaxWriter<CommunicationChannelSyntaxTreeItem> CommunicationChannelSyntaxTreeItemWriter = null;
    public ISyntaxWriter<EnvironmentSyntaxTreeItem> EnvironmentSyntaxTreeItemWriter = null;
    public ISyntaxWriter<EnvironmentStateCaseStatementSyntaxTreeItem> EnvironmentStateCaseStatementSyntaxTreeItemWriter = null;
    public ISyntaxWriter<EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem> EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = null;
    public ISyntaxWriter<EnvironmentActionFromStateSendSyntaxTreeItem> EnvironmentActionFromStateSendSyntaxTreeItemWriter = null;
    public ISyntaxWriter<EnvironmentActionFromStateReceiveSyntaxTreeItem> EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = null;
}
