package nl.florianslob.modelchecking.base.runtime.v2;

import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.api.v2.NotAllowedTransitionException;
import nl.florianslob.modelchecking.base.runtime.v2.datastructure.LtlTransitionExpressionAtomicPropositionDirection;

import java.util.Optional;
import java.util.concurrent.CountDownLatch;

public class StateSpaceExploringThread {
    private String threadName;
    private IProtocol protocol;
    private IEnvironment environment;

    public StateSpaceExploringThread(String participantName){
        this.threadName = participantName;
    }

    public void SetProtocolClone(IProtocol protocolClone) throws Exception {
        // Pass new environment to thread.
        this.protocol = protocolClone;
        this.environment = this.protocol.getEnvironment(this.threadName);
    }

    /**
     * @param actionToBeExecuted Action to be executed represents a possible transaction on the protocol automaton
     * @return Will return the protocol after a successful action, is empty otherwise.
     *
     * This method tries a transition, if it is interupted it has encountered a wait operation.
     */
    public Optional<IProtocol> ExecuteAction(StateSpaceExploringAction actionToBeExecuted) {

        final CountDownLatch latch = new CountDownLatch(1);
        final Optional[] value = {Optional.empty()};

        if (actionToBeExecuted.direction == LtlTransitionExpressionAtomicPropositionDirection.SEND) {

            try {
                this.environment.send(actionToBeExecuted.dummy, actionToBeExecuted.receiver);
                return Optional.of(this.protocol);
            } catch (NotAllowedTransitionException notAllowedTransitionException) {
                System.out.println("Transition is not allowed.");
                notAllowedTransitionException.printStackTrace();
                return Optional.empty();
            } catch (Exception e2) {
                System.out.println("caught other exception: " + e2.getCause());
                e2.printStackTrace();
                return Optional.empty();
            }
        }

        // Check for an interupt when trying to receive a value.
        // Thread will hang on .take() otherwise.
        if (actionToBeExecuted.direction == LtlTransitionExpressionAtomicPropositionDirection.RECEIVE) {
            var baseThread =
                    new Thread(() -> {
                        synchronized (this.environment) {
                            Thread thread = Thread.currentThread();
                            new Thread(() -> {
                                synchronized (this.environment) {
                                    thread.interrupt();
                                }
                            }).start();
                        }
                        var self = this;

                        try {
                            //// Action block
                            var result = self.environment.receive();
                            if (result.getClass() == actionToBeExecuted.messageClass) {
                                value[0] = Optional.of(self.protocol);
                                latch.countDown();
                                return;
                            }

                            value[0] = Optional.empty();
                            latch.countDown();
                            return;
                            //// End action block
                        } catch (InterruptedException e) { // <<-- This means no possible action!
                            System.out.println("job was interrupted");
                            value[0] = Optional.empty();
                            latch.countDown();
                            return;
                        } catch (NotAllowedTransitionException notAllowedTransitionException) {
                            System.out.println("Transition is not allowed.");
                            notAllowedTransitionException.printStackTrace();
                            value[0] = Optional.empty();
                            latch.countDown();
                            return;
                        } catch (Exception e2) {
                            System.out.println("caught other exception: " + e2.getCause());
                            e2.printStackTrace();
                            value[0] = Optional.empty();
                            latch.countDown();
                            return;
                        }
                    });

            baseThread.start();
            try {
                latch.await(); // Wait for countDown() in the thread.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return value[0];
        }
        return Optional.empty();
    }
}
