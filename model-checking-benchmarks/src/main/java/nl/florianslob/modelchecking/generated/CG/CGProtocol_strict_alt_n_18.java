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

public class CGProtocol_strict_alt_n_18 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_13_ = new LinkedBlockingQueue<>(); 
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
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 23 :
						case 25 :
						case 27 :
						case 29 :
						case 31 :
						case 33 :
						case 35 :
						case 37 :
						case 39 :
						case 41 :
						case 43 :
						case 45 :
						case 47 :
						case 49 :
						case 51 :
						case 53 :
						case 55 :
						case 75 :
						case 78 :
						case 80 :
						case 82 :
						case 84 :
						case 86 :
						case 88 :
						case 90 :
						case 92 :
						case 94 :
						case 96 :
						case 98 :
						case 100 :
						case 102 :
						case 104 :
						case 106 :
						case 108 :
						case 110 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(18);
									String[] receiverOptionsArray = new String[]{ "worker_4_","worker_10_","worker_5_","worker_8_","worker_2_","worker_12_","worker_3_","worker_13_","worker_14_","worker_15_","worker_6_","worker_9_","worker_17_","worker_0_","worker_1_","worker_11_","worker_16_","worker_7_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(16);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									setState(15);
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									setState(17);
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									setState(19);
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(18);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									setState(21);
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									setState(20);
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(3);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(3);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(23);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(25);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(27);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(29);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_5_";
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(31);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_6_";
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(33);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_7_";
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(35);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_8_";
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(37);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_9_";
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(39);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_10_";
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(41);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_11_";
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									setState(43);
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_12_";
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									setState(45);
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_13_";
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									setState(47);
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_14_";
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									setState(49);
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_15_";
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									setState(51);
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_16_";
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									setState(53);
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_17_";
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									setState(55);
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(18);
									String[] receiverOptionsArray = new String[]{ "worker_13_","worker_16_","worker_3_","worker_14_","worker_0_","worker_6_","worker_12_","worker_1_","worker_4_","worker_7_","worker_9_","worker_15_","worker_2_","worker_11_","worker_10_","worker_8_","worker_17_","worker_5_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									setState(15);
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									setState(20);
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									setState(17);
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(18);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									setState(19);
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(16);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									setState(21);
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_0_";
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(2);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(3);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 57:
							if (queueFromworker_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 58:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 59:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 60:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 61:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 62:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 63:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 64:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 65:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 66:
							if (queueFromworker_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 67:
							if (queueFromworker_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 68:
							if (queueFromworker_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 69:
							if (queueFromworker_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 70:
							if (queueFromworker_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 71:
							if (queueFromworker_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 72:
							if (queueFromworker_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 73:
							if (queueFromworker_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 74:
							if (queueFromworker_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 76:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(18);
									String[] receiverOptionsArray = new String[]{ "worker_16_","worker_4_","worker_0_","worker_14_","worker_1_","worker_2_","worker_10_","worker_5_","worker_9_","worker_13_","worker_7_","worker_3_","worker_15_","worker_8_","worker_17_","worker_11_","worker_6_","worker_12_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									setState(20);
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									setState(17);
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(18);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									setState(15);
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									setState(19);
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(16);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									setState(21);
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(3);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 81:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 83:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 85:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 87:
							if (queueFromworker_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 89:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 91:
							if (queueFromworker_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 93:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 95:
							if (queueFromworker_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 97:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 99:
							if (queueFromworker_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 101:
							if (queueFromworker_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 103:
							if (queueFromworker_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 105:
							if (queueFromworker_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 107:
							if (queueFromworker_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 109:
							if (queueFromworker_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 111:
							if (queueFromworker_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(77);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_17_Tomaster.take());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(22);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(75);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(65);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(76);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_10_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterToworker_10_.peek() != null ) {
								monitor.notifyAll();
								setState(86);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
							}
							monitor.wait();
							break;
						case 41:
							if (queueFrommasterToworker_10_.peek() != null ) {
								monitor.notifyAll();
								setState(42);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(73);
									queueFromworker_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 86:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(87);
									queueFromworker_10_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_11_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterToworker_11_.peek() != null ) {
								monitor.notifyAll();
								setState(90);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_11_.take());
							}
							monitor.wait();
							break;
						case 43:
							if (queueFrommasterToworker_11_.peek() != null ) {
								monitor.notifyAll();
								setState(44);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_11_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(72);
									queueFromworker_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 90:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(91);
									queueFromworker_11_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_12_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterToworker_12_.peek() != null ) {
								monitor.notifyAll();
								setState(94);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_12_.take());
							}
							monitor.wait();
							break;
						case 45:
							if (queueFrommasterToworker_12_.peek() != null ) {
								monitor.notifyAll();
								setState(46);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_12_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(71);
									queueFromworker_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 94:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(95);
									queueFromworker_12_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_13_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterToworker_13_.peek() != null ) {
								monitor.notifyAll();
								setState(98);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_13_.take());
							}
							monitor.wait();
							break;
						case 47:
							if (queueFrommasterToworker_13_.peek() != null ) {
								monitor.notifyAll();
								setState(48);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_13_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(70);
									queueFromworker_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 98:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(99);
									queueFromworker_13_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_14_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 17:
							if (queueFrommasterToworker_14_.peek() != null ) {
								monitor.notifyAll();
								setState(102);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_14_.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFrommasterToworker_14_.peek() != null ) {
								monitor.notifyAll();
								setState(50);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_14_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(69);
									queueFromworker_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 102:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(103);
									queueFromworker_14_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_15_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 19:
							if (queueFrommasterToworker_15_.peek() != null ) {
								monitor.notifyAll();
								setState(106);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_15_.take());
							}
							monitor.wait();
							break;
						case 51:
							if (queueFrommasterToworker_15_.peek() != null ) {
								monitor.notifyAll();
								setState(52);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_15_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(68);
									queueFromworker_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 106:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(107);
									queueFromworker_15_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_16_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 20:
							if (queueFrommasterToworker_16_.peek() != null ) {
								monitor.notifyAll();
								setState(108);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_16_.take());
							}
							monitor.wait();
							break;
						case 53:
							if (queueFrommasterToworker_16_.peek() != null ) {
								monitor.notifyAll();
								setState(54);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_16_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(67);
									queueFromworker_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 108:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(109);
									queueFromworker_16_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_17_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
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
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (queueFrommasterToworker_17_.peek() != null ) {
								monitor.notifyAll();
								setState(110);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_17_.take());
							}
							monitor.wait();
							break;
						case 55:
							if (queueFrommasterToworker_17_.peek() != null ) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_17_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(66);
									queueFromworker_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 110:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(111);
									queueFromworker_17_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(78);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 23:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(24);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(64);
									queueFromworker_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 78:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(79);
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 6:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(80);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 25:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(63);
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 80:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(81);
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 7:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(82);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 27:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(28);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(62);
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(83);
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_4_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 8:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								setState(84);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 29:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								setState(30);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(61);
									queueFromworker_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 84:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(85);
									queueFromworker_4_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_5_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 10:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								setState(88);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 31:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								setState(32);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(60);
									queueFromworker_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 88:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(89);
									queueFromworker_5_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_6_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 12:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								setState(92);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 33:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								setState(34);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(59);
									queueFromworker_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 92:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(93);
									queueFromworker_6_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_7_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
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
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 14:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								setState(96);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								setState(36);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(58);
									queueFromworker_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 96:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(97);
									queueFromworker_7_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_8_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 16:
							if (queueFrommasterToworker_8_.peek() != null ) {
								monitor.notifyAll();
								setState(100);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
							}
							monitor.wait();
							break;
						case 37:
							if (queueFrommasterToworker_8_.peek() != null ) {
								monitor.notifyAll();
								setState(38);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(57);
									queueFromworker_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 100:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(101);
									queueFromworker_8_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_9_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_112(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 18:
							if (queueFrommasterToworker_9_.peek() != null ) {
								monitor.notifyAll();
								setState(104);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
							}
							monitor.wait();
							break;
						case 39:
							if (queueFrommasterToworker_9_.peek() != null ) {
								monitor.notifyAll();
								setState(40);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(74);
									queueFromworker_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 77:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 104:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(105);
									queueFromworker_9_Tomaster.put(box.get());
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
							if (state >=0 && state <= 112){
								Optional result = exchange_0_112(box, receiver, isCloseAction);
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
		return new String[] { "worker_1_","master","worker_4_","worker_10_","worker_5_","worker_6_","worker_12_","worker_7_","worker_8_","worker_9_","worker_15_","worker_16_","worker_0_","worker_3_","worker_11_","worker_2_","worker_17_","worker_13_","worker_14_" };
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
