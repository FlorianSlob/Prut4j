package nl.florianslob.modelchecking.base.api.v2;

public interface IProtocol {
    IEnvironment getEnvironment(String threadName) throws Exception;

    String[] threadNames(); // helper method to get all participating thread names

    String getState(); // helper method to deep-clone
}

