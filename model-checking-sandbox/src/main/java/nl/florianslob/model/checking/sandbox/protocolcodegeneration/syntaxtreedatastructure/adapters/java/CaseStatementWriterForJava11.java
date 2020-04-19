package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironmentActionFromState;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class CaseStatementWriterForJava11 implements ISyntaxWriter<ASTStateCaseStatement> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTStateCaseStatement SyntaxTreeItem) {

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "case "+SyntaxTreeItem.stateIdCondition+":");
        numberOfPrependingTabs++;
        for(ASTEnvironmentActionFromState actionFromState: SyntaxTreeItem.actionsFromState){
            actionFromState.buildSyntax(builder,numberOfPrependingTabs);
        }
    }
}
