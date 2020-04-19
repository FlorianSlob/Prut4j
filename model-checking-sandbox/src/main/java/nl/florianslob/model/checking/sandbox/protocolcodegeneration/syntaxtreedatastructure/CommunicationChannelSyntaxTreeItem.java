package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.Objects;

public class CommunicationChannelSyntaxTreeItem extends AbstractSyntaxTreeItem<CommunicationChannelSyntaxTreeItem> {
    public final String fromRole;
    public final String toRole;
    public final String messageType;
    public final String queueName;

    public CommunicationChannelSyntaxTreeItem(String fromRole, String toRole, String messageType, ISyntaxWriter<CommunicationChannelSyntaxTreeItem> syntaxBuilderAdapter){
        super(syntaxBuilderAdapter);
        this.fromRole = fromRole;
        this.toRole = toRole;
        this.messageType = messageType;
        this.queueName = "queueFrom"+fromRole+"To"+toRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunicationChannelSyntaxTreeItem channel = (CommunicationChannelSyntaxTreeItem) o;
        return Objects.equals(fromRole, channel.fromRole) &&
            Objects.equals(toRole, channel.toRole) &&
            Objects.equals(messageType, channel.messageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromRole, toRole, messageType);
    }


}
