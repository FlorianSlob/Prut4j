/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import static java.lang.Thread.sleep;

public class CGProtocol_strict_alt_n_2 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_1_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_7(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 1:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									setState(3);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_0_")) {
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFromworker_1_Tomaster.isEmpty() && queueFromworker_1_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_1_Tomaster.take());
								}
								if (!queueFromworker_0_Tomaster.isEmpty() && queueFromworker_0_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_0_Tomaster.take());
								}
							 monitor.wait(); }
						case 4:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_0_Tomaster.take());
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 6:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_1_Tomaster.take());
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
					while (true){
						if (state >=0 && state <= 7){
							Optional result = exchange_0_7(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					}
					
				}
			};
			case "worker_0_": return new IEnvironment() {
				private int state = 1;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_0_.take());
						case 1:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
							 monitor.wait(); }
						case 2:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromworker_0_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_0_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
							 monitor.wait(); }
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
					while (true){
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					}
					
				}
			};
			case "worker_1_": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
							 monitor.wait(); }
						case 1:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_1_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
							 monitor.wait(); }
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_1_.take());
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_1_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
					while (true){
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					}
					
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "worker_0_","worker_1_","master" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[]{"TestStringDummy"};
	}
	
	@Override
	public int getState(){
		return 0;
	}
}
