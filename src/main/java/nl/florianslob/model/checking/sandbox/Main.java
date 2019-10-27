package nl.florianslob.model.checking.sandbox;

import nl.florianslob.model.checking.sandbox.fosterchandy.FosterChandySandboxActivity;
import nl.florianslob.model.checking.sandbox.onthefly.OnTheFlyLtlSandboxActivity;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author FlorianSlob
 */
public class Main {

    public static void main(String[] args) {
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
                throw new NotImplementedException();
        }
    }
}
