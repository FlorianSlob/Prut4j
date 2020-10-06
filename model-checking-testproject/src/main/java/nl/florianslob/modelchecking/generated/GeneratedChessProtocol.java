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

public class GeneratedChessProtocol implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrombTow = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromwTob = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "w": return new IEnvironment() {
				private boolean wIsActive = true;
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box) throws Exception{
					return this.exchange(box, null);
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver) throws Exception{
					synchronized (monitor){
						while (wIsActive){
							switch (state){
								case 0:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("b") ) ) {
										monitor.notifyAll();
										state = 1;
										queueFromwTob.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 1:
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									if (queueFrombTow.peek() != null ) {
										monitor.notifyAll();
										state = 4;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrombTow.take());
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("b") ) ) {
										monitor.notifyAll();
										state = 1;
										queueFromwTob.put(box.get());
										return Optional.empty();
									}
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("b") ) ) {
										monitor.notifyAll();
										state = 5;
										queueFromwTob.put(box.get());
										return Optional.empty();
									}
									monitor.wait();
									break;
								case 5:
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
					return Optional.empty();
				}
			};
			case "b": return new IEnvironment() {
				private boolean bIsActive = true;
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box) throws Exception{
					return this.exchange(box, null);
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver) throws Exception{
					synchronized (monitor){
						while (bIsActive){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									if (queueFromwTob.peek() != null ) {
										monitor.notifyAll();
										state = 2;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromwTob.take());
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("w") ) ) {
										monitor.notifyAll();
										state = 3;
										queueFrombTow.put(box.get());
										return Optional.empty();
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
									if (queueFromwTob.peek() != null ) {
										monitor.notifyAll();
										state = 6;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromwTob.take());
									}
									monitor.wait();
									break;
								case 6:
									monitor.wait();
									break;
								default: throw new Exception("State number out of bounds");
							}
						}
					}
					
					return Optional.empty();
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "w","b" };
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
