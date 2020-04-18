package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.SyntaxBuilderAdapterProvider;

import java.util.HashSet;
import java.util.LinkedList;

public class CreateEnvironmentForRoleVisitor implements IVisitor<ProtocolStateNode>{

    private LinkedList<EnvironmentStateCaseStatementSyntaxTreeItem> environmentStateCaseStatements = new LinkedList<>();
    public String roleName;
    private SyntaxBuilderAdapterProvider syntaxBuilderAdapterProvider;
    private HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems;

    public CreateEnvironmentForRoleVisitor(String roleName, SyntaxBuilderAdapterProvider syntaxBuilderAdapterProvider, HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems){
        this.roleName = roleName;
        this.syntaxBuilderAdapterProvider = syntaxBuilderAdapterProvider;
        this.communicationChannelSyntaxTreeItems = communicationChannelSyntaxTreeItems;
    }

    public EnvironmentSyntaxTreeItem getEnvironmentStateCaseStatements(){
        return new EnvironmentSyntaxTreeItem(this.roleName, environmentStateCaseStatements, syntaxBuilderAdapterProvider.EnvironmentSyntaxTreeItemWriter);
    }

    @Override
    public void Visit(ProtocolStateNode host) {
        EnvironmentStateCaseStatementSyntaxTreeItem caseStatement = new EnvironmentStateCaseStatementSyntaxTreeItem(host.stateId, syntaxBuilderAdapterProvider.EnvironmentStateCaseStatementSyntaxTreeItemWriter);

        boolean noActionAdded = true;
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            if(transaction.fromRole.equals(roleName) && transaction.action == ProtocolMessageAction.SEND){
                // add send action
                caseStatement.addAction(new EnvironmentActionFromStateSendSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateSendSyntaxTreeItemWriter));

                noActionAdded = false;
            }

            if(transaction.toRole.equals(roleName) && transaction.action == ProtocolMessageAction.RECEIVE){
                // add receive action of type
                caseStatement.addAction(new EnvironmentActionFromStateReceiveSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateReceiveSyntaxTreeItemWriter));

                noActionAdded = false;
            }
        }

        if(noActionAdded){
            caseStatement.addAction(new EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter));
        }

        environmentStateCaseStatements.add(caseStatement);
    }
}
