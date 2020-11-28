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

public class CGProtocol_strict_alt_n_4 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_3_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_28(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 9 :
						case 11 :
						case 13 :
						case 19 :
						case 22 :
						case 24 :
						case 26 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(4);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_","worker_3_","worker_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(1);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(2);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(2);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(4);
									String[] receiverOptionsArray = new String[]{ "worker_3_","worker_0_","worker_1_","worker_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(1);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(2);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 15:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 16:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 17:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 18:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 20:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(21);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(4);
									String[] receiverOptionsArray = new String[]{ "worker_0_","worker_3_","worker_1_","worker_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(2);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 23:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(21);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 25:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(21);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 27:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(21);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 28){
								Optional result = exchange_0_28(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_0_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_28(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 4 :
						case 5 :
						case 6 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 20 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(8);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(19);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 7:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(18);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(20);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 28){
								Optional result = exchange_0_28(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_1_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_28(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 5 :
						case 6 :
						case 8 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(22);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 7:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(10);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(17);
									queueFromworker_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(23);
									queueFromworker_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 28){
								Optional result = exchange_0_28(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_2_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_28(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 6 :
						case 8 :
						case 9 :
						case 10 :
						case 12 :
						case 13 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 22 :
						case 23 :
						case 25 :
						case 26 :
						case 27 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(24);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 7:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(12);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(16);
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(25);
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 28){
								Optional result = exchange_0_28(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_3_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_28(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 27 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 6:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 7:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(15);
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(7);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(27);
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 28){
								Optional result = exchange_0_28(box, receiver, isCloseAction);
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
		return new String[] { "worker_0_","master","worker_2_","worker_1_","worker_3_" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[]{"TestStringDummy"};
	}
	
	@Override
	public int getState(){
		return this.state;
	}
}
