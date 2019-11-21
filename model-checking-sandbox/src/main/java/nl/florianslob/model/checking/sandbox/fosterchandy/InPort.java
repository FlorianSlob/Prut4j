package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.logging.Level;
import java.util.logging.Logger;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IInPort;

public class InPort implements IInPort {

    public InPort() {
    }
    private IChannel channel;

    @Override
    public Object Receive() throws MaxDepthReachedException, ProtocolViolationException {
        while (channel == null || channel.getMessageQueueObject() == null) {
            try {
                channel.checkMaxDepth();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(InPort.class.getName()).log(Level.SEVERE, null, e);
            } catch (MaxDepthReachedException | ProtocolViolationException e) {
                Logger.getLogger(InPort.class.getName()).log(Level.SEVERE, null, e);
                throw e;
            }
        }
        Object returnObject = channel.getMessageQueueObject();

        // return object if channel is open and object is not null
        return returnObject;
    }

    @Override
    public void SetChannel(IChannel channel) {
        this.channel = channel;
    }
}
