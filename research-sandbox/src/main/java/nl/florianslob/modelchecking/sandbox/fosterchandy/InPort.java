package nl.florianslob.modelchecking.sandbox.fosterchandy;

import java.util.logging.Level;
import java.util.logging.Logger;
import nl.florianslob.modelchecking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces.IChannel;
import nl.florianslob.modelchecking.sandbox.fosterchandy.interfaces.IInPort;

public class InPort<T> implements IInPort<T> {

    public InPort() {
    }
    private IChannel<T> channel;

    @Override
    public T Receive() throws MaxDepthReachedException {
        while (channel == null || channel.getMessageQueueObject() == null) {
            try {
                channel.checkMaxDepth();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(InPort.class.getName()).log(Level.SEVERE, null, e);
            } catch (MaxDepthReachedException e) {
                Logger.getLogger(InPort.class.getName()).log(Level.SEVERE, null, e);
                throw e;
            }
        }

        // return object if channel is open and object is not null
        return channel.getMessageQueueObject();
    }

    @Override
    public void SetChannel(IChannel<T> channel) {
        this.channel = channel;
    }
}
