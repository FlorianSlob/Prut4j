package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 * IInPort
 */
public interface IInPort<T> extends IPort<T> {
    T Receive() throws MaxDepthReachedException, ProtocolViolationException;
}
