/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.model.checking.sandbox.protocolcodegeneration.generated;

// Import types from the API
import nl.florianslob.model.checking.sandbox.protocolimplementations.*;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GeneratedChessProtocol implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Move> queueFromWToB = new LinkedBlockingQueue(); 
	private final BlockingQueue<Move> queueFromBToW = new LinkedBlockingQueue(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "W": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public Optional exchange(Optional box) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.notifyAll();
									state = 1;
									queueFromWToB.put((Move)box.get());
									return Optional.empty();
								case 1:
									monitor.wait();
									break;
								case 2:
									monitor.wait();
									break;
								case 3:
									monitor.notifyAll();
									state = 4;
									Move m3 = queueFromBToW.take();
									return Optional.of(m3);
								case 4:
									monitor.notifyAll();
									state = 5;
									queueFromWToB.put((Move)box.get());
									return Optional.empty();
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
			case "B": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				@Override
				public Optional exchange(Optional box) throws Exception{
					synchronized (monitor){
						while (true){
							switch (state){
								case 0:
									monitor.wait();
									break;
								case 1:
									monitor.notifyAll();
									state = 2;
									Move m1 = queueFromWToB.take();
									return Optional.of(m1);
								case 2:
									monitor.notifyAll();
									state = 3;
									queueFromBToW.put((Move)box.get());
									return Optional.empty();
								case 3:
									monitor.wait();
									break;
								case 4:
									monitor.wait();
									break;
								case 5:
									monitor.notifyAll();
									state = 6;
									Move m5 = queueFromWToB.take();
									return Optional.of(m5);
								case 6:
									monitor.notifyAll();
									state = 3;
									queueFromBToW.put((Move)box.get());
									return Optional.empty();
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
	public IProtocol deepClone(){
		return null;
	}
}
