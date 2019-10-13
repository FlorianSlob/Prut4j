/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.fosterchandy.exceptions;

/**
 *
 * @author FlorianSlob
 */
public class MaxDepthReachedException extends Exception{
    public MaxDepthReachedException(String message){
        super(message);
    }
}
