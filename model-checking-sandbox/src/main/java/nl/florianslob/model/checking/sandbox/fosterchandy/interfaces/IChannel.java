package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 *
 * @author FlorianSlob
 */
public interface IChannel<T> {

    Boolean isEnabled();

    void setEnabled(Boolean isEnabled);

    void checkMaxDepth() throws MaxDepthReachedException, ProtocolViolationException;

    void setMessageQueueObject(T o);

    T getMessageQueueObject();
}
