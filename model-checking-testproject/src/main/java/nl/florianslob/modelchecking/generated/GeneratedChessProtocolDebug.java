/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API

import dto.Move;
import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GeneratedChessProtocolDebug implements IProtocol {
	public volatile int state = 0;
	public final Object monitor = this;
	
	public final BlockingQueue<Object> queueFromBToW = new LinkedBlockingQueue<>();
	public final BlockingQueue<Object> queueFromWToB = new LinkedBlockingQueue<>();
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "B": return new IEnvironment() {
				
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
								case 1:
									if (queueFromWToB.peek() != null && queueFromWToB.peek().getClass() == Move.class) {
										monitor.notifyAll();
										state = 2;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromWToB.take());
									}
									monitor.wait();
									break;
								case 2:
									if (box.isPresent() && box.get().getClass() == Move.class) {
										monitor.notifyAll();
										state = 3;
										queueFromBToW.put(box.get());
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
									if (queueFromWToB.peek() != null && queueFromWToB.peek().getClass() == Move.class) {
										monitor.notifyAll();
										state = 6;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromWToB.take());
									}
									monitor.wait();
									break;
								case 6:
									if (box.isPresent() && box.get().getClass() == Move.class) {
										monitor.notifyAll();
										state = 3;
										queueFromBToW.put(box.get());
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
			case "W": return new IEnvironment() {
				
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
									if (box.isPresent() && box.get().getClass() == Move.class) {
										monitor.notifyAll();
										state = 1;
										queueFromWToB.put(box.get());
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
									if (queueFromBToW.peek() != null && queueFromBToW.peek().getClass() == Move.class) {
										monitor.notifyAll();
										state = 4;
										// Disabling unchecked inspection: We did check the class in the if statement above
										//noinspection unchecked
										return Optional.of((Any)queueFromBToW.take());
									}
									monitor.wait();
									break;
								case 4:
									if (box.isPresent() && box.get().getClass() == Move.class) {
										monitor.notifyAll();
										state = 5;
										queueFromWToB.put(box.get());
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
		// return default object for all types that are used.
		return new Object[]{ new Move() };
	}
	@Override
	public int getState() {
		return this.state;
	}
}
