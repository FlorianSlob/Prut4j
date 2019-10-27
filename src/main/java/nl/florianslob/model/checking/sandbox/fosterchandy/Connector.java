package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.LinkedList;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.*;

public class Connector implements IConnector {

    private int _maxDepth = -1;

    public Connector() {
    }

    public Connector(int maxDepth) {
        _maxDepth = maxDepth;
    }

    @Override
    public void Connect(IInPort inPortA,
            IOutPort outPortB,
            IInPort inPortB,
            IOutPort outPortA
    ) {
        SimpleDirectChannel channel1 = new SimpleDirectChannel("Channel 1",_maxDepth);
        SimpleDirectChannel channel2 = new SimpleDirectChannel("Channel 2",_maxDepth);

        outPortA.SetChannel(channel1);
        inPortB.SetChannel(channel1);
        outPortB.SetChannel(channel2);
        inPortA.SetChannel(channel2);

        LinkedList<IChannel> channel1Disable, channel1Enable, channel2Disable, channel2Enable;

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

        channel1.setChannelsToDisableAfterTransaciton(channel1Disable);
        channel1.setChannelsToEnableAfterTransaciton(channel1Enable);
        channel2.setChannelsToDisableAfterTransaciton(channel2Disable);
        channel2.setChannelsToEnableAfterTransaciton(channel2Enable);

        System.out.println("Connected!");
    }
}
