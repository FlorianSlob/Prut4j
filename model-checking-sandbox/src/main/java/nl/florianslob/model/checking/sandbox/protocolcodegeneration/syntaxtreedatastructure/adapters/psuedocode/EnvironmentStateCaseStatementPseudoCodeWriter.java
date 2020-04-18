package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentActionFromState;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentStateCaseStatementSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentStateCaseStatementPseudoCodeWriter implements ISyntaxBuilderAdapter<EnvironmentStateCaseStatementSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, EnvironmentStateCaseStatementSyntaxTreeItem SyntaxTreeItem) {

        builder.append("Start Syntax for EnvironmentStateCaseStatement\n");

        for(EnvironmentActionFromState actionFromState: SyntaxTreeItem.actionsFromState){
            actionFromState.buildSyntax(builder,0);
        }

        builder.append("End Syntax for EnvironmentStateCaseStatement\n");
    }
}
