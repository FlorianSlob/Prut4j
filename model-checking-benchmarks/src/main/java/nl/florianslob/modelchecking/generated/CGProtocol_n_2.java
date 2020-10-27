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

public class CGProtocol_n_2 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToworker_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToworker_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromworker_0_Tomaster = new LinkedBlockingQueue<>(); 
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 2;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 1;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 1:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 4;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
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
								case 3:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 6;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 5:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 8;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 7;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								case 7:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 9;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 8:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 32;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
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
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 12:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 14;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 13;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 13:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 17;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 14:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 17;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 15:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 18;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 26;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 16:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 19;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 27;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 18:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 23;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 19:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 25;
										return Optional.empty();
									}
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 25:
									monitor.wait();
									break;
								case 26:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 23;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 25;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 29:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 30;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 31;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 30:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 31:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 32:
									monitor.wait();
									break;
								case 33:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 35:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 36;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 37;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 36:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 37:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 38:
									monitor.wait();
									break;
								case 39:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 40;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 40:
									monitor.wait();
									break;
								case 41:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 43:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 44;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 44:
									monitor.wait();
									break;
								case 45:
									monitor.wait();
									break;
								case 46:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 42;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 47:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 43;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 48:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 49;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 49:
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
										state = 3;
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 5;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 4:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 6;
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 8;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									monitor.wait();
									break;
								case 10:
									monitor.wait();
									break;
								case 11:
									monitor.wait();
									break;
								case 12:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 15;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 13:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 18;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 14:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 26;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 15:
									monitor.wait();
									break;
								case 16:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 29;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 17:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 20;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 18:
									monitor.wait();
									break;
								case 19:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 24;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 20:
									monitor.wait();
									break;
								case 21:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 26:
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 28;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									monitor.wait();
									break;
								case 29:
									monitor.wait();
									break;
								case 30:
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 32:
									monitor.wait();
									break;
								case 33:
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 33;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 39:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 40:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 41;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 38;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 43:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 39;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 44:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 45;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 45:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 41;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									monitor.wait();
									break;
								case 49:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 45;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
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
										state = 46;
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
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 42;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 38;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 8:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 33;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 9:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 10;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 10:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 11;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 11:
									monitor.wait();
									break;
								case 12:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 16;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 13:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 19;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 14:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 27;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 15:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 29;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 16:
									monitor.wait();
									break;
								case 17:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 21;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 18:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 24;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 20:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 21:
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 23:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 22;
										return Optional.empty();
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 28;
										return Optional.empty();
									}
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
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 32:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 10;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 33:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 35;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 34:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 11;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 39;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 43;
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 47;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									monitor.wait();
									break;
								case 49:
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
		return new String[] { "worker_1_","master","worker_0_" };
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
