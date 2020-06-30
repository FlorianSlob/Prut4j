package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.visitors;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolMessageActionType;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolStateNode;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.definitiondatastructure.ProtocolTransition;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.SyntaxWriterProvider;

import java.util.HashSet;
import java.util.LinkedList;

public class CreateEnvironmentForRoleProtocolDefinitionVisitor implements IProtocolDefinitionVisitor {

    public String roleName;

    private LinkedList<ASTStateCaseStatement> ASTStateCaseStatements = new LinkedList<>();

    public final ISyntaxWriter<ASTEnvironment> environmentWriter;
    public final ISyntaxWriter<ASTStateCaseStatement> caseStatementWriter;
    public final ISyntaxWriter<ASTSendAction> sendActionWriter;
    public final ISyntaxWriter<ASTReceiveAction> receiveActionWriter;

    private HashSet<ASTCommunicationChannel> ASTCommunicationChannels;

    public CreateEnvironmentForRoleProtocolDefinitionVisitor(String roleName, SyntaxWriterProvider writerProvider, HashSet<ASTCommunicationChannel> ASTCommunicationChannels) {
        this.roleName = roleName;
        this.ASTCommunicationChannels = ASTCommunicationChannels;
        this.environmentWriter = writerProvider.EnvironmentWriter;
        this.caseStatementWriter = writerProvider.CaseStatementWriter;
        this.sendActionWriter = writerProvider.SendActionWriter;
        this.receiveActionWriter = writerProvider.ReceiveActionWriter;
    }

    public ASTEnvironment getASTStateCaseStatements() {
        return new ASTEnvironment(environmentWriter, this.roleName, ASTStateCaseStatements);
    }

    private ASTCommunicationChannel getCommunicationChannelSyntaxTreeItem(String fromRole, String toRole) throws Exception {
        for (ASTCommunicationChannel item : this.ASTCommunicationChannels) {
            if (item.fromRole == fromRole && item.toRole == toRole) {
                return item;
            }
        }
        throw new Exception("Cannot find queue for this transaction.");
    }

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) throws Exception {
        // Create a case statement item for this protocol state
        ASTStateCaseStatement caseStatement =
            new ASTStateCaseStatement(this.caseStatementWriter, protocolStateNode.stateId);


        // Fill the body of the case statement with the actions possible for this environment in this state.
        boolean noActionAdded = true;

        // Check for outgoing transactions that concern the role and add an ActionFromState item for every send/receive action.
        for (ProtocolTransition transaction : protocolStateNode.outgoingTransactions) {
            if (transaction.fromRole.equals(roleName) && transaction.action == ProtocolMessageActionType.SEND) {
                ASTCommunicationChannel ASTCommunicationChannel =
                    getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole);
                // add send action
                caseStatement.addAction(
                    new ASTSendAction(this.sendActionWriter, ASTCommunicationChannel, transaction.targetState.stateId, transaction.messageContentType)
                );

                noActionAdded = false;
            }

            if (transaction.toRole.equals(roleName) && transaction.action == ProtocolMessageActionType.RECEIVE) {

                ASTCommunicationChannel ASTCommunicationChannel = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole);

                // add receive action of type
                caseStatement.addAction(new ASTReceiveAction(this.receiveActionWriter, ASTCommunicationChannel, protocolStateNode.stateId, transaction.targetState.stateId, transaction.messageContentType));

                noActionAdded = false;
            }
        }

        ASTStateCaseStatements.add(caseStatement);
    }
}
