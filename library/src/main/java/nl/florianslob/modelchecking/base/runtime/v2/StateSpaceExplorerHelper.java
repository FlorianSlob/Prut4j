package nl.florianslob.modelchecking.base.runtime.v2;

import com.rits.cloning.Cloner;
import com.rits.cloning.IDumpCloned;
import nl.florianslob.modelchecking.base.api.v2.ICloneableProtocol;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;

import java.lang.reflect.Field;
import java.util.*;

public class StateSpaceExplorerHelper {

    public static List<StateSpaceExploringAction> getExploringActions(IProtocol protocol, Object[] dummies) {
        var exploringActions = new ArrayList<StateSpaceExploringAction>();
        for (var threadName : protocol.threadNames()) {
            // Add all receive and send actions for every dummy
            for (var dummy : dummies) {
                exploringActions.add(StateSpaceExploringAction.CreateReceiveStateSpaceExploringAction(threadName, dummy.getClass()));
                // add a send action for all possible receivers
                // TODO Exclude the thread itself?
                for(var possibleReceiverThread : protocol.threadNames()) {
                    if(!possibleReceiverThread.equalsIgnoreCase(threadName))
                        exploringActions.add(StateSpaceExploringAction.CreateSendStateSpaceExploringAction(threadName, dummy, possibleReceiverThread));
                }
            }
        }
        return exploringActions;
    }

    public static IProtocol deepClone(IProtocol protocol) {
//        // Clone the IProtocol with the third party library
//        // https://github.com/kostaskougios/cloning
//        Cloner cloner = new Cloner();
//
//        cloner.setDumpCloned(new IDumpCloned() {
//            @Override
//            public void startCloning(Class<?> clz) {
//                System.out.println("CloningNewObject");
//            }
//
//            @Override
//            public void cloning(Field field, Class<?> clz) {
//                System.out.println("Cloning Field "+field.getName());
//            }
//        });
        // This is not safe!
        IProtocol thisIsAClonedProtocol = ((ICloneableProtocol)protocol).CloneThisProtocol();
        return thisIsAClonedProtocol;
    }
}
