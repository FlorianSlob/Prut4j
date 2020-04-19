package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

public class EnvironmentActionFromStateSendSyntaxTreeItem extends EnvironmentActionFromState {

    public final CommunicationChannelSyntaxTreeItem communicationChannel;
    public final int nextStateId;

    public EnvironmentActionFromStateSendSyntaxTreeItem(ISyntaxWriter<EnvironmentActionFromStateSendSyntaxTreeItem> syntaxBuilderAdapter, CommunicationChannelSyntaxTreeItem communicationChannel, int nextStateId) {
        super(syntaxBuilderAdapter);
        this.communicationChannel = communicationChannel;
        this.nextStateId = nextStateId;
    }
}
