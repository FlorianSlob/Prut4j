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

public class CGProtocol_strict_alt_n_10 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_3_Tomaster = new LinkedBlockingQueue<>(); 
	
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_23(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(10);
									String[] receiverOptionsArray = new String[]{ "worker_6_","worker_4_","worker_2_","worker_0_","worker_8_","worker_7_","worker_1_","worker_5_","worker_9_","worker_3_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_6_")) {
									setState(16);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(11);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(7);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									setState(20);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(18);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(13);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(22);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(9);
									queueFrommasterToworker_3_.put(box.get());
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
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_0_Tomaster.take());
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(10);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_7_","worker_6_","worker_0_","worker_8_","worker_9_","worker_4_","worker_5_","worker_2_","worker_3_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(18);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(16);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									setState(20);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(22);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(11);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(13);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(7);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(9);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 5:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_1_Tomaster.take());
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									setState(8);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 7:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_2_Tomaster.take());
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									setState(10);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 9:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_3_Tomaster.take());
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									setState(12);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 11:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_4_Tomaster.take());
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_5_";
								}
								if (receiver.equals("worker_5_")) {
									setState(15);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 13:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_5_Tomaster.take());
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(10);
									String[] receiverOptionsArray = new String[]{ "worker_8_","worker_5_","worker_6_","worker_2_","worker_7_","worker_9_","worker_4_","worker_0_","worker_3_","worker_1_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_8_")) {
									setState(20);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(13);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(16);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(7);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(18);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(22);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(11);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(9);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
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
							while(true) {
								if (!queueFromworker_8_Tomaster.isEmpty() && queueFromworker_8_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_8_Tomaster.take());
								}
								if (!queueFromworker_7_Tomaster.isEmpty() && queueFromworker_7_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_7_Tomaster.take());
								}
								if (!queueFromworker_6_Tomaster.isEmpty() && queueFromworker_6_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_6_Tomaster.take());
								}
								if (!queueFromworker_5_Tomaster.isEmpty() && queueFromworker_5_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_5_Tomaster.take());
								}
								if (!queueFromworker_4_Tomaster.isEmpty() && queueFromworker_4_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_4_Tomaster.take());
								}
								if (!queueFromworker_3_Tomaster.isEmpty() && queueFromworker_3_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_3_Tomaster.take());
								}
								if (!queueFromworker_2_Tomaster.isEmpty() && queueFromworker_2_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_2_Tomaster.take());
								}
								if (!queueFromworker_1_Tomaster.isEmpty() && queueFromworker_1_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_1_Tomaster.take());
								}
								if (!queueFromworker_0_Tomaster.isEmpty() && queueFromworker_0_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_0_Tomaster.take());
								}
								if (!queueFromworker_9_Tomaster.isEmpty() && queueFromworker_9_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(14);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_9_Tomaster.take());
								}
							 monitor.wait(); }
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_6_";
								}
								if (receiver.equals("worker_6_")) {
									setState(17);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 16:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_6_Tomaster.take());
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_7_";
								}
								if (receiver.equals("worker_7_")) {
									setState(19);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 18:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_7_Tomaster.take());
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_8_";
								}
								if (receiver.equals("worker_8_")) {
									setState(21);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 20:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_8_Tomaster.take());
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_9_";
								}
								if (receiver.equals("worker_9_")) {
									setState(14);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 22:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_9_Tomaster.take());
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
					while (true){
						if (state >=0 && state <= 23){
							Optional result = exchange_0_23(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					}
					
				}
			};
			case "worker_0_": return new IEnvironment() {
				private int state = 3;
				
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_0_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_0_.take());
						case 3:
							if (isCloseAction) {
								setState(0);
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
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
							 monitor.wait(); }
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
								setState(0);
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
									setState(1);
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (isCloseAction) {
								setState(0);
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
								setState(0);
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
								setState(0);
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
			case "worker_2_": return new IEnvironment() {
				private int state = 3;
				
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_2_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 1:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							setState(0);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_2_.take());
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_2_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
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
			case "worker_3_": return new IEnvironment() {
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
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
							 monitor.wait(); }
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_3_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_3_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
							 monitor.wait(); }
						case 3:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 4:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_3_.take());
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
			case "worker_4_": return new IEnvironment() {
				private int state = 2;
				
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
								setState(4);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_4_.take());
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromworker_4_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_4_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
							 monitor.wait(); }
						case 4:
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
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
			case "worker_5_": return new IEnvironment() {
				private int state = 4;
				
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_5_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(0);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_5_.take());
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_5_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
							 monitor.wait(); }
						case 3:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 4:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
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
			case "worker_6_": return new IEnvironment() {
				private int state = 3;
				
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
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_6_.take());
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromworker_6_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 3:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_6_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
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
			case "worker_7_": return new IEnvironment() {
				private int state = 3;
				
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
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_7_.take());
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
									setState(0);
									queueFromworker_7_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
								}
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_7_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
								}
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
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
			case "worker_8_": return new IEnvironment() {
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
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
							 monitor.wait(); }
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_8_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
							 monitor.wait(); }
						case 2:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_8_.take());
						case 3:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_8_Tomaster.put(box.get());
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
			case "worker_9_": return new IEnvironment() {
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
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
							 monitor.wait(); }
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_9_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
							 monitor.wait(); }
						case 2:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_9_.take());
						case 3:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_9_Tomaster.put(box.get());
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
		return new String[] { "worker_6_","worker_2_","worker_1_","master","worker_8_","worker_3_","worker_0_","worker_5_","worker_4_","worker_7_","worker_9_" };
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
