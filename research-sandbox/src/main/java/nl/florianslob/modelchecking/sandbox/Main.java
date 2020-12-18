package nl.florianslob.modelchecking.sandbox;

import nl.florianslob.modelchecking.sandbox.fosterchandy.FosterChandySandboxActivity;
import nl.florianslob.modelchecking.sandbox.graphvisualization.GraphVisualizationSandboxingActivity;
import nl.florianslob.modelchecking.sandbox.ltlautomatonfromowl.LtlAutomatonFromOwlSandboxingActivity;
import nl.florianslob.modelchecking.sandbox.ltlverification.LtlVerificationActivity;
import nl.florianslob.modelchecking.sandbox.modelchecking.ModelCheckingActivity;
import nl.florianslob.modelchecking.sandbox.onthefly.OnTheFlyLtlSandboxActivity;
import nl.florianslob.modelchecking.sandbox.protocolimplementations.ProtocolImplementationsSandboxActivity;

/**
 *
 * @author FlorianSlob
 */
public class Main {

    public static void main(String[] args) throws Exception {
        SandboxingActivityType sandboxingActivityType = SandboxingActivityType.OnTheFlyLtl;

        if(args != null && args.length > 0){
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
            case GraphVisualization:
                return new GraphVisualizationSandboxingActivity();
            case ChessProtocol:
                return new ProtocolImplementationsSandboxActivity();
            case LtlAutomatonFromOWl:
                return new LtlAutomatonFromOwlSandboxingActivity();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
