package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxBuilderAdapter;

public class EnvironmentActionFromStateSendSyntaxTreeItem extends EnvironmentActionFromState {

    public final CommunicationChannelSyntaxTreeItem communicationChannel;
    public final int nextStateId;

    public EnvironmentActionFromStateSendSyntaxTreeItem(ISyntaxBuilderAdapter<EnvironmentActionFromStateSendSyntaxTreeItem> syntaxBuilderAdapter, CommunicationChannelSyntaxTreeItem communicationChannel, int nextStateId) {
        super(syntaxBuilderAdapter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
    }
}
