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

public class CGProtocol_strict_n_2 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment masterEnvironment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "master";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_7(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(0);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(2);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(0);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(2);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(0);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(2);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						setState(5);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(5);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 7){
				Optional result = exchange_0_7(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_0_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_0_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(2);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(2);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),11));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_1_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_1_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(1);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(1);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(3);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return masterEnvironment;
			case "worker_0_": return worker_0_Environment;
			case "worker_1_": return worker_1_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "master","worker_0_","worker_1_" };
	}
	
	@Override
	public String getState(){
		return "/" + masterEnvironment.getState() + "/" + worker_0_Environment.getState() + "/" + worker_1_Environment.getState() + "/";
	}
}
