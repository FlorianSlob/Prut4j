/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.fosterchandy.interfaces;

/**
 *
 * @author FlorianSlob
 */
public interface IChannel {

    Boolean isEnabled();

    void checkMaxDepth() throws Exception;

    public void setMessageQueueObject(Object o);

    public Object getMessageQueueObject();
}
