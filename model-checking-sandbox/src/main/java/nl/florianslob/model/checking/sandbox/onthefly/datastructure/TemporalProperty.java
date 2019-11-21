package nl.florianslob.model.checking.sandbox.onthefly.datastructure;

import nl.florianslob.model.checking.sandbox.LoggingHelper;

/**
 *
 * @author FlorianSlob
 */
public class TemporalProperty {

    public String content;

    public TemporalProperty(String content) {
        this.content = content;
    }

    public void Print() {
        LoggingHelper.logInfo(" " + content);
    }
}
