package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.SyntaxWriterProvider;

import java.util.HashSet;
import java.util.LinkedList;

public class CreateEnvironmentForRoleVisitor implements IVisitor<ProtocolStateNode>{

    private LinkedList<EnvironmentStateCaseStatementSyntaxTreeItem> environmentStateCaseStatements = new LinkedList<>();
    public String roleName;
    private SyntaxWriterProvider syntaxWriterProvider;
    private HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems;

    public CreateEnvironmentForRoleVisitor(String roleName, SyntaxWriterProvider syntaxWriterProvider, HashSet<CommunicationChannelSyntaxTreeItem> communicationChannelSyntaxTreeItems){
        this.roleName = roleName;
        this.syntaxWriterProvider = syntaxWriterProvider;
        this.communicationChannelSyntaxTreeItems = communicationChannelSyntaxTreeItems;
    }

    public EnvironmentSyntaxTreeItem getEnvironmentStateCaseStatements(){
        return new EnvironmentSyntaxTreeItem(this.roleName, environmentStateCaseStatements, syntaxWriterProvider.EnvironmentSyntaxTreeItemWriter);
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
        EnvironmentStateCaseStatementSyntaxTreeItem caseStatement = new EnvironmentStateCaseStatementSyntaxTreeItem(host.stateId, syntaxWriterProvider.EnvironmentStateCaseStatementSyntaxTreeItemWriter);

        boolean noActionAdded = true;
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            if(transaction.fromRole.equals(roleName) && transaction.action == ProtocolMessageAction.SEND){
                CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole, transaction.messageContentType);
                // add send action
                caseStatement.addAction(new EnvironmentActionFromStateSendSyntaxTreeItem(syntaxWriterProvider.EnvironmentActionFromStateSendSyntaxTreeItemWriter, communicationChannelSyntaxTreeItem, transaction.targetState.stateId));

                noActionAdded = false;
            }

            if(transaction.toRole.equals(roleName) && transaction.action == ProtocolMessageAction.RECEIVE){

                CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole, transaction.messageContentType);

                // add receive action of type
                caseStatement.addAction(new EnvironmentActionFromStateReceiveSyntaxTreeItem(syntaxWriterProvider.EnvironmentActionFromStateReceiveSyntaxTreeItemWriter, communicationChannelSyntaxTreeItem, host.stateId, transaction.targetState.stateId));

                noActionAdded = false;
            }
        }

        if(noActionAdded){
            caseStatement.addAction(new EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItem(syntaxWriterProvider.EnvironmentActionFromStateDefaultWaitActionSyntaxTreeItemWriter));
        }

        environmentStateCaseStatements.add(caseStatement);
    }
}
