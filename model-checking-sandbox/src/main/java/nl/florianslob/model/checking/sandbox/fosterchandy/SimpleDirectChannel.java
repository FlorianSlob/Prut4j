package nl.florianslob.model.checking.sandbox.fosterchandy;

/**
 *
 * @author FlorianSlob
 */
public class SimpleDirectChannel<T> extends AbstractChannel<T> {

    public T messageQueueObject;

    public String name;

    public SimpleDirectChannel(String name, int maxDepth) {
        super(maxDepth);
        this.name = name;
    }

    @Override
    public void setMessageQueueObject(T o) {
        this.messageQueueObject = o;
        currentDepth++;
    }

    @Override
    public T getMessageQueueObjectImplementation() {
        T returnObject = this.messageQueueObject;
        this.messageQueueObject = null;
        return returnObject;
    }
}
