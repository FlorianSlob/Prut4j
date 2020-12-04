/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated;

// Import types from the API

import nl.florianslob.modelchecking.base.api.v2.IEnvironment;
import nl.florianslob.modelchecking.base.api.v2.IProtocol;
import nl.florianslob.modelchecking.base.api.v2.NotAllowedTransitionException;
import nl.florianslob.modelchecking.base.api.v2.ProtocolMessage;

import java.util.Optional;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GeneratedChessProtocolCopy implements IProtocol {



	private final BlockingQueue<ProtocolMessage> bQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> wQueue = new LinkedBlockingQueue<>();
	private final IEnvironment bEnvironment = new IEnvironment() {
		public int getState(){
			return state;
		}

		private int state = 0;

		public void setState(int newState){
			state = newState;
		}

		@Override
		public String getName(){
			return "b";
		}

		public <Any, AnyInput> Optional<Any> exchange_0_2(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if(!box.isPresent()) // It must be a receive action to try this
					{
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any) bQueue.take().Message);
					}else{
						throw new NotAllowedTransitionException();
					}
				case 1:
					if (box.isPresent() && box.get().getClass() == String.class ) {
						if (receiver == null) {
							receiver = "w";
						}
						if (receiver.equals("w")) {
							setState(0);
							wQueue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
			}
			return null;
		}

		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
				if (state >=0 && state <= 2){
					Optional result = exchange_0_2(box, receiver, isCloseAction);
					if(result != null)
						return (Optional<Any>) result;
				}
				return null;
		}
	};
	private final IEnvironment wEnvironment = new IEnvironment() {
		private int state = 0;

		public int getState(){
			return state;
		}

		public void setState(int newState){
			state = newState;
		}

		@Override
		public String getName(){
			return "w";
		}

		public <Any, AnyInput> Optional<Any> exchange_0_3(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == String.class ) {
						if (receiver == null) {
							receiver = "b";
						}
						if (receiver.equals("b")) {
							setState(1);
							bQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
				case 1:
					if(!box.isPresent()) // It must be a receive action to try this
					{
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any) wQueue.take().Message);
					}else{
						throw new NotAllowedTransitionException();
					}
				case 2:
					if (box.isPresent() && box.get().getClass() == String.class ) {
						if (receiver == null) {
							receiver = "b";
						}
						if (receiver.equals("b")) {
							setState(1);
							bQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
			}
			return null;
		}

		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
				if (state >=0 && state <= 3){
					Optional result = exchange_0_3(box, receiver, isCloseAction);
					if(result != null)
						return (Optional<Any>) result;
				}
			throw new NotAllowedTransitionException();
		}
	};
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "b": return bEnvironment;
			case "w": return wEnvironment;
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
	public String getState(){
		return this.bEnvironment.getState() + "-" + this.wEnvironment.getState();
	}
}
