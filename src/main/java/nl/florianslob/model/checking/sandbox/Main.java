package nl.florianslob.model.checking.sandbox;

import nl.florianslob.model.checking.sandbox.fosterchandy.FosterChandySandboxActivity;
import nl.florianslob.model.checking.sandbox.onthefly.OnTheFlyLtlSandboxActivity;

/**
 *
 * @author FlorianSlob
 */
public class Main {

    public static void main(String[] args) throws Exception{
        System.out.println("Starting foster chandy model");

        SandboxingActivityType activityType = SandboxingActivityType.OnTheFlyLtl;
        ISandboxingActivity activity = getActivity(activityType);
        
        activity.runActivity();
    }
    
    private static ISandboxingActivity getActivity(SandboxingActivityType chosenOption){
          switch(chosenOption){
            case FosterChandy:
                return new FosterChandySandboxActivity();
            case OnTheFlyLtl: 
                return new OnTheFlyLtlSandboxActivity();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
