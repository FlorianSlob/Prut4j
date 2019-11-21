package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

/**
 * IConnector
 */
public interface IConnector {

    public void Connect(
            IInPort inPortA,
            IOutPort outPortB,
            IInPort inPortB,
            IOutPort outPortA);
}
