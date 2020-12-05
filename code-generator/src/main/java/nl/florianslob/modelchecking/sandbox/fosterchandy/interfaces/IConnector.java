package nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces;

/**
 * IConnector
 */
public interface IConnector<T> {
    void Connect(
        IInPort<T> inPortA,
        IOutPort<T> outPortB,
        IInPort<T> inPortB,
        IOutPort<T> outPortA);
}
