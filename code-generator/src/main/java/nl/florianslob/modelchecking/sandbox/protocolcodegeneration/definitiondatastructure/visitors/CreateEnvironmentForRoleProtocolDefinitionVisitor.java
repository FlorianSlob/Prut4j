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
    private LinkedList<ASTStateCaseStatement> AllASTStateCaseStatements = new LinkedList<>();

    public final ISyntaxWriter<ASTEnvironment> environmentWriter;
    public final ISyntaxWriter<ASTStateCaseStatement> caseStatementWriter;
    public final ISyntaxWriter<ASTSendAction> sendActionWriter;
    public final ISyntaxWriter<ASTCloseAction> closeActionWriter;
    public final ISyntaxWriter<ASTReceiveAction> receiveActionWriter;

    private HashSet<ASTCommunicationChannel> ASTCommunicationChannels;

    public CreateEnvironmentForRoleProtocolDefinitionVisitor(String roleName, SyntaxWriterProvider writerProvider, HashSet<ASTCommunicationChannel> ASTCommunicationChannels) {
        this.roleName = roleName;
        this.ASTCommunicationChannels = ASTCommunicationChannels;
        this.environmentWriter = writerProvider.EnvironmentWriter;
        this.caseStatementWriter = writerProvider.CaseStatementWriter;
        this.sendActionWriter = writerProvider.SendActionWriter;
        this.closeActionWriter = writerProvider.CloseActionWriter;
        this.receiveActionWriter = writerProvider.ReceiveActionWriter;
    }

    public ASTEnvironment getASTStateCaseStatements() {
        return new ASTEnvironment(environmentWriter, this.roleName, ASTStateCaseStatements,AllASTStateCaseStatements);
    }

    private ASTCommunicationChannel getCommunicationChannelSyntaxTreeItem(String fromRole, String toRole) throws Exception {
        for (ASTCommunicationChannel item : this.ASTCommunicationChannels) {
            if (item.fromRole.equals(ASTHelper.EscapeRoleName(fromRole)) && item.toRole.equals(ASTHelper.EscapeRoleName(toRole))) {
                return item;
            }
        }
        throw new Exception("Cannot find queue for this transaction.");
    }

    @Override
    public void Visit(ProtocolStateNode protocolStateNode) throws Exception {

        var stateCaseStatementOptional = ASTStateCaseStatements.stream().filter(item -> item.stateIdCondition == protocolStateNode.stateId).findFirst();
        var allStateCaseStatementOptional = AllASTStateCaseStatements.stream().filter(item -> item.stateIdCondition == protocolStateNode.stateId).findFirst();
        // Create a case statement item for this protocol state
        ASTStateCaseStatement caseStatement;
        ASTStateCaseStatement allCaseStatement;


        if(stateCaseStatementOptional.isEmpty()){
            caseStatement  =
            new ASTStateCaseStatement(this.caseStatementWriter, protocolStateNode.stateId);
        }else{
            // We will add it later again.
            ASTStateCaseStatements.remove(stateCaseStatementOptional.get());
            caseStatement = stateCaseStatementOptional.get();
        }

        if(allStateCaseStatementOptional.isEmpty()){
            allCaseStatement  =
                    new ASTStateCaseStatement(this.caseStatementWriter, protocolStateNode.stateId);
        }else{
            // We will add it later again.
            AllASTStateCaseStatements.remove(allStateCaseStatementOptional.get());
            allCaseStatement = allStateCaseStatementOptional.get();
        }

        // Fill the body of the case statement with the actions possible for this environment in this state.
        // Check for outgoing transactions that concern the role and add an ActionFromState item for every send/receive action.
        for (ProtocolTransition transaction : protocolStateNode.outgoingTransactions) {
            if (transaction.action == ProtocolMessageActionType.SEND) {

                ASTCommunicationChannel allASTCommunicationChannel =
                        getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole);
                // add send action
                var actionToAdd =new ASTSendAction(this.sendActionWriter, allASTCommunicationChannel, transaction.targetState.stateId, transaction.messageContentType);


                if(transaction.fromRole.equals(roleName)) {
                    allCaseStatement.isInLocalType = true;
                    actionToAdd.isLocalAction = true;

                    // add send action
                    caseStatement.addAction(
                            actionToAdd
                    );
                }

                allCaseStatement.addAction(
                        actionToAdd
                );
            }

            if (transaction.action == ProtocolMessageActionType.CLOSE) {

                var actionToAdd = new ASTCloseAction(this.closeActionWriter, transaction.targetState.stateId, transaction.messageContentType, transaction.fromRole);

                if(transaction.fromRole.equals(roleName)){

                    allCaseStatement.isInLocalType = true;
                    actionToAdd.isLocalAction = true;
                    // add close action
                    caseStatement.addAction(
                            actionToAdd
                    );
                }

                allCaseStatement.addAction(
                        actionToAdd
                );
            }

            if (transaction.action == ProtocolMessageActionType.RECV) {
                ASTCommunicationChannel allASTCommunicationChannel = getCommunicationChannelSyntaxTreeItem(transaction.fromRole, transaction.toRole);
                // add receive action of type
                var actionToAdd =new ASTReceiveAction(this.receiveActionWriter, allASTCommunicationChannel, protocolStateNode.stateId, transaction.targetState.stateId, transaction.messageContentType);


                if(transaction.toRole.equals(roleName)){
                    allCaseStatement.isInLocalType = true;
                    actionToAdd.isLocalAction = true;

                    // add receive action of type
                    caseStatement.addAction(actionToAdd);
                }

                allCaseStatement.addAction(actionToAdd);
            }
        }

        ASTStateCaseStatements.add(caseStatement);
        AllASTStateCaseStatements.add(allCaseStatement);
    }
}
