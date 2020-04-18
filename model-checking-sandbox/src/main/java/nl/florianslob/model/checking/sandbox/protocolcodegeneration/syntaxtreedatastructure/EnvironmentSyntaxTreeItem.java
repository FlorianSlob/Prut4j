package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

import java.util.LinkedList;

public class EnvironmentSyntaxTreeItem extends AbstractSyntaxTreeItem {

    public String roleName;
    public LinkedList<EnvironmentStateCaseStatementSyntaxTreeItem> environmentStateCaseStatements;

    public EnvironmentSyntaxTreeItem(String roleName, LinkedList<EnvironmentStateCaseStatementSyntaxTreeItem> environmentStateCaseStatements, ISyntaxBuilderAdapter<EnvironmentSyntaxTreeItem> SyntaxBuilderAdapter){
        super(SyntaxBuilderAdapter);
        this.roleName = roleName;
        this.environmentStateCaseStatements = environmentStateCaseStatements;
    }
}
