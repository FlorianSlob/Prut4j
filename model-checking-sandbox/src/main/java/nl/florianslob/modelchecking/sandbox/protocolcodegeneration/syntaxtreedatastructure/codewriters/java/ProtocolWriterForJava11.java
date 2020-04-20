package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;

public class ProtocolWriterForJava11 implements ISyntaxWriter<ASTProtocol> {
    @Override
    public void buildSyntax(StringBuilder builder, int tabCount, ASTProtocol SyntaxTreeItem) {
        // Write comment at the top of the page.
        // TODO Extend with links to documentation, original protocol automaton, settings used to generate this class.
        // (Maybe plantuml syntax of the protocol?)
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"/* !!! IMPORTANT !!!");
        StringBuilderSyntaxHelper.addLine(builder, tabCount," * !!! This code is generated from a protocol definition. !!!");
        StringBuilderSyntaxHelper.addLine(builder, tabCount," * !!! Any Changes made to this code could be overridden. !!!");
        StringBuilderSyntaxHelper.addLine(builder, tabCount," * !!! If you want to change the protocol, change its definition and regenerate this code. !!!");
        StringBuilderSyntaxHelper.addLine(builder, tabCount," **/");

        // TODO How to determine package name?
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"package nl.florianslob.modelchecking.generated;");
        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount);

        // Start with all imports
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"// Import types from the API");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import nl.florianslob.modelchecking.base.api.*;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import dto.Move;");


        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount); // White line to distinguish imports from the java SDK with imports from our own API.
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.Optional;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.BlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.LinkedBlockingQueue;");
        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount);

        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"public class "+SyntaxTreeItem.protocolName+" implements IProtocol ", tabCount,
            (tabCountLvl0) -> {
                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0,"private volatile int state = 0;");
                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "private final Object monitor = this;");

                StringBuilderSyntaxHelper.addEmptyLine(builder, tabCountLvl0);

                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel ASTCommunicationChannel : SyntaxTreeItem.ASTCommunicationChannels){
                    ASTCommunicationChannel.buildSyntax(builder,tabCountLvl0);
                }

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public IEnvironment getEnvironment(String environmentName) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (environmentName)", tabCountLvl1,
                            (tabCountLvl2) -> {
                                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : SyntaxTreeItem.environments){
                                    ASTEnvironment.buildSyntax(builder,tabCountLvl2);
                                }

                                // Add default to switch case statement.
                                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl2, "default: throw new Exception(\"Unknown environment\");");
                            }
                        );
                }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public String[] threadNames()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new String[] { \"W\", \"B\" };");
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public Object[] dummies()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new Object[0];");
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public IProtocol deepClone()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return null;");
                    }
                );
            }
        );
    }
}
