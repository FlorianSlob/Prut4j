package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

/**
 * IConnector
 */
public interface IConnector<T> {

    public void Connect(
            IInPort<T> inPortA,
            IOutPort<T> outPortB,
            IInPort<T> inPortB,
            IOutPort<T> outPortA);
}
