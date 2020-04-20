package nl.florianslob.modelchecking.base.api;

import java.util.Optional;

public interface IEnvironment {

    String getName();
    Optional<ProtocolMessage> exchange(Optional<ProtocolMessage> box) throws Exception;

    default void send(ProtocolMessage m) throws Exception {
        exchange(Optional.of(m));
    }

    default ProtocolMessage receive() throws Exception {
        return exchange(Optional.empty()).get();
    }
}