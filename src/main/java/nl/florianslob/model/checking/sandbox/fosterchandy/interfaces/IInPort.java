package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 * IInPort
 */
public interface IInPort extends IPort {

    public Object Receive() throws MaxDepthReachedException, ProtocolViolationException;
}
