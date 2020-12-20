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

public class ChessProtocol implements Pr {
	private final BlockingQueue<ProtocolMessage> blackQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> whiteQueue = new LinkedBlockingQueue<>();
	private final IEnvironment blackEnvironment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "black";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_2(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)blackQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
						if (receiver == null) {
							receiver = "white";
						}
						if (receiver.equals("white")) {
							setState(0);
							whiteQueue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
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
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment whiteEnvironment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "white";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_3(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
						if (receiver == null) {
							receiver = "black";
						}
						if (receiver.equals("black")) {
							setState(1);
							blackQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if(!box.isPresent() && !isCloseAction){
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)whiteQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
						if (receiver == null) {
							receiver = "black";
						}
						if (receiver.equals("black")) {
							setState(1);
							blackQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
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
			case "black": return blackEnvironment;
			case "white": return whiteEnvironment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "white","black" };
	}
	
	@Override
	public String getState(){
		return "/" + blackEnvironment.getState() + "/" + whiteEnvironment.getState() + "/";
	}
	
	@Override
	public <Any> void send(String threadName, Any m, String receiver) throws Exception{
		getEnvironment(threadName).send(m,receiver);
	}
	
	@Override
	public <Any> void send(String threadName, Any m) throws Exception{
		getEnvironment(threadName).send(m);
	}
	
	@Override
	public <Any> Any recv(String threadName) throws Exception{
		return getEnvironment(threadName).receive();
	}
	
	@Override
	public void close(String threadName) throws Exception{
		getEnvironment(threadName).close();
	}
}
