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

    private final int _maxDepth = 10; // -1 means no max

    @Override
    public void runActivity() {

        // Define used ports
        IOutPort outPortB = new OutPort();
        IInPort inPortA = new InPort();

        IOutPort outPortA = new OutPort();
        IInPort inPortB = new InPort();

        // Define connector and connect
        IConnector connector = new Connector(_maxDepth);
        connector.Connect(inPortA, outPortB, inPortB, outPortA);

        // Start all tasks as threads
        new Thread() {
            @Override
            public void run() {
                try {
                    TaskMethods.taskA(inPortA, outPortA);
                } catch (ProtocolViolationException ex) {
                    System.out.println("Protocol violated, test failed. Exception message: " + ex.getMessage());
                } catch (MaxDepthReachedException ex) {
                    System.out.println("Max depth reached, test succeeded. Exception message: " + ex.getMessage());
                } catch (InterruptedException ex) {
                    Logger.getLogger(FosterChandySandboxActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                try {
                    TaskMethods.taskB(inPortB, outPortB);
                } catch (ProtocolViolationException ex) {
                    System.out.println("Protocol violated, test failed. Exception message: " + ex.getMessage());
                } catch (MaxDepthReachedException ex) {
                    System.out.println("Max depth reached, test succeeded. Exception message: " + ex.getMessage());
                } catch (InterruptedException ex) {
                    Logger.getLogger(FosterChandySandboxActivity.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }
}