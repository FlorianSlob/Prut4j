package nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces;

/**
 *
 * @author FlorianSlob
 */
public interface IPort<T> {
    void SetChannel(IChannel<T> channel);
}
