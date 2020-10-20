package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironmentActionFromState;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTWaitAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.Random;
import java.util.stream.Collectors;

public class CaseStatementWriterForJava11 implements ISyntaxWriter<ASTStateCaseStatement> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ASTStateCaseStatement SyntaxTreeItem) {

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "case "+SyntaxTreeItem.stateIdCondition+":");
        numberOfPrependingTabs++;


        var sendActions = SyntaxTreeItem
                .actionsFromState
                .stream()
                .filter(a -> a.getClass() == ASTSendAction.class)
                .map(a -> (ASTSendAction)a)
                .collect(Collectors.toList());

        var typeNames = sendActions
                .stream()
                .map(sa -> sa.messageContentType)
                .distinct()
                .collect(Collectors.toList());

        // TODO Order types by name
        for(var typeName : typeNames){

            var sendActionsForType =
                    sendActions
                            .stream()
                            .filter(s -> s.messageContentType.equals(typeName))
                            .collect(Collectors.toList());

            var receiverNames =
                    sendActionsForType
                            .stream()
                            .map(sa -> sa.communicationChannel.toRole)
                            .distinct()
                            .collect(Collectors.toList());

            StringBuilderSyntaxHelperForJava11
                    .addCodeInBlock(builder,"if (box.isPresent() && box.get().getClass() == "+typeName+".class ) {", "}",
                            numberOfPrependingTabs,
                            (tabCountLvl0) -> {
                                StringBuilderSyntaxHelperForJava11
                                        .addCodeInBlock(builder,"if (receiver == null) {", "}",
                                                tabCountLvl0,
                                                (tabCountLvl1) -> {
                                                    if(receiverNames.size() > 1) {
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "int rnd = new Random().nextInt(" + receiverNames.size() + ");");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "var receiverOptionsArray = new String[]{ \"" + String.join("\",\"", receiverNames) + "\" };");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "receiver = receiverOptionsArray[rnd];");
                                                    }else{
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "receiver = \""+receiverNames.get(0)+"\";");
                                                    }
                                                });

                                for(ASTEnvironmentActionFromState actionFromState: sendActionsForType){
                                    actionFromState.buildSyntax(builder,tabCountLvl0);
                                }
                            }
            );
        }

        var nonSendActions = SyntaxTreeItem
                .actionsFromState
                .stream()
                .filter(a -> a.getClass() != ASTSendAction.class)
                .collect(Collectors.toList());

        for(ASTEnvironmentActionFromState actionFromState: nonSendActions){
            actionFromState.buildSyntax(builder,numberOfPrependingTabs);
        }

        // always add a default wait action after all send/receive if statements.
        new ASTWaitAction(new WaitActionWriterForJava11()).buildSyntax(builder,numberOfPrependingTabs);
    }
}
