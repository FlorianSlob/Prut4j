package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import java.util.HashSet;

public class ProtocolSyntaxTreeItem implements ISyntaxTreeItem {

    private final HashSet<CommunicationChannel> communicationChannels;
    private final HashSet<EnvironmentSyntaxTreeItem> environments;

    public ProtocolSyntaxTreeItem(HashSet<CommunicationChannel> communicationChannels, HashSet<EnvironmentSyntaxTreeItem> environments){
        this.communicationChannels = communicationChannels;
        this.environments = environments;
    }


    @Override
    public String getSyntax(int numberOfPrependingTabs) {
        StringBuilder syntax = new StringBuilder();
        syntax.append("public class blabla! \n");

        for(CommunicationChannel communicationChannel: this.communicationChannels){
            syntax.append(communicationChannel.getSyntax(0));
        }

        syntax.append("\n");
        syntax.append("\n");
        syntax.append("\n");

        for(EnvironmentSyntaxTreeItem environmentSyntaxTreeItem: this.environments){
            syntax.append(environmentSyntaxTreeItem.getSyntax(0));
        }

        syntax.append("End class \n");


        return syntax.toString();
    }
}
