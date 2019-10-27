package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;

/**
 * IOutPort
 */
public interface IOutPort extends IPort {

    public void Send(Object o) throws InterruptedException, MaxDepthReachedException, ProtocolViolationException;
}
