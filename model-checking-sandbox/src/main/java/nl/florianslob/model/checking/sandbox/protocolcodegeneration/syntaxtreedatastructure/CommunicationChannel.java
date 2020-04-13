package nl.florianslob.model.checking.sandbox.protocolcodegeneration.syntaxtreedatastructure;

import java.util.Objects;

public class CommunicationChannel implements ISyntaxTreeItem{
    private final String fromRole;
    private final String toRole;
    private final String messageType;

    public CommunicationChannel(String fromRole, String toRole, String messageType){
        this.fromRole = fromRole;
        this.toRole = toRole;
        this.messageType = messageType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunicationChannel channel = (CommunicationChannel) o;
        return Objects.equals(fromRole, channel.fromRole) &&
            Objects.equals(toRole, channel.toRole) &&
            Objects.equals(messageType, channel.messageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromRole, toRole, messageType);
    }

    @Override
    public String getSyntax(int numberOfPrependingTabs) {
        return "Blocking queue from "+this.fromRole+" to "+this.toRole+" with messageType "+this.messageType+ "\n" ;
    }
}
