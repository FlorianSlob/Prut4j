package nl.florianslob.model.checking.sandbox;

import nl.florianslob.model.checking.sandbox.fosterchandy.FosterChandySandboxActivity;
import nl.florianslob.model.checking.sandbox.ltlverification.LtlVerificationActivity;
import nl.florianslob.model.checking.sandbox.modelchecking.ModelcheckingActivity;
import nl.florianslob.model.checking.sandbox.onthefly.OnTheFlyLtlSandboxActivity;

/**
 *
 * @author FlorianSlob
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ISandboxingActivity activity = getActivity(SandboxingActivityType.ModelChecker);
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
                return new ModelcheckingActivity();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
