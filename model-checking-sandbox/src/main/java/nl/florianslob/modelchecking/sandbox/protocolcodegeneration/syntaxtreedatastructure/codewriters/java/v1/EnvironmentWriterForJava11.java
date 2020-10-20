package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v1;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTStateCaseStatement;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.Comparator;


public class EnvironmentWriterForJava11 implements ISyntaxWriter<ASTEnvironment> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTEnvironment SyntaxTreeItem) {
        StringBuilderSyntaxHelperForJava11.addCodeInBlock(builder,"case \""+SyntaxTreeItem.roleName+"\": return new IEnvironment() {", "};", tabCount,
            (tabCountLvl0) -> {

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public String getName()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return environmentName;");
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"synchronized (monitor)", tabCountLvl1,
                            (tabCountLvl2) -> {
                                StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"while (true)", tabCountLvl2,
                                    (tabCountLvl3) -> {
                                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (state)", tabCountLvl3,
                                            (tabCountLvl4) -> {
                                                // Order all statements by id, this is not necessary, but makes the generated code more readable.
                                                SyntaxTreeItem.ASTStateCaseStatements.sort(Comparator.comparingInt(s -> s.stateIdCondition));

                                                // Writing all case statements to the switch block
                                                for(ASTStateCaseStatement stateCaseStatement : SyntaxTreeItem.ASTStateCaseStatements)
                                                    stateCaseStatement.buildSyntax(builder,tabCountLvl4);

                                                // Add default to switch case statement.
                                                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl4, "default: throw new Exception(\"State number out of bounds\");");
                                            }
                                        );
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
