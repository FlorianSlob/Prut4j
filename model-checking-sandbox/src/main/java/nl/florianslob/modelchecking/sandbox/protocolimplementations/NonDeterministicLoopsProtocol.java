package nl.florianslob.modelchecking.sandbox.protocolimplementations;

import nl.florianslob.modelchecking.base.api.IEnvironment;
import nl.florianslob.modelchecking.base.api.IProtocol;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class NonDeterministicLoopsProtocol implements IProtocol {
    private volatile int state = 0;
    private final Object monitor = this; // Why do we need this?
    private final BlockingQueue queueRootToLeft = new LinkedBlockingQueue();
    private final BlockingQueue queueLeftToRoot = new LinkedBlockingQueue();
    private final BlockingQueue queueRootToRight = new LinkedBlockingQueue();
    private final BlockingQueue queueRightToRoot = new LinkedBlockingQueue();
    private final boolean verboseDebug = false;

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
                        while ( true) {
                            if(verboseDebug)
                                System.out.println(getName()+ "is in state "+state);

                            switch (state) {
                                case 0: monitor.notifyAll();
                                        if(nextRandomBoolean()){
                                            state = 1;
                                            queueRootToLeft.put(box.get());
                                        }else{
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
                                    Object m = queueLeftToRoot.take();
                                    return Optional.of(m);
                                case 4: monitor.wait();
                                    break;
                                case 5: monitor.wait();
                                    break;
                                case 6: monitor.notifyAll();
                                    state = 0;
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
                        while ( true) {
                            if(verboseDebug)
                                System.out.println(getName()+ "is in state "+state);

                            switch (state) {
                                case 0: monitor.wait();
                                    break;
                                case 1:monitor.notifyAll();
                                    state = 2;
                                    Object m = queueRootToLeft.take();
                                    return Optional.of(m);
                                case 2: monitor.notifyAll();
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
                        while ( true) {
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
                                    state = 5;
                                    Object m2 = queueRootToRight.take();
                                    return Optional.of(m2);
                                case 5: monitor.notifyAll();
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
