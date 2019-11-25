package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 * IOutPort
 */
public interface IOutPort<T> extends IPort<T> {

    public void Send(T o) throws MaxDepthReachedException, ProtocolViolationException;
}
