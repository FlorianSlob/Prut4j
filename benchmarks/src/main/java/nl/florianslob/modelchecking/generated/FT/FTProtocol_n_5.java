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

public class FTProtocol_n_5 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> evolve_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final IEnvironment evolve_0_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "evolve_0_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = evolve_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(4);
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
					}
					throw new NotAllowedTransitionException();
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),14));
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
	private final IEnvironment evolve_1_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "evolve_1_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),33));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = evolve_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(4);
							//queueFrommasterToevolve_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFrommasterToevolve_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),16));
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
	private final IEnvironment evolve_2_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "evolve_2_";
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
							masterQueue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (isCloseAction) {
						setState(0);
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = evolve_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(1);
							//queueFrommasterToevolve_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 39) {
							setState(3);
							//queueFrommasterToevolve_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
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
	private final IEnvironment evolve_3_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "evolve_3_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = evolve_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(2);
							//queueFrommasterToevolve_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(0);
							//queueFrommasterToevolve_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
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
	private final IEnvironment evolve_4_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "evolve_4_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = evolve_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(2);
							//queueFrommasterToevolve_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(4);
							//queueFrommasterToevolve_4_);
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),22));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),57));
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
	private final IEnvironment fft_0_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "fft_0_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = fft_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(2);
							//queueFrommasterTofft_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(2);
							//queueFrommasterTofft_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(3);
							//queueFrommasterTofft_0_);
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
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),92));
							return Optional.empty();
						}
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
							masterQueue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
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
	private final IEnvironment fft_1_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "fft_1_";
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
							masterQueue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = fft_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(1);
							//queueFrommasterTofft_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 84) {
							setState(3);
							//queueFrommasterTofft_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 102) {
							setState(3);
							//queueFrommasterTofft_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),94));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
	private final IEnvironment fft_2_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "fft_2_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = fft_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 43) {
							setState(2);
							//queueFrommasterTofft_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 86) {
							setState(4);
							//queueFrommasterTofft_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 104) {
							setState(4);
							//queueFrommasterTofft_2_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),96));
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
	private final IEnvironment fft_3_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "fft_3_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),98));
							return Optional.empty();
						}
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
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = fft_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(3);
							//queueFrommasterTofft_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 88) {
							setState(2);
							//queueFrommasterTofft_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 106) {
							setState(2);
							//queueFrommasterTofft_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
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
	private final IEnvironment fft_4_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "fft_4_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),100));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = fft_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 59) {
							setState(4);
							//queueFrommasterTofft_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 90) {
							setState(2);
							//queueFrommasterTofft_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),61));
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
	private final IEnvironment masterEnvironment = new IEnvironment() {
		private int state = 0;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_54(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_0_";
						}
						if (receiver.equals("evolve_0_")) {
							setState(2);
							evolve_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_0_";
						}
						if (receiver.equals("fft_0_")) {
							setState(50);
							fft_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_0_";
						}
						if (receiver.equals("fft_0_")) {
							setState(41);
							fft_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_0_";
						}
						if (receiver.equals("evolve_0_")) {
							setState(12);
							evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_1_";
						}
						if (receiver.equals("evolve_1_")) {
							setState(3);
							evolve_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_2_";
						}
						if (receiver.equals("evolve_2_")) {
							setState(4);
							evolve_2_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_3_";
						}
						if (receiver.equals("evolve_3_")) {
							setState(5);
							evolve_3_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_4_";
						}
						if (receiver.equals("evolve_4_")) {
							setState(6);
							evolve_4_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(7);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if(!box.isPresent() && !isCloseAction){
						setState(8);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						setState(9);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						setState(10);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(11);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_0_";
						}
						if (receiver.equals("evolve_0_")) {
							setState(2);
							evolve_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_0_";
						}
						if (receiver.equals("evolve_0_")) {
							setState(12);
							evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_0_";
						}
						if (receiver.equals("fft_0_")) {
							setState(41);
							fft_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_0_";
						}
						if (receiver.equals("fft_0_")) {
							setState(50);
							fft_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "fft_0_";
						}
						if (receiver.equals("fft_0_")) {
							setState(14);
							fft_0_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						setState(15);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_1_";
						}
						if (receiver.equals("evolve_1_")) {
							setState(16);
							evolve_1_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						setState(17);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "fft_1_";
						}
						if (receiver.equals("fft_1_")) {
							setState(18);
							fft_1_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if(!box.isPresent() && !isCloseAction){
						setState(19);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_2_";
						}
						if (receiver.equals("evolve_2_")) {
							setState(20);
							evolve_2_Queue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "fft_2_";
						}
						if (receiver.equals("fft_2_")) {
							setState(22);
							fft_2_Queue.put(new ProtocolMessage(box.get(),43));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if(!box.isPresent() && !isCloseAction){
						setState(23);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_3_";
						}
						if (receiver.equals("evolve_3_")) {
							setState(24);
							evolve_3_Queue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 24:
					if(!box.isPresent() && !isCloseAction){
						setState(25);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "fft_3_";
						}
						if (receiver.equals("fft_3_")) {
							setState(26);
							fft_3_Queue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 26:
					if(!box.isPresent() && !isCloseAction){
						setState(27);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "evolve_4_";
						}
						if (receiver.equals("evolve_4_")) {
							setState(28);
							evolve_4_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 28:
					if(!box.isPresent() && !isCloseAction){
						setState(29);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 29:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "fft_4_";
						}
						if (receiver.equals("fft_4_")) {
							setState(30);
							fft_4_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 30:
					if(!box.isPresent() && !isCloseAction){
						setState(31);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (isCloseAction) {
						setState(32);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (isCloseAction) {
						setState(33);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 33:
					if (isCloseAction) {
						setState(34);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 34:
					if (isCloseAction) {
						setState(35);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 35:
					if (isCloseAction) {
						setState(36);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 36:
					if (isCloseAction) {
						setState(37);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 37:
					if (isCloseAction) {
						setState(38);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 38:
					if (isCloseAction) {
						setState(39);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (isCloseAction) {
						setState(40);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 41:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_1_";
						}
						if (receiver.equals("fft_1_")) {
							setState(42);
							fft_1_Queue.put(new ProtocolMessage(box.get(),84));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 42:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_2_";
						}
						if (receiver.equals("fft_2_")) {
							setState(43);
							fft_2_Queue.put(new ProtocolMessage(box.get(),86));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_3_";
						}
						if (receiver.equals("fft_3_")) {
							setState(44);
							fft_3_Queue.put(new ProtocolMessage(box.get(),88));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
						if (receiver == null) {
							receiver = "fft_4_";
						}
						if (receiver.equals("fft_4_")) {
							setState(45);
							fft_4_Queue.put(new ProtocolMessage(box.get(),90));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 45:
					if(!box.isPresent() && !isCloseAction){
						setState(46);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 46:
					if(!box.isPresent() && !isCloseAction){
						setState(47);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 47:
					if(!box.isPresent() && !isCloseAction){
						setState(48);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 48:
					if(!box.isPresent() && !isCloseAction){
						setState(49);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 49:
					if(!box.isPresent() && !isCloseAction){
						setState(11);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 50:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_1_";
						}
						if (receiver.equals("fft_1_")) {
							setState(51);
							fft_1_Queue.put(new ProtocolMessage(box.get(),102));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_2_";
						}
						if (receiver.equals("fft_2_")) {
							setState(52);
							fft_2_Queue.put(new ProtocolMessage(box.get(),104));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 52:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_3_";
						}
						if (receiver.equals("fft_3_")) {
							setState(53);
							fft_3_Queue.put(new ProtocolMessage(box.get(),106));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 53:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
						if (receiver == null) {
							receiver = "fft_4_";
						}
						if (receiver.equals("fft_4_")) {
							setState(45);
							fft_4_Queue.put(new ProtocolMessage(box.get(),90));
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
			if (state >=0 && state <= 54){
				Optional result = exchange_0_54(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return evolve_0_Environment;
			case "evolve_1_": return evolve_1_Environment;
			case "evolve_2_": return evolve_2_Environment;
			case "evolve_3_": return evolve_3_Environment;
			case "evolve_4_": return evolve_4_Environment;
			case "fft_0_": return fft_0_Environment;
			case "fft_1_": return fft_1_Environment;
			case "fft_2_": return fft_2_Environment;
			case "fft_3_": return fft_3_Environment;
			case "fft_4_": return fft_4_Environment;
			case "master": return masterEnvironment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "evolve_2_","fft_1_","evolve_1_","evolve_3_","fft_3_","fft_2_","evolve_0_","fft_4_","master","evolve_4_","fft_0_" };
	}
	
	@Override
	public String getState(){
		return "/" + evolve_0_Environment.getState() + "/" + evolve_1_Environment.getState() + "/" + evolve_2_Environment.getState() + "/" + evolve_3_Environment.getState() + "/" + evolve_4_Environment.getState() + "/" + fft_0_Environment.getState() + "/" + fft_1_Environment.getState() + "/" + fft_2_Environment.getState() + "/" + fft_3_Environment.getState() + "/" + fft_4_Environment.getState() + "/" + masterEnvironment.getState() + "/";
	}
}
