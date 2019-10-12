package nl.florianslob.model.checking.sandbox;

import nl.florianslob.model.checking.sandbox.fosterchandy.FosterChandySandboxActivity;

/**
 *
 * @author FlorianSlob
 */
public class Main {
    public static void main(String[] args){
       System.out.println("Starting foster chandy model");
       runFosterChandyModel();
    }    
    
    public static void runFosterChandyModel(){
        ISandboxingActivity activity = new FosterChandySandboxActivity();
        activity.runActivity();        
    }    
}
