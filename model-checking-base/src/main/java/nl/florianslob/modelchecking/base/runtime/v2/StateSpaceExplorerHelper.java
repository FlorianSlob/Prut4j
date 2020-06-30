package nl.florianslob.modelchecking.base.runtime.v2;

import com.rits.cloning.Cloner;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

import java.util.*;

public class StateSpaceExplorerHelper {

    public static List<StateSpaceExploringAction> getExploringActions(IProtocol protocol) {
        var exploringActions = new ArrayList<StateSpaceExploringAction>();
        for (var threadName : protocol.threadNames()) {
            // Add all receive and send actions for every dummy
            for (var dummy : protocol.dummies()) {
                exploringActions.add(StateSpaceExploringAction.CreateReceiveStateSpaceExploringAction(threadName, dummy.getClass()));
                exploringActions.add(StateSpaceExploringAction.CreateSendStateSpaceExploringAction(threadName, dummy));
            }
        }
        return exploringActions;
    }


    public static HashMap<String, StateSpaceExploringThread> startExploringThreads(IProtocol protocol) {
        var threadPerParticipant =new HashMap<String, StateSpaceExploringThread>();
        for (var threadName : protocol.threadNames()) {
            threadPerParticipant.put(threadName, new StateSpaceExploringThread(threadName));
        }
        return threadPerParticipant;
    }

    public static IProtocol deepClone(IProtocol protocol) {
        // Clone the IProtocol with the third party library
        // https://github.com/kostaskougios/cloning
        Cloner cloner = new Cloner();
        return cloner.deepClone(protocol);
    }
}
