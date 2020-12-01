package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.*;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

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
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "String[] receiverOptionsArray = new String[]{ \"" + String.join("\",\"", receiverNames) + "\" };");
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

        var receiveActions = SyntaxTreeItem
                .actionsFromState
                .stream()
                .filter(a -> a.getClass() == ASTReceiveAction.class)
                .collect(Collectors.toList());


        var nonSendActions = SyntaxTreeItem
                .actionsFromState
                .stream()
                .filter(a -> a.getClass() != ASTSendAction.class && a.getClass() != ASTReceiveAction.class)
                .collect(Collectors.toList());

        for(ASTEnvironmentActionFromState actionFromState: nonSendActions){
            actionFromState.buildSyntax(builder,numberOfPrependingTabs);
        }

        if(receiveActions.size() > 1) {
            // We need to solve this
//            StringBuilderSyntaxHelperForJava11
//                    .addCodeInBlock(builder, "while(true) {", " monitor.wait(); }",
//                            numberOfPrependingTabs,
//                            (tabCountLvl0) -> {

            var firstAction = (ASTReceiveAction) receiveActions.stream().findFirst().get();
            StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "Any objectToGet = (Any)"+firstAction.communicationChannel.queueName+".take();");

            for (ASTEnvironmentActionFromState actionFromState : receiveActions) {
                                    actionFromState.buildSyntax(builder, numberOfPrependingTabs);
                                }
//                            });

        }else if (receiveActions.size() == 1){
            var receiveAction = (ASTReceiveAction)(receiveActions.stream().findFirst().get());
            StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "setState("+receiveAction.nextLocalStateId+");");
            StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "// Disabling unchecked inspection: We did check the class in the if statement above");
            StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "//noinspection unchecked");
            StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return Optional.of((Any)"+receiveAction.communicationChannel.queueName+".take());");
        }
    }
}
