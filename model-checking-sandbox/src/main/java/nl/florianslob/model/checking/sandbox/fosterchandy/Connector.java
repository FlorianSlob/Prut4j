package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.LinkedList;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.*;

public class Connector<T> implements IConnector<T> {

    private final int _maxDepth;

    public Connector(int maxDepth) {
        _maxDepth = maxDepth;
    }

    @Override
    public void Connect(IInPort<T> inPortA,
            IOutPort<T> outPortB,
            IInPort<T> inPortB,
            IOutPort<T> outPortA
    ) {
        SimpleDirectChannel<T> channel1 = new SimpleDirectChannel<>(_maxDepth);
        SimpleDirectChannel<T> channel2 = new SimpleDirectChannel<>(_maxDepth);

        outPortA.SetChannel(channel1);
        inPortB.SetChannel(channel1);
        outPortB.SetChannel(channel2);
        inPortA.SetChannel(channel2);

        LinkedList<IChannel<T>> channel1Disable, channel1Enable, channel2Disable, channel2Enable;

        channel1Disable = new LinkedList<>();
        channel1Disable.add(channel1);
        channel1Enable = new LinkedList<>();
        channel1Enable.add(channel2);
        channel2Disable = new LinkedList<>();
        channel2Disable.add(channel2);
        channel2Enable = new LinkedList<>();
        channel2Enable.add(channel1);

        // Set the starting state, only channel 1 can be used.
        channel1.setEnabled(true);
        channel2.setEnabled(false);

        channel1.setChannelsToDisableAfterTransaction(channel1Disable);
        channel1.setChannelsToEnableAfterTransaction(channel1Enable);
        channel2.setChannelsToDisableAfterTransaction(channel2Disable);
        channel2.setChannelsToEnableAfterTransaction(channel2Enable);

        System.out.println("Connected!");
    }
}
