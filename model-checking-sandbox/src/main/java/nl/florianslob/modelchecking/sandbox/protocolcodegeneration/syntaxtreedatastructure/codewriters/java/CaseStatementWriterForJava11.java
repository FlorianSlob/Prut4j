package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironmentActionFromState;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

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
