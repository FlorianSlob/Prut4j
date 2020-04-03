package nl.florianslob.model.checking.sandbox.protocolimplementations;

import nl.florianslob.model.checking.sandbox.fosterchandy.exceptions.MaxDepthReachedException;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NonDeterministicLoopsProtocolWithVisualization implements IProtocol {
    private static final String SEND_PREFIX = "!";
    private static final String RECEIVE_PREFIX = "?";
    private static final String MOVE_MESSAGE_TYPE = "Move";

    private volatile int state = 0;
    public Object monitor = this; // Why do we need this?
    private BlockingQueue queueRootToLeft = new LinkedBlockingQueue();
    private BlockingQueue queueLeftToRoot = new LinkedBlockingQueue();
    private BlockingQueue queueRootToRight = new LinkedBlockingQueue();
    private BlockingQueue queueRightToRoot = new LinkedBlockingQueue();
    private boolean verboseDebug = false;
    private IProtocolWatcher _protocolWatcher;

    public NonDeterministicLoopsProtocolWithVisualization(IProtocolWatcher protocolWatcher){

        _protocolWatcher = protocolWatcher;
    }

    @Override
    public IEnvironment getEnvironment(String environmentName) throws Exception{
        switch (environmentName) {
            case "Root": return new IEnvironment(){
                @Override
                public String getName() {
                    return environmentName;
                }

                @Override
                public Optional exchange(Optional box) throws Exception{
                    synchronized (monitor) {
                        while (true) {
                            if(verboseDebug)
                                System.out.println(getName()+ "is in state "+state);

                            switch (state) {
                                case 0: monitor.notifyAll();
                                    _protocolWatcher.reportVisitedState(0);
                                        if(nextRandomBoolean()){
                                            _protocolWatcher.reportVisitedTransaction(0, 0, 1, "Root", "Left", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                            state = 1;
                                            queueRootToLeft.put(box.get());
                                        }else{
                                            _protocolWatcher.reportVisitedTransaction(1, 0, 4, "Root", "Right", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                            state = 4;
                                            queueRootToRight.put(box.get());
                                        }
                                    return Optional.empty();
                                case 1: monitor.wait();
                                        break;
                                case 2: monitor.wait();
                                        break;
                                case 3: monitor.notifyAll();
                                    state = 0;
                                    _protocolWatcher.reportVisitedState(3);
                                    _protocolWatcher.reportVisitedTransaction(2, 3, 0, "Left", "Root", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                    Object m = queueLeftToRoot.take();
                                    return Optional.of(m);
                                case 4: monitor.wait();
                                    break;
                                case 5: monitor.wait();
                                    break;
                                case 6: monitor.notifyAll();
                                    state = 0;
                                    _protocolWatcher.reportVisitedState(6);
                                    _protocolWatcher.reportVisitedTransaction(3, 6, 0, "Right", "Root", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                    Object m2 = queueRightToRoot.take();
                                    return Optional.of(m2);
                                default:
                                    throw new Exception("State number out of bounds");
                            }
                        }
                    }
                }
            };
            case "Left": return new IEnvironment(){
                @Override
                public String getName() {
                    return environmentName;
                }

                @Override
                public Optional exchange(Optional box) throws Exception{
                    synchronized (monitor) {
                        while (true) {
                            if(verboseDebug)
                                System.out.println(getName()+ "is in state "+state);

                            switch (state) {
                                case 0: monitor.wait();
                                    break;
                                case 1:monitor.notifyAll();
                                    _protocolWatcher.reportVisitedState(1);
                                    _protocolWatcher.reportVisitedTransaction(4, 1, 2, "Root", "Left", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                    state = 2;
                                    Object m = queueRootToLeft.take();
                                    return Optional.of(m);
                                case 2: monitor.notifyAll();
                                    _protocolWatcher.reportVisitedState(2);
                                    _protocolWatcher.reportVisitedTransaction(5, 2, 3, "Left", "Root", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                    state = 3;
                                    queueLeftToRoot.put(box.get());
                                    return Optional.empty();
                                case 3: monitor.wait();
                                    break;
                                case 4: monitor.wait();
                                    break;
                                case 5:monitor.wait();
                                    break;
                                case 6: monitor.wait();
                                    break;
                                default:
                                    throw new Exception("State number out of bounds");
                            }
                        }
                    }
                }
            };
            case "Right": return new IEnvironment(){

                @Override
                public String getName() {
                    return environmentName;
                }

                @Override
                public Optional exchange(Optional box) throws Exception{
                    synchronized (monitor) {
                        while (true) {
                            if(verboseDebug)
                                System.out.println(getName()+ "is in state "+state);

                            switch (state) {
                                case 0: monitor.wait();
                                    break;
                                case 1:monitor.wait();
                                    break;
                                case 2: monitor.wait();
                                    break;
                                case 3: monitor.wait();
                                    break;
                                case 4: monitor.notifyAll();
                                    _protocolWatcher.reportVisitedState(4);
                                    _protocolWatcher.reportVisitedTransaction(6, 4, 5, "Root", "Right", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                    state = 5;
                                    Object m2 = queueRootToRight.take();
                                    return Optional.of(m2);
                                case 5: monitor.notifyAll();
                                    _protocolWatcher.reportVisitedState(5);
                                    _protocolWatcher.reportVisitedTransaction(7, 5, 6, "Right", "Root", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                    state = 6;
                                    queueRightToRoot.put(box.get());
                                    return Optional.empty();
                                case 6: monitor.wait();
                                    break;
                                default:
                                    throw new Exception("State number out of bounds");
                            }
                        }
                    }
                }
            };
            default: throw new Exception("Unknown Environment");
        }
    }

    private boolean nextRandomBoolean() {
//        return false;
        return new Random().nextBoolean();
    }

    @Override
    public String[] threadNames() {
        return new String[] { "Root", "Left", "Right" };
    }

    @Override
    public Object[] dummies() {
        return new Object[0];
    }

    @Override
    public IProtocol deepClone() {
        return null;
    }
}
