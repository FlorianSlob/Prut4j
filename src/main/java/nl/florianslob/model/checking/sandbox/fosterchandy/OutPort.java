/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.logging.Level;
import java.util.logging.Logger;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IOutPort;

/**
 *
 * @author FlorianSlob
 */
public class OutPort implements IOutPort {
    private static int currentDepth = 0;

    private int _maxDepth;

    public OutPort(){
        
    }
    public OutPort(int maxDepth) {
        this._maxDepth = maxDepth; 
    }
    private IChannel channel;

    @Override
    public void Send(Object o) throws Exception {

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
            throw new Exception("Violated the protocol");
        }
    }

    @Override
    public void SetChannel(IChannel channel) {
        this.channel = channel;
    }
}
