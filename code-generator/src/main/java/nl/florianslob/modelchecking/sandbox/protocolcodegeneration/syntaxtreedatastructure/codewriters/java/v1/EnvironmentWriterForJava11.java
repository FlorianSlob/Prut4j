package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.Comparator;
import java.util.stream.Collectors;


public class EnvironmentWriterForJava11 implements ISyntaxWriter<ASTEnvironment> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTEnvironment SyntaxTreeItem) {
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"case \""+SyntaxTreeItem.roleName+"\": return new IEnvironment() {", "};", tabCount,
            (tabCountLvl0) -> {

                StringBuilderSyntaxHelperForJava11.addMethod(builder,"public void setState(int newState)", tabCountLvl0,
                        (tabCountLvl1) -> {
//                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "System.out.println(\"Setting state to \"+newState);");// Enable for debugging
                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "state = newState;");
                        }
                );


                StringBuilderSyntaxHelperForJava11.addMethod(builder,"public int getState()", tabCountLvl0,
                        (tabCountLvl1) -> {
//                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "System.out.println(\"Setting state to \"+newState);");// Enable for debugging
                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return 0;");
                        }
                );


                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public String getName()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return environmentName;");
                    }
                );
                // Order all statements by id, this is not necessary, but makes the generated code more readable.
                SyntaxTreeItem.ASTStateCaseStatements.sort(Comparator.comparingInt(s -> s.stateIdCondition));

                var numberOfStates = SyntaxTreeItem.ASTStateCaseStatements.size();
                var blockSize = 200;
                var numberOfBlocks = numberOfStates/blockSize;
                // TODO Determine block size...
                // Create blocks
                for(int i = 0; i <= numberOfBlocks; i++){
                    var startIndex = i*blockSize;
                    var endIndex = ((i+1) * blockSize)-1;
                    var blockEndIndex = endIndex +1;

                    if(endIndex > numberOfStates){
                        endIndex = numberOfStates;
                        blockEndIndex = numberOfStates;
                    }

                    var blockOfASTStateCaseStatements = SyntaxTreeItem.ASTStateCaseStatements.subList(startIndex, blockEndIndex);
                    StringBuilderSyntaxHelperForJava11.addMethod(builder,"public <Any, AnyInput> Optional<Any> exchange_"+startIndex+"_"+endIndex+"(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception", tabCountLvl0,
                            (tabCountLvl1) -> {
                                StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (state)", tabCountLvl1,
                                        (tabCountLvl2) -> {


                                            // Handle all wait-action-only cases in one case statement.
                                            {
                                                var hasAtLeastOneCaseStatement = blockOfASTStateCaseStatements
                                                        .stream()
                                                        .filter(s -> s.actionsFromState.size() == 0).count() > 0;

                                                if(hasAtLeastOneCaseStatement){
                                                    blockOfASTStateCaseStatements
                                                        .stream()
                                                        .filter(s -> s.actionsFromState.size() == 0)
                                                        .forEach(s -> {
                                                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl2, "case "+s.stateIdCondition + " :");
                                                        });

                                                    StringBuilderSyntaxHelper.addLine(builder, (tabCountLvl2 + 1), "monitor.wait();");
                                                    StringBuilderSyntaxHelper.addLine(builder, (tabCountLvl2 + 1), "break;");
                                                }

                                            }

                                            // Select all case statements that at least have 1 action
                                            var caseStatementsWithMultipleActions = blockOfASTStateCaseStatements.stream().filter(s -> s.actionsFromState.size() > 0).collect(Collectors.toList());

                                            // Writing all case statements to the switch block
                                            for(ASTStateCaseStatement stateCaseStatement : caseStatementsWithMultipleActions)
                                                stateCaseStatement.buildSyntax(builder,tabCountLvl2);

                                            // Add default to switch case statement.
//                                            StringBuilderSyntaxHelper.addLine(builder, tabCountLvl2, "default: throw new Exception(\"State number out of bounds\");");
                                        }
                                );
                                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return null;");
                            });
                }

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"synchronized (monitor)", tabCountLvl1,
                            (tabCountLvl2) -> {
                                StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"while (true)", tabCountLvl2,
                                    (tabCountLvl3) -> {

                                        for(int i = 0; i <= numberOfBlocks; i++) {
                                            var startIndex = i * blockSize;
                                            int endIndex;
                                            if(((i+1) * blockSize)-1 > numberOfStates){
                                                endIndex = numberOfStates;
                                            }else{
                                                endIndex = ((i+1) * blockSize)-1;
                                            }
                                            StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"if (state >="+startIndex+" && state <= "+endIndex+")", tabCountLvl3,
                                                    (tabCountLvl4) -> {
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "Optional result = exchange_"+startIndex+"_"+endIndex+"(box, receiver, isCloseAction);");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "if(result != null)");
                                                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "  return (Optional<Any>) result;");
                                                    }
                                            );
                                        }
                                    }
                                );
                            }
                        );
                        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCountLvl1);
                    }
                );
            }
        );
    }
}
