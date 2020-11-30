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

public class CGProtocol_strict_alt_n_25 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_3_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 5 :
						case 7 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 15 :
						case 16 :
						case 17 :
						case 20 :
						case 21 :
						case 22 :
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
						case 40 :
						case 42 :
						case 44 :
						case 45 :
						case 47 :
						case 48 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 61 :
						case 62 :
						case 63 :
						case 66 :
						case 67 :
						case 68 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 80 :
						case 83 :
						case 85 :
						case 87 :
						case 89 :
						case 91 :
						case 93 :
						case 95 :
						case 97 :
						case 99 :
						case 101 :
						case 103 :
						case 105 :
						case 107 :
						case 109 :
						case 111 :
						case 113 :
						case 115 :
						case 117 :
						case 119 :
						case 121 :
						case 123 :
						case 125 :
						case 127 :
						case 129 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_12_","worker_20_","worker_1_","worker_16_","worker_24_","worker_9_","worker_21_","worker_17_","worker_13_","worker_4_","worker_14_","worker_10_","worker_2_","worker_23_","worker_8_","worker_0_","worker_19_","worker_7_","worker_15_","worker_18_","worker_6_","worker_5_","worker_3_","worker_22_","worker_11_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 20;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 7;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 32;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 25;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 33;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 12;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 34;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 24;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 17;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 27;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 10;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 21;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 31;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 28;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 30;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 35;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 26;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 22;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 16;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_10_","worker_11_","worker_19_","worker_0_","worker_14_","worker_7_","worker_12_","worker_2_","worker_4_","worker_24_","worker_6_","worker_22_","worker_1_","worker_21_","worker_18_","worker_9_","worker_23_","worker_3_","worker_17_","worker_5_","worker_20_","worker_13_","worker_15_","worker_8_","worker_16_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 53;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 57;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 76;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 40;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 70;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 63;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 61;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 44;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 67;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 59;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 58;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 42;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 54;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 75;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 71;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 62;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 74;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 55;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 47;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 66;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 72;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 68;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 73;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 3;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (queueFromworker_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 3;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 4:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 6:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 8:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 14:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 18:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 19:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 23:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 29:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 37:
							if (queueFromworker_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 38:
							if (queueFromworker_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 39:
							if (queueFromworker_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (queueFromworker_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 43:
							if (queueFromworker_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 46:
							if (queueFromworker_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFromworker_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 50:
							if (queueFromworker_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 51:
							if (queueFromworker_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 52:
							if (queueFromworker_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 56:
							if (queueFromworker_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 60:
							if (queueFromworker_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 64:
							if (queueFromworker_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 65:
							if (queueFromworker_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 69:
							if (queueFromworker_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 77:
							if (queueFromworker_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 78:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_0_","worker_21_","worker_24_","worker_15_","worker_4_","worker_11_","worker_9_","worker_6_","worker_22_","worker_20_","worker_13_","worker_1_","worker_10_","worker_16_","worker_3_","worker_8_","worker_7_","worker_18_","worker_19_","worker_12_","worker_23_","worker_17_","worker_14_","worker_5_","worker_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 12;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 25;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 30;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 17;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 33;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 26;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 16;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 24;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 7;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 32;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 31;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 28;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 35;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 20;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 21;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 34;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 27;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 22;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 10;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_21_","worker_4_","worker_6_","worker_23_","worker_3_","worker_16_","worker_0_","worker_15_","worker_22_","worker_18_","worker_1_","worker_14_","worker_24_","worker_12_","worker_13_","worker_11_","worker_2_","worker_19_","worker_10_","worker_7_","worker_5_","worker_20_","worker_17_","worker_9_","worker_8_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 54;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 59;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 62;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 73;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 40;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 72;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 58;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 75;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 42;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 70;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 67;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 61;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 66;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 57;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 44;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 76;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 53;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 63;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 55;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 47;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 74;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 71;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 68;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 3;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_11_","worker_17_","worker_8_","worker_19_","worker_13_","worker_16_","worker_24_","worker_4_","worker_23_","worker_3_","worker_15_","worker_6_","worker_0_","worker_5_","worker_20_","worker_22_","worker_9_","worker_21_","worker_12_","worker_2_","worker_7_","worker_14_","worker_10_","worker_18_","worker_1_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 57;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 74;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 68;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 76;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 66;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 73;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 67;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 62;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 72;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 59;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 40;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 55;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 47;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 58;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 71;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 54;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 61;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 44;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 63;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 70;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 53;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 75;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 42;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_17_","worker_24_","worker_8_","worker_22_","worker_23_","worker_13_","worker_11_","worker_6_","worker_15_","worker_2_","worker_16_","worker_10_","worker_18_","worker_9_","worker_1_","worker_12_","worker_5_","worker_3_","worker_0_","worker_4_","worker_21_","worker_7_","worker_19_","worker_14_","worker_20_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 34;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 25;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 31;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 16;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 21;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 24;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 26;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 30;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 10;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 32;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 35;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 33;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 7;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 20;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 22;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 17;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 12;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 28;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 27;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 3;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 81:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 82:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(25);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_20_","worker_9_","worker_17_","worker_6_","worker_7_","worker_3_","worker_10_","worker_21_","worker_4_","worker_5_","worker_11_","worker_13_","worker_14_","worker_23_","worker_8_","worker_2_","worker_15_","worker_16_","worker_0_","worker_18_","worker_22_","worker_19_","worker_12_","worker_24_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									state = 42;
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									monitor.notifyAll();
									state = 47;
									queueFrommasterToworker_20_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									state = 71;
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									monitor.notifyAll();
									state = 74;
									queueFrommasterToworker_17_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									state = 59;
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									state = 63;
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									state = 53;
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_21_")) {
									monitor.notifyAll();
									state = 54;
									queueFrommasterToworker_21_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									state = 55;
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									monitor.notifyAll();
									state = 57;
									queueFrommasterToworker_11_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									monitor.notifyAll();
									state = 66;
									queueFrommasterToworker_13_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									monitor.notifyAll();
									state = 70;
									queueFrommasterToworker_14_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_23_")) {
									monitor.notifyAll();
									state = 62;
									queueFrommasterToworker_23_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									state = 68;
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									state = 44;
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									monitor.notifyAll();
									state = 72;
									queueFrommasterToworker_15_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									monitor.notifyAll();
									state = 73;
									queueFrommasterToworker_16_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									state = 40;
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									monitor.notifyAll();
									state = 75;
									queueFrommasterToworker_18_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_22_")) {
									monitor.notifyAll();
									state = 58;
									queueFrommasterToworker_22_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									monitor.notifyAll();
									state = 76;
									queueFrommasterToworker_19_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									monitor.notifyAll();
									state = 61;
									queueFrommasterToworker_12_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_24_")) {
									monitor.notifyAll();
									state = 67;
									queueFrommasterToworker_24_.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 3;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 84:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 86:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 88:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 90:
							if (queueFromworker_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 92:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 94:
							if (queueFromworker_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 96:
							if (queueFromworker_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 98:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 100:
							if (queueFromworker_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 102:
							if (queueFromworker_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 104:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 106:
							if (queueFromworker_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 108:
							if (queueFromworker_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 110:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 112:
							if (queueFromworker_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 114:
							if (queueFromworker_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 116:
							if (queueFromworker_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 118:
							if (queueFromworker_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 120:
							if (queueFromworker_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 122:
							if (queueFromworker_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 124:
							if (queueFromworker_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 126:
							if (queueFromworker_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 128:
							if (queueFromworker_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 130:
							if (queueFromworker_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_19_Tomaster.take());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 29;
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 40:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								state = 80;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
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
									state = 29;
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 29;
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
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
									state = 81;
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 65;
									queueFromworker_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterToworker_10_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
							}
							monitor.wait();
							break;
						case 53:
							if (queueFrommasterToworker_10_.peek() != null ) {
								monitor.notifyAll();
								state = 93;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
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
									state = 65;
									queueFromworker_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 65;
									queueFromworker_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 94;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 56;
									queueFromworker_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterToworker_11_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_11_.take());
							}
							monitor.wait();
							break;
						case 57:
							if (queueFrommasterToworker_11_.peek() != null ) {
								monitor.notifyAll();
								state = 99;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_11_.take());
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
									state = 56;
									queueFromworker_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 56;
									queueFromworker_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 100;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_12_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
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
						case 77 :
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
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 52;
									queueFromworker_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 20:
							if (queueFrommasterToworker_12_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_12_.take());
							}
							monitor.wait();
							break;
						case 61:
							if (queueFrommasterToworker_12_.peek() != null ) {
								monitor.notifyAll();
								state = 105;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_12_.take());
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
									state = 52;
									queueFromworker_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 52;
									queueFromworker_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 106;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_13_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 22 :
						case 23 :
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
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 50;
									queueFromworker_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 24:
							if (queueFrommasterToworker_13_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_13_.take());
							}
							monitor.wait();
							break;
						case 66:
							if (queueFrommasterToworker_13_.peek() != null ) {
								monitor.notifyAll();
								state = 111;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_13_.take());
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
									state = 50;
									queueFromworker_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 50;
									queueFromworker_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 112;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_14_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 46;
									queueFromworker_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 27:
							if (queueFrommasterToworker_14_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_14_.take());
							}
							monitor.wait();
							break;
						case 70:
							if (queueFrommasterToworker_14_.peek() != null ) {
								monitor.notifyAll();
								state = 117;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_14_.take());
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
									state = 46;
									queueFromworker_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 46;
									queueFromworker_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 117:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 118;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_15_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
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
						case 56 :
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
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 43;
									queueFromworker_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 30:
							if (queueFrommasterToworker_15_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_15_.take());
							}
							monitor.wait();
							break;
						case 72:
							if (queueFrommasterToworker_15_.peek() != null ) {
								monitor.notifyAll();
								state = 121;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_15_.take());
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
									state = 43;
									queueFromworker_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 43;
									queueFromworker_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 121:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 122;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_16_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 41;
									queueFromworker_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 32:
							if (queueFrommasterToworker_16_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_16_.take());
							}
							monitor.wait();
							break;
						case 73:
							if (queueFrommasterToworker_16_.peek() != null ) {
								monitor.notifyAll();
								state = 123;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_16_.take());
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
									state = 41;
									queueFromworker_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 41;
									queueFromworker_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 123:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 124;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_17_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 39;
									queueFromworker_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 34:
							if (queueFrommasterToworker_17_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_17_.take());
							}
							monitor.wait();
							break;
						case 74:
							if (queueFrommasterToworker_17_.peek() != null ) {
								monitor.notifyAll();
								state = 125;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_17_.take());
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
									state = 39;
									queueFromworker_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 39;
									queueFromworker_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 125:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 126;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_18_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 38;
									queueFromworker_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 35:
							if (queueFrommasterToworker_18_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_18_.take());
							}
							monitor.wait();
							break;
						case 75:
							if (queueFrommasterToworker_18_.peek() != null ) {
								monitor.notifyAll();
								state = 127;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_18_.take());
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
									state = 38;
									queueFromworker_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 38;
									queueFromworker_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 127:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 128;
									queueFromworker_18_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_19_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 37;
									queueFromworker_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 36:
							if (queueFrommasterToworker_19_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_19_.take());
							}
							monitor.wait();
							break;
						case 76:
							if (queueFrommasterToworker_19_.peek() != null ) {
								monitor.notifyAll();
								state = 129;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_19_.take());
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
									state = 37;
									queueFromworker_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 37;
									queueFromworker_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 129:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 130;
									queueFromworker_19_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
						case 80 :
						case 81 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
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
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 7:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 42:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								state = 83;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
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
									state = 23;
									queueFromworker_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
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
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 84;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_20_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 69;
									queueFromworker_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterToworker_20_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_20_.take());
							}
							monitor.wait();
							break;
						case 47:
							if (queueFrommasterToworker_20_.peek() != null ) {
								monitor.notifyAll();
								state = 89;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_20_.take());
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
									state = 69;
									queueFromworker_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 69;
									queueFromworker_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 90;
									queueFromworker_20_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_21_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 55 :
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 64;
									queueFromworker_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 12:
							if (queueFrommasterToworker_21_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_21_.take());
							}
							monitor.wait();
							break;
						case 54:
							if (queueFrommasterToworker_21_.peek() != null ) {
								monitor.notifyAll();
								state = 95;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_21_.take());
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
									state = 64;
									queueFromworker_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 64;
									queueFromworker_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 96;
									queueFromworker_21_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_22_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
						case 57 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 60;
									queueFromworker_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 16:
							if (queueFrommasterToworker_22_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_22_.take());
							}
							monitor.wait();
							break;
						case 58:
							if (queueFrommasterToworker_22_.peek() != null ) {
								monitor.notifyAll();
								state = 101;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_22_.take());
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
									state = 60;
									queueFromworker_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 60;
									queueFromworker_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 102;
									queueFromworker_22_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_23_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
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
						case 77 :
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
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 51;
									queueFromworker_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (queueFrommasterToworker_23_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_23_.take());
							}
							monitor.wait();
							break;
						case 62:
							if (queueFrommasterToworker_23_.peek() != null ) {
								monitor.notifyAll();
								state = 107;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_23_.take());
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
									state = 51;
									queueFromworker_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 51;
									queueFromworker_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 108;
									queueFromworker_23_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_24_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 49;
									queueFromworker_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 25:
							if (queueFrommasterToworker_24_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_24_.take());
							}
							monitor.wait();
							break;
						case 67:
							if (queueFrommasterToworker_24_.peek() != null ) {
								monitor.notifyAll();
								state = 113;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_24_.take());
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
									state = 49;
									queueFromworker_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 49;
									queueFromworker_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 113:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 114;
									queueFromworker_24_Tomaster.put(box.get());
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 19;
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 10:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 44:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								state = 85;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
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
									state = 19;
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 19;
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 86;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_3_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 18;
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 45:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								state = 87;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
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
									state = 18;
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 18;
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 88;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_4_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 14;
									queueFromworker_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 17:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 48:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								state = 91;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
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
									state = 14;
									queueFromworker_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 14;
									queueFromworker_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 92;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_5_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 8;
									queueFromworker_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 22:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 55:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								state = 97;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
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
									state = 8;
									queueFromworker_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 8;
									queueFromworker_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 98;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_6_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 22 :
						case 23 :
						case 24 :
						case 25 :
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
						case 56 :
						case 57 :
						case 58 :
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
						case 77 :
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
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 6;
									queueFromworker_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 26:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 59:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								state = 103;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
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
									state = 6;
									queueFromworker_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 6;
									queueFromworker_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 104;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_7_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
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
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
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
						case 77 :
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
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 4;
									queueFromworker_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 28:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 63:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								state = 109;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
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
									state = 4;
									queueFromworker_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 4;
									queueFromworker_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 109:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 110;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_8_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 1;
									queueFromworker_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 31:
							if (queueFrommasterToworker_8_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
							}
							monitor.wait();
							break;
						case 68:
							if (queueFrommasterToworker_8_.peek() != null ) {
								monitor.notifyAll();
								state = 115;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
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
									state = 1;
									queueFromworker_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 1;
									queueFromworker_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 116;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "worker_9_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_131(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
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
						case 56 :
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
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
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
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 77;
									queueFromworker_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 33:
							if (queueFrommasterToworker_9_.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
							}
							monitor.wait();
							break;
						case 71:
							if (queueFrommasterToworker_9_.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
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
									state = 77;
									queueFromworker_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 77;
									queueFromworker_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 82:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 2;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 120;
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
							if (state >=0 && state <= 131){
								Optional result = exchange_0_131(box, receiver, isCloseAction);
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
		return new String[] { "worker_2_","worker_5_","worker_12_","worker_14_","worker_8_","worker_6_","worker_4_","worker_18_","worker_13_","worker_20_","worker_22_","worker_15_","worker_24_","worker_3_","worker_16_","worker_19_","worker_11_","worker_17_","worker_7_","master","worker_10_","worker_9_","worker_23_","worker_0_","worker_21_","worker_1_" };
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