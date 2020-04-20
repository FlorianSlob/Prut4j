package nl.florianslob.modelchecking.base.api;

public class ProtocolMessage<T>  {
    public  ProtocolMessage(String receiver, T message){
        this.receiver = receiver;
        this.message = message;
    }
    public final String receiver;
    public final T message;
}
