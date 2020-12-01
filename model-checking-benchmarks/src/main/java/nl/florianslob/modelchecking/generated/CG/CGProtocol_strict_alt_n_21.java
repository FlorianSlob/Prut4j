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

public class CGProtocol_strict_alt_n_21 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_19_ = new LinkedBlockingQueue<>(); 
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
	private final BlockingQueue<Object> queueFromworker_20_Tomaster = new LinkedBlockingQueue<>(); 
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_45(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(21);
									String[] receiverOptionsArray = new String[]{ "worker_10_","worker_18_","worker_20_","worker_7_","worker_5_","worker_4_","worker_8_","worker_9_","worker_16_","worker_15_","worker_19_","worker_14_","worker_6_","worker_3_","worker_0_","worker_17_","worker_13_","worker_1_","worker_11_","worker_12_","worker_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_10_")) {
									setState(16);
									queueFrommasterToworker_10_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									setState(43);
									queueFrommasterToworker_18_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									setState(12);
									queueFrommasterToworker_20_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(26);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(18);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(14);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									setState(30);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(34);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									setState(38);
									queueFrommasterToworker_16_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									setState(36);
									queueFrommasterToworker_15_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									setState(1);
									queueFrommasterToworker_19_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									setState(32);
									queueFrommasterToworker_14_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(22);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(10);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									setState(40);
									queueFrommasterToworker_17_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									setState(28);
									queueFrommasterToworker_13_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									setState(20);
									queueFrommasterToworker_11_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									setState(24);
									queueFrommasterToworker_12_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(8);
									queueFrommasterToworker_2_.put(box.get());
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
								setState(2);
								return Optional.empty();
							}
						case 1:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_19_Tomaster.take());
						case 2:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 3:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_0_Tomaster.take());
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									setState(7);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(21);
									String[] receiverOptionsArray = new String[]{ "worker_16_","worker_20_","worker_0_","worker_6_","worker_15_","worker_1_","worker_5_","worker_17_","worker_3_","worker_9_","worker_4_","worker_11_","worker_12_","worker_10_","worker_18_","worker_8_","worker_7_","worker_2_","worker_13_","worker_14_","worker_19_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_16_")) {
									setState(38);
									queueFrommasterToworker_16_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									setState(12);
									queueFrommasterToworker_20_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(22);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									setState(36);
									queueFrommasterToworker_15_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(18);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									setState(40);
									queueFrommasterToworker_17_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(10);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(34);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(14);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									setState(20);
									queueFrommasterToworker_11_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									setState(24);
									queueFrommasterToworker_12_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									setState(16);
									queueFrommasterToworker_10_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									setState(43);
									queueFrommasterToworker_18_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									setState(30);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(26);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(8);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									setState(28);
									queueFrommasterToworker_13_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									setState(32);
									queueFrommasterToworker_14_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									setState(1);
									queueFrommasterToworker_19_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 6:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_1_Tomaster.take());
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									setState(9);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 8:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_2_Tomaster.take());
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									setState(11);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 10:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_3_Tomaster.take());
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									setState(13);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 12:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_20_Tomaster.take());
						case 13:
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
						case 14:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_4_Tomaster.take());
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
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_10_Tomaster.take());
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
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_5_Tomaster.take());
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
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_11_Tomaster.take());
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_9_";
								}
								if (receiver.equals("worker_9_")) {
									setState(23);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 22:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_6_Tomaster.take());
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_10_";
								}
								if (receiver.equals("worker_10_")) {
									setState(25);
									queueFrommasterToworker_10_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 24:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_12_Tomaster.take());
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_11_";
								}
								if (receiver.equals("worker_11_")) {
									setState(27);
									queueFrommasterToworker_11_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 26:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_7_Tomaster.take());
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_12_";
								}
								if (receiver.equals("worker_12_")) {
									setState(29);
									queueFrommasterToworker_12_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 28:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_13_Tomaster.take());
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_13_";
								}
								if (receiver.equals("worker_13_")) {
									setState(31);
									queueFrommasterToworker_13_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 30:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_8_Tomaster.take());
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_14_";
								}
								if (receiver.equals("worker_14_")) {
									setState(33);
									queueFrommasterToworker_14_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 32:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_14_Tomaster.take());
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_15_";
								}
								if (receiver.equals("worker_15_")) {
									setState(35);
									queueFrommasterToworker_15_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 34:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_9_Tomaster.take());
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_16_";
								}
								if (receiver.equals("worker_16_")) {
									setState(37);
									queueFrommasterToworker_16_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 36:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_15_Tomaster.take());
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_17_";
								}
								if (receiver.equals("worker_17_")) {
									setState(39);
									queueFrommasterToworker_17_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 38:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_16_Tomaster.take());
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_18_";
								}
								if (receiver.equals("worker_18_")) {
									setState(41);
									queueFrommasterToworker_18_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 40:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_17_Tomaster.take());
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_19_";
								}
								if (receiver.equals("worker_19_")) {
									setState(44);
									queueFrommasterToworker_19_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(21);
									String[] receiverOptionsArray = new String[]{ "worker_10_","worker_5_","worker_13_","worker_1_","worker_14_","worker_3_","worker_8_","worker_17_","worker_2_","worker_0_","worker_9_","worker_20_","worker_12_","worker_16_","worker_4_","worker_11_","worker_7_","worker_18_","worker_6_","worker_15_","worker_19_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_10_")) {
									setState(16);
									queueFrommasterToworker_10_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									setState(18);
									queueFrommasterToworker_5_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_13_")) {
									setState(28);
									queueFrommasterToworker_13_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									setState(6);
									queueFrommasterToworker_1_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_14_")) {
									setState(32);
									queueFrommasterToworker_14_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									setState(10);
									queueFrommasterToworker_3_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									setState(30);
									queueFrommasterToworker_8_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_17_")) {
									setState(40);
									queueFrommasterToworker_17_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									setState(8);
									queueFrommasterToworker_2_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									setState(34);
									queueFrommasterToworker_9_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_20_")) {
									setState(12);
									queueFrommasterToworker_20_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_12_")) {
									setState(24);
									queueFrommasterToworker_12_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_16_")) {
									setState(38);
									queueFrommasterToworker_16_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									setState(14);
									queueFrommasterToworker_4_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_11_")) {
									setState(20);
									queueFrommasterToworker_11_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									setState(26);
									queueFrommasterToworker_7_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_18_")) {
									setState(43);
									queueFrommasterToworker_18_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									setState(22);
									queueFrommasterToworker_6_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_15_")) {
									setState(36);
									queueFrommasterToworker_15_.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
								if (receiver.equals("worker_19_")) {
									setState(1);
									queueFrommasterToworker_19_.put(box.get());
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
								setState(2);
								return Optional.empty();
							}
							while(true) {
								if (!queueFromworker_8_Tomaster.isEmpty() && queueFromworker_8_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_8_Tomaster.take());
								}
								if (!queueFromworker_7_Tomaster.isEmpty() && queueFromworker_7_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_7_Tomaster.take());
								}
								if (!queueFromworker_6_Tomaster.isEmpty() && queueFromworker_6_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_6_Tomaster.take());
								}
								if (!queueFromworker_5_Tomaster.isEmpty() && queueFromworker_5_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_5_Tomaster.take());
								}
								if (!queueFromworker_4_Tomaster.isEmpty() && queueFromworker_4_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_4_Tomaster.take());
								}
								if (!queueFromworker_3_Tomaster.isEmpty() && queueFromworker_3_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_3_Tomaster.take());
								}
								if (!queueFromworker_2_Tomaster.isEmpty() && queueFromworker_2_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_2_Tomaster.take());
								}
								if (!queueFromworker_1_Tomaster.isEmpty() && queueFromworker_1_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_1_Tomaster.take());
								}
								if (!queueFromworker_0_Tomaster.isEmpty() && queueFromworker_0_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_0_Tomaster.take());
								}
								if (!queueFromworker_19_Tomaster.isEmpty() && queueFromworker_19_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_19_Tomaster.take());
								}
								if (!queueFromworker_18_Tomaster.isEmpty() && queueFromworker_18_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_18_Tomaster.take());
								}
								if (!queueFromworker_17_Tomaster.isEmpty() && queueFromworker_17_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_17_Tomaster.take());
								}
								if (!queueFromworker_16_Tomaster.isEmpty() && queueFromworker_16_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_16_Tomaster.take());
								}
								if (!queueFromworker_15_Tomaster.isEmpty() && queueFromworker_15_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_15_Tomaster.take());
								}
								if (!queueFromworker_14_Tomaster.isEmpty() && queueFromworker_14_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_14_Tomaster.take());
								}
								if (!queueFromworker_13_Tomaster.isEmpty() && queueFromworker_13_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_13_Tomaster.take());
								}
								if (!queueFromworker_12_Tomaster.isEmpty() && queueFromworker_12_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_12_Tomaster.take());
								}
								if (!queueFromworker_11_Tomaster.isEmpty() && queueFromworker_11_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_11_Tomaster.take());
								}
								if (!queueFromworker_10_Tomaster.isEmpty() && queueFromworker_10_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_10_Tomaster.take());
								}
								if (!queueFromworker_20_Tomaster.isEmpty() && queueFromworker_20_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_20_Tomaster.take());
								}
								if (!queueFromworker_9_Tomaster.isEmpty() && queueFromworker_9_Tomaster.peek().getClass() == discourje.examples.npb3.impl.DoneMessage.class) {
									setState(42);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFromworker_9_Tomaster.take());
								}
							 monitor.wait(); }
						case 43:
							setState(5);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromworker_18_Tomaster.take());
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_20_";
								}
								if (receiver.equals("worker_20_")) {
									setState(42);
									queueFrommasterToworker_20_.put(box.get());
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
						if (state >=0 && state <= 45){
							Optional result = exchange_0_45(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					}
					
				}
			};
			case "worker_0_": return new IEnvironment() {
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
								setState(1);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_0_.take());
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
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_0_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_0_.isEmpty() && queueFrommasterToworker_0_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
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
			case "worker_10_": return new IEnvironment() {
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
								if (!queueFrommasterToworker_10_.isEmpty() && queueFrommasterToworker_10_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_10_.take());
								}
								if (!queueFrommasterToworker_10_.isEmpty() && queueFrommasterToworker_10_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_10_.take());
								}
							 monitor.wait(); }
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_10_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_10_.isEmpty() && queueFrommasterToworker_10_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_10_.take());
								}
								if (!queueFrommasterToworker_10_.isEmpty() && queueFrommasterToworker_10_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_10_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_10_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_10_.take());
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
			case "worker_11_": return new IEnvironment() {
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
								if (!queueFrommasterToworker_11_.isEmpty() && queueFrommasterToworker_11_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_11_.take());
								}
								if (!queueFrommasterToworker_11_.isEmpty() && queueFrommasterToworker_11_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_11_.take());
								}
							 monitor.wait(); }
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_11_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_11_.isEmpty() && queueFrommasterToworker_11_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_11_.take());
								}
								if (!queueFrommasterToworker_11_.isEmpty() && queueFrommasterToworker_11_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_11_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_11_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_11_.take());
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
			case "worker_12_": return new IEnvironment() {
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
								if (!queueFrommasterToworker_12_.isEmpty() && queueFrommasterToworker_12_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_12_.take());
								}
								if (!queueFrommasterToworker_12_.isEmpty() && queueFrommasterToworker_12_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_12_.take());
								}
							 monitor.wait(); }
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_12_.take());
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_12_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_12_.isEmpty() && queueFrommasterToworker_12_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_12_.take());
								}
								if (!queueFrommasterToworker_12_.isEmpty() && queueFrommasterToworker_12_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_12_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_12_Tomaster.put(box.get());
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
			case "worker_13_": return new IEnvironment() {
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
									queueFromworker_13_Tomaster.put(box.get());
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
							return Optional.of((Any)queueFrommasterToworker_13_.take());
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_13_.isEmpty() && queueFrommasterToworker_13_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_13_.take());
								}
								if (!queueFrommasterToworker_13_.isEmpty() && queueFrommasterToworker_13_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_13_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_13_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_13_.isEmpty() && queueFrommasterToworker_13_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_13_.take());
								}
								if (!queueFrommasterToworker_13_.isEmpty() && queueFrommasterToworker_13_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_13_.take());
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
			case "worker_14_": return new IEnvironment() {
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
								if (!queueFrommasterToworker_14_.isEmpty() && queueFrommasterToworker_14_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_14_.take());
								}
								if (!queueFrommasterToworker_14_.isEmpty() && queueFrommasterToworker_14_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_14_.take());
								}
							 monitor.wait(); }
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_14_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_14_.isEmpty() && queueFrommasterToworker_14_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_14_.take());
								}
								if (!queueFrommasterToworker_14_.isEmpty() && queueFrommasterToworker_14_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_14_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_14_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_14_.take());
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
			case "worker_15_": return new IEnvironment() {
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
								setState(1);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_15_.take());
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
							while(true) {
								if (!queueFrommasterToworker_15_.isEmpty() && queueFrommasterToworker_15_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_15_.take());
								}
								if (!queueFrommasterToworker_15_.isEmpty() && queueFrommasterToworker_15_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_15_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_15_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_15_.isEmpty() && queueFrommasterToworker_15_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_15_.take());
								}
								if (!queueFrommasterToworker_15_.isEmpty() && queueFrommasterToworker_15_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_15_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromworker_15_Tomaster.put(box.get());
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
			case "worker_16_": return new IEnvironment() {
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_16_.take());
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_16_.isEmpty() && queueFrommasterToworker_16_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_16_.take());
								}
								if (!queueFrommasterToworker_16_.isEmpty() && queueFrommasterToworker_16_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_16_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_16_Tomaster.put(box.get());
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
									queueFromworker_16_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_16_.isEmpty() && queueFrommasterToworker_16_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_16_.take());
								}
								if (!queueFrommasterToworker_16_.isEmpty() && queueFrommasterToworker_16_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_16_.take());
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
			case "worker_17_": return new IEnvironment() {
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_17_.take());
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_17_.isEmpty() && queueFrommasterToworker_17_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_17_.take());
								}
								if (!queueFrommasterToworker_17_.isEmpty() && queueFrommasterToworker_17_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_17_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_17_Tomaster.put(box.get());
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
									queueFromworker_17_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_17_.isEmpty() && queueFrommasterToworker_17_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_17_.take());
								}
								if (!queueFrommasterToworker_17_.isEmpty() && queueFrommasterToworker_17_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_17_.take());
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
			case "worker_18_": return new IEnvironment() {
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
									setState(0);
									queueFromworker_18_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_18_.isEmpty() && queueFrommasterToworker_18_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_18_.take());
								}
								if (!queueFrommasterToworker_18_.isEmpty() && queueFrommasterToworker_18_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_18_.take());
								}
							 monitor.wait(); }
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
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_18_.take());
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromworker_18_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_18_.isEmpty() && queueFrommasterToworker_18_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_18_.take());
								}
								if (!queueFrommasterToworker_18_.isEmpty() && queueFrommasterToworker_18_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_18_.take());
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
			case "worker_19_": return new IEnvironment() {
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
									setState(4);
									queueFromworker_19_Tomaster.put(box.get());
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
							while(true) {
								if (!queueFrommasterToworker_19_.isEmpty() && queueFrommasterToworker_19_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_19_.take());
								}
								if (!queueFrommasterToworker_19_.isEmpty() && queueFrommasterToworker_19_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_19_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_19_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_19_.isEmpty() && queueFrommasterToworker_19_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_19_.take());
								}
								if (!queueFrommasterToworker_19_.isEmpty() && queueFrommasterToworker_19_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_19_.take());
								}
							 monitor.wait(); }
						case 4:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							setState(0);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_19_.take());
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
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_1_.take());
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromworker_1_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
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
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_1_.take());
								}
								if (!queueFrommasterToworker_1_.isEmpty() && queueFrommasterToworker_1_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
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
			case "worker_20_": return new IEnvironment() {
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
									setState(3);
									queueFromworker_20_Tomaster.put(box.get());
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
							while(true) {
								if (!queueFrommasterToworker_20_.isEmpty() && queueFrommasterToworker_20_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_20_.take());
								}
								if (!queueFrommasterToworker_20_.isEmpty() && queueFrommasterToworker_20_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_20_.take());
								}
							 monitor.wait(); }
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							setState(0);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_20_.take());
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_20_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_20_.isEmpty() && queueFrommasterToworker_20_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(0);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_20_.take());
								}
								if (!queueFrommasterToworker_20_.isEmpty() && queueFrommasterToworker_20_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_20_.take());
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
							if (isCloseAction) {
								setState(0);
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
							if (isCloseAction) {
								setState(0);
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
								setState(0);
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
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
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
									queueFromworker_3_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_3_.isEmpty() && queueFrommasterToworker_3_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
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
								setState(1);
								return Optional.empty();
							}
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_3_.take());
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_3_Tomaster.put(box.get());
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
								setState(0);
								return Optional.empty();
							}
						case 1:
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
						case 2:
							if (isCloseAction) {
								setState(0);
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
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_4_.take());
								}
							 monitor.wait(); }
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_4_.take());
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
								setState(0);
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
									queueFromworker_5_Tomaster.put(box.get());
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
							return Optional.of((Any)queueFrommasterToworker_5_.take());
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
							 monitor.wait(); }
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_5_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_5_.take());
								}
								if (!queueFrommasterToworker_5_.isEmpty() && queueFrommasterToworker_5_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(4);
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_6_.take());
						case 2:
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
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
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
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_6_.isEmpty() && queueFrommasterToworker_6_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(2);
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
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
								}
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
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
									setState(4);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
								}
								if (!queueFrommasterToworker_7_.isEmpty() && queueFrommasterToworker_7_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(2);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_7_.take());
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
							return Optional.of((Any)queueFrommasterToworker_7_.take());
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_7_Tomaster.put(box.get());
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
			case "worker_8_": return new IEnvironment() {
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_8_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_8_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
								if (!queueFrommasterToworker_8_.isEmpty() && queueFrommasterToworker_8_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_8_.take());
								}
							 monitor.wait(); }
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_8_.take());
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
								setState(0);
								return Optional.empty();
							}
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromworker_9_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
							 monitor.wait(); }
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromworker_9_Tomaster.put(box.get());
									monitor.notifyAll();
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							while(true) {
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
									setState(1);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
								if (!queueFrommasterToworker_9_.isEmpty() && queueFrommasterToworker_9_.peek().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class) {
									setState(3);
									// Disabling unchecked inspection: We did check the class in the if statement above
									//noinspection unchecked
									return Optional.of((Any)queueFrommasterToworker_9_.take());
								}
							 monitor.wait(); }
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
							setState(1);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrommasterToworker_9_.take());
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
		return new String[] { "worker_8_","worker_16_","worker_12_","worker_2_","worker_18_","worker_7_","worker_3_","worker_17_","master","worker_1_","worker_13_","worker_6_","worker_20_","worker_10_","worker_9_","worker_19_","worker_15_","worker_0_","worker_11_","worker_5_","worker_4_","worker_14_" };
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
