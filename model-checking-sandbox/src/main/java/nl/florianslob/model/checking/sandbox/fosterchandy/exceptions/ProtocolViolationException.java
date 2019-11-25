package nl.florianslob.model.checking.sandbox.fosterchandy.exceptions;

/**
 *
 * @author FlorianSlob
 */
public class ProtocolViolationException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -1297848735748512248L;

    public ProtocolViolationException(final String errorMessage) {
        super(errorMessage);
    }
}
