package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure.adapters.ISyntaxWriter;

import java.util.Objects;

public class ASTCommunicationChannel extends SyntaxTreeItemBase<ASTCommunicationChannel> {
    public final String fromRole;
    public final String toRole;
    public final String messageType;
    public final String queueName;

    public ASTCommunicationChannel(ISyntaxWriter<ASTCommunicationChannel> syntaxWriter, String fromRole, String toRole, String messageType){
        super(syntaxWriter);
        this.fromRole = fromRole;
        this.toRole = toRole;
        this.messageType = messageType;
        this.queueName = "queueFrom"+fromRole+"To"+toRole;
    }

    // Override the equals method to enable comparison based on the fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ASTCommunicationChannel channel = (ASTCommunicationChannel) o;
        return Objects.equals(fromRole, channel.fromRole) &&
            Objects.equals(toRole, channel.toRole) &&
            Objects.equals(messageType, channel.messageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromRole, toRole, messageType);
    }
}
