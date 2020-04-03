package nl.florianslob.model.checking.sandbox.protocolimplementations;

public class ProtocolMessage<T>  {
    public  ProtocolMessage(String receiver, T message){
        this.receiver = receiver;
        this.message = message;
    }
    public String receiver;
    public T message;
}
