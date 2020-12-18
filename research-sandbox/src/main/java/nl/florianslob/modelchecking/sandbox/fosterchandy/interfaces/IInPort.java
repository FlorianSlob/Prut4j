package nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces;

import nl.florianslob.modelchecking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;

/**
 * IInPort
 */
public interface IInPort<T> extends IPort<T> {
    T Receive() throws MaxDepthReachedException;
}
