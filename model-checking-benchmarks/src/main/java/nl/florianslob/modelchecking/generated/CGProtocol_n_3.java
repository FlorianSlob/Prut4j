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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(3);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_","worker_2_" };
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
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 3;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 1:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
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
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 247;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 5;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 3:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 6;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 247;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 9;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 8;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 5:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 216;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 6:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 216;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 7:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 11;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 12;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 10;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 8:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 185;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 9:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 185;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 10:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 14;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 13;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 11:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 139;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 137;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 12:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 139;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 176;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 13:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 16;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 14:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 16;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 15:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 18;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 16:
									monitor.wait();
									break;
								case 17:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 20;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 19;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 18:
									monitor.wait();
									break;
								case 19:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 20:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 119;
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
									monitor.wait();
									break;
								case 23:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 24:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 26;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 27;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 25;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 25:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 32;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 31;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 26:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 31;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 75;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 93;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 33;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 29:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 34;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 30:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 35;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 96;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 31:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 36;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 32:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 36;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 33:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 37;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 34:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 38;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 61;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 35:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 39;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 62;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 36:
									monitor.wait();
									break;
								case 37:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 48;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 38:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 54;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 39:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
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
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 51;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 53;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									monitor.wait();
									break;
								case 52:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 53:
									monitor.wait();
									break;
								case 54:
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 56;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									monitor.wait();
									break;
								case 57:
									monitor.wait();
									break;
								case 58:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
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
										state = 48;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 61:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 54;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 62:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 63:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 51;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 64:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 53;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 65:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 66:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 56;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 67:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 68:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 49;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 69:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 50;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 64;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 70:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 71:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 72:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 73:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 66;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 74:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 58;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 75:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 36;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 37;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 77:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 38;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 78:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 39;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 48;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 80:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 54;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 81:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 82:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 51;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 83:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 53;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 84:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 85:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 56;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 86:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 87:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 49;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 88:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 50;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 89:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 90:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 91:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 92:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 86;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 58;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 93:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 36;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 79;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 97;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 95:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 98;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 96:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 99;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 97:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 48;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 98:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 54;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 99:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 57;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 100:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 51;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 101:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 53;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 102:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 103:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 56;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 104:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 59;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 105:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 100;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 106:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 101;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 107:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 108:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 109:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 103;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 110:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 86;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 104;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 111:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 68;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 112:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 88;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 113:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 115;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 116;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 114;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 114:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 72;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 115:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 71;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 116:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 108;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 90;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 91;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 110;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 74;
										return Optional.empty();
									}
									if (isCloseAction) {
										monitor.notifyAll();
										state = 92;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 119:
									monitor.wait();
									break;
								case 120:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 121;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 121:
									monitor.wait();
									break;
								case 122:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 123;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 124;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 123:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 124:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 125:
									monitor.wait();
									break;
								case 126:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 127;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 127:
									monitor.wait();
									break;
								case 128:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 129:
									monitor.wait();
									break;
								case 130:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 131;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 129;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 134:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 130;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 135;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 135:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 136;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 136:
									monitor.wait();
									break;
								case 137:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 16;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 138:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 142;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 140;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 139:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 168;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 140:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 18;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 141:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 145;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 144;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 143;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 142:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 160;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 143:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 20;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 19;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 144:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 146;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 19;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 145:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 151;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 150;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 146:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 119;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 147:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 121;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 148:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 123;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 149:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 150:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 119;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 151:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 119;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 152:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 154;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 153;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 153:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 121;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 154:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 121;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 155:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 158;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 157;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 156;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 156:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 124;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 123;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 157:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 123;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 158:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 159;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 159:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 160:
									monitor.wait();
									break;
								case 161:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 162;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 162:
									monitor.wait();
									break;
								case 163:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 164;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 165;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 164:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 127;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 165:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 166;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 166:
									monitor.wait();
									break;
								case 167:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 149;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 159;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 168:
									monitor.wait();
									break;
								case 169:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 170;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 170:
									monitor.wait();
									break;
								case 171:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 173;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 172;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 172:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 131;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 173:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 174;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 174:
									monitor.wait();
									break;
								case 175:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 166;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 176:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 16;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 177:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 169;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 178;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 178:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 129;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 179:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 171;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 181;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 180;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 180:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 130;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 135;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 181:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 183;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 182;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 182:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 136;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 183:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 174;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 184:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 187;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 185:
									monitor.wait();
									break;
								case 186:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 189;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 188;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 187:
									monitor.wait();
									break;
								case 188:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 191;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 189:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 196;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 190:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 146;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 19;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 191:
									monitor.wait();
									break;
								case 192:
									monitor.wait();
									break;
								case 193:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 194;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 194:
									monitor.wait();
									break;
								case 195:
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 196:
									monitor.wait();
									break;
								case 197:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 198;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 198:
									monitor.wait();
									break;
								case 199:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 201;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 200;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 200:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 194;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 201:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 194;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 202:
									monitor.wait();
									break;
								case 203:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 204;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 204:
									monitor.wait();
									break;
								case 205:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 194;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 206:
									monitor.wait();
									break;
								case 207:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 208;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 208:
									monitor.wait();
									break;
								case 209:
									monitor.wait();
									break;
								case 210:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 206;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 211:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 212;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 212:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 214;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 213:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 183;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_0_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 182;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 214:
									monitor.wait();
									break;
								case 215:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 218;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 216:
									monitor.wait();
									break;
								case 217:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 220;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 219;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 218:
									monitor.wait();
									break;
								case 219:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 222;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 220:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 227;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 221:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 191;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 222:
									monitor.wait();
									break;
								case 223:
									monitor.wait();
									break;
								case 224:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 225;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 225:
									monitor.wait();
									break;
								case 226:
									monitor.wait();
									break;
								case 227:
									monitor.wait();
									break;
								case 228:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 229;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 229:
									monitor.wait();
									break;
								case 230:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 231;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 232;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 231:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 225;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 232:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 225;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 233:
									monitor.wait();
									break;
								case 234:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 235;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 235:
									monitor.wait();
									break;
								case 236:
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 225;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 237:
									monitor.wait();
									break;
								case 238:
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 239;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 239:
									monitor.wait();
									break;
								case 240:
									monitor.wait();
									break;
								case 241:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 237;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 242:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 243;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 243:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 245;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 244:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 214;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 245:
									monitor.wait();
									break;
								case 246:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 215;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 249;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 247:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 216;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 248:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 217;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 251;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 250;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 249:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 218;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 250:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 253;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 252;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 251:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 220;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 258;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 252:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_2_";
										}
										if (receiver.equals("worker_2_")) {
											monitor.notifyAll();
											state = 222;
											queueFrommasterToworker_2_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 253:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 222;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 254:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 223;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 255:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 224;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
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
								case 256:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 257:
									monitor.wait();
									break;
								case 258:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 222;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 259:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 228;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 260;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 260:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 223;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 261:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 230;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 262;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 263;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 262:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 224;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
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
								case 263:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 236;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 256;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 264:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 233;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 265:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 234;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 266;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 266:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 267:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 236;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_1_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 256;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 268:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 237;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 269:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 238;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 270;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 270:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 245;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 271:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 272:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 268;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 241;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 273:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 269;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 242;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
									}
									if (queueFromworker_2_Tomaster.peek() != null ) {
										monitor.notifyAll();
										state = 274;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_2_Tomaster.take());
									}
									monitor.wait();
									break;
								case 274:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											int rnd = new Random().nextInt(2);
											var receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
											receiver = receiverOptionsArray[rnd];
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 275;
											queueFrommasterToworker_0_.put(box.get());
											return Optional.empty();
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 276;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 275:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_1_";
										}
										if (receiver.equals("worker_1_")) {
											monitor.notifyAll();
											state = 245;
											queueFrommasterToworker_1_.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 276:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "worker_0_";
										}
										if (receiver.equals("worker_0_")) {
											monitor.notifyAll();
											state = 245;
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
										state = 4;
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 7;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 5:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 8;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 6:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 9;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 8:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 11;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 9:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 12;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 28;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 25:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 33;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 26:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 76;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 94;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									monitor.wait();
									break;
								case 29:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 111;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 30:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 118;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 31:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 37;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 32:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 60;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 33:
									monitor.wait();
									break;
								case 34:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 68;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 35:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 74;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 36:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 40;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 37:
									monitor.wait();
									break;
								case 38:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 49;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 39:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 58;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 40:
									monitor.wait();
									break;
								case 41:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 43;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 42:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 47;
										return Optional.empty();
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
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
								case 50:
									monitor.wait();
									break;
								case 51:
									monitor.wait();
									break;
								case 52:
									monitor.wait();
									break;
								case 53:
									monitor.wait();
									break;
								case 54:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 43;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 52;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 56:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 57:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 47;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									monitor.wait();
									break;
								case 59:
									monitor.wait();
									break;
								case 60:
									monitor.wait();
									break;
								case 61:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 62:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 67;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 63:
									monitor.wait();
									break;
								case 64:
									monitor.wait();
									break;
								case 65:
									monitor.wait();
									break;
								case 66:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 65;
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
										state = 70;
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
										state = 79;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									monitor.wait();
									break;
								case 77:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 78:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 92;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									monitor.wait();
									break;
								case 80:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 81:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 86;
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
										state = 84;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 86:
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
										state = 97;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									monitor.wait();
									break;
								case 95:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 96:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 110;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 97:
									monitor.wait();
									break;
								case 98:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 100;
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
									monitor.wait();
									break;
								case 101:
									monitor.wait();
									break;
								case 102:
									monitor.wait();
									break;
								case 103:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 102;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 104:
									monitor.wait();
									break;
								case 105:
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
										state = 107;
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
									monitor.wait();
									break;
								case 116:
									monitor.wait();
									break;
								case 117:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 118:
									monitor.wait();
									break;
								case 119:
									monitor.wait();
									break;
								case 120:
									monitor.wait();
									break;
								case 121:
									monitor.wait();
									break;
								case 122:
									monitor.wait();
									break;
								case 123:
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 138;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 185:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 139;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 186:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 141;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 187:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 142;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 188:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 190;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 189:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 145;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 190:
									monitor.wait();
									break;
								case 191:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 192:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 147;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 193:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 148;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 194:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 195:
									monitor.wait();
									break;
								case 196:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 146;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 197:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 152;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 198:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 147;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 199:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 155;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 200:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 148;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 201:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 167;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 202:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 161;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 203:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 204:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 175;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 205:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 167;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 206:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 207:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 208:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 183;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 209:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 175;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 210:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 177;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 211:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 212:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 213;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 213:
									monitor.wait();
									break;
								case 214:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 183;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 215:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 184;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 216:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 185;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 217:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 186;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 218:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 187;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 219:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 221;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 220:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 189;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 221:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 190;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 222:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 191;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 223:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 192;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 224:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 193;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 225:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 226;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 226:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 227:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 191;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 228:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 197;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 229:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 192;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 230:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 199;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 231:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 193;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 232:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 205;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 233:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 202;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 234:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 203;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 235:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 209;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 236:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 205;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 237:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 206;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 238:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 207;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 239:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 214;
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
										state = 244;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 244:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 213;
											queueFromworker_0_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 245:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 214;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
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
									monitor.wait();
									break;
								case 259:
									monitor.wait();
									break;
								case 260:
									monitor.wait();
									break;
								case 261:
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
									monitor.wait();
									break;
								case 272:
									monitor.wait();
									break;
								case 273:
									monitor.wait();
									break;
								case 274:
									monitor.wait();
									break;
								case 275:
									if (queueFrommasterToworker_0_.peek() != null ) {
										monitor.notifyAll();
										state = 244;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 276:
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
										state = 246;
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
										state = 215;
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
										state = 184;
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
										state = 138;
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
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 15;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 14:
									monitor.wait();
									break;
								case 15:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 17;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
										state = 29;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 25:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 34;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 26:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 77;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 95;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 111;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 29:
									monitor.wait();
									break;
								case 30:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 117;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 31:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 38;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 32:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 61;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 33:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 68;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 35:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 36:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 41;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 37:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 49;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 38:
									monitor.wait();
									break;
								case 39:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 40:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 43;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 46;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 44:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 43;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									monitor.wait();
									break;
								case 50:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 52;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									monitor.wait();
									break;
								case 52:
									monitor.wait();
									break;
								case 53:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 54:
									monitor.wait();
									break;
								case 55:
									monitor.wait();
									break;
								case 56:
									monitor.wait();
									break;
								case 57:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 46;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 52;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 59:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 60:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 63;
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
										state = 66;
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
										state = 65;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 65:
									monitor.wait();
									break;
								case 66:
									monitor.wait();
									break;
								case 67:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 65;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
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
									monitor.wait();
									break;
								case 74:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 75:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 80;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 87;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 77:
									monitor.wait();
									break;
								case 78:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 91;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 82;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 80:
									monitor.wait();
									break;
								case 81:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 82:
									monitor.wait();
									break;
								case 83:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 84;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 84:
									monitor.wait();
									break;
								case 85:
									monitor.wait();
									break;
								case 86:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 84;
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
									monitor.wait();
									break;
								case 92:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 89;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 93:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 98;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 105;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 95:
									monitor.wait();
									break;
								case 96:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 97:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 100;
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
										state = 102;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 102:
									monitor.wait();
									break;
								case 103:
									monitor.wait();
									break;
								case 104:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 102;
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
										state = 107;
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 107;
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
									monitor.wait();
									break;
								case 117:
									monitor.wait();
									break;
								case 118:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 113;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 119:
									monitor.wait();
									break;
								case 120:
									monitor.wait();
									break;
								case 121:
									monitor.wait();
									break;
								case 122:
									monitor.wait();
									break;
								case 123:
									monitor.wait();
									break;
								case 124:
									monitor.wait();
									break;
								case 125:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 120;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 126:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 122;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 127:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 128;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 128:
									monitor.wait();
									break;
								case 129:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 125;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 130:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 126;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 131:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 132;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 132:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 128;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 133:
									monitor.wait();
									break;
								case 134:
									monitor.wait();
									break;
								case 135:
									monitor.wait();
									break;
								case 136:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 132;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 137:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 15;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 138:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 141;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 139:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 142;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 140:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 17;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 141:
									monitor.wait();
									break;
								case 142:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 145;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 161:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 162:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 120;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 163:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 155;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 164:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 122;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 165:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 167;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 166:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 128;
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
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 18;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 169:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 161;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 170:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 125;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 171:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 163;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 172:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 126;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 173:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 175;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 174:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 132;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 175:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 167;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 175;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 184:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 186;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 185:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 187;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 186:
									monitor.wait();
									break;
								case 187:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 189;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 197;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 203:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 199;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 204:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 205;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 205:
									monitor.wait();
									break;
								case 206:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 202;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 207:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 203;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 208:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 209;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 209:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 205;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 210:
									monitor.wait();
									break;
								case 211:
									monitor.wait();
									break;
								case 212:
									monitor.wait();
									break;
								case 213:
									monitor.wait();
									break;
								case 214:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 209;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 215:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 217;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 216:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 218;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 217:
									monitor.wait();
									break;
								case 218:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 220;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									monitor.wait();
									break;
								case 231:
									monitor.wait();
									break;
								case 232:
									monitor.wait();
									break;
								case 233:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 228;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 234:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 230;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 235:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 236;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 236:
									monitor.wait();
									break;
								case 237:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 238:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 234;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 239:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 240;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 240:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 236;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 241:
									monitor.wait();
									break;
								case 242:
									monitor.wait();
									break;
								case 243:
									monitor.wait();
									break;
								case 244:
									monitor.wait();
									break;
								case 245:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 240;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 246:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 248;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 247:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 249;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 248:
									monitor.wait();
									break;
								case 249:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 251;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									monitor.wait();
									break;
								case 262:
									monitor.wait();
									break;
								case 263:
									monitor.wait();
									break;
								case 264:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 259;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 265:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 261;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 266:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 267;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 267:
									monitor.wait();
									break;
								case 268:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 264;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 269:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 265;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 270:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 271;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 271:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 267;
											queueFromworker_1_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 272:
									monitor.wait();
									break;
								case 273:
									monitor.wait();
									break;
								case 274:
									monitor.wait();
									break;
								case 275:
									monitor.wait();
									break;
								case 276:
									if (queueFrommasterToworker_1_.peek() != null ) {
										monitor.notifyAll();
										state = 271;
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
										state = 272;
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
										state = 241;
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
										state = 210;
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
										state = 177;
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 133;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 15:
									monitor.wait();
									break;
								case 16:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 129;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 18:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 125;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 20:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 120;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 21:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 22:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 23;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 23:
									monitor.wait();
									break;
								case 24:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 30;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 25:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 35;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 26:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 78;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 27:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 96;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 28:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 112;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 29:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 117;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 30:
									monitor.wait();
									break;
								case 31:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 39;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 32:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 62;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 33:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 69;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 34:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 73;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 35:
									monitor.wait();
									break;
								case 36:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 42;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 37:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 50;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 38:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 55;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 39:
									monitor.wait();
									break;
								case 40:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 44;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 41:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 46;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 43:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
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
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 48:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 44;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 49:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 52;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									monitor.wait();
									break;
								case 51:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 45;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									monitor.wait();
									break;
								case 53:
									monitor.wait();
									break;
								case 54:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 46;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									monitor.wait();
									break;
								case 56:
									monitor.wait();
									break;
								case 57:
									monitor.wait();
									break;
								case 58:
									monitor.wait();
									break;
								case 59:
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 66;
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
										state = 65;
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 70;
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
									if (isCloseAction) {
										monitor.notifyAll();
										state = 81;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 88;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 77:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 91;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 78:
									monitor.wait();
									break;
								case 79:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 83;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 80:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 85;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 81:
									monitor.wait();
									break;
								case 82:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 84;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 83:
									monitor.wait();
									break;
								case 84:
									monitor.wait();
									break;
								case 85:
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
									monitor.wait();
									break;
								case 93:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 99;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 94:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 106;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 95:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 109;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 96:
									monitor.wait();
									break;
								case 97:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 101;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 98:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 103;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 99:
									monitor.wait();
									break;
								case 100:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 102;
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 101:
									monitor.wait();
									break;
								case 102:
									monitor.wait();
									break;
								case 103:
									monitor.wait();
									break;
								case 104:
									monitor.wait();
									break;
								case 105:
									if (isCloseAction) {
										monitor.notifyAll();
										state = 107;
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
									monitor.wait();
									break;
								case 118:
									monitor.wait();
									break;
								case 119:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 120:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 122;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 121:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 23;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 122:
									monitor.wait();
									break;
								case 123:
									monitor.wait();
									break;
								case 124:
									monitor.wait();
									break;
								case 125:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 126;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									monitor.wait();
									break;
								case 129:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 130;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 134;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 169;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 140:
									monitor.wait();
									break;
								case 141:
									monitor.wait();
									break;
								case 142:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 161;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 152;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 146:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 147:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 148;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 148:
									monitor.wait();
									break;
								case 149:
									monitor.wait();
									break;
								case 150:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 120;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 151:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 147;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 152:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 155;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 153:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 122;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 154:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 148;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
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
									monitor.wait();
									break;
								case 158:
									monitor.wait();
									break;
								case 159:
									monitor.wait();
									break;
								case 160:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 125;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 161:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 163;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 162:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 126;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 129;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 169:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 171;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 170:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 130;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 133;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 177:
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
								case 178:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 134;
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
									monitor.wait();
									break;
								case 185:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 206;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 186:
									monitor.wait();
									break;
								case 187:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 202;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 188:
									monitor.wait();
									break;
								case 189:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 197;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 190:
									monitor.wait();
									break;
								case 191:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 192;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 192:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 193;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 192;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 197:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 199;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 198:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 193;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 207;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 207:
									monitor.wait();
									break;
								case 208:
									monitor.wait();
									break;
								case 209:
									monitor.wait();
									break;
								case 210:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 211;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 211:
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 237;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 217:
									monitor.wait();
									break;
								case 218:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 233;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 219:
									monitor.wait();
									break;
								case 220:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 228;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 221:
									monitor.wait();
									break;
								case 222:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 223;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 223:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 224;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 224:
									monitor.wait();
									break;
								case 225:
									monitor.wait();
									break;
								case 226:
									monitor.wait();
									break;
								case 227:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 223;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 228:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 230;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 229:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 224;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 230:
									monitor.wait();
									break;
								case 231:
									monitor.wait();
									break;
								case 232:
									monitor.wait();
									break;
								case 233:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 234;
											queueFromworker_2_Tomaster.put(box.get());
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 238;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 238:
									monitor.wait();
									break;
								case 239:
									monitor.wait();
									break;
								case 240:
									monitor.wait();
									break;
								case 241:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 242;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 242:
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
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 268;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 248:
									monitor.wait();
									break;
								case 249:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 264;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 250:
									monitor.wait();
									break;
								case 251:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 259;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 252:
									monitor.wait();
									break;
								case 253:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 254;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 254:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 255;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 255:
									monitor.wait();
									break;
								case 256:
									monitor.wait();
									break;
								case 257:
									monitor.wait();
									break;
								case 258:
									if (queueFrommasterToworker_2_.peek() != null ) {
										monitor.notifyAll();
										state = 254;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_2_.take());
									}
									monitor.wait();
									break;
								case 259:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 261;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 260:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 255;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 261:
									monitor.wait();
									break;
								case 262:
									monitor.wait();
									break;
								case 263:
									monitor.wait();
									break;
								case 264:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 265;
											queueFromworker_2_Tomaster.put(box.get());
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
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 269;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 269:
									monitor.wait();
									break;
								case 270:
									monitor.wait();
									break;
								case 271:
									monitor.wait();
									break;
								case 272:
									if (box.isPresent() && box.get().getClass() == String.class ) {
										if (receiver == null) {
											receiver = "master";
										}
										if (receiver.equals("master")) {
											monitor.notifyAll();
											state = 273;
											queueFromworker_2_Tomaster.put(box.get());
											return Optional.empty();
										}
									}
									monitor.wait();
									break;
								case 273:
									monitor.wait();
									break;
								case 274:
									monitor.wait();
									break;
								case 275:
									monitor.wait();
									break;
								case 276:
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
		return new String[] { "worker_1_","worker_2_","worker_0_","master" };
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
