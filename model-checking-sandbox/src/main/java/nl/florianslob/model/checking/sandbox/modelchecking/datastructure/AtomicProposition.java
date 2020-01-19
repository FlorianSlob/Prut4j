package nl.florianslob.model.checking.sandbox.modelchecking.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class AtomicProposition {

    public String content;

    public AtomicProposition(String content) {
        this.content = content;
    }

    public void Print() {
        LoggingHelper.logInfo(" " + content);
    }

    public String getDisplayValue() {
        return content;
    }
}
