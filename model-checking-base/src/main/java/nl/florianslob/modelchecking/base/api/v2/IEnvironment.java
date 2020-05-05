package nl.florianslob.modelchecking.base.api.v2;

import java.util.Optional;

public interface IEnvironment {

    String getName();

    <Any,Any2> Optional<Any> exchange(@SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<Any2> box) throws Exception;

    default <Any> void send(Any m) throws Exception {
        exchange(Optional.of(m));
    }

    default <Any> Any receive() throws Exception {
        // Suppressing warnings, protocols are generated code that do type checks and present check manually
        //noinspection unchecked,OptionalGetWithoutIsPresent
        return (Any) exchange(Optional.empty()).get();
    }
}