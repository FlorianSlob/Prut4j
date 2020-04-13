package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import java.util.LinkedList;

public class EnvironmentSyntaxTreeItem implements ISyntaxTreeItem {

    private String roleName;
    private LinkedList<EnvironmentStateCaseStatement> environmentStateCaseStatements;

    public EnvironmentSyntaxTreeItem(String roleName, LinkedList<EnvironmentStateCaseStatement> environmentStateCaseStatements){

        this.roleName = roleName;
        this.environmentStateCaseStatements = environmentStateCaseStatements;
    }

    @Override
    public String getSyntax(int numberOfPrependingTabs) {

        StringBuilder builder = new StringBuilder();

        for(EnvironmentStateCaseStatement stateCaseStatement : environmentStateCaseStatements)
            builder.append(stateCaseStatement.getSyntax(0));

        return "Syntax for environment "+this.roleName+"; \n" +
            builder.toString() +
            "End Syntax for environment "+this.roleName+"; \n";
    }
}
