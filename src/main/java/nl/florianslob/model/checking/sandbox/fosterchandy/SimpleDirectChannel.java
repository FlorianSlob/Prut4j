/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.fosterchandy;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IChannel;

/**
 *
 * @author FlorianSlob
 */
public class SimpleDirectChannel implements IChannel {

    public Object messageQueueObject; // TODO Make generic!

    public Boolean enabled = false;
    private int _maxDepth = -1;
    private static int currentDepth = 0;

    public SimpleDirectChannel() {

    }

    public SimpleDirectChannel(int maxDepth) {
        _maxDepth = maxDepth;
    }

    @Override
    public Boolean isEnabled() {
        return enabled;
    }

    @Override
    public void setMessageQueueObject(Object o) {
        this.messageQueueObject = o;
        currentDepth++;
    }

    @Override
    public Object getMessageQueueObject() {
        return this.messageQueueObject;
    }

    @Override
    public void checkMaxDepth() throws MaxDepthReachedException {
        if (_maxDepth == -1) {
            return;
        }

        if (_maxDepth > currentDepth) {
            return;
        }

        throw new MaxDepthReachedException("Max depth reached!");//TODO Custom Exception
    }
}
