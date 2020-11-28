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

public class CGProtocol_strict_alt_n_8 implements IProtocol {
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
	private final BlockingQueue<Object> queueFromworker_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_7_Tomaster = new LinkedBlockingQueue<>(); 
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 13 :
						case 15 :
						case 17 :
						case 19 :
						case 21 :
						case 23 :
						case 25 :
						case 35 :
						case 38 :
						case 40 :
						case 42 :
						case 44 :
						case 46 :
						case 48 :
						case 50 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(8);
									String[] receiverOptionsArray = new String[]{ "worker_3_","worker_6_","worker_5_","worker_0_","worker_7_","worker_1_","worker_2_","worker_4_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_7_.put(box.get());
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
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
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
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_1_";
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(13);
									queueFrommasterToworker_1_.put(box.get());
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
									setState(15);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_3_";
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(17);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_4_";
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(19);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_5_";
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(21);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_6_";
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(23);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
								if (receiver == null) {
									receiver = "worker_7_";
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(25);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(8);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_4_","worker_5_","worker_0_","worker_6_","worker_2_","worker_7_","worker_3_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_6_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
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
						case 27:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 28:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 29:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 30:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 31:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 32:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 33:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 34:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 36:
							if (queueFromworker_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(8);
									String[] receiverOptionsArray = new String[]{ "worker_1_","worker_4_","worker_0_","worker_5_","worker_3_","worker_7_","worker_2_","worker_6_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("worker_1_")) {
									monitor.notifyAll();
									setState(4);
									queueFrommasterToworker_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_4_")) {
									monitor.notifyAll();
									setState(7);
									queueFrommasterToworker_4_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_0_")) {
									monitor.notifyAll();
									setState(3);
									queueFrommasterToworker_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_5_")) {
									monitor.notifyAll();
									setState(8);
									queueFrommasterToworker_5_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_3_")) {
									monitor.notifyAll();
									setState(6);
									queueFrommasterToworker_3_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_7_")) {
									monitor.notifyAll();
									setState(10);
									queueFrommasterToworker_7_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFrommasterToworker_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("worker_6_")) {
									monitor.notifyAll();
									setState(9);
									queueFrommasterToworker_6_.put(box.get());
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
						case 39:
							if (queueFromworker_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (queueFromworker_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 43:
							if (queueFromworker_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 45:
							if (queueFromworker_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 47:
							if (queueFromworker_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFromworker_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 51:
							if (queueFromworker_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								setState(37);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromworker_7_Tomaster.take());
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
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
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 1:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(12);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 3:
							if (queueFrommasterToworker_0_.peek() != null ) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_0_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
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
									setState(34);
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
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
									queueFromworker_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
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
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(38);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterToworker_1_.peek() != null ) {
								monitor.notifyAll();
								setState(14);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_1_.take());
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
									setState(33);
									queueFromworker_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(39);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
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
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(40);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterToworker_2_.peek() != null ) {
								monitor.notifyAll();
								setState(16);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_2_.take());
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
									setState(32);
									queueFromworker_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(41);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
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
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 6:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(42);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 17:
							if (queueFrommasterToworker_3_.peek() != null ) {
								monitor.notifyAll();
								setState(18);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_3_.take());
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
									setState(31);
									queueFromworker_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(43);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
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
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 7:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								setState(44);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 19:
							if (queueFrommasterToworker_4_.peek() != null ) {
								monitor.notifyAll();
								setState(20);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_4_.take());
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
									setState(30);
									queueFromworker_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(45);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
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
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 8:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								setState(46);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (queueFrommasterToworker_5_.peek() != null ) {
								monitor.notifyAll();
								setState(22);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_5_.take());
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
									setState(29);
									queueFromworker_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
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
									setState(47);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
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
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								setState(48);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 23:
							if (queueFrommasterToworker_6_.peek() != null ) {
								monitor.notifyAll();
								setState(24);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_6_.take());
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
									setState(28);
									queueFromworker_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									setState(49);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_52(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
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
						case 51 :
							monitor.wait();
							break;
						case 0:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 2:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 10:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								setState(50);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 25:
							if (queueFrommasterToworker_7_.peek() != null ) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToworker_7_.take());
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
									queueFromworker_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								setState(11);
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
							if (state >=0 && state <= 52){
								Optional result = exchange_0_52(box, receiver, isCloseAction);
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
		return new String[] { "worker_2_","master","worker_6_","worker_4_","worker_0_","worker_1_","worker_3_","worker_5_","worker_7_" };
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
