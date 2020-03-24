package nl.florianslob.model.checking.sandbox.fosterchandy;

import java.util.logging.Level;
import java.util.logging.Logger;
import nl.florianslob.model.checking.sandbox.ISandboxingActivity;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;
import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.ProtocolViolationException;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IConnector;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IInPort;
import nl.florianslob.model.checking.sandbox.fosterchandy.interfaces.IOutPort;

/**
 *
 * @author FlorianSlob
 */
public class FosterChandySandboxActivity implements ISandboxingActivity {

    @Override
    public void runActivity() {

        // Define used ports
        IOutPort<String> outPortB = new OutPort<>();
        IInPort<String> inPortA = new InPort<>();

        IOutPort<String> outPortA = new OutPort<>();
        IInPort<String> inPortB = new InPort<>();

        // -1 means no max
        int maxDepth = 10;

        // Define connector and connect
        IConnector<String> connector = new Connector<>(maxDepth);
        connector.Connect(inPortA, outPortB, inPortB, outPortA);

        // Start all tasks as threads
        new Thread(() -> {
            try {
                TaskMethods.taskA(inPortA, outPortA);
            } catch (ProtocolViolationException ex) {
                System.out.println("Protocol violated, test failed. Exception message: " + ex.getMessage());
            } catch (MaxDepthReachedException ex) {
                System.out.println("Max depth reached, test succeeded. Exception message: " + ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FosterChandySandboxActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();

        new Thread(() -> {
            try {
                TaskMethods.taskB(inPortB, outPortB);
            } catch (ProtocolViolationException ex) {
                System.out.println("Protocol violated, test failed. Exception message: " + ex.getMessage());
            } catch (MaxDepthReachedException ex) {
                System.out.println("Max depth reached, test succeeded. Exception message: " + ex.getMessage());
            } catch (Exception ex) {
                Logger.getLogger(FosterChandySandboxActivity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }).start();
    }
}
