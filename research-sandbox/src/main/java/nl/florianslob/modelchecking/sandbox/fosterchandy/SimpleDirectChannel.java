package nl.florianslob.modelchecking.sandbox.fosterchandy;

/**
 *
 * @author FlorianSlob
 */
public class SimpleDirectChannel<T> extends AbstractChannel<T> {

    public T messageQueueObject;

    public SimpleDirectChannel(int maxDepth) {
        super(maxDepth);
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
