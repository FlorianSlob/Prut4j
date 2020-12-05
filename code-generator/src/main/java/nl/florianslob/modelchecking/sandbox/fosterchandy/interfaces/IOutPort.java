package nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces;

import nl.florianslob.modelchecking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.modelchecking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 * IOutPort
 */
public interface IOutPort<T> extends IPort<T> {
    void Send(T o) throws MaxDepthReachedException, ProtocolViolationException;
}
