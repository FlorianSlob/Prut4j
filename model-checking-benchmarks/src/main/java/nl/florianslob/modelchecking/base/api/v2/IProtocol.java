package nl.florianslob.modelchecking.base.api.v2;

public interface IProtocol {
    IEnvironment getEnvironment(String threadName) throws Exception;

    String[] threadNames(); // helper method to get all participating thread names

    Object[] dummies(); // helper method to get a dummy value of each relevant type

    String getState(); // helper method to deep-clone
}
