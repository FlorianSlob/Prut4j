package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters;

import jdk.jshell.spi.ExecutionControl;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java.ProtocolSyntaxTreeItemJava11Writer;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode.*;

public class SyntaxBuilderAdapterProvider {
    public SyntaxBuilderAdapterProvider(String targetLanguage) throws ExecutionControl.NotImplementedException {
        // TODO Replace with some for of Dependency Injection
        // Autofac alternative for Java = ???

        if(targetLanguage.equals("PseudoCode")){
            ProtocolWriter = new ProtocolPseudoCodeWriter();
            CommunicationChannelSyntaxTreeItemWriter = new CommunicationChannelPseudoCodeWriter();
            EnvironmentSyntaxTreeItemWriter = new EnvironmentPseudoCodeWriter();
            EnvironmentStateCaseStatementSyntaxTreeItemWriter = new EnvironmentStateCaseStatementPseudoCodeWriter();
            EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = new EnvironmentActionFromStateDefaultWaitActionPseudoCodeWriter();
            EnvironmentActionFromStateSendSyntaxTreeItemWriter = new EnvironmentActionFromStateSendPseudoCodeWriter();
            EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = new EnvironmentActionFromStateReceivePseudoCodeWriter();

            // init fields
        }
        else if (targetLanguage.equals("Java11")){
            ProtocolWriter = new ProtocolSyntaxTreeItemJava11Writer();
            // TODO NEEDS IMPLEMENTATION:
            EnvironmentSyntaxTreeItemWriter = null;
            EnvironmentStateCaseStatementSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateSendSyntaxTreeItemWriter = null;
            EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = null;
        }


    }

    public ISyntaxBuilderAdapter<ProtocolSyntaxTreeItem> ProtocolWriter = null;
    public ISyntaxBuilderAdapter<CommunicationChannelSyntaxTreeItem> CommunicationChannelSyntaxTreeItemWriter = null;
    public ISyntaxBuilderAdapter<EnvironmentSyntaxTreeItem> EnvironmentSyntaxTreeItemWriter = null;
    public ISyntaxBuilderAdapter<EnvironmentStateCaseStatementSyntaxTreeItem> EnvironmentStateCaseStatementSyntaxTreeItemWriter = null;
    public ISyntaxBuilderAdapter<EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem> EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter = null;
    public ISyntaxBuilderAdapter<EnvironmentActionFromStateSendSyntaxTreeItem> EnvironmentActionFromStateSendSyntaxTreeItemWriter = null;
    public ISyntaxBuilderAdapter<EnvironmentActionFromStateReceiveSyntaxTreeItem> EnvironmentActionFromStateReceiveSyntaxTreeItemWriter = null;
}
