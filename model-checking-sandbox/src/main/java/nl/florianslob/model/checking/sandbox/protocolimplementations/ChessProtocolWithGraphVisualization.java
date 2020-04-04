package nl.florianslob.model.checking.sandbox.protocolimplementations;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ChessProtocolWithGraphVisualization implements IProtocol {
    private static final String SEND_PREFIX = "!";
    private static final String RECEIVE_PREFIX = "?";
    private static final String MOVE_MESSAGE_TYPE = "Move";
    private volatile int state = 0;
    private final Object monitor = this; // Why do we need this?
    private final BlockingQueue queue1 = new LinkedBlockingQueue();
    private final BlockingQueue queue2 = new LinkedBlockingQueue();
    private final IProtocolWatcher _protocolWatcher;

    public ChessProtocolWithGraphVisualization(IProtocolWatcher protocolWatcher){
        _protocolWatcher = protocolWatcher;
    }

    @Override
    public IEnvironment getEnvironment(String environmentName) throws Exception {
        switch (environmentName) {
            case "W":
                return new IEnvironment() {
                    @Override
                    public String getName() {
                        return environmentName;
                    }

                    @Override
                    public Optional exchange(Optional box) throws Exception {
                        synchronized (monitor) {
                            while (true) {
                                switch (state) {
                                    case 0:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(0);
                                        _protocolWatcher.reportVisitedTransaction(0, 0, 1, "W", "B", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 1;
                                        queue1.put(box.get());
                                        return Optional.empty();
                                    case 1:
                                    monitor.wait();
                                    break;
                                    case 2:
                                        monitor.wait();
                                        break;
                                    case 3:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(3);
                                        _protocolWatcher.reportVisitedTransaction(1, 3, 4, "W", "B", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 4;
                                        Object m = queue2.take();
                                        return Optional.of(m);
                                    case 4:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(4);
                                        _protocolWatcher.reportVisitedTransaction(7, 4, 5, "W", "B", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 5;
                                        queue1.put(box.get());
                                        return Optional.empty();
                                    case 5:
                                        monitor.wait();
                                        break;
                                    case 6:
                                        monitor.wait();
                                        break;
                                    default:
                                        throw new Exception("State number out of bounds");
                                }
                            }
                        }
                    }
                };
            case "B":
                return new IEnvironment() {
                    @Override
                    public String getName() {
                        return environmentName;
                    }

                    @Override
                    public Optional exchange(Optional box) throws Exception {
                        synchronized (monitor) {
                            while (true) {
                                switch (state) {
                                    case 0:
                                        monitor.wait();
                                        break;
                                    case 1:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(1);
                                        _protocolWatcher.reportVisitedTransaction(2, 1, 2, "B", "W" , RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 2;
                                        Object m = queue1.take();
                                        return Optional.of(m);
                                    case 2:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(2);
                                        _protocolWatcher.reportVisitedTransaction(3, 2, 3, "B", "W",SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 3;
                                        queue2.put(box.get());
                                        return Optional.empty();
                                    case 3:
                                        monitor.wait();
                                        break;
                                    case 4:
                                        monitor.wait();
                                        break;
                                    case 5:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(5);
                                        _protocolWatcher.reportVisitedTransaction(4, 5, 6, "B", "W", RECEIVE_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 6;
                                        Object m2 = queue1.take();
                                        return Optional.of(m2);
                                    case 6:
                                        monitor.notifyAll();
                                        _protocolWatcher.reportVisitedState(6);
                                        _protocolWatcher.reportVisitedTransaction(5, 6, 3, "B", "W", SEND_PREFIX, MOVE_MESSAGE_TYPE);
                                        state = 3;
                                        queue2.put(box.get());
                                        return Optional.empty();
                                    default:
                                        throw new Exception("State number out of bounds");
                                }
                            }
                        }
                    }
                };
            default:
                throw new Exception("Unknown Environment");
        }
    }

    @Override
    public String[] threadNames() {
        return new String[]{"W", "B"};
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
