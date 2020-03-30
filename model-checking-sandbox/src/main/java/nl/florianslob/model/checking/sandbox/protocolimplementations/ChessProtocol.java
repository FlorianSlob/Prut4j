package nl.florianslob.model.checking.sandbox.protocolimplementations;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ChessProtocol implements IProtocol {
    private volatile int state = 0;
    private Object monitor = this; // Why do we need this?
    private BlockingQueue queue1 = new LinkedBlockingQueue();
    private BlockingQueue queue2 = new LinkedBlockingQueue();

    @Override
    public IEnvironment getEnvironment(String environmentName) throws Exception{
        switch (environmentName) {
            case "W": return new IEnvironment(){
                @Override
                public String getName() {
                    return environmentName;
                }

                @Override
                public Optional exchange(Optional box) throws Exception{
                    synchronized (monitor) {
                        while ( true) {
                            switch (state) {
                                case 0: monitor.notifyAll();
                                        state = 1;
                                        queue1.put(box.get());
                                        return Optional.empty();
                                case 1: monitor.wait();
                                        break;
                                case 2: monitor.wait();
                                        break;
                                case 3: monitor.notifyAll();
                                    state = 4;
                                    Object m = queue2.take();
                                    return Optional.of(m);
                                case 4: monitor.notifyAll();
                                    state = 5;
                                    queue1.put(box.get());
                                    return Optional.empty();
                                case 5: monitor.wait();
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
            case "B": return new IEnvironment(){
                @Override
                public String getName() {
                    return environmentName;
                }

                @Override
                public Optional exchange(Optional box) throws Exception{
                    synchronized (monitor) {
                        while ( true) {
                            // TODO Create for black!
                            switch (state) {
                                case 0: monitor.wait();
                                    break;
                                case 1:monitor.notifyAll();
                                    state = 2;
                                    Object m = queue1.take();
                                    return Optional.of(m);
                                case 2: monitor.notifyAll();
                                    state = 3;
                                    queue2.put(box.get());
                                    return Optional.empty();
                                case 3: monitor.wait();
                                    break;
                                case 4: monitor.wait();
                                    break;
                                case 5: monitor.notifyAll();
                                    state = 6;
                                    Object m2 = queue1.take();
                                    return Optional.of(m2);
                                case 6: monitor.notifyAll();
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
            default: throw new Exception("Unknown Environment");
        }
    }

    @Override
    public String[] threadNames() {
        return new String[] { "W", "B" };
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
