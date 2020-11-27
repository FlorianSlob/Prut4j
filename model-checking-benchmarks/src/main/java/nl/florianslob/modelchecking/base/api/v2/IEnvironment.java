package nl.florianslob.modelchecking.base.api.v2;

import java.util.Optional;

public interface IEnvironment {

    String getName();

    <Any, AnyInput> Optional<Any> exchange(@SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception;

    default <Any, AnyInput> Optional<Any> exchange(@SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box) throws Exception{
        return exchange(box,null, false);
    }

    default <Any, AnyInput> Optional<Any> exchange(@SuppressWarnings("OptionalUsedAsFieldOrParameterType") Optional<AnyInput> box, String receiver) throws Exception{
        return exchange(box,receiver, false);
    }

    default <Any> void send(Any m, String receiver) throws Exception {
        exchange(Optional.of(m), receiver);
    }

    default <Any> void send(Any m) throws Exception {
        exchange(Optional.of(m), null);
    }

    default <Any> Any receive() throws Exception {
        // Suppressing warnings, protocols are generated code that do type checks and present check manually
        //noinspection unchecked,OptionalGetWithoutIsPresent
        return (Any) exchange(Optional.empty()).get();
    }

    default void close() throws Exception {
        // Suppressing warnings, protocols are generated code that do type checks and present check manually
        //noinspection unchecked,OptionalGetWithoutIsPresent
        exchange(Optional.empty(), null, true);
    }
}