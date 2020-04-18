package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.psuedocode;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.CommunicationChannelSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.EnvironmentSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.ProtocolSyntaxTreeItem;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.StringBuilderSyntaxHelper;
import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class ProtocolPseudoCodeWriter implements ISyntaxBuilderAdapter<ProtocolSyntaxTreeItem> {
    @Override
    public void buildSyntax(StringBuilder builder, int numberOfPrependingTabs, ProtocolSyntaxTreeItem SyntaxTreeItem) {
        // TODO Define packages?
        // Start with all imports
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
        numberOfPrependingTabs--;
        StringBuilderSyntaxHelper.addLine(builder, numberOfPrependingTabs, "}");
    }
}
