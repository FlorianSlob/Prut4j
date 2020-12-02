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

public class FTProtocol_n_2 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<ProtocolMessage> evolve_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return new IEnvironment() {
				private int state = 1;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
							wait();
							break;
						case 1:
							ProtocolMessage objectToGet = evolve_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 1) {
								setState(2);
								//queueFrommasterToevolve_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 4) {
								setState(3);
								//queueFrommasterToevolve_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),8));
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),13));
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "evolve_1_": return new IEnvironment() {
				private int state = 2;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
							wait();
							break;
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),21));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = evolve_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 6) {
								setState(3);
								//queueFrommasterToevolve_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 19) {
								setState(1);
								//queueFrommasterToevolve_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),10));
									return Optional.empty();
								}
							}
						case 4:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "fft_0_": return new IEnvironment() {
				private int state = 3;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),17));
									return Optional.empty();
								}
							}
						case 1:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = fft_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 2) {
								setState(4);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 3) {
								setState(4);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 15) {
								setState(0);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),38));
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "fft_1_": return new IEnvironment() {
				private int state = 4;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
							wait();
							break;
						case 1:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),40));
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),25));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 23) {
								setState(3);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 36) {
								setState(2);
								//queueFrommasterTofft_1_);
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
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "master": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_21(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(10);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(7);
									fft_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(3);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(2);
									fft_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(4);
									fft_1_Queue.put(new ProtocolMessage(box.get(),36));
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(5);
									evolve_1_Queue.put(new ProtocolMessage(box.get(),6));
									return Optional.empty();
								}
							}
						case 4:
							setState(6);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 5:
							setState(8);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 6:
							setState(9);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(4);
									fft_1_Queue.put(new ProtocolMessage(box.get(),36));
									return Optional.empty();
								}
							}
						case 8:
							setState(9);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(7);
									fft_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(3);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(10);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(2);
									fft_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
						case 10:
							setState(11);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(12);
									fft_0_Queue.put(new ProtocolMessage(box.get(),15));
									return Optional.empty();
								}
							}
						case 12:
							setState(13);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(14);
									evolve_1_Queue.put(new ProtocolMessage(box.get(),19));
									return Optional.empty();
								}
							}
						case 14:
							setState(15);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(16);
									fft_1_Queue.put(new ProtocolMessage(box.get(),23));
									return Optional.empty();
								}
							}
						case 16:
							setState(17);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 17:
							if (isCloseAction) {
								setState(18);
								return Optional.empty();
							}
						case 18:
							if (isCloseAction) {
								setState(19);
								return Optional.empty();
							}
						case 19:
							if (isCloseAction) {
								setState(20);
								return Optional.empty();
							}
						case 20:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 21){
							Optional result = exchange_0_21(box, receiver, isCloseAction);
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
		return new String[] { "master","evolve_0_","fft_0_","fft_1_","evolve_1_" };
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
