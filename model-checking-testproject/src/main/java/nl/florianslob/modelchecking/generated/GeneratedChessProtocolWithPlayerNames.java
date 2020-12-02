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

public class GeneratedChessProtocolWithPlayerNames implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<ProtocolMessage> aliceQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> bobQueue = new LinkedBlockingQueue<>();
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "alice": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_4(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == String.class ) {
								if (receiver == null) {
									receiver = "bob";
								}
								if (receiver.equals("bob")) {
									setState(2);
									bobQueue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
						case 2:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)aliceQueue.take().Message);
						case 3:
							if (box.isPresent() && box.get().getClass() == String.class ) {
								if (receiver == null) {
									receiver = "bob";
								}
								if (receiver.equals("bob")) {
									setState(1);
									bobQueue.put(new ProtocolMessage(box.get(),5));
									return Optional.empty();
								}
								if (receiver.equals("bob")) {
									setState(2);
									bobQueue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 4){
							Optional result = exchange_0_4(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "bob": return new IEnvironment() {
				private int state = 1;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_4(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
							wait();
							break;
						case 1:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)bobQueue.take().Message);
						case 2:
							if (box.isPresent() && box.get().getClass() == String.class ) {
								if (receiver == null) {
									receiver = "alice";
								}
								if (receiver.equals("alice")) {
									setState(3);
									aliceQueue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = bobQueue.take();
							if (objectToGet.OriginalTargetStateId == 1) {
								setState(2);
								//queueFromaliceTobob);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 5) {
								setState(0);
								//queueFromaliceTobob);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 4){
							Optional result = exchange_0_4(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "bob","alice" };
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
