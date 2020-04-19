package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateReceiveSyntaxTreeItem extends EnvironmentActionFromState {

    public final CommunicationChannelSyntaxTreeItem communicationChannel;

    public final int nextStateId;
    public final int currentStateId;

    public EnvironmentActionFromStateReceiveSyntaxTreeItem(ISyntaxBuilderAdapter<EnvironmentActionFromStateReceiveSyntaxTreeItem> syntaxBuilderAdapter, CommunicationChannelSyntaxTreeItem communicationChannel, int currentStateId, int nextStateId) {
        super(syntaxBuilderAdapter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
        this.currentStateId = currentStateId;
    }
}
