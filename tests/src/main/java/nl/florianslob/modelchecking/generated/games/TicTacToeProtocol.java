/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated.games;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TicTacToeProtocol implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFromplayer_2_Toplayer_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_1_Toplayer_2_ = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "player_1_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				public int getState(){
					return 0;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 3 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(1);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 2:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(1);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 5){
								Optional result = exchange_0_5(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "player_2_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				public int getState(){
					return 0;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
						case 4 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(2);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 1:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_2_.isEmpty()) {
								monitor.notifyAll();
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_2_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.chess.Move.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(2);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 5){
								Optional result = exchange_0_5(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
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
		return new String[] { "player_1_","player_2_" };
	}
	
	@Override
	public String getState(){
		return ""+this.state;
	}
}
