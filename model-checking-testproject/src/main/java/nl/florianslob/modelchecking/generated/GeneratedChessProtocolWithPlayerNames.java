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

public class GeneratedChessProtocolWithPlayerNames implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFromalice2Tobob = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrombobToalice = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromaliceTobob = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "bob": return new IEnvironment() {
				private boolean bobIsActive = true;
				
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
						while (bobIsActive){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									if (queueFromalice2Tobob.peek() != null ) {
										monitor.notifyAll();
										state = 2;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromalice2Tobob.take());
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("alice") ) ) {
										monitor.notifyAll();
										state = 3;
										queueFrombobToalice.put(box.get());
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
									if (queueFromaliceTobob.peek() != null ) {
										monitor.notifyAll();
										state = 6;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromaliceTobob.take());
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
			case "alice2": return new IEnvironment() {
				private boolean alice2IsActive = true;
				
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
						while (alice2IsActive){
							switch (state){
								case 0:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("bob") ) ) {
										monitor.notifyAll();
										state = 1;
										queueFromalice2Tobob.put(box.get());
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
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("bob") ) ) {
										monitor.notifyAll();
										state = 1;
										queueFromalice2Tobob.put(box.get());
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
			case "alice": return new IEnvironment() {
				private boolean aliceIsActive = true;
				
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
						while (aliceIsActive){
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
									if (queueFrombobToalice.peek() != null ) {
										monitor.notifyAll();
										state = 4;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFrombobToalice.take());
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == String.class && (receiver == null || receiver.equals("bob") ) ) {
										monitor.notifyAll();
										state = 5;
										queueFromaliceTobob.put(box.get());
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
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "bob","alice2","alice" };
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
