package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.LinkedList;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;

/**
 *
 * @author FlorianSlob
 */
public abstract class AbstractChannel implements IChannel {

    private Boolean enabled = false;
    private int _maxDepth = -1;
    protected static int currentDepth = 0;
    private LinkedList<IChannel> _channelsToEnableAfterTransaction;
    private LinkedList<IChannel> _channelsToDisableAfterTransaction;

    @Override
    public final Object getMessageQueueObject() {
        enableAndDisableChannelsAfterTransaction();
        return getMessageQueueObjectImplementation();
    }

    public AbstractChannel() {
    }

    public AbstractChannel(int maxDepth) {
        _maxDepth = maxDepth;
    }

    @Override
    public Boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setEnabled(Boolean isEnabled) {
        this.enabled = isEnabled;
    }

    @Override
    public abstract void setMessageQueueObject(Object o);

    public abstract Object getMessageQueueObjectImplementation();

    @Override
    public void checkMaxDepth() throws MaxDepthReachedException {
        if (_maxDepth == -1) {
            return;
        }

        if (_maxDepth > currentDepth) {
            return;
        }

        throw new MaxDepthReachedException("Max depth reached!");
    }

    public void setChannelsToEnableAfterTransaciton(LinkedList<IChannel> channelsToEnableAfterTransaction) {
        _channelsToEnableAfterTransaction = channelsToEnableAfterTransaction;
    }

    public void setChannelsToDisableAfterTransaciton(LinkedList<IChannel> channelsToDisableAfterTransaction) {
        _channelsToDisableAfterTransaction = channelsToDisableAfterTransaction;
    }

    private void enableAndDisableChannelsAfterTransaction() {
        enableChannelsAfterTransaction();
        disableChannelsAfterTransaction();
    }

    private void enableChannelsAfterTransaction() {
        _channelsToEnableAfterTransaction.forEach((channel) -> {
            channel.setEnabled(true);
        });
    }

    private void disableChannelsAfterTransaction() {
        _channelsToDisableAfterTransaction.forEach((channel) -> {
            channel.setEnabled(false);
        });
    }
}
