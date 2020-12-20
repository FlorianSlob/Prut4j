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

public class GoFishProtocol implements Pr {
	private final BlockingQueue<ProtocolMessage> dealerQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> player_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> player_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> player_2_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment dealerEnvironment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "dealer";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(3);
							String[] receiverOptionsArray = new String[]{ "player_0_","player_2_","player_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(4);
							player_2_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(8);
							player_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(8);
							player_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(8);
							player_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = dealerQueue.take();
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(1);
							//queueFromplayer_0_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(2);
							//queueFromplayer_0_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 70) {
							setState(7);
							//queueFromplayer_0_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = dealerQueue.take();
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(1);
							//queueFromplayer_2_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 53) {
							setState(5);
							//queueFromplayer_2_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(10);
							//queueFromplayer_2_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(3);
							player_2_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(3);
							player_2_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(4);
							player_1_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(4);
							player_1_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(4);
							player_0_Queue.put(new ProtocolMessage(box.get(),72));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(4);
							player_0_Queue.put(new ProtocolMessage(box.get(),72));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = dealerQueue.take();
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(1);
							//queueFromplayer_1_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(9);
							//queueFromplayer_1_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 38) {
							setState(6);
							//queueFromplayer_1_Todealer);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(8);
							player_2_Queue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(8);
							player_2_Queue.put(new ProtocolMessage(box.get(),64));
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
			if (state >=0 && state <= 11){
				Optional result = exchange_0_11(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment player_0_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "player_0_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_17(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 57) {
							setState(4);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 67) {
							setState(9);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 68) {
							setState(5);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(14);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(11);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(4);
							//queueFromdealerToplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(14);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(11);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Ask.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_2_","player_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_2_")) {
							setState(0);
							player_2_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(16);
							player_1_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(6);
							dealerQueue.put(new ProtocolMessage(box.get(),70));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(8);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(2);
							player_2_Queue.put(new ProtocolMessage(box.get(),48));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(1);
							dealerQueue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(12);
							dealerQueue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(15);
							player_2_Queue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(1);
							player_2_Queue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(2);
							player_2_Queue.put(new ProtocolMessage(box.get(),48));
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
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(2);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(7);
							player_1_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(1);
							player_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(2);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 15:
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(9);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(4);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(10);
							//queueFromplayer_1_Toplayer_0_);
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
			if (state >=0 && state <= 17){
				Optional result = exchange_0_17(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment player_1_Environment = new IEnvironment() {
		private int state = 11;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "player_1_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_17(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(9);
							player_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						setState(12);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(12);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(13);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(15);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(6);
							dealerQueue.put(new ProtocolMessage(box.get(),38));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(0);
							player_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("player_0_")) {
							setState(9);
							player_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(10);
							player_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(8);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(13);
							//queueFromplayer_2_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(12);
							//queueFromplayer_2_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(4);
							//queueFromplayer_2_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(5);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(14);
							//queueFromplayer_2_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(12);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 11:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(12);
							//queueFromdealerToplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(5);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(14);
							//queueFromplayer_2_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Ask.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_0_","player_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(7);
							player_2_Queue.put(new ProtocolMessage(box.get(),22));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(0);
							dealerQueue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(0);
							player_2_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(2);
							player_2_Queue.put(new ProtocolMessage(box.get(),60));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(16);
							dealerQueue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 17){
				Optional result = exchange_0_17(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment player_2_Environment = new IEnvironment() {
		private int state = 16;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "player_2_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_17(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(14);
							player_1_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(0);
							player_1_Queue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(6);
							player_1_Queue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 42) {
							setState(7);
							//queueFromplayer_1_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 59) {
							setState(10);
							//queueFromplayer_1_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 60) {
							setState(15);
							//queueFromplayer_1_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(14);
							player_1_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Card.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(0);
							player_0_Queue.put(new ProtocolMessage(box.get(),67));
							return Optional.empty();
						}
						if (receiver.equals("player_0_")) {
							setState(14);
							player_0_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Go.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(9);
							player_0_Queue.put(new ProtocolMessage(box.get(),68));
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
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Ask.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_1_","player_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("player_0_")) {
							setState(8);
							player_0_Queue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(10);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 48) {
							setState(7);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 49) {
							setState(11);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						setState(7);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.OutOfCards.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(0);
							dealerQueue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(12);
							dealerQueue.put(new ProtocolMessage(box.get(),53));
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
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Turn.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(14);
							player_0_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(5);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 22) {
							setState(2);
							//queueFromplayer_1_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.gofish.Fish.class ) {
						if (receiver == null) {
							receiver = "dealer";
						}
						if (receiver.equals("dealer")) {
							setState(1);
							dealerQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(7);
							//queueFromdealerToplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(5);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 22) {
							setState(2);
							//queueFromplayer_1_Toplayer_2_);
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
			if (state >=0 && state <= 17){
				Optional result = exchange_0_17(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "dealer": return dealerEnvironment;
			case "player_0_": return player_0_Environment;
			case "player_1_": return player_1_Environment;
			case "player_2_": return player_2_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "player_2_","dealer","player_1_","player_0_" };
	}
	
	@Override
	public String getState(){
		return "/" + dealerEnvironment.getState() + "/" + player_0_Environment.getState() + "/" + player_1_Environment.getState() + "/" + player_2_Environment.getState() + "/";
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
