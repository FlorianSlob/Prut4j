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

public class RockPaperScissorsOptimizedProtocol implements Pr {
	private final BlockingQueue<ProtocolMessage> player_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> player_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> player_2_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment player_0_Environment = new IEnvironment() {
		private int state = 0;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(7);
							player_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(2);
							player_1_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(6);
							player_1_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_2_","player_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(6);
							player_1_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_1_","player_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(7);
							player_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "player_1_","player_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("player_1_")) {
							setState(2);
							player_1_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(4);
							player_2_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						setState(5);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(8);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(8);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromplayer_1_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(3);
							player_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(4);
							player_2_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(4);
							player_2_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(1);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(1);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(1);
							//queueFromplayer_2_Toplayer_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						setState(10);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_0_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(9);
							player_2_Queue.put(new ProtocolMessage(box.get(),20));
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
	private final IEnvironment player_1_Environment = new IEnvironment() {
		private int state = 5;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if(!box.isPresent() && !isCloseAction){
						setState(9);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(1);
							player_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						setState(7);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_1_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(1);
							player_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(8);
							player_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(2);
							player_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(4);
							player_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(1);
							player_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_2_";
						}
						if (receiver.equals("player_2_")) {
							setState(10);
							player_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(6);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(7);
							//queueFromplayer_0_Toplayer_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(0);
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
			if (state >=0 && state <= 11){
				Optional result = exchange_0_11(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment player_2_Environment = new IEnvironment() {
		private int state = 4;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(9);
							player_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(9);
							player_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(9);
							player_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						setState(7);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						setState(6);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 5:
					if(!box.isPresent() && !isCloseAction){
						setState(10);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(8);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)player_2_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(3);
							player_0_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(0);
							player_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(1);
							player_0_Queue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_0_";
						}
						if (receiver.equals("player_0_")) {
							setState(2);
							player_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = player_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(6);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(7);
							//queueFromplayer_0_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(10);
							//queueFromplayer_1_Toplayer_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(5);
							player_1_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(5);
							player_1_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
						if (receiver == null) {
							receiver = "player_1_";
						}
						if (receiver.equals("player_1_")) {
							setState(5);
							player_1_Queue.put(new ProtocolMessage(box.get(),31));
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
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "player_0_": return player_0_Environment;
			case "player_1_": return player_1_Environment;
			case "player_2_": return player_2_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "player_0_","player_1_","player_2_" };
	}
	
	@Override
	public String getState(){
		return "/" + player_0_Environment.getState() + "/" + player_1_Environment.getState() + "/" + player_2_Environment.getState() + "/";
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
