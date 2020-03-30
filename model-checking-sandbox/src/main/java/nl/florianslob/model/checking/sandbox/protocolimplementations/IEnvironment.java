package nl.florianslob.model.checking.sandbox.protocolimplementations;


import java.util.Optional;

public interface IEnvironment {

    String getName();
    Optional exchange(Optional box) throws Exception;

    default void send(Object m) throws Exception {
        exchange(Optional.of(m));
    }

    default Object receive() throws Exception {
        return exchange(Optional.empty()).get();
    }
}

