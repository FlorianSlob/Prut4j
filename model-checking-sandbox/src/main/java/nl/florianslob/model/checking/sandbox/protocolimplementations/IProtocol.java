package nl.florianslob.model.checking.sandbox.protocolimplementations;

public interface IProtocol {
    IEnvironment getEnvironment(String threadName) throws Exception;

    String[] threadNames(); // helper method to get all participating thread names

    Object[] dummies(); // helper method to get a dummy value of each relevant type

    IProtocol deepClone(); // helper method to deep-clone
}
