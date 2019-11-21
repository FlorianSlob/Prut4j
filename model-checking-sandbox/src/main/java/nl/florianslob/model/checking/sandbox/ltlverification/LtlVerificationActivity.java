package nl.florianslob.model.checking.sandbox.ltlverification;

import java.util.HashSet;
import java.util.Set;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.LoggingHelper;
import nl.florianslob.model.checking.sandbox.ltlverification.datastructure.StateNode;

/**
 *
 * @author FlorianSlob
 */
public class LtlVerificationActivity implements ISandboxingActivity {

    @Override
    public void runActivity() throws Exception {
        LoggingHelper.isDebuggingEnabled = true;

        // Normally these states will be generated!
        StateNode state0 = new StateNode(0);
        StateNode state1 = new StateNode(1);
        StateNode state2 = new StateNode(2);
        StateNode state3 = new StateNode(3);
        StateNode state4 = new StateNode(4);
        StateNode state5 = new StateNode(5);
        StateNode state6 = new StateNode(6);
        StateNode state7 = new StateNode(7);
        StateNode state8 = new StateNode(8);
        StateNode state9 = new StateNode(9);
        StateNode state10 = new StateNode(10);

        StateNode state11 = new StateNode(11);
        StateNode state12 = new StateNode(12);
        StateNode state13 = new StateNode(13);
        StateNode state14 = new StateNode(14);

        state0.Successors.add(state1);
        state1.Successors.add(state2);
        state2.Successors.add(state3);
        state3.Successors.add(state4);
        state4.Successors.add(state5);
        state5.Successors.add(state6);
        state6.Successors.add(state2);

        state4.Successors.add(state7);
        state7.Successors.add(state8);
        state8.Successors.add(state9);
        state9.Successors.add(state10);
        state10.Successors.add(state5);

        state1.Successors.add(state11);
        state11.Successors.add(state12);
        state12.Successors.add(state13);
        state13.Successors.add(state14);
        state14.Successors.add(state14);

        if (LoggingHelper.isDebuggingEnabled) {
            state0.printRecursively();
        }

        Set<StateNode> F = new HashSet<>(); // TODO what is F?
        F.add(state2);
//        F.add(state5);
//        F.add(state10);

        Set<StateNode> Q = FindDesignatedStatesHelper.DfsPass1(state0, F);
        System.out.println("Is non empty for F? : " + FindDesignatedStatesHelper.DfsPass2(Q));

    }

}
