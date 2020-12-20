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

public class StarProtocol implements Pr {
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_2_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment worker_0_Environment = new IEnvironment() {
		private int state = 18;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_29(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(1);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(7);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(1);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(1);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(2);
							worker_1_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(5);
							worker_2_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(15);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(26);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(7);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(6);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(2);
							worker_1_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(5);
							worker_2_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(17);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(27);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(7);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(6);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(6);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(7);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(7);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(7);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(26);
							worker_1_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(27);
							worker_2_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(7);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(6);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(7);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(15);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(17);
							worker_2_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(13);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(1);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(17);
							worker_2_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(15);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(15);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(6);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 16:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(17);
							worker_2_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(15);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(17);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(7);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 18:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(2);
							worker_1_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(5);
							worker_2_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(13);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(19);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(27);
							worker_2_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(26);
							worker_1_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(19);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(1);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 20:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(15);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 22:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(17);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(26);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 24:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(27);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(21);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(17);
							worker_2_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(15);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(25);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(11);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 26:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(26);
							worker_1_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(27);
							worker_2_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(26);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(10);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(6);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(23);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(9);
							worker_2_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(26);
							worker_1_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(27);
							worker_2_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(8);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(27);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(9);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(16);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(20);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(11);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(7);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 28:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(12);
							worker_2_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(4);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(28);
							//queueFromworker_1_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(0);
							//queueFromworker_2_Toworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(1);
							//queueFromworker_2_Toworker_0_);
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
			if (state >=0 && state <= 29){
				Optional result = exchange_0_29(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_1_Environment = new IEnvironment() {
		private int state = 9;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(2);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(5);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(2);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(5);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(5);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(6);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(2);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(5);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(3);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(8);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(2);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(6);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(3);
							worker_0_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(10);
							//queueFromworker_0_Toworker_1_);
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
			if (state >=0 && state <= 11){
				Optional result = exchange_0_11(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_2_Environment = new IEnvironment() {
		private int state = 7;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_2_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_11(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(2);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(8);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(2);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(8);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(2);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(6);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(1);
							worker_0_Queue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(6);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(3);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(5);
							worker_0_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(8);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(2);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == Boolean.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(10);
							worker_0_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(9);
							//queueFromworker_0_Toworker_2_);
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
			case "worker_0_": return worker_0_Environment;
			case "worker_1_": return worker_1_Environment;
			case "worker_2_": return worker_2_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "worker_0_","worker_1_","worker_2_" };
	}
	
	@Override
	public String getState(){
		return "/" + worker_0_Environment.getState() + "/" + worker_1_Environment.getState() + "/" + worker_2_Environment.getState() + "/";
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
