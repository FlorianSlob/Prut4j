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

public class CGProtocol_strict_alt_n_11 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_10_ = new LinkedBlockingQueue<>(); 
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
	private final BlockingQueue<Object> queueFromworker_10_Tomaster = new LinkedBlockingQueue<>(); 
	
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 16 :
						case 18 :
						case 20 :
						case 22 :
						case 24 :
						case 26 :
						case 28 :
						case 30 :
						case 32 :
						case 34 :
						case 47 :
						case 50 :
						case 52 :
						case 54 :
						case 56 :
						case 58 :
						case 60 :
						case 62 :
						case 64 :
						case 66 :
						case 68 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(11);
									String[] receiverOptionsArray = new String[]{ "worker_8_","worker_3_","worker_2_","worker_6_","worker_10_","worker_0_","worker_9_","worker_4_","worker_5_","worker_7_","worker_1_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
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
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(16);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_2_";
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(18);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(20);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(22);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_5_";
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(24);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_6_";
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(26);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_7_";
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(28);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_8_";
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(30);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_9_";
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(32);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_10_";
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(34);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(11);
									String[] receiverOptionsArray = new String[]{ "worker_8_","worker_9_","worker_2_","worker_5_","worker_3_","worker_7_","worker_1_","worker_4_","worker_10_","worker_0_","worker_6_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_7_.put(box.get());
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
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
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
									setState(11);
									queueFrommasterToworker_6_.put(box.get());
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
						case 36:
							if (!queueFromworker_8_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 37:
							if (!queueFromworker_7_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 38:
							if (!queueFromworker_6_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 39:
							if (!queueFromworker_5_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 40:
							if (!queueFromworker_4_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (!queueFromworker_3_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 42:
							if (!queueFromworker_2_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 43:
							if (!queueFromworker_1_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 44:
							if (!queueFromworker_0_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 45:
							if (!queueFromworker_10_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 46:
							if (!queueFromworker_9_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 48:
							if (!queueFromworker_0_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(11);
									String[] receiverOptionsArray = new String[]{ "worker_5_","worker_7_","worker_1_","worker_8_","worker_9_","worker_4_","worker_2_","worker_3_","worker_0_","worker_10_","worker_6_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(12);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_8_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_8_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_9_")) {
									monitor.notifyAll();
									setState(14);
									queueFrommasterToworker_9_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_10_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_10_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(11);
									queueFrommasterToworker_6_.put(box.get());
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
						case 51:
							if (!queueFromworker_1_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 53:
							if (!queueFromworker_2_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 55:
							if (!queueFromworker_3_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 57:
							if (!queueFromworker_4_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 59:
							if (!queueFromworker_10_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 61:
							if (!queueFromworker_5_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 63:
							if (!queueFromworker_6_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 65:
							if (!queueFromworker_7_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 67:
							if (!queueFromworker_8_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 69:
							if (!queueFromworker_9_Tomaster.isEmpty()) {
								monitor.notifyAll();
								setState(49);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_9_Tomaster.take());
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_0_.isEmpty()) {
								monitor.notifyAll();
								setState(15);
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
							if (!queueFrommasterToworker_0_.isEmpty()) {
								monitor.notifyAll();
								setState(47);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(44);
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
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(48);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 49:
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_10_.isEmpty()) {
								monitor.notifyAll();
								setState(58);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
							}
							monitor.wait();
							break;
						case 34:
							if (!queueFrommasterToworker_10_.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_10_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(45);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 58:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(59);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_1_.isEmpty()) {
								monitor.notifyAll();
								setState(50);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 16:
							if (!queueFrommasterToworker_1_.isEmpty()) {
								monitor.notifyAll();
								setState(17);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(43);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(51);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 50 :
						case 51 :
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
							if (!queueFrommasterToworker_2_.isEmpty()) {
								monitor.notifyAll();
								setState(52);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 18:
							if (!queueFrommasterToworker_2_.isEmpty()) {
								monitor.notifyAll();
								setState(19);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(42);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(53);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_3_.isEmpty()) {
								monitor.notifyAll();
								setState(54);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 20:
							if (!queueFrommasterToworker_3_.isEmpty()) {
								monitor.notifyAll();
								setState(21);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(41);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(55);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_4_.isEmpty()) {
								monitor.notifyAll();
								setState(56);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 22:
							if (!queueFrommasterToworker_4_.isEmpty()) {
								monitor.notifyAll();
								setState(23);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(40);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
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
							if (!queueFrommasterToworker_5_.isEmpty()) {
								monitor.notifyAll();
								setState(60);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 24:
							if (!queueFrommasterToworker_5_.isEmpty()) {
								monitor.notifyAll();
								setState(25);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(39);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 60:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(61);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_6_.isEmpty()) {
								monitor.notifyAll();
								setState(62);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 26:
							if (!queueFrommasterToworker_6_.isEmpty()) {
								monitor.notifyAll();
								setState(27);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(38);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 62:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(63);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
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
							if (!queueFrommasterToworker_7_.isEmpty()) {
								monitor.notifyAll();
								setState(64);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 28:
							if (!queueFrommasterToworker_7_.isEmpty()) {
								monitor.notifyAll();
								setState(29);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(37);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 64:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(65);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_8_.isEmpty()) {
								monitor.notifyAll();
								setState(66);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
							}
							monitor.wait();
							break;
						case 30:
							if (!queueFrommasterToworker_8_.isEmpty()) {
								monitor.notifyAll();
								setState(31);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_8_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(36);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 66:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(67);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_70(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (!queueFrommasterToworker_9_.isEmpty()) {
								monitor.notifyAll();
								setState(68);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
							}
							monitor.wait();
							break;
						case 32:
							if (!queueFrommasterToworker_9_.isEmpty()) {
								monitor.notifyAll();
								setState(33);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_9_.take());
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(46);
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
						case 49:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(1);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 68:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(69);
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
							if (state >=0 && state <= 70){
								Optional result = exchange_0_70(box, receiver, isCloseAction);
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
		return new String[] { "worker_4_","worker_1_","worker_5_","worker_6_","worker_0_","worker_10_","worker_9_","worker_2_","worker_3_","master","worker_8_","worker_7_" };
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