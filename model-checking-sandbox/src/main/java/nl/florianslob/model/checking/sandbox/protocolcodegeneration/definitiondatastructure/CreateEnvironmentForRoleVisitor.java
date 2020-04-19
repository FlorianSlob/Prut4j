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

    public CommunicationChannelSyntaxTreeItem getCommunicationChannelSyntaxTreeItem(String fromRole, String toRole, String messageType) throws Exception {
        for(CommunicationChannelSyntaxTreeItem item : this.communicationChannelSyntaxTreeItems){
            if(item.messageType == messageType && item.fromRole == fromRole && item.toRole == toRole){
                return item;
            }
        }
        throw new Exception("Cannot find queue for this transaction.");
    }

    @Override
    public void Visit(ProtocolStateNode host) throws Exception {
        EnvironmentStateCaseStatementSyntaxTreeItem caseStatement = new EnvironmentStateCaseStatementSyntaxTreeItem(host.stateId, syntaxBuilderAdapterProvider.EnvironmentStateCaseStatementSyntaxTreeItemWriter);

        boolean noActionAdded = true;
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            if(transaction.fromRole.equals(roleName) && transaction.action == ProtocolMessageAction.SEND){
                CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole, transaction.messageContentType);
                // add send action
                caseStatement.addAction(new EnvironmentActionFromStateSendSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateSendSyntaxTreeItemWriter, communicationChannelSyntaxTreeItem, transaction.targetState.stateId));

                noActionAdded = false;
            }

            if(transaction.toRole.equals(roleName) && transaction.action == ProtocolMessageAction.RECEIVE){

                CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole, transaction.messageContentType);

                // add receive action of type
                caseStatement.addAction(new EnvironmentActionFromStateReceiveSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateReceiveSyntaxTreeItemWriter, communicationChannelSyntaxTreeItem, host.stateId, transaction.targetState.stateId));

                noActionAdded = false;
            }
        }

        if(noActionAdded){
            caseStatement.addAction(new EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem(syntaxBuilderAdapterProvider.EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter));
        }

        environmentStateCaseStatements.add(caseStatement);
    }
}
