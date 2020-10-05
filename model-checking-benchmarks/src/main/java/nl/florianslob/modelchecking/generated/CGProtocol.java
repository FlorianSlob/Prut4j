/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CGProtocol implements IProtocol {
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
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 4;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 1;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 3;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 2;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 76:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 54;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 52:
									monitor.wait();
									break;
								case 53:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 26:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 38;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 39;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 38:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
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
								case 35:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 29:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 33;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 32;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 33:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 32:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 39:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 40;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 37:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 25:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 31;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 30;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 31:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 36;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 36:
									monitor.wait();
									break;
								case 30:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 36;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 28:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 41;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 41:
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 27:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 41;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 49:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 48:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 24:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 28;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 27;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 23:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 24;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 56:
									monitor.wait();
									break;
								case 57:
									monitor.wait();
									break;
								case 77:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 55;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 78;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 78:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 79;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 79:
									monitor.wait();
									break;
								case 44:
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 5:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 8;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 14;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 15:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 18;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 17:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 19;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 20;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 19:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 21;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 21:
									monitor.wait();
									break;
								case 71:
									monitor.wait();
									break;
								case 72:
									monitor.wait();
									break;
								case 58:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 59;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 73:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 70;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 74;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 74:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 75;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 75:
									monitor.wait();
									break;
								case 65:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 14;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 66:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 14;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 14:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 1;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 4;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 2;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 3;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 1:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 6;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 16;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 16:
									monitor.wait();
									break;
								case 54:
									monitor.wait();
									break;
								case 50:
									monitor.wait();
									break;
								case 51:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 52;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 47:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 49;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 48;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 45:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 46;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 55:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 56;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 18:
									monitor.wait();
									break;
								case 20:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 44;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 63:
									monitor.wait();
									break;
								case 13:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 14;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 61:
									monitor.wait();
									break;
								case 12:
									monitor.wait();
									break;
								case 7:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 9;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 10;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 9:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 11;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 11:
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								case 59:
									monitor.wait();
									break;
								case 60:
									monitor.wait();
									break;
								case 67:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 68;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 64:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 65;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 66;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 62:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 63;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 70:
									if (queueFromworker_1_Tomaster.peek() != null && queueFromworker_1_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 71;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_1_Tomaster.take());
									}
									monitor.wait();
									break;
								case 8:
									monitor.wait();
									break;
								case 10:
									if (queueFromworker_0_Tomaster.peek() != null && queueFromworker_0_Tomaster.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 61;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromworker_0_Tomaster.take());
									}
									monitor.wait();
									break;
								case 3:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 6;
										queueFrommasterToworker_0_.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 16;
										queueFrommasterToworker_1_.put(box.get());
										return Optional.empty();
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
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 76:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 77;
										queueFromworker_1_Tomaster.put(box.get());
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
								case 26:
									monitor.wait();
									break;
								case 38:
									monitor.wait();
									break;
								case 40:
									monitor.wait();
									break;
								case 35:
									monitor.wait();
									break;
								case 29:
									monitor.wait();
									break;
								case 33:
									monitor.wait();
									break;
								case 32:
									monitor.wait();
									break;
								case 39:
									monitor.wait();
									break;
								case 37:
									monitor.wait();
									break;
								case 25:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 29;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 31:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 37;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 36:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 30:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 35;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 28:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 39;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 41:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 43;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 42:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 43:
									monitor.wait();
									break;
								case 27:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 38;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 49:
									monitor.wait();
									break;
								case 48:
									monitor.wait();
									break;
								case 24:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 26;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 46:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 23;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 23:
									monitor.wait();
									break;
								case 56:
									monitor.wait();
									break;
								case 57:
									monitor.wait();
									break;
								case 77:
									monitor.wait();
									break;
								case 78:
									monitor.wait();
									break;
								case 79:
									monitor.wait();
									break;
								case 44:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 22:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 23;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 68:
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 15:
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 21:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 22;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 71:
									monitor.wait();
									break;
								case 72:
									monitor.wait();
									break;
								case 58:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 73;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
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
								case 65:
									monitor.wait();
									break;
								case 66:
									monitor.wait();
									break;
								case 14:
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 4:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 76;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 16:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 54;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 54:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 55;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 50:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 51;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 45:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 47;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 55:
									monitor.wait();
									break;
								case 18:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 50;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 20:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 45;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 63:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 13;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 13:
									monitor.wait();
									break;
								case 61:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 12:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 13;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 9:
									monitor.wait();
									break;
								case 11:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 12;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 6:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 59;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 59:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 70;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 60:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 67;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 67:
									monitor.wait();
									break;
								case 64:
									monitor.wait();
									break;
								case 62:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 64;
										queueFromworker_1_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 70:
									monitor.wait();
									break;
								case 8:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 60;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 10:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 62;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 3:
									if (queueFrommasterToworker_1_.peek() != null && queueFrommasterToworker_1_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 58;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_1_.take());
									}
									monitor.wait();
									break;
								case 2:
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
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 76:
									monitor.wait();
									break;
								case 52:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 53;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 53:
									monitor.wait();
									break;
								case 26:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 29;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 38:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 35;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 40:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 35:
									monitor.wait();
									break;
								case 29:
									monitor.wait();
									break;
								case 33:
									monitor.wait();
									break;
								case 32:
									monitor.wait();
									break;
								case 39:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 37;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 37:
									monitor.wait();
									break;
								case 25:
									monitor.wait();
									break;
								case 31:
									monitor.wait();
									break;
								case 36:
									monitor.wait();
									break;
								case 30:
									monitor.wait();
									break;
								case 28:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 31;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 41:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 42;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 42:
									monitor.wait();
									break;
								case 34:
									monitor.wait();
									break;
								case 43:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 34;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 27:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 30;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 49:
									monitor.wait();
									break;
								case 48:
									monitor.wait();
									break;
								case 24:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 25;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 46:
									monitor.wait();
									break;
								case 23:
									monitor.wait();
									break;
								case 56:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 57;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 57:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 53;
										queueFromworker_0_Tomaster.put(box.get());
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
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 57;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 44:
									monitor.wait();
									break;
								case 22:
									monitor.wait();
									break;
								case 5:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 7;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 68:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 69;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 69:
									monitor.wait();
									break;
								case 15:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 17;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 17:
									monitor.wait();
									break;
								case 19:
									monitor.wait();
									break;
								case 21:
									monitor.wait();
									break;
								case 71:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 72;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 72:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 69;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 58:
									monitor.wait();
									break;
								case 73:
									monitor.wait();
									break;
								case 74:
									monitor.wait();
									break;
								case 75:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 72;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 65:
									monitor.wait();
									break;
								case 66:
									monitor.wait();
									break;
								case 14:
									monitor.wait();
									break;
								case 1:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 5;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 16:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 18;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 54:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 50;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 50:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 45;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 51:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 47;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 47:
									monitor.wait();
									break;
								case 45:
									monitor.wait();
									break;
								case 55:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 51;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 18:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 20;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 20:
									monitor.wait();
									break;
								case 63:
									monitor.wait();
									break;
								case 13:
									monitor.wait();
									break;
								case 61:
									monitor.wait();
									break;
								case 12:
									monitor.wait();
									break;
								case 7:
									monitor.wait();
									break;
								case 9:
									monitor.wait();
									break;
								case 11:
									monitor.wait();
									break;
								case 6:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 8;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 59:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 60;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 60:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 62;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 67:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 64;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 64:
									monitor.wait();
									break;
								case 62:
									monitor.wait();
									break;
								case 70:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 67;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrommasterToworker_0_.take());
									}
									monitor.wait();
									break;
								case 8:
									if (box.isPresent() && box.get().getClass() == String.class) {
										monitor.notifyAll();
										state = 10;
										queueFromworker_0_Tomaster.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 10:
									monitor.wait();
									break;
								case 3:
									monitor.wait();
									break;
								case 2:
									if (queueFrommasterToworker_0_.peek() != null && queueFrommasterToworker_0_.peek().getClass() == Object.class) {
										monitor.notifyAll();
										state = 15;
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
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "W", "B" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[0];
	}
	
	@Override
	public int getState(){
		return this.state;
	}
}
