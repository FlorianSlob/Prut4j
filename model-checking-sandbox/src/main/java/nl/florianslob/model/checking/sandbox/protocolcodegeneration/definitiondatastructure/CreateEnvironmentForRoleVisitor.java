package nl.florianslob.model.checking.sandbox.protocolcodegeneration.definitiondatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;

import java.util.LinkedList;

public class CreateEnvironmentForRoleVisitor implements IVisitor<ProtocolStateNode>{

    private LinkedList<EnvironmentStateCaseStatement> environmentStateCaseStatements = new LinkedList<>();
    public String roleName;

    public CreateEnvironmentForRoleVisitor(String roleName){
        this.roleName = roleName;
    }

    public EnvironmentSyntaxTreeItem getEnvironmentStateCaseStatements(){
        return new EnvironmentSyntaxTreeItem(this.roleName, environmentStateCaseStatements);
    }

    @Override
    public void Visit(ProtocolStateNode host) {
        EnvironmentStateCaseStatement caseStatement = new EnvironmentStateCaseStatement(host.stateId);

        boolean noActionAdded = true;
        for(ProtocolTransaction transaction : host.outgoingTransactions){
            if(transaction.fromRole.equals(roleName) && transaction.action == ProtocolMessageAction.SEND){
                // add send action
                caseStatement.addAction(new EnvironmentActionFromStateSend());

                noActionAdded = false;
            }

            if(transaction.toRole.equals(roleName) && transaction.action == ProtocolMessageAction.RECEIVE){
                // add receive action of type
                caseStatement.addAction(new EnvironmentActionFromStateRecieve());

                noActionAdded = false;
            }
        }

        if(noActionAdded){
            caseStatement.addAction(EnvironmentActionFromStateDefaultWaitAction.defaultWaitAction);
        }

        environmentStateCaseStatements.add(caseStatement);
    }
}
