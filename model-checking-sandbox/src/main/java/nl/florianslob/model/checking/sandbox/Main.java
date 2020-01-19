package nl.florianslob.model.checking.sandbox;

import nl.florianslob.model.checking.sandbox.fosterchandy.FosterChandySandboxActivity;
import nl.florianslob.model.checking.sandbox.ltlverification.LtlVerificationActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.model.checking.sandbox.onthefly.OnTheFlyLtlSandboxActivity;

/**
 *
 * @author FlorianSlob
 */
public class Main {

    public static void main(String[] args) throws Exception {
        SandboxingActivityType sandboxingActivityType = SandboxingActivityType.ModelChecker;

        if(args != null){
            try{
                sandboxingActivityType = SandboxingActivityType.valueOf(args[0]);
            }catch (Exception e){
                System.out.println("Text must be an exact match with an enum value. Leave parameters empty for default behavior. Stopping execution. ");
                throw e;
            }
        }
        ISandboxingActivity activity = getActivity(sandboxingActivityType);
        activity.runActivity();
    }

    private static ISandboxingActivity getActivity(SandboxingActivityType chosenOption) {
        switch (chosenOption) {
            case FosterChandy:
                return new FosterChandySandboxActivity();
            case OnTheFlyLtl:
                return new OnTheFlyLtlSandboxActivity();
            case LtlVerification:
                return new LtlVerificationActivity();
            case ModelChecker:
                return new ModelCheckingActivity();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
