package nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.v4;

import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTProtocol;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTReceiveAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTSendAction;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.ISyntaxWriter;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.StringBuilderSyntaxHelper;
import nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.codewriters.java.StringBuilderSyntaxHelperForJava11;

import java.util.*;
import java.util.stream.Collectors;

public class ProtocolWriterForJava11 implements ISyntaxWriter<ASTProtocol> {

    private final String[] PrimitiveJavaTypes = new String []
            {"Byte",
            "Char",
            "Short",
            "Integer",
            "Long",
            "Float",
            "Double",
            "Boolean",
            "String"};

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

        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount); // White line to distinguish imports from the java SDK with imports from our own API.
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.Optional;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.Random;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.BlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import java.util.concurrent.LinkedBlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, tabCount,"import static java.lang.Thread.sleep;");

        StringBuilderSyntaxHelper.addEmptyLine(builder, tabCount);

        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"public class "+SyntaxTreeItem.protocolName+" implements IProtocol ", tabCount,
            (tabCountLvl0) -> {
//                StringBuilderSyntaxHelper.addLine(builder, tabCountLvl0, "private final Object monitor = this;");
                // Order all Environments by name, this is not necessary, but makes the generated code more readable and consistent.
                var orderedEnvironments = new ArrayList<>(SyntaxTreeItem.environments);
                orderedEnvironments.sort(Comparator.comparing(o -> o.roleName));

                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : orderedEnvironments){
                    StringBuilderSyntaxHelper.addLine(builder,tabCountLvl0, "private final BlockingQueue<ProtocolMessage> "+ASTEnvironment.roleName+"Queue = new LinkedBlockingQueue<>();");
                }

                // Build the syntax of each environment in alphabetical order
                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : orderedEnvironments){
                    ASTEnvironment.buildSyntax(builder,tabCountLvl0);
                }

                StringBuilderSyntaxHelper.addEmptyLine(builder, tabCountLvl0);


                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public IEnvironment getEnvironment(String environmentName) throws Exception", tabCountLvl0,
                    (tabCountLvl1) -> {
                        StringBuilderSyntaxHelperForJava11.addScopedBlock(builder,"switch (environmentName)", tabCountLvl1,
                            (tabCountLvl2) -> {

                                // Build the syntax of each environment in alphabetical order
                                for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : orderedEnvironments){
                                    StringBuilderSyntaxHelper.addLine(builder,tabCountLvl2, "case \""+ASTEnvironment.roleName+"\": return "+ASTEnvironment.roleName+"Environment;");
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

                    var firstEnvironment =
                        SyntaxTreeItem.environments.stream().findFirst();

                    Set<String> possibleCommunicationTypes = new HashSet<>();

                    if(firstEnvironment.isPresent()) {

                        firstEnvironment.get().AllASTStateCaseStatements.forEach(cs -> {
                            possibleCommunicationTypes.addAll(
                            cs.actionsFromState.stream().filter(a -> a.getClass() == ASTSendAction.class)
                                    .map( a -> ((ASTSendAction) a).messageContentType)
                                    .collect(Collectors.toSet())
                            );
                        });

                        var objectCreationString = possibleCommunicationTypes.stream().map((action) -> {
                            if (Arrays.stream(PrimitiveJavaTypes).anyMatch(s -> s.equals(action))) {
                                return "new " + action + "()";
                            } else {
                                return action + ".GetTestDummyObject()";
                            }
                        }).collect(Collectors.joining(","));

                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new Object[]{"+objectCreationString+"};");
                    }else{
                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return new Object[]{};"); // No Send actions for this protocol.
                    }
                    }
                );

                StringBuilderSyntaxHelperForJava11.addMethodOverride(builder,"public String getState()", tabCountLvl0,
                    (tabCountLvl1) -> {

                    String stateNameBuilder = "\"/\"";
                        // Build the syntax of each environment in alphabetical order
                        for(nl.florianslob.modelchecking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ASTEnvironment ASTEnvironment : orderedEnvironments){
                            stateNameBuilder += " + "+ASTEnvironment.roleName+"Environment.getState() + \"/\"";
                        }

                        StringBuilderSyntaxHelper.addLine(builder, tabCountLvl1, "return "+stateNameBuilder+";"); /// TODO Do we still need this:?
                    }
                );
            }
        );
    }
}
