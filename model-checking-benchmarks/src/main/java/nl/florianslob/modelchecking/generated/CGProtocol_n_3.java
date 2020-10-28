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

public class CGProtocol_n_3 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_1_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(3);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 3;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 1;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 2;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(3);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 5;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 6;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 4;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 1:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 8;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 9;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 8;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 271;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 3:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 271;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 9;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 29;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 30;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 5:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 405;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 29;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 6:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 405;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 30;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 7:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 12;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 11;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 8:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 273;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 9:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 273;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 10:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 15;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 14;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 13;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 11:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 275;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 12:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 275;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 13:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 16;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 17;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 14:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 278;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 276;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 15:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 278;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 433;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 16:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 19;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 17:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 19;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 18:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 21;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 20:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 23;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 21:
									monitor.wait();
									break;
								case 22:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 24;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 23:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 281;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 24:
									monitor.wait();
									break;
								case 25:
									monitor.wait();
									break;
								case 26:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 27:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(3);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 3;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 1;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 2;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(3);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 6;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 5;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 4;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 28:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 33;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 32;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 29:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 240;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 30:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 240;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 31:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 36;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 35;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 32:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 209;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 33:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 209;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 34:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 38;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 37;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 35:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 163;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 161;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 36:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 163;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 200;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 37:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 40;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 38:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 40;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 39:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 42;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 40:
									monitor.wait();
									break;
								case 41:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 44;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 43;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 43:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 45;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 44:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 143;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 45:
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 47:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 49;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 51;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 50;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 56;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 99;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 117;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 99;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 118;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 100;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 53:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 58;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 119;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 101;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 54:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 102;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 120;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 57:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 84;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 61;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 62;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 59:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 86;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 60:
									monitor.wait();
									break;
								case 61:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 62:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 63:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 64:
									monitor.wait();
									break;
								case 65:
									monitor.wait();
									break;
								case 66:
									monitor.wait();
									break;
								case 67:
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 70:
									monitor.wait();
									break;
								case 71:
									monitor.wait();
									break;
								case 72:
									monitor.wait();
									break;
								case 73:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 74:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 75:
									monitor.wait();
									break;
								case 76:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 77:
									monitor.wait();
									break;
								case 78:
									monitor.wait();
									break;
								case 79:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 80:
									monitor.wait();
									break;
								case 81:
									monitor.wait();
									break;
								case 82:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 83:
									monitor.wait();
									break;
								case 84:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 85:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 86:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 87:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 88:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 89:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 90:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 91:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 92:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 93:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 74;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 88;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 96;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 95:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 96:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 97:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 98:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 91;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 99:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 100:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 61;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 103;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 101:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 62;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 104;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 102:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 103:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 104:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 105:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 106:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 107:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 108:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 109:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 110:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 111:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 112:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 107;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 74;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 113:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 114;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 114:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 115:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 116:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 110;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 121;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 103;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 119:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 104;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 122;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 120:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 123;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 121:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 122:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 123:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 124:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 125:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 126:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 127:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 128:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 129:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 124;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 130:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 125;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 107;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 131:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 132;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 114;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 132:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 133:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 127;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 134:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 110;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 128;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 135:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 111;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 129;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 92;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 136:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 130;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 93;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 112;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 137:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 140;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 138;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 139;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 138:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 96;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 139:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 114;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 140:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 114;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 132;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 141:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 115;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 133;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 97;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 142:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 134;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 116;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 98;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 143:
									monitor.wait();
									break;
								case 144:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 145;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 145:
									monitor.wait();
									break;
								case 146:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 148;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 147:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 148:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 149:
									monitor.wait();
									break;
								case 150:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 151;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 151:
									monitor.wait();
									break;
								case 152:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 153:
									monitor.wait();
									break;
								case 154:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 155;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 155:
									monitor.wait();
									break;
								case 156:
									monitor.wait();
									break;
								case 157:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 153;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 158:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 154;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 159;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 159:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 160;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 160:
									monitor.wait();
									break;
								case 161:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 40;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 162:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 166;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 164;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 163:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 192;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 164:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 42;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 165:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 169;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 168;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 167;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 166:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 184;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 167:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 44;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 43;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 168:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 170;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 43;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 169:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 174;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 175;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 170:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 143;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 171:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 145;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 172:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 173;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 173:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 174:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 143;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 175:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 143;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 176:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 177;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 178;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 177:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 145;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 178:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 145;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 179:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 180;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 181;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 182;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 180:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 148;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 181:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 173;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 182:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 183;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 173;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 183:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 184:
									monitor.wait();
									break;
								case 185:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 186;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 186:
									monitor.wait();
									break;
								case 187:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 188;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 189;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 188:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 151;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 189:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 190;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 190:
									monitor.wait();
									break;
								case 191:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 173;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 183;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 192:
									monitor.wait();
									break;
								case 193:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 194;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 194:
									monitor.wait();
									break;
								case 195:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 196;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 197;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 196:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 155;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 197:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 198;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 198:
									monitor.wait();
									break;
								case 199:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 190;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 200:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 40;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 201:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 193;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 202;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 202:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 153;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 203:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 195;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 204;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 205;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 204:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 154;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 159;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 205:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 207;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 206;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 206:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 160;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 207:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 198;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 208:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 211;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 209:
									monitor.wait();
									break;
								case 210:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 213;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 212;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 211:
									monitor.wait();
									break;
								case 212:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 215;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 213:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 220;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 214:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 170;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 43;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 215:
									monitor.wait();
									break;
								case 216:
									monitor.wait();
									break;
								case 217:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 218;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 218:
									monitor.wait();
									break;
								case 219:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 220:
									monitor.wait();
									break;
								case 221:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 222;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 222:
									monitor.wait();
									break;
								case 223:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 225;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 224;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 224:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 218;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 225:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 218;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 226:
									monitor.wait();
									break;
								case 227:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 228;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 228:
									monitor.wait();
									break;
								case 229:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 218;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 230:
									monitor.wait();
									break;
								case 231:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 232;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 232:
									monitor.wait();
									break;
								case 233:
									monitor.wait();
									break;
								case 234:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 230;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 235:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 231;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 236;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 236:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 238;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 237:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 207;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 206;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 238:
									monitor.wait();
									break;
								case 239:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 242;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 240:
									monitor.wait();
									break;
								case 241:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 244;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 243;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 242:
									monitor.wait();
									break;
								case 243:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 246;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 244:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 251;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 245:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 215;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 246:
									monitor.wait();
									break;
								case 247:
									monitor.wait();
									break;
								case 248:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 249;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 249:
									monitor.wait();
									break;
								case 250:
									monitor.wait();
									break;
								case 251:
									monitor.wait();
									break;
								case 252:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 253;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 253:
									monitor.wait();
									break;
								case 254:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 255;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 256;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 255:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 249;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 256:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 249;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 257:
									monitor.wait();
									break;
								case 258:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 259;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 259:
									monitor.wait();
									break;
								case 260:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 249;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 261:
									monitor.wait();
									break;
								case 262:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 263;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 263:
									monitor.wait();
									break;
								case 264:
									monitor.wait();
									break;
								case 265:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 261;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 266:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 262;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 267;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 267:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 269;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 268:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 238;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 269:
									monitor.wait();
									break;
								case 270:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 272;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 380;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 271:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 273;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 272:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 355;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 273:
									monitor.wait();
									break;
								case 274:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 330;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 275:
									monitor.wait();
									break;
								case 276:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 19;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 277:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 295;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 293;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 278:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 321;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 279:
									monitor.wait();
									break;
								case 280:
									monitor.wait();
									break;
								case 281:
									monitor.wait();
									break;
								case 282:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 283;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 283:
									monitor.wait();
									break;
								case 284:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 286;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 285;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 285:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 286:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 287:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 288;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 288:
									monitor.wait();
									break;
								case 289:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 290:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 291;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 291:
									monitor.wait();
									break;
								case 292:
									monitor.wait();
									break;
								case 293:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 21;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 294:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 298;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 297;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 296;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 295:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 313;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 296:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 23;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 297:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 299;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 298:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 303;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 304;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 299:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 281;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 300:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 283;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 301:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 285;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 302;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 302:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 303:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 281;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 304:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 281;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 305:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 307;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 306;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 306:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 283;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 307:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 283;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 308:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 309;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 311;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 310;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 309:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 286;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 285;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 310:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 302;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 285;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 311:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 302;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 312;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 312:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 313:
									monitor.wait();
									break;
								case 314:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 315;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 315:
									monitor.wait();
									break;
								case 316:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 317;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 318;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 317:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 288;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 318:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 319;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 319:
									monitor.wait();
									break;
								case 320:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 302;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 312;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 321:
									monitor.wait();
									break;
								case 322:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 323;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 323:
									monitor.wait();
									break;
								case 324:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 326;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 325;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 325:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 291;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 326:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 327;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 327:
									monitor.wait();
									break;
								case 328:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 319;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 329:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 332;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 331;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 330:
									monitor.wait();
									break;
								case 331:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 334;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 332:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 339;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 333:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 299;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 334:
									monitor.wait();
									break;
								case 335:
									monitor.wait();
									break;
								case 336:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 337;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 337:
									monitor.wait();
									break;
								case 338:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 339:
									monitor.wait();
									break;
								case 340:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 341;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 341:
									monitor.wait();
									break;
								case 342:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 343;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 344;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 343:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 337;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 344:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 337;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 345:
									monitor.wait();
									break;
								case 346:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 347;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 347:
									monitor.wait();
									break;
								case 348:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 337;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 349:
									monitor.wait();
									break;
								case 350:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 351;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 351:
									monitor.wait();
									break;
								case 352:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 327;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 353:
									monitor.wait();
									break;
								case 354:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 357;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 356;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 355:
									monitor.wait();
									break;
								case 356:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 359;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 357:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 364;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 358:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 334;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 359:
									monitor.wait();
									break;
								case 360:
									monitor.wait();
									break;
								case 361:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 362;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 362:
									monitor.wait();
									break;
								case 363:
									monitor.wait();
									break;
								case 364:
									monitor.wait();
									break;
								case 365:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 366;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 366:
									monitor.wait();
									break;
								case 367:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 369;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 368;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 368:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 362;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 369:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 362;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 370:
									monitor.wait();
									break;
								case 371:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 372;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 372:
									monitor.wait();
									break;
								case 373:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 362;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 374:
									monitor.wait();
									break;
								case 375:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 376;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 376:
									monitor.wait();
									break;
								case 377:
									monitor.wait();
									break;
								case 378:
									monitor.wait();
									break;
								case 379:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 354;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 382;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 381;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 380:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 355;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 381:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 384;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 383;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 382:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 357;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 389;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 383:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 359;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 384:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 359;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 385:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 360;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 386:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 361;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 387;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 387:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 388;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 388:
									monitor.wait();
									break;
								case 389:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 359;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 390:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 365;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 391;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 391:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 360;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 392:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 367;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 393;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 394;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 393:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 361;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 387;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 394:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 373;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 387;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 395:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 370;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 396:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 371;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 397;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 397:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 378;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 398:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 373;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 387;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 399:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 374;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 400:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 375;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 401;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 401:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 402;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 402:
									monitor.wait();
									break;
								case 403:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 378;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 404:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 407;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 239;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 405:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 240;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 406:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 409;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 241;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 408;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 407:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 242;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 408:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 410;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 411;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 409:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 244;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 416;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 410:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 246;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 411:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 246;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 412:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 247;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 413:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 248;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 414;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 414:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 415;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 415:
									monitor.wait();
									break;
								case 416:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 246;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 417:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 252;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 418;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 418:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 247;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 419:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 254;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 420;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 421;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 420:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 248;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 414;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 421:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 260;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 414;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 422:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 257;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 423:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 258;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 424;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 424:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 264;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 425:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 260;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 414;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 426:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 261;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 427:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 262;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 428;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 428:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 269;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 429:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 264;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 430:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 399;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 431;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 431:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 374;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 432:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 349;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 433:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 19;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 434:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 322;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 439;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 435:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 279;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 436:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 290;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 437;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 437:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 438;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 438:
									monitor.wait();
									break;
								case 439:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 279;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 440:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 324;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 442;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 441;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 441:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 290;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 437;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 442:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 352;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 443;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 443:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 438;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 444:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 350;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 445;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 445:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 377;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 446:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 352;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 443;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 447:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 375;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 448;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 448:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 402;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 449:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 377;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 450:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 400;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 447;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 451;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 451:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 453;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 452;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 452:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 402;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 453:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 402;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 454:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 265;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 426;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 455:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 266;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 427;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 456;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 456:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 458;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 457;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 457:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 269;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 458:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 269;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			case "worker_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 7;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									monitor.wait();
									break;
								case 4:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 28;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								case 7:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 10;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 8:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 11;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 9:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 10:
									monitor.wait();
									break;
								case 11:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 14;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 12:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 15;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 13:
									monitor.wait();
									break;
								case 14:
									monitor.wait();
									break;
								case 15:
									monitor.wait();
									break;
								case 16:
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 18:
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 20:
									monitor.wait();
									break;
								case 21:
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 23:
									monitor.wait();
									break;
								case 24:
									monitor.wait();
									break;
								case 25:
									monitor.wait();
									break;
								case 26:
									monitor.wait();
									break;
								case 27:
									monitor.wait();
									break;
								case 28:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 31;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 29:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 32;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 30:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 33;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 32:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 35;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 33:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 36;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 35:
									monitor.wait();
									break;
								case 36:
									monitor.wait();
									break;
								case 37:
									monitor.wait();
									break;
								case 38:
									monitor.wait();
									break;
								case 39:
									monitor.wait();
									break;
								case 40:
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 44:
									monitor.wait();
									break;
								case 45:
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 52;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 100;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 118;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									monitor.wait();
									break;
								case 53:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 135;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 54:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 142;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 61;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 84;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 57:
									monitor.wait();
									break;
								case 58:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 92;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 59:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 98;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 60:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 64;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 61:
									monitor.wait();
									break;
								case 62:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 63:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 64:
									monitor.wait();
									break;
								case 65:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 66:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 67:
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 70:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 71:
									monitor.wait();
									break;
								case 72:
									monitor.wait();
									break;
								case 73:
									monitor.wait();
									break;
								case 74:
									monitor.wait();
									break;
								case 75:
									monitor.wait();
									break;
								case 76:
									monitor.wait();
									break;
								case 77:
									monitor.wait();
									break;
								case 78:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 80:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 81:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 82:
									monitor.wait();
									break;
								case 83:
									monitor.wait();
									break;
								case 84:
									monitor.wait();
									break;
								case 85:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 86:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 91;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 87:
									monitor.wait();
									break;
								case 88:
									monitor.wait();
									break;
								case 89:
									monitor.wait();
									break;
								case 90:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 89;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 91:
									monitor.wait();
									break;
								case 92:
									monitor.wait();
									break;
								case 93:
									monitor.wait();
									break;
								case 94:
									monitor.wait();
									break;
								case 95:
									monitor.wait();
									break;
								case 96:
									monitor.wait();
									break;
								case 97:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 98:
									monitor.wait();
									break;
								case 99:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 103;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 100:
									monitor.wait();
									break;
								case 101:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 111;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 102:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 116;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 103:
									monitor.wait();
									break;
								case 104:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 105:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 110;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 106:
									monitor.wait();
									break;
								case 107:
									monitor.wait();
									break;
								case 108:
									monitor.wait();
									break;
								case 109:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 110:
									monitor.wait();
									break;
								case 111:
									monitor.wait();
									break;
								case 112:
									monitor.wait();
									break;
								case 113:
									monitor.wait();
									break;
								case 114:
									monitor.wait();
									break;
								case 115:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 116:
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 121;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									monitor.wait();
									break;
								case 119:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 129;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 120:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 134;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 121:
									monitor.wait();
									break;
								case 122:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 124;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 123:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 128;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 124:
									monitor.wait();
									break;
								case 125:
									monitor.wait();
									break;
								case 126:
									monitor.wait();
									break;
								case 127:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 126;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 128:
									monitor.wait();
									break;
								case 129:
									monitor.wait();
									break;
								case 130:
									monitor.wait();
									break;
								case 131:
									monitor.wait();
									break;
								case 132:
									monitor.wait();
									break;
								case 133:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 131;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 134:
									monitor.wait();
									break;
								case 135:
									monitor.wait();
									break;
								case 136:
									monitor.wait();
									break;
								case 137:
									monitor.wait();
									break;
								case 138:
									monitor.wait();
									break;
								case 139:
									monitor.wait();
									break;
								case 140:
									monitor.wait();
									break;
								case 141:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 137;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 142:
									monitor.wait();
									break;
								case 143:
									monitor.wait();
									break;
								case 144:
									monitor.wait();
									break;
								case 145:
									monitor.wait();
									break;
								case 146:
									monitor.wait();
									break;
								case 147:
									monitor.wait();
									break;
								case 148:
									monitor.wait();
									break;
								case 149:
									monitor.wait();
									break;
								case 150:
									monitor.wait();
									break;
								case 151:
									monitor.wait();
									break;
								case 152:
									monitor.wait();
									break;
								case 153:
									monitor.wait();
									break;
								case 154:
									monitor.wait();
									break;
								case 155:
									monitor.wait();
									break;
								case 156:
									monitor.wait();
									break;
								case 157:
									monitor.wait();
									break;
								case 158:
									monitor.wait();
									break;
								case 159:
									monitor.wait();
									break;
								case 160:
									monitor.wait();
									break;
								case 161:
									monitor.wait();
									break;
								case 162:
									monitor.wait();
									break;
								case 163:
									monitor.wait();
									break;
								case 164:
									monitor.wait();
									break;
								case 165:
									monitor.wait();
									break;
								case 166:
									monitor.wait();
									break;
								case 167:
									monitor.wait();
									break;
								case 168:
									monitor.wait();
									break;
								case 169:
									monitor.wait();
									break;
								case 170:
									monitor.wait();
									break;
								case 171:
									monitor.wait();
									break;
								case 172:
									monitor.wait();
									break;
								case 173:
									monitor.wait();
									break;
								case 174:
									monitor.wait();
									break;
								case 175:
									monitor.wait();
									break;
								case 176:
									monitor.wait();
									break;
								case 177:
									monitor.wait();
									break;
								case 178:
									monitor.wait();
									break;
								case 179:
									monitor.wait();
									break;
								case 180:
									monitor.wait();
									break;
								case 181:
									monitor.wait();
									break;
								case 182:
									monitor.wait();
									break;
								case 183:
									monitor.wait();
									break;
								case 184:
									monitor.wait();
									break;
								case 185:
									monitor.wait();
									break;
								case 186:
									monitor.wait();
									break;
								case 187:
									monitor.wait();
									break;
								case 188:
									monitor.wait();
									break;
								case 189:
									monitor.wait();
									break;
								case 190:
									monitor.wait();
									break;
								case 191:
									monitor.wait();
									break;
								case 192:
									monitor.wait();
									break;
								case 193:
									monitor.wait();
									break;
								case 194:
									monitor.wait();
									break;
								case 195:
									monitor.wait();
									break;
								case 196:
									monitor.wait();
									break;
								case 197:
									monitor.wait();
									break;
								case 198:
									monitor.wait();
									break;
								case 199:
									monitor.wait();
									break;
								case 200:
									monitor.wait();
									break;
								case 201:
									monitor.wait();
									break;
								case 202:
									monitor.wait();
									break;
								case 203:
									monitor.wait();
									break;
								case 204:
									monitor.wait();
									break;
								case 205:
									monitor.wait();
									break;
								case 206:
									monitor.wait();
									break;
								case 207:
									monitor.wait();
									break;
								case 208:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 162;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 209:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 163;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 210:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 165;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 211:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 166;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 212:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 214;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 213:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 169;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 214:
									monitor.wait();
									break;
								case 215:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 170;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 216:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 171;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 217:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 172;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 218:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 219;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 219:
									monitor.wait();
									break;
								case 220:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 170;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 221:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 176;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 222:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 171;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 223:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 179;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 224:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 172;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 225:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 191;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 226:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 185;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 227:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 187;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 228:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 199;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 229:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 191;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 230:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 193;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 231:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 195;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 232:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 207;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 233:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 199;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 234:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 201;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 235:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 203;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 236:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 237;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 237:
									monitor.wait();
									break;
								case 238:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 207;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 239:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 208;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 240:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 209;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 241:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 210;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 242:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 211;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 243:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 245;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 244:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 213;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 245:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 214;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 246:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 215;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 247:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 216;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 248:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 217;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 249:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 250;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 250:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 219;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 251:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 215;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 252:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 221;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 253:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 216;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 254:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 223;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 255:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 217;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 256:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 229;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 257:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 226;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 258:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 227;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 259:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 260:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 229;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 261:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 230;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 262:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 231;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 263:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 238;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 264:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 265:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 234;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 266:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 235;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 267:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 268;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 268:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 237;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 269:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 238;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 270:
									monitor.wait();
									break;
								case 271:
									monitor.wait();
									break;
								case 272:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 274;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 273:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 275;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 274:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 277;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 275:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 278;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 276:
									monitor.wait();
									break;
								case 277:
									monitor.wait();
									break;
								case 278:
									monitor.wait();
									break;
								case 279:
									monitor.wait();
									break;
								case 280:
									monitor.wait();
									break;
								case 281:
									monitor.wait();
									break;
								case 282:
									monitor.wait();
									break;
								case 283:
									monitor.wait();
									break;
								case 284:
									monitor.wait();
									break;
								case 285:
									monitor.wait();
									break;
								case 286:
									monitor.wait();
									break;
								case 287:
									monitor.wait();
									break;
								case 288:
									monitor.wait();
									break;
								case 289:
									monitor.wait();
									break;
								case 290:
									monitor.wait();
									break;
								case 291:
									monitor.wait();
									break;
								case 292:
									monitor.wait();
									break;
								case 293:
									monitor.wait();
									break;
								case 294:
									monitor.wait();
									break;
								case 295:
									monitor.wait();
									break;
								case 296:
									monitor.wait();
									break;
								case 297:
									monitor.wait();
									break;
								case 298:
									monitor.wait();
									break;
								case 299:
									monitor.wait();
									break;
								case 300:
									monitor.wait();
									break;
								case 301:
									monitor.wait();
									break;
								case 302:
									monitor.wait();
									break;
								case 303:
									monitor.wait();
									break;
								case 304:
									monitor.wait();
									break;
								case 305:
									monitor.wait();
									break;
								case 306:
									monitor.wait();
									break;
								case 307:
									monitor.wait();
									break;
								case 308:
									monitor.wait();
									break;
								case 309:
									monitor.wait();
									break;
								case 310:
									monitor.wait();
									break;
								case 311:
									monitor.wait();
									break;
								case 312:
									monitor.wait();
									break;
								case 313:
									monitor.wait();
									break;
								case 314:
									monitor.wait();
									break;
								case 315:
									monitor.wait();
									break;
								case 316:
									monitor.wait();
									break;
								case 317:
									monitor.wait();
									break;
								case 318:
									monitor.wait();
									break;
								case 319:
									monitor.wait();
									break;
								case 320:
									monitor.wait();
									break;
								case 321:
									monitor.wait();
									break;
								case 322:
									monitor.wait();
									break;
								case 323:
									monitor.wait();
									break;
								case 324:
									monitor.wait();
									break;
								case 325:
									monitor.wait();
									break;
								case 326:
									monitor.wait();
									break;
								case 327:
									monitor.wait();
									break;
								case 328:
									monitor.wait();
									break;
								case 329:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 294;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 330:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 295;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 331:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 333;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 332:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 298;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 333:
									monitor.wait();
									break;
								case 334:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 299;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 335:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 300;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 336:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 301;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 337:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 338;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 338:
									monitor.wait();
									break;
								case 339:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 299;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 340:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 305;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 341:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 300;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 342:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 308;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 343:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 301;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 344:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 320;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 345:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 314;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 346:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 316;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 347:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 328;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 348:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 320;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 349:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 322;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 350:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 324;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 351:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 352;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 352:
									monitor.wait();
									break;
								case 353:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 328;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 354:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 329;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 355:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 330;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 356:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 358;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 357:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 332;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 358:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 333;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 359:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 334;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 360:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 335;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 361:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 336;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 362:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 363;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 363:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 338;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 364:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 334;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 365:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 340;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 366:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 335;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 367:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 342;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 368:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 336;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 369:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 348;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 370:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 345;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 371:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 346;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 372:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 353;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 373:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 348;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 374:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 349;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 375:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 350;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 376:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 377;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 377:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 352;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 378:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 353;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 379:
									monitor.wait();
									break;
								case 380:
									monitor.wait();
									break;
								case 381:
									monitor.wait();
									break;
								case 382:
									monitor.wait();
									break;
								case 383:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 358;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 384:
									monitor.wait();
									break;
								case 385:
									monitor.wait();
									break;
								case 386:
									monitor.wait();
									break;
								case 387:
									monitor.wait();
									break;
								case 388:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 363;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 389:
									monitor.wait();
									break;
								case 390:
									monitor.wait();
									break;
								case 391:
									monitor.wait();
									break;
								case 392:
									monitor.wait();
									break;
								case 393:
									monitor.wait();
									break;
								case 394:
									monitor.wait();
									break;
								case 395:
									monitor.wait();
									break;
								case 396:
									monitor.wait();
									break;
								case 397:
									monitor.wait();
									break;
								case 398:
									monitor.wait();
									break;
								case 399:
									monitor.wait();
									break;
								case 400:
									monitor.wait();
									break;
								case 401:
									monitor.wait();
									break;
								case 402:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 377;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 403:
									monitor.wait();
									break;
								case 404:
									monitor.wait();
									break;
								case 405:
									monitor.wait();
									break;
								case 406:
									monitor.wait();
									break;
								case 407:
									monitor.wait();
									break;
								case 408:
									monitor.wait();
									break;
								case 409:
									monitor.wait();
									break;
								case 410:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 245;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 411:
									monitor.wait();
									break;
								case 412:
									monitor.wait();
									break;
								case 413:
									monitor.wait();
									break;
								case 414:
									monitor.wait();
									break;
								case 415:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 250;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 416:
									monitor.wait();
									break;
								case 417:
									monitor.wait();
									break;
								case 418:
									monitor.wait();
									break;
								case 419:
									monitor.wait();
									break;
								case 420:
									monitor.wait();
									break;
								case 421:
									monitor.wait();
									break;
								case 422:
									monitor.wait();
									break;
								case 423:
									monitor.wait();
									break;
								case 424:
									monitor.wait();
									break;
								case 425:
									monitor.wait();
									break;
								case 426:
									monitor.wait();
									break;
								case 427:
									monitor.wait();
									break;
								case 428:
									monitor.wait();
									break;
								case 429:
									monitor.wait();
									break;
								case 430:
									monitor.wait();
									break;
								case 431:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 432;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 432:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 434;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 433:
									monitor.wait();
									break;
								case 434:
									monitor.wait();
									break;
								case 435:
									monitor.wait();
									break;
								case 436:
									monitor.wait();
									break;
								case 437:
									monitor.wait();
									break;
								case 438:
									monitor.wait();
									break;
								case 439:
									monitor.wait();
									break;
								case 440:
									monitor.wait();
									break;
								case 441:
									monitor.wait();
									break;
								case 442:
									monitor.wait();
									break;
								case 443:
									monitor.wait();
									break;
								case 444:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 440;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 445:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 446;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 446:
									monitor.wait();
									break;
								case 447:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 444;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 448:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 449;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 449:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 446;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 450:
									monitor.wait();
									break;
								case 451:
									monitor.wait();
									break;
								case 452:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 449;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 453:
									monitor.wait();
									break;
								case 454:
									monitor.wait();
									break;
								case 455:
									monitor.wait();
									break;
								case 456:
									monitor.wait();
									break;
								case 457:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 268;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 458:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			case "worker_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 2:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 270;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 3:
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 5:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 404;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 8:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 272;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 9:
									monitor.wait();
									break;
								case 10:
									monitor.wait();
									break;
								case 11:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 274;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 12:
									monitor.wait();
									break;
								case 13:
									monitor.wait();
									break;
								case 14:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 277;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 15:
									monitor.wait();
									break;
								case 16:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 18;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 18:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 20;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 19:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 21;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 20:
									monitor.wait();
									break;
								case 21:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 23;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 23:
									monitor.wait();
									break;
								case 24:
									monitor.wait();
									break;
								case 25:
									monitor.wait();
									break;
								case 26:
									monitor.wait();
									break;
								case 27:
									monitor.wait();
									break;
								case 28:
									monitor.wait();
									break;
								case 29:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 239;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 30:
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 32:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 208;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 33:
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 35:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 162;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 36:
									monitor.wait();
									break;
								case 37:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 39;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 38:
									monitor.wait();
									break;
								case 39:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 41;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 40:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 42;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 44;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 44:
									monitor.wait();
									break;
								case 45:
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 53;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 58;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 101;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 119;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 135;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 53:
									monitor.wait();
									break;
								case 54:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 141;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 62;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 57:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 92;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									monitor.wait();
									break;
								case 59:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 97;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 60:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 65;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 61:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 62:
									monitor.wait();
									break;
								case 63:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 64:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 65:
									monitor.wait();
									break;
								case 66:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 67:
									monitor.wait();
									break;
								case 68:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 70:
									monitor.wait();
									break;
								case 71:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 72:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 73:
									monitor.wait();
									break;
								case 74:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 75:
									monitor.wait();
									break;
								case 76:
									monitor.wait();
									break;
								case 77:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 78:
									monitor.wait();
									break;
								case 79:
									monitor.wait();
									break;
								case 80:
									monitor.wait();
									break;
								case 81:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 82:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 83:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 84:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 85:
									monitor.wait();
									break;
								case 86:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 87:
									monitor.wait();
									break;
								case 88:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 89;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 89:
									monitor.wait();
									break;
								case 90:
									monitor.wait();
									break;
								case 91:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 89;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 92:
									monitor.wait();
									break;
								case 93:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									monitor.wait();
									break;
								case 95:
									monitor.wait();
									break;
								case 96:
									monitor.wait();
									break;
								case 97:
									monitor.wait();
									break;
								case 98:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 99:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 104;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 100:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 111;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 101:
									monitor.wait();
									break;
								case 102:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 115;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 103:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 104:
									monitor.wait();
									break;
								case 105:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 106:
									monitor.wait();
									break;
								case 107:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 108:
									monitor.wait();
									break;
								case 109:
									monitor.wait();
									break;
								case 110:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 111:
									monitor.wait();
									break;
								case 112:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 113:
									monitor.wait();
									break;
								case 114:
									monitor.wait();
									break;
								case 115:
									monitor.wait();
									break;
								case 116:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 122;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 129;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 119:
									monitor.wait();
									break;
								case 120:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 133;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 121:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 124;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 122:
									monitor.wait();
									break;
								case 123:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 127;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 124:
									monitor.wait();
									break;
								case 125:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 126;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 126:
									monitor.wait();
									break;
								case 127:
									monitor.wait();
									break;
								case 128:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 126;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 129:
									monitor.wait();
									break;
								case 130:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 131;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 131:
									monitor.wait();
									break;
								case 132:
									monitor.wait();
									break;
								case 133:
									monitor.wait();
									break;
								case 134:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 131;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 135:
									monitor.wait();
									break;
								case 136:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 137;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 137:
									monitor.wait();
									break;
								case 138:
									monitor.wait();
									break;
								case 139:
									monitor.wait();
									break;
								case 140:
									monitor.wait();
									break;
								case 141:
									monitor.wait();
									break;
								case 142:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 137;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 143:
									monitor.wait();
									break;
								case 144:
									monitor.wait();
									break;
								case 145:
									monitor.wait();
									break;
								case 146:
									monitor.wait();
									break;
								case 147:
									monitor.wait();
									break;
								case 148:
									monitor.wait();
									break;
								case 149:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 144;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 150:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 151:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 152;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 152:
									monitor.wait();
									break;
								case 153:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 154:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 150;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 155:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 156;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 156:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 152;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 157:
									monitor.wait();
									break;
								case 158:
									monitor.wait();
									break;
								case 159:
									monitor.wait();
									break;
								case 160:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 156;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 161:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 39;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 162:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 165;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 163:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 166;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 164:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 41;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 165:
									monitor.wait();
									break;
								case 166:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 169;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 167:
									monitor.wait();
									break;
								case 168:
									monitor.wait();
									break;
								case 169:
									monitor.wait();
									break;
								case 170:
									monitor.wait();
									break;
								case 171:
									monitor.wait();
									break;
								case 172:
									monitor.wait();
									break;
								case 173:
									monitor.wait();
									break;
								case 174:
									monitor.wait();
									break;
								case 175:
									monitor.wait();
									break;
								case 176:
									monitor.wait();
									break;
								case 177:
									monitor.wait();
									break;
								case 178:
									monitor.wait();
									break;
								case 179:
									monitor.wait();
									break;
								case 180:
									monitor.wait();
									break;
								case 181:
									monitor.wait();
									break;
								case 182:
									monitor.wait();
									break;
								case 183:
									monitor.wait();
									break;
								case 184:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 44;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 185:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 176;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 186:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 144;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 187:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 179;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 188:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 189:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 191;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 190:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 152;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 191:
									monitor.wait();
									break;
								case 192:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 42;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 193:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 185;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 194:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 195:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 187;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 196:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 150;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 197:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 199;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 198:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 156;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 199:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 191;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 200:
									monitor.wait();
									break;
								case 201:
									monitor.wait();
									break;
								case 202:
									monitor.wait();
									break;
								case 203:
									monitor.wait();
									break;
								case 204:
									monitor.wait();
									break;
								case 205:
									monitor.wait();
									break;
								case 206:
									monitor.wait();
									break;
								case 207:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 199;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 208:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 210;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 209:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 211;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 210:
									monitor.wait();
									break;
								case 211:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 213;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 212:
									monitor.wait();
									break;
								case 213:
									monitor.wait();
									break;
								case 214:
									monitor.wait();
									break;
								case 215:
									monitor.wait();
									break;
								case 216:
									monitor.wait();
									break;
								case 217:
									monitor.wait();
									break;
								case 218:
									monitor.wait();
									break;
								case 219:
									monitor.wait();
									break;
								case 220:
									monitor.wait();
									break;
								case 221:
									monitor.wait();
									break;
								case 222:
									monitor.wait();
									break;
								case 223:
									monitor.wait();
									break;
								case 224:
									monitor.wait();
									break;
								case 225:
									monitor.wait();
									break;
								case 226:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 221;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 227:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 223;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 228:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 229;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 229:
									monitor.wait();
									break;
								case 230:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 226;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 231:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 227;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 232:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 233:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 229;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 234:
									monitor.wait();
									break;
								case 235:
									monitor.wait();
									break;
								case 236:
									monitor.wait();
									break;
								case 237:
									monitor.wait();
									break;
								case 238:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 239:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 241;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 240:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 242;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 241:
									monitor.wait();
									break;
								case 242:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 244;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 243:
									monitor.wait();
									break;
								case 244:
									monitor.wait();
									break;
								case 245:
									monitor.wait();
									break;
								case 246:
									monitor.wait();
									break;
								case 247:
									monitor.wait();
									break;
								case 248:
									monitor.wait();
									break;
								case 249:
									monitor.wait();
									break;
								case 250:
									monitor.wait();
									break;
								case 251:
									monitor.wait();
									break;
								case 252:
									monitor.wait();
									break;
								case 253:
									monitor.wait();
									break;
								case 254:
									monitor.wait();
									break;
								case 255:
									monitor.wait();
									break;
								case 256:
									monitor.wait();
									break;
								case 257:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 252;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 258:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 254;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 259:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 260;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 260:
									monitor.wait();
									break;
								case 261:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 257;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 262:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 258;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 263:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 264;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 264:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 260;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 265:
									monitor.wait();
									break;
								case 266:
									monitor.wait();
									break;
								case 267:
									monitor.wait();
									break;
								case 268:
									monitor.wait();
									break;
								case 269:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 264;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 270:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 379;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 271:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 380;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 272:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 354;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 273:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 355;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 274:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 329;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 275:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 330;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 276:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 18;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 277:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 294;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 278:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 295;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 279:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 280;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 280:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 282;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 281:
									monitor.wait();
									break;
								case 282:
									monitor.wait();
									break;
								case 283:
									monitor.wait();
									break;
								case 284:
									monitor.wait();
									break;
								case 285:
									monitor.wait();
									break;
								case 286:
									monitor.wait();
									break;
								case 287:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 284;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 288:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 289;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 289:
									monitor.wait();
									break;
								case 290:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 287;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 291:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 292;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 292:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 289;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 293:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 20;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 294:
									monitor.wait();
									break;
								case 295:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 298;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 296:
									monitor.wait();
									break;
								case 297:
									monitor.wait();
									break;
								case 298:
									monitor.wait();
									break;
								case 299:
									monitor.wait();
									break;
								case 300:
									monitor.wait();
									break;
								case 301:
									monitor.wait();
									break;
								case 302:
									monitor.wait();
									break;
								case 303:
									monitor.wait();
									break;
								case 304:
									monitor.wait();
									break;
								case 305:
									monitor.wait();
									break;
								case 306:
									monitor.wait();
									break;
								case 307:
									monitor.wait();
									break;
								case 308:
									monitor.wait();
									break;
								case 309:
									monitor.wait();
									break;
								case 310:
									monitor.wait();
									break;
								case 311:
									monitor.wait();
									break;
								case 312:
									monitor.wait();
									break;
								case 313:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 23;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 314:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 305;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 315:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 282;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 316:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 308;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 317:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 284;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 318:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 320;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 319:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 289;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 320:
									monitor.wait();
									break;
								case 321:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 21;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 322:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 314;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 323:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 280;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 324:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 316;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 325:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 287;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 326:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 328;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 327:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 292;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 328:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 320;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 329:
									monitor.wait();
									break;
								case 330:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 332;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 331:
									monitor.wait();
									break;
								case 332:
									monitor.wait();
									break;
								case 333:
									monitor.wait();
									break;
								case 334:
									monitor.wait();
									break;
								case 335:
									monitor.wait();
									break;
								case 336:
									monitor.wait();
									break;
								case 337:
									monitor.wait();
									break;
								case 338:
									monitor.wait();
									break;
								case 339:
									monitor.wait();
									break;
								case 340:
									monitor.wait();
									break;
								case 341:
									monitor.wait();
									break;
								case 342:
									monitor.wait();
									break;
								case 343:
									monitor.wait();
									break;
								case 344:
									monitor.wait();
									break;
								case 345:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 340;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 346:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 342;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 347:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 348;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 348:
									monitor.wait();
									break;
								case 349:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 345;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 350:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 346;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 351:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 353;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 352:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 328;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 353:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 348;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 354:
									monitor.wait();
									break;
								case 355:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 357;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 356:
									monitor.wait();
									break;
								case 357:
									monitor.wait();
									break;
								case 358:
									monitor.wait();
									break;
								case 359:
									monitor.wait();
									break;
								case 360:
									monitor.wait();
									break;
								case 361:
									monitor.wait();
									break;
								case 362:
									monitor.wait();
									break;
								case 363:
									monitor.wait();
									break;
								case 364:
									monitor.wait();
									break;
								case 365:
									monitor.wait();
									break;
								case 366:
									monitor.wait();
									break;
								case 367:
									monitor.wait();
									break;
								case 368:
									monitor.wait();
									break;
								case 369:
									monitor.wait();
									break;
								case 370:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 365;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 371:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 367;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 372:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 373;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 373:
									monitor.wait();
									break;
								case 374:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 370;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 375:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 371;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 376:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 378;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 377:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 353;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 378:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 373;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 379:
									monitor.wait();
									break;
								case 380:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 382;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 381:
									monitor.wait();
									break;
								case 382:
									monitor.wait();
									break;
								case 383:
									monitor.wait();
									break;
								case 384:
									monitor.wait();
									break;
								case 385:
									monitor.wait();
									break;
								case 386:
									monitor.wait();
									break;
								case 387:
									monitor.wait();
									break;
								case 388:
									monitor.wait();
									break;
								case 389:
									monitor.wait();
									break;
								case 390:
									monitor.wait();
									break;
								case 391:
									monitor.wait();
									break;
								case 392:
									monitor.wait();
									break;
								case 393:
									monitor.wait();
									break;
								case 394:
									monitor.wait();
									break;
								case 395:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 390;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 396:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 392;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 397:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 398;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 398:
									monitor.wait();
									break;
								case 399:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 395;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 400:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 396;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 401:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 403;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 402:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 378;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 403:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 398;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 404:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 406;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 405:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 407;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 406:
									monitor.wait();
									break;
								case 407:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 409;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 408:
									monitor.wait();
									break;
								case 409:
									monitor.wait();
									break;
								case 410:
									monitor.wait();
									break;
								case 411:
									monitor.wait();
									break;
								case 412:
									monitor.wait();
									break;
								case 413:
									monitor.wait();
									break;
								case 414:
									monitor.wait();
									break;
								case 415:
									monitor.wait();
									break;
								case 416:
									monitor.wait();
									break;
								case 417:
									monitor.wait();
									break;
								case 418:
									monitor.wait();
									break;
								case 419:
									monitor.wait();
									break;
								case 420:
									monitor.wait();
									break;
								case 421:
									monitor.wait();
									break;
								case 422:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 417;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 423:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 419;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 424:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 425;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 425:
									monitor.wait();
									break;
								case 426:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 422;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 427:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 423;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 428:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 429;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 429:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 425;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 430:
									monitor.wait();
									break;
								case 431:
									monitor.wait();
									break;
								case 432:
									monitor.wait();
									break;
								case 433:
									monitor.wait();
									break;
								case 434:
									monitor.wait();
									break;
								case 435:
									monitor.wait();
									break;
								case 436:
									monitor.wait();
									break;
								case 437:
									monitor.wait();
									break;
								case 438:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 292;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 439:
									monitor.wait();
									break;
								case 440:
									monitor.wait();
									break;
								case 441:
									monitor.wait();
									break;
								case 442:
									monitor.wait();
									break;
								case 443:
									monitor.wait();
									break;
								case 444:
									monitor.wait();
									break;
								case 445:
									monitor.wait();
									break;
								case 446:
									monitor.wait();
									break;
								case 447:
									monitor.wait();
									break;
								case 448:
									monitor.wait();
									break;
								case 449:
									monitor.wait();
									break;
								case 450:
									monitor.wait();
									break;
								case 451:
									monitor.wait();
									break;
								case 452:
									monitor.wait();
									break;
								case 453:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 403;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 454:
									monitor.wait();
									break;
								case 455:
									monitor.wait();
									break;
								case 456:
									monitor.wait();
									break;
								case 457:
									monitor.wait();
									break;
								case 458:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 429;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
				}
			};
			case "worker_2_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 430;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 454;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 8:
									monitor.wait();
									break;
								case 9:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 431;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 10:
									monitor.wait();
									break;
								case 11:
									monitor.wait();
									break;
								case 12:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 432;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 13:
									monitor.wait();
									break;
								case 14:
									monitor.wait();
									break;
								case 15:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 434;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 16:
									monitor.wait();
									break;
								case 17:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 435;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 18:
									monitor.wait();
									break;
								case 19:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 279;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 20:
									monitor.wait();
									break;
								case 21:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 280;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 23:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 282;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 24:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 25;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 25:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 26;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 26:
									monitor.wait();
									break;
								case 27:
									monitor.wait();
									break;
								case 28:
									monitor.wait();
									break;
								case 29:
									monitor.wait();
									break;
								case 30:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 265;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 32:
									monitor.wait();
									break;
								case 33:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 234;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 35:
									monitor.wait();
									break;
								case 36:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 201;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 37:
									monitor.wait();
									break;
								case 38:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 157;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 39:
									monitor.wait();
									break;
								case 40:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 153;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 44:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 144;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 45:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 46;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 46:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 47;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 54;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 102;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 120;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 136;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 53:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 141;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 54:
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 86;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 57:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 93;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 97;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 59:
									monitor.wait();
									break;
								case 60:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 66;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 61:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 74;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 62:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 63:
									monitor.wait();
									break;
								case 64:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 68;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 65:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 66:
									monitor.wait();
									break;
								case 67:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 70:
									monitor.wait();
									break;
								case 71:
									monitor.wait();
									break;
								case 72:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 68;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 73:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 74:
									monitor.wait();
									break;
								case 75:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									monitor.wait();
									break;
								case 77:
									monitor.wait();
									break;
								case 78:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									monitor.wait();
									break;
								case 80:
									monitor.wait();
									break;
								case 81:
									monitor.wait();
									break;
								case 82:
									monitor.wait();
									break;
								case 83:
									monitor.wait();
									break;
								case 84:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 88;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 85:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 86:
									monitor.wait();
									break;
								case 87:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 89;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 88:
									monitor.wait();
									break;
								case 89:
									monitor.wait();
									break;
								case 90:
									monitor.wait();
									break;
								case 91:
									monitor.wait();
									break;
								case 92:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 93:
									monitor.wait();
									break;
								case 94:
									monitor.wait();
									break;
								case 95:
									monitor.wait();
									break;
								case 96:
									monitor.wait();
									break;
								case 97:
									monitor.wait();
									break;
								case 98:
									monitor.wait();
									break;
								case 99:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 100:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 112;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 101:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 115;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 102:
									monitor.wait();
									break;
								case 103:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 107;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 104:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 105:
									monitor.wait();
									break;
								case 106:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 107:
									monitor.wait();
									break;
								case 108:
									monitor.wait();
									break;
								case 109:
									monitor.wait();
									break;
								case 110:
									monitor.wait();
									break;
								case 111:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 112:
									monitor.wait();
									break;
								case 113:
									monitor.wait();
									break;
								case 114:
									monitor.wait();
									break;
								case 115:
									monitor.wait();
									break;
								case 116:
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 123;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 130;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 119:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 133;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 120:
									monitor.wait();
									break;
								case 121:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 125;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 122:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 127;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 123:
									monitor.wait();
									break;
								case 124:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 126;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 125:
									monitor.wait();
									break;
								case 126:
									monitor.wait();
									break;
								case 127:
									monitor.wait();
									break;
								case 128:
									monitor.wait();
									break;
								case 129:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 131;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 130:
									monitor.wait();
									break;
								case 131:
									monitor.wait();
									break;
								case 132:
									monitor.wait();
									break;
								case 133:
									monitor.wait();
									break;
								case 134:
									monitor.wait();
									break;
								case 135:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 137;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 136:
									monitor.wait();
									break;
								case 137:
									monitor.wait();
									break;
								case 138:
									monitor.wait();
									break;
								case 139:
									monitor.wait();
									break;
								case 140:
									monitor.wait();
									break;
								case 141:
									monitor.wait();
									break;
								case 142:
									monitor.wait();
									break;
								case 143:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 46;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 144:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 145:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 47;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 146:
									monitor.wait();
									break;
								case 147:
									monitor.wait();
									break;
								case 148:
									monitor.wait();
									break;
								case 149:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 150;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 150:
									monitor.wait();
									break;
								case 151:
									monitor.wait();
									break;
								case 152:
									monitor.wait();
									break;
								case 153:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 154;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 154:
									monitor.wait();
									break;
								case 155:
									monitor.wait();
									break;
								case 156:
									monitor.wait();
									break;
								case 157:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 158;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 158:
									monitor.wait();
									break;
								case 159:
									monitor.wait();
									break;
								case 160:
									monitor.wait();
									break;
								case 161:
									monitor.wait();
									break;
								case 162:
									monitor.wait();
									break;
								case 163:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 193;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 164:
									monitor.wait();
									break;
								case 165:
									monitor.wait();
									break;
								case 166:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 185;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 167:
									monitor.wait();
									break;
								case 168:
									monitor.wait();
									break;
								case 169:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 176;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 170:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 171;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 171:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 172;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 172:
									monitor.wait();
									break;
								case 173:
									monitor.wait();
									break;
								case 174:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 144;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 175:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 171;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 176:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 179;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 177:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 178:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 172;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 179:
									monitor.wait();
									break;
								case 180:
									monitor.wait();
									break;
								case 181:
									monitor.wait();
									break;
								case 182:
									monitor.wait();
									break;
								case 183:
									monitor.wait();
									break;
								case 184:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 185:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 187;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 186:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 150;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 187:
									monitor.wait();
									break;
								case 188:
									monitor.wait();
									break;
								case 189:
									monitor.wait();
									break;
								case 190:
									monitor.wait();
									break;
								case 191:
									monitor.wait();
									break;
								case 192:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 153;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 193:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 195;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 194:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 154;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 195:
									monitor.wait();
									break;
								case 196:
									monitor.wait();
									break;
								case 197:
									monitor.wait();
									break;
								case 198:
									monitor.wait();
									break;
								case 199:
									monitor.wait();
									break;
								case 200:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 157;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 201:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 203;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 202:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 158;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 203:
									monitor.wait();
									break;
								case 204:
									monitor.wait();
									break;
								case 205:
									monitor.wait();
									break;
								case 206:
									monitor.wait();
									break;
								case 207:
									monitor.wait();
									break;
								case 208:
									monitor.wait();
									break;
								case 209:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 230;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 210:
									monitor.wait();
									break;
								case 211:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 226;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 212:
									monitor.wait();
									break;
								case 213:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 221;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 214:
									monitor.wait();
									break;
								case 215:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 216;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 216:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 217;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 217:
									monitor.wait();
									break;
								case 218:
									monitor.wait();
									break;
								case 219:
									monitor.wait();
									break;
								case 220:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 216;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 221:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 223;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 222:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 217;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 223:
									monitor.wait();
									break;
								case 224:
									monitor.wait();
									break;
								case 225:
									monitor.wait();
									break;
								case 226:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 227;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 227:
									monitor.wait();
									break;
								case 228:
									monitor.wait();
									break;
								case 229:
									monitor.wait();
									break;
								case 230:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 231;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 231:
									monitor.wait();
									break;
								case 232:
									monitor.wait();
									break;
								case 233:
									monitor.wait();
									break;
								case 234:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 235;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 235:
									monitor.wait();
									break;
								case 236:
									monitor.wait();
									break;
								case 237:
									monitor.wait();
									break;
								case 238:
									monitor.wait();
									break;
								case 239:
									monitor.wait();
									break;
								case 240:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 261;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 241:
									monitor.wait();
									break;
								case 242:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 257;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 243:
									monitor.wait();
									break;
								case 244:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 252;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 245:
									monitor.wait();
									break;
								case 246:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 247;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 247:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 248;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 248:
									monitor.wait();
									break;
								case 249:
									monitor.wait();
									break;
								case 250:
									monitor.wait();
									break;
								case 251:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 247;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 252:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 254;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 253:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 248;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 254:
									monitor.wait();
									break;
								case 255:
									monitor.wait();
									break;
								case 256:
									monitor.wait();
									break;
								case 257:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 258;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 258:
									monitor.wait();
									break;
								case 259:
									monitor.wait();
									break;
								case 260:
									monitor.wait();
									break;
								case 261:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 262;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 262:
									monitor.wait();
									break;
								case 263:
									monitor.wait();
									break;
								case 264:
									monitor.wait();
									break;
								case 265:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 266;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 266:
									monitor.wait();
									break;
								case 267:
									monitor.wait();
									break;
								case 268:
									monitor.wait();
									break;
								case 269:
									monitor.wait();
									break;
								case 270:
									monitor.wait();
									break;
								case 271:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 399;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 272:
									monitor.wait();
									break;
								case 273:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 374;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 274:
									monitor.wait();
									break;
								case 275:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 349;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 276:
									monitor.wait();
									break;
								case 277:
									monitor.wait();
									break;
								case 278:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 322;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 279:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 290;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 280:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 287;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 281:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 25;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 282:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 284;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 283:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 26;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 284:
									monitor.wait();
									break;
								case 285:
									monitor.wait();
									break;
								case 286:
									monitor.wait();
									break;
								case 287:
									monitor.wait();
									break;
								case 288:
									monitor.wait();
									break;
								case 289:
									monitor.wait();
									break;
								case 290:
									monitor.wait();
									break;
								case 291:
									monitor.wait();
									break;
								case 292:
									monitor.wait();
									break;
								case 293:
									monitor.wait();
									break;
								case 294:
									monitor.wait();
									break;
								case 295:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 314;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 296:
									monitor.wait();
									break;
								case 297:
									monitor.wait();
									break;
								case 298:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 305;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 299:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 300;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 300:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 301;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 301:
									monitor.wait();
									break;
								case 302:
									monitor.wait();
									break;
								case 303:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 282;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 304:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 300;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 305:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 308;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 306:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 284;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 307:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 301;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 308:
									monitor.wait();
									break;
								case 309:
									monitor.wait();
									break;
								case 310:
									monitor.wait();
									break;
								case 311:
									monitor.wait();
									break;
								case 312:
									monitor.wait();
									break;
								case 313:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 280;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 314:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 316;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 315:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 287;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 316:
									monitor.wait();
									break;
								case 317:
									monitor.wait();
									break;
								case 318:
									monitor.wait();
									break;
								case 319:
									monitor.wait();
									break;
								case 320:
									monitor.wait();
									break;
								case 321:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 279;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 322:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 324;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 323:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 290;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 324:
									monitor.wait();
									break;
								case 325:
									monitor.wait();
									break;
								case 326:
									monitor.wait();
									break;
								case 327:
									monitor.wait();
									break;
								case 328:
									monitor.wait();
									break;
								case 329:
									monitor.wait();
									break;
								case 330:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 345;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 331:
									monitor.wait();
									break;
								case 332:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 340;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 333:
									monitor.wait();
									break;
								case 334:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 335;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 335:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 336;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 336:
									monitor.wait();
									break;
								case 337:
									monitor.wait();
									break;
								case 338:
									monitor.wait();
									break;
								case 339:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 335;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 340:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 342;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 341:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 336;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 342:
									monitor.wait();
									break;
								case 343:
									monitor.wait();
									break;
								case 344:
									monitor.wait();
									break;
								case 345:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 346;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 346:
									monitor.wait();
									break;
								case 347:
									monitor.wait();
									break;
								case 348:
									monitor.wait();
									break;
								case 349:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 350;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 350:
									monitor.wait();
									break;
								case 351:
									monitor.wait();
									break;
								case 352:
									monitor.wait();
									break;
								case 353:
									monitor.wait();
									break;
								case 354:
									monitor.wait();
									break;
								case 355:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 370;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 356:
									monitor.wait();
									break;
								case 357:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 365;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 358:
									monitor.wait();
									break;
								case 359:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 360;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 360:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 361;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 361:
									monitor.wait();
									break;
								case 362:
									monitor.wait();
									break;
								case 363:
									monitor.wait();
									break;
								case 364:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 360;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 365:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 367;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 366:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 361;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 367:
									monitor.wait();
									break;
								case 368:
									monitor.wait();
									break;
								case 369:
									monitor.wait();
									break;
								case 370:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 371;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 371:
									monitor.wait();
									break;
								case 372:
									monitor.wait();
									break;
								case 373:
									monitor.wait();
									break;
								case 374:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 375;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 375:
									monitor.wait();
									break;
								case 376:
									monitor.wait();
									break;
								case 377:
									monitor.wait();
									break;
								case 378:
									monitor.wait();
									break;
								case 379:
									monitor.wait();
									break;
								case 380:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 395;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 381:
									monitor.wait();
									break;
								case 382:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 390;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 383:
									monitor.wait();
									break;
								case 384:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 385;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 385:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 386;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 386:
									monitor.wait();
									break;
								case 387:
									monitor.wait();
									break;
								case 388:
									monitor.wait();
									break;
								case 389:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 385;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 390:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 392;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 391:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 386;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 392:
									monitor.wait();
									break;
								case 393:
									monitor.wait();
									break;
								case 394:
									monitor.wait();
									break;
								case 395:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 396;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 396:
									monitor.wait();
									break;
								case 397:
									monitor.wait();
									break;
								case 398:
									monitor.wait();
									break;
								case 399:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 400;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 400:
									monitor.wait();
									break;
								case 401:
									monitor.wait();
									break;
								case 402:
									monitor.wait();
									break;
								case 403:
									monitor.wait();
									break;
								case 404:
									monitor.wait();
									break;
								case 405:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 426;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 406:
									monitor.wait();
									break;
								case 407:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 422;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 408:
									monitor.wait();
									break;
								case 409:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 417;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 410:
									monitor.wait();
									break;
								case 411:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 412;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 412:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 413;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 413:
									monitor.wait();
									break;
								case 414:
									monitor.wait();
									break;
								case 415:
									monitor.wait();
									break;
								case 416:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 412;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 417:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 419;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 418:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 413;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 419:
									monitor.wait();
									break;
								case 420:
									monitor.wait();
									break;
								case 421:
									monitor.wait();
									break;
								case 422:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 423;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 423:
									monitor.wait();
									break;
								case 424:
									monitor.wait();
									break;
								case 425:
									monitor.wait();
									break;
								case 426:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 427;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 427:
									monitor.wait();
									break;
								case 428:
									monitor.wait();
									break;
								case 429:
									monitor.wait();
									break;
								case 430:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 450;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 431:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 447;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 432:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 444;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 433:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 435;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 434:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 440;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 435:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 436;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 436:
									monitor.wait();
									break;
								case 437:
									monitor.wait();
									break;
								case 438:
									monitor.wait();
									break;
								case 439:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 436;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 440:
									monitor.wait();
									break;
								case 441:
									monitor.wait();
									break;
								case 442:
									monitor.wait();
									break;
								case 443:
									monitor.wait();
									break;
								case 444:
									monitor.wait();
									break;
								case 445:
									monitor.wait();
									break;
								case 446:
									monitor.wait();
									break;
								case 447:
									monitor.wait();
									break;
								case 448:
									monitor.wait();
									break;
								case 449:
									monitor.wait();
									break;
								case 450:
									monitor.wait();
									break;
								case 451:
									monitor.wait();
									break;
								case 452:
									monitor.wait();
									break;
								case 453:
									monitor.wait();
									break;
								case 454:
									if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 455;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 455:
									monitor.wait();
									break;
								case 456:
									monitor.wait();
									break;
								case 457:
									monitor.wait();
									break;
								case 458:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
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
		return new String[] { "worker_0_","worker_1_","master","worker_2_" };
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
