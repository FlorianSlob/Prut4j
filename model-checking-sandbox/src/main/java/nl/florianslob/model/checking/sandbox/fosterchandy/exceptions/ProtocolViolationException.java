package nl.florianslob.model.checking.sandbox.fosterchandy.exceptions;

/**
 *
 * @author FlorianSlob
 */
public class ProtocolViolationException extends Exception {
    public ProtocolViolationException(final String errorMessage) {
        super(errorMessage);
    }
}
