package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.logging.Level;
import java.util.logging.Logger;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IOutPort;

/**
 *
 * @author FlorianSlob
 */
public class OutPort<T> implements IOutPort<T> {

    public OutPort() {
    }

    private IChannel<T> channel;

    @Override
    public void Send(T o) throws MaxDepthReachedException, ProtocolViolationException {

        while (channel == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(InPort.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        channel.checkMaxDepth();

        if (channel.isEnabled()) {
            // set in the queue as soon as the channel is open.
            channel.setMessageQueueObject(o);
        } else {
            throw new ProtocolViolationException("Violated the protocol");
        }
    }

    @Override
    public void SetChannel(IChannel<T> channel) {
        this.channel = channel;
    }
}
