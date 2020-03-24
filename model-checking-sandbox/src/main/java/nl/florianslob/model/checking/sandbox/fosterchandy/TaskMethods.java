package nl.florianslob.model.checking.sandbox.fosterchandy;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IInPort;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IOutPort;

/**
 *
 * @author FlorianSlob
 */
public class TaskMethods {

    public static void taskA(IInPort<String> inPort, IOutPort<String> outPort) throws MaxDepthReachedException, ProtocolViolationException {
        System.out.println("sandbox.App.taskA() before initial send.");
        outPort.Send("This is sparta!");
        System.out.println("sandbox.App.taskA() after initial send");

        //noinspection InfiniteLoopStatement We are creating an infinite program.
        while (true) {
            System.out.println("sandbox.App.taskA() before receive.");
            Object test = inPort.Receive();
            System.out.println("sandbox.App.taskA() after receive. Received: "+test);

            System.out.println("sandbox.App.taskA() before send.");
            outPort.Send("This is sparta!");
            System.out.println("sandbox.App.taskA() after send");
        }
    }

    public static void taskB(IInPort<String> inPort, IOutPort<String> outPort) throws MaxDepthReachedException, ProtocolViolationException {
        //noinspection InfiniteLoopStatement We are creating an infinite program.
        while (true) {
            System.out.println("sandbox.App.taskB() before receive.");
            Object test = inPort.Receive();
            System.out.println("sandbox.App.taskB() after receive. Received: "+test);

            System.out.println("sandbox.App.taskB() before send.");
            outPort.Send("This is sparta!");
            System.out.println("sandbox.App.taskB() after send");
        }
    }
}
