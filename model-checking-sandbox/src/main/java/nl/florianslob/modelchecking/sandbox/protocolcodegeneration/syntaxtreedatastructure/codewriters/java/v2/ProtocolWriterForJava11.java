package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v2;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

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
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import nl.florianslob.modelchecking.base.api.v2.*;");
        // TODO Import custom type or only support primitive types
//        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import dto.Move;");


        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount); // White line to distinguish imports from the java SDK with imports from our own API.
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.Optional;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.Random;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.BlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.LinkedBlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import static java.lang.Thread.sleep;");

        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount);

        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"public class "+SyntaxTreeItem.protocolName+" implements IProtocol ", tabCount,
            (tabCountLvl0) -> {
//                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0,"private volatile int state = 0;");
                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "private final Object monitor = this;");

                StringBuilderSyntaxHelper.addEmptyLine(builder, tabCountLvl0);


//                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "private final LinkedBlockingDeque<QueueItem> BlockingQueue = new LinkedBlockingDeque<>();");
//
                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTCommunicationChannel ASTCommunicationChannel : SyntaxTreeItem.ASTCommunicationChannels){
                    ASTCommunicationChannel.buildSyntax(builder,tabCountLvl0);
                }

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public IEnvironment getEnvironment(String environmentName) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (environmentName)", tabCountLvl1,
                            (tabCountLvl2) -> {
                                // Order all Environments by name, this is not necessary, but makes the generated code more readable and consistent.
                                var orderedEnvironments = new ArrayList<>(SyntaxTreeItem.environments);
                                orderedEnvironments.sort(Comparator.comparing(o -> o.roleName));

                                // Build the syntax of each environment in alphabetical order
                                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : orderedEnvironments){
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
                        var listOfEnvironments = SyntaxTreeItem.environments.stream().map(a -> "\""+a.roleName+"\"").collect(Collectors.joining(","));

                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new String[] { "+listOfEnvironments+" };");
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public Object[] dummies()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new Object[]{\"TestStringDummy\"};"); // TODO Make this more dynamic (Default for all types used in the protocol)
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public int getState()", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return 0;"); /// TODO Do we still need this:?
                    }
                );
            }
        );
    }
}
