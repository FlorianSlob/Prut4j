package nl.florianslob.model.checking.sandbox.fosterchandy;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;

/**
 *
 * @author FlorianSlob
 */
public class SimpleDirectChannel extends AbstractChannel {

    public Object messageQueueObject; // TODO Make generic!

    public String name;

    public SimpleDirectChannel(String name) {
        super();
        this.name = name;
    }

    public SimpleDirectChannel(String name, int maxDepth) {
        super(maxDepth);
        this.name = name;
    }

    @Override
    public void setMessageQueueObject(Object o) {
        this.messageQueueObject = o;
        currentDepth++;
    }

    @Override
    public Object getMessageQueueObjectImplementation() {
        Object returnObject = this.messageQueueObject;
        this.messageQueueObject = null;
        return returnObject;
    }
}
