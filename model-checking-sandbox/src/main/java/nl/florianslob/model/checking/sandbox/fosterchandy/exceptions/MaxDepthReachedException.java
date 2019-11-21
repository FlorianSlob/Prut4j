package nl.florianslob.model.checking.sandbox.fosterchandy.exceptions;

/**
 *
 * @author FlorianSlob
 */
public class MaxDepthReachedException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public MaxDepthReachedException(final String message) {
        super(message);
    }
}
