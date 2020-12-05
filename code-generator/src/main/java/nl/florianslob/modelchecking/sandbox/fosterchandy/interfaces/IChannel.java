package nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces;

import nl.florianslob.modelchecking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;

/**
 *
 * @author FlorianSlob
 */
public interface IChannel<T> {

    Boolean isEnabled();

    void setEnabled(Boolean isEnabled);

    void checkMaxDepth() throws MaxDepthReachedException;

    void setMessageQueueObject(T o);

    T getMessageQueueObject();
}
