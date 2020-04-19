package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.java;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannelSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class ProtocolJava11Writer implements ISyntaxWriter<ProtocolSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ProtocolSyntaxTreeItem SyntaxTreeItem) {
        // Write comment at the top of the page.
        // TODO Extend with links to documentation, original protocol automaton, settings used to generate this class.
        // (Maybe plantuml syntax of the protocol?)
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"/* !!! IMPORTANT !!!");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs," * !!! This code is generated from a protocol definition. !!!");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs," * !!! Any Changes made to this code could be overridden. !!!");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs," * !!! If you want to change the protocol, change its definition and regenerate this code. !!!");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs," **/");


        // TODO How to determine package name?
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"package nl.florianslob.model.checking.sandbox.protocolcodegeneration.generated;");
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);

        // Start with all imports

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"// Import types from the API");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"import nl.florianslob.model.checking.sandbox.protocolimplementations.*;");

        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"import java.util.Optional;");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"import java.util.concurrent.BlockingQueue;");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"import java.util.concurrent.LinkedBlockingQueue;");
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"public class "+SyntaxTreeItem.protocolName+" implements IProtocol {");

        numberOfPrependingTabs++;

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs,"private volatile int state = 0;");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "private final Object monitor = this;");
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        for(CommunicationChannelSyntaxTreeItem communicationChannelSyntaxTreeItem : SyntaxTreeItem.communicationChannelSyntaxTreeItems){
            communicationChannelSyntaxTreeItem.buildSyntax(builder,numberOfPrependingTabs);
        }
        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public IEnvironment getEnvironment(String environmentName) throws Exception{");

        numberOfPrependingTabs++;

        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "switch (environmentName) {");

        numberOfPrependingTabs++;

        for(EnvironmentSyntaxTreeItem environmentSyntaxTreeItem: SyntaxTreeItem.environments){
            environmentSyntaxTreeItem.buildSyntax(builder,numberOfPrependingTabs);
        }

        // Add default to switch case statement.
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "default: throw new Exception(\"Unknown environment\");");

        // Add closing tags
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");

        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public String[] threadNames() {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return new String[] { \"W\", \"B\" };");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");

        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public Object[] dummies() {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return new Object[0];");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");

        StringBuilderSyntaxHelper.addEmptyLine(builder, numberOfPrependingTabs);
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "@Override");
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "public IProtocol deepClone() {");
        numberOfPrependingTabs++;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "return null;");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
    }
}
