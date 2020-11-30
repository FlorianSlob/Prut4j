package nl.florianslob.modelchecking.base.api.v2;

public class QueueItem {
    public String QueueName;
    public Object Message;
    public QueueItem(String queueName, Object message){
        this.QueueName = queueName;
        this.Message = message;
    }
}
