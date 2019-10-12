/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.fosterchandy;

import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.*;

public class Connector implements IConnector{
    private int _maxDepth = -1;

    public Connector(){
    }
    
    public Connector(int maxDepth){
        _maxDepth = maxDepth;
    }
    
    @Override
    public void Connect(IInPort inPortA, 
            IOutPort outPortB,
            IInPort inPortB, 
            IOutPort outPortA
                ) {
        SimpleDirectChannel channel1 = new SimpleDirectChannel(_maxDepth);        
        SimpleDirectChannel channel2 = new SimpleDirectChannel(_maxDepth);

        inPortA.SetChannel(channel1);
        outPortB.SetChannel(channel1);
        
        inPortB.SetChannel(channel2);
        outPortA.SetChannel(channel2);
        
        // All transitions are allowed for now.
        channel1.enabled = true;
        channel2.enabled = true;
        
        System.out.println("Connected!");
    }
}
