package nl.florianslob.modelchecking.base.api.v2;

import java.util.Optional;

public interface IProtocol {
    IEnvironment getEnvironment(String threadName) throws Exception;

    default <Any, AnyInput> Optional<Any> exchange(String threadName, @SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
        return getEnvironment(threadName).exchange(box,receiver, isCloseAction);
    }

    default <Any, AnyInput> Optional<Any> exchange(String threadName, @SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box) throws Exception{
        return getEnvironment(threadName).exchange(box,null, false);
    }

    default <Any, AnyInput> Optional<Any> exchange(String threadName, @SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box, String receiver) throws Exception{
        return getEnvironment(threadName).exchange(box,receiver, false);
    }

    default  <Any> void send(String threadName, Any m, String receiver) throws Exception{
        getEnvironment(threadName).send(m,receiver);
    }

    default <Any> void send(String threadName, Any m) throws Exception{
        getEnvironment(threadName).send(m);
    }

    default  <Any> Any receive(String threadName) throws Exception{
        return getEnvironment(threadName).receive();
    }

    default void close(String threadName) throws Exception{
        getEnvironment(threadName).close();
    }

    String[] threadNames(); // helper method to get all participating thread names

    String getState(); // helper method to deep-clone
}

