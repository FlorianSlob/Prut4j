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

public class CGProtocol_strict_alt_n_7 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_5_Tomaster = new LinkedBlockingQueue<>(); 
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_17(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(7);
									String[] receiverOptionsArray = new String[]{ "worker_0_","worker_2_","worker_5_","worker_6_","worker_1_","worker_3_","worker_4_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_0_")) {
									setState(1);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(10);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									setState(9);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 1:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_0_Tomaster.take());
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(7);
									String[] receiverOptionsArray = new String[]{ "worker_4_","worker_1_","worker_2_","worker_6_","worker_5_","worker_3_","worker_0_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_4_")) {
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(10);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(1);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 3:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 4:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_1_Tomaster.take());
						case 5:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_2_Tomaster.take());
						case 6:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_3_Tomaster.take());
						case 7:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_4_Tomaster.take());
						case 8:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_5_Tomaster.take());
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									setState(11);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 10:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_6_Tomaster.take());
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									setState(12);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									setState(13);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									setState(14);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_5_";
								}
								if (receiver.equals("worker_5_")) {
									setState(16);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(7);
									String[] receiverOptionsArray = new String[]{ "worker_5_","worker_6_","worker_3_","worker_2_","worker_0_","worker_1_","worker_4_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_5_")) {
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(10);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(1);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									setState(9);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFromworker_6_Tomaster.isEmpty() && queueFromworker_6_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_6_Tomaster.take());
								}
								if (!queueFromworker_5_Tomaster.isEmpty() && queueFromworker_5_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_5_Tomaster.take());
								}
								if (!queueFromworker_4_Tomaster.isEmpty() && queueFromworker_4_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_4_Tomaster.take());
								}
								if (!queueFromworker_3_Tomaster.isEmpty() && queueFromworker_3_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_3_Tomaster.take());
								}
								if (!queueFromworker_2_Tomaster.isEmpty() && queueFromworker_2_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_2_Tomaster.take());
								}
								if (!queueFromworker_1_Tomaster.isEmpty() && queueFromworker_1_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_1_Tomaster.take());
								}
								if (!queueFromworker_0_Tomaster.isEmpty() && queueFromworker_0_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(15);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_0_Tomaster.take());
								}
							 monitor.wait(); }
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_6_";
								}
								if (receiver.equals("worker_6_")) {
									setState(15);
									queueFrommasterToworker_6_.put(box.get());
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
						if (state >=0 && state <= 17){
							Optional result = exchange_0_17(box, receiver, isCloseAction);
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
								setState(3);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_0_.take());
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
							 monitor.wait(); }
						case 2:
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
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_0_.take());
								}
							 monitor.wait(); }
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
									setState(0);
									queueFromworker_0_Tomaster.put(box.get());
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
			case "worker_1_": return new IEnvironment() {
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
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_1_.take());
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromworker_1_Tomaster.put(box.get());
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
									queueFromworker_1_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
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
								setState(3);
								return Optional.empty();
							}
						case 4:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
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
								setState(4);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
							 monitor.wait(); }
						case 1:
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
							}
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_2_.take());
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_2_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_2_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
								}
								if (!queueFrommasterToworker_2_.isEmpty() && queueFrommasterToworker_2_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_2_.take());
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
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
							 monitor.wait(); }
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_3_.take());
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_3_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
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
									setState(4);
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
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
								}
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_3_.take());
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
			case "worker_4_": return new IEnvironment() {
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
								setState(3);
								return Optional.empty();
							}
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_4_.take());
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
							 monitor.wait(); }
						case 2:
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
									setState(4);
									queueFromworker_4_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
								if (!queueFrommasterToworker_4_.isEmpty() && queueFrommasterToworker_4_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
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
			case "worker_5_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
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
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
							 monitor.wait(); }
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_5_.take());
						case 2:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
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
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
							 monitor.wait(); }
						case 1:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_6_.take());
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
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_6_.take());
								}
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
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
									setState(1);
									queueFromworker_6_Tomaster.put(box.get());
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
		return new String[] { "worker_5_","worker_1_","master","worker_6_","worker_0_","worker_2_","worker_3_","worker_4_" };
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
