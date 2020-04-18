package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentStateCaseStatementSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentPseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentSyntaxTreeItem SyntaxTreeItem) {

        builder.append("Syntax for environment "+SyntaxTreeItem.roleName+"; \n");

        for(EnvironmentStateCaseStatementSyntaxTreeItem stateCaseStatement : SyntaxTreeItem.environmentStateCaseStatements)
            stateCaseStatement.buildSyntax(builder,0);

        builder.append("End Syntax for environment "+SyntaxTreeItem.roleName+"; \n");
    }
}
