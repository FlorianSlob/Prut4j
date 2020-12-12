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

public class CGProtocol_strict_n_20 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_18_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_19_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_9_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment masterEnvironment = new IEnvironment() {
		private int state = 23;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_25(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_17_","worker_11_","worker_12_","worker_5_","worker_14_","worker_18_","worker_7_","worker_9_","worker_19_","worker_6_","worker_4_","worker_16_","worker_13_","worker_1_","worker_10_","worker_0_","worker_3_","worker_8_","worker_15_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(4);
							worker_2_Queue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(19);
							worker_17_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(9);
							worker_11_Queue.put(new ProtocolMessage(box.get(),48));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(11);
							worker_12_Queue.put(new ProtocolMessage(box.get(),50));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(8);
							worker_5_Queue.put(new ProtocolMessage(box.get(),46));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(15);
							worker_14_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(20);
							worker_18_Queue.put(new ProtocolMessage(box.get(),60));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(12);
							worker_7_Queue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(16);
							worker_9_Queue.put(new ProtocolMessage(box.get(),56));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(21);
							worker_19_Queue.put(new ProtocolMessage(box.get(),61));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(10);
							worker_6_Queue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(6);
							worker_4_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(18);
							worker_16_Queue.put(new ProtocolMessage(box.get(),58));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(13);
							worker_13_Queue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(3);
							worker_1_Queue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
						if (receiver.equals("worker_10_")) {
							setState(7);
							worker_10_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(5);
							worker_3_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(14);
							worker_8_Queue.put(new ProtocolMessage(box.get(),54));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(17);
							worker_15_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
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
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 5:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 7:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 11:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 12:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 15:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 17:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 18:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 19:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 20:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 21:
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 22:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_10_","worker_19_","worker_13_","worker_12_","worker_16_","worker_5_","worker_11_","worker_18_","worker_4_","worker_14_","worker_15_","worker_17_","worker_0_","worker_2_","worker_6_","worker_1_","worker_3_","worker_8_","worker_7_","worker_9_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_10_")) {
							setState(24);
							worker_10_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(24);
							worker_19_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(24);
							worker_13_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(24);
							worker_12_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(24);
							worker_16_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(24);
							worker_5_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(24);
							worker_11_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(24);
							worker_18_Queue.put(new ProtocolMessage(box.get(),30));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(24);
							worker_4_Queue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(24);
							worker_14_Queue.put(new ProtocolMessage(box.get(),22));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(24);
							worker_15_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(24);
							worker_17_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(24);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(24);
							worker_6_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(24);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(24);
							worker_3_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(24);
							worker_8_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(24);
							worker_7_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(24);
							worker_9_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_8_","worker_13_","worker_15_","worker_19_","worker_16_","worker_1_","worker_12_","worker_9_","worker_7_","worker_18_","worker_14_","worker_3_","worker_17_","worker_2_","worker_5_","worker_6_","worker_0_","worker_11_","worker_4_","worker_10_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_8_")) {
							setState(14);
							worker_8_Queue.put(new ProtocolMessage(box.get(),54));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(13);
							worker_13_Queue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(17);
							worker_15_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(21);
							worker_19_Queue.put(new ProtocolMessage(box.get(),61));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(18);
							worker_16_Queue.put(new ProtocolMessage(box.get(),58));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(3);
							worker_1_Queue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(11);
							worker_12_Queue.put(new ProtocolMessage(box.get(),50));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(16);
							worker_9_Queue.put(new ProtocolMessage(box.get(),56));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(12);
							worker_7_Queue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(20);
							worker_18_Queue.put(new ProtocolMessage(box.get(),60));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(15);
							worker_14_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(5);
							worker_3_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(19);
							worker_17_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(4);
							worker_2_Queue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(8);
							worker_5_Queue.put(new ProtocolMessage(box.get(),46));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(10);
							worker_6_Queue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(9);
							worker_11_Queue.put(new ProtocolMessage(box.get(),48));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(6);
							worker_4_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_10_")) {
							setState(7);
							worker_10_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(22);
							//queueFromworker_8_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(22);
							//queueFromworker_7_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(22);
							//queueFromworker_6_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(22);
							//queueFromworker_5_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(22);
							//queueFromworker_4_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(22);
							//queueFromworker_3_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(22);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(22);
							//queueFromworker_19_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 33) {
							setState(22);
							//queueFromworker_18_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(22);
							//queueFromworker_17_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(22);
							//queueFromworker_16_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 38) {
							setState(22);
							//queueFromworker_15_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 41) {
							setState(22);
							//queueFromworker_14_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 43) {
							setState(22);
							//queueFromworker_13_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_12_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(22);
							//queueFromworker_11_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 52) {
							setState(22);
							//queueFromworker_10_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(22);
							//queueFromworker_9_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_11_","worker_17_","worker_2_","worker_14_","worker_0_","worker_9_","worker_19_","worker_1_","worker_13_","worker_10_","worker_4_","worker_5_","worker_15_","worker_3_","worker_8_","worker_18_","worker_7_","worker_6_","worker_16_","worker_12_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_11_")) {
							setState(24);
							worker_11_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(24);
							worker_17_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(24);
							worker_14_Queue.put(new ProtocolMessage(box.get(),22));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(24);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(24);
							worker_9_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(24);
							worker_19_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(24);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(24);
							worker_13_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_10_")) {
							setState(24);
							worker_10_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(24);
							worker_4_Queue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(24);
							worker_5_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(24);
							worker_15_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(24);
							worker_3_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(24);
							worker_8_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(24);
							worker_18_Queue.put(new ProtocolMessage(box.get(),30));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(24);
							worker_7_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(24);
							worker_6_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(24);
							worker_16_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(24);
							worker_12_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_10_","worker_17_","worker_0_","worker_13_","worker_5_","worker_16_","worker_19_","worker_1_","worker_4_","worker_15_","worker_7_","worker_12_","worker_9_","worker_6_","worker_8_","worker_11_","worker_2_","worker_3_","worker_14_","worker_18_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_10_")) {
							setState(7);
							worker_10_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(19);
							worker_17_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(13);
							worker_13_Queue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(8);
							worker_5_Queue.put(new ProtocolMessage(box.get(),46));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(18);
							worker_16_Queue.put(new ProtocolMessage(box.get(),58));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(21);
							worker_19_Queue.put(new ProtocolMessage(box.get(),61));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(3);
							worker_1_Queue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(6);
							worker_4_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(17);
							worker_15_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(12);
							worker_7_Queue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(11);
							worker_12_Queue.put(new ProtocolMessage(box.get(),50));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(16);
							worker_9_Queue.put(new ProtocolMessage(box.get(),56));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(10);
							worker_6_Queue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(14);
							worker_8_Queue.put(new ProtocolMessage(box.get(),54));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(9);
							worker_11_Queue.put(new ProtocolMessage(box.get(),48));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(4);
							worker_2_Queue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(5);
							worker_3_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(15);
							worker_14_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(20);
							worker_18_Queue.put(new ProtocolMessage(box.get(),60));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(22);
							//queueFromworker_8_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(22);
							//queueFromworker_7_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(22);
							//queueFromworker_6_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(22);
							//queueFromworker_5_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(22);
							//queueFromworker_4_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(22);
							//queueFromworker_3_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(22);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(22);
							//queueFromworker_19_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 33) {
							setState(22);
							//queueFromworker_18_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(22);
							//queueFromworker_17_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(22);
							//queueFromworker_16_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 38) {
							setState(22);
							//queueFromworker_15_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 41) {
							setState(22);
							//queueFromworker_14_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 43) {
							setState(22);
							//queueFromworker_13_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_12_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(22);
							//queueFromworker_11_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 52) {
							setState(22);
							//queueFromworker_10_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(22);
							//queueFromworker_9_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 24:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_3_","worker_15_","worker_1_","worker_5_","worker_7_","worker_13_","worker_10_","worker_12_","worker_14_","worker_8_","worker_19_","worker_4_","worker_18_","worker_11_","worker_0_","worker_17_","worker_6_","worker_2_","worker_9_","worker_16_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_3_")) {
							setState(24);
							worker_3_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(24);
							worker_15_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(24);
							worker_1_Queue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(24);
							worker_5_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(24);
							worker_7_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(24);
							worker_13_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("worker_10_")) {
							setState(24);
							worker_10_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("worker_12_")) {
							setState(24);
							worker_12_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(24);
							worker_14_Queue.put(new ProtocolMessage(box.get(),22));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(24);
							worker_8_Queue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(24);
							worker_19_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(24);
							worker_4_Queue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(24);
							worker_18_Queue.put(new ProtocolMessage(box.get(),30));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(24);
							worker_11_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(24);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(24);
							worker_17_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(24);
							worker_6_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(24);
							worker_9_Queue.put(new ProtocolMessage(box.get(),28));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(24);
							worker_16_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(20);
							String[] receiverOptionsArray = new String[]{ "worker_12_","worker_18_","worker_6_","worker_8_","worker_14_","worker_13_","worker_17_","worker_7_","worker_3_","worker_10_","worker_19_","worker_5_","worker_2_","worker_9_","worker_1_","worker_15_","worker_0_","worker_4_","worker_11_","worker_16_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_12_")) {
							setState(11);
							worker_12_Queue.put(new ProtocolMessage(box.get(),50));
							return Optional.empty();
						}
						if (receiver.equals("worker_18_")) {
							setState(20);
							worker_18_Queue.put(new ProtocolMessage(box.get(),60));
							return Optional.empty();
						}
						if (receiver.equals("worker_6_")) {
							setState(10);
							worker_6_Queue.put(new ProtocolMessage(box.get(),49));
							return Optional.empty();
						}
						if (receiver.equals("worker_8_")) {
							setState(14);
							worker_8_Queue.put(new ProtocolMessage(box.get(),54));
							return Optional.empty();
						}
						if (receiver.equals("worker_14_")) {
							setState(15);
							worker_14_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
						if (receiver.equals("worker_13_")) {
							setState(13);
							worker_13_Queue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
						if (receiver.equals("worker_17_")) {
							setState(19);
							worker_17_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
						if (receiver.equals("worker_7_")) {
							setState(12);
							worker_7_Queue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("worker_3_")) {
							setState(5);
							worker_3_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_10_")) {
							setState(7);
							worker_10_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("worker_19_")) {
							setState(21);
							worker_19_Queue.put(new ProtocolMessage(box.get(),61));
							return Optional.empty();
						}
						if (receiver.equals("worker_5_")) {
							setState(8);
							worker_5_Queue.put(new ProtocolMessage(box.get(),46));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(4);
							worker_2_Queue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
						if (receiver.equals("worker_9_")) {
							setState(16);
							worker_9_Queue.put(new ProtocolMessage(box.get(),56));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(3);
							worker_1_Queue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
						if (receiver.equals("worker_15_")) {
							setState(17);
							worker_15_Queue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(0);
							worker_0_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("worker_4_")) {
							setState(6);
							worker_4_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_11_")) {
							setState(9);
							worker_11_Queue.put(new ProtocolMessage(box.get(),48));
							return Optional.empty();
						}
						if (receiver.equals("worker_16_")) {
							setState(18);
							worker_16_Queue.put(new ProtocolMessage(box.get(),58));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(22);
							//queueFromworker_8_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(22);
							//queueFromworker_7_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(22);
							//queueFromworker_6_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(22);
							//queueFromworker_5_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(22);
							//queueFromworker_4_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(22);
							//queueFromworker_3_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(22);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(22);
							//queueFromworker_19_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 33) {
							setState(22);
							//queueFromworker_18_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 34) {
							setState(22);
							//queueFromworker_17_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(22);
							//queueFromworker_16_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 38) {
							setState(22);
							//queueFromworker_15_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 41) {
							setState(22);
							//queueFromworker_14_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 43) {
							setState(22);
							//queueFromworker_13_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_12_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(22);
							//queueFromworker_11_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 52) {
							setState(22);
							//queueFromworker_10_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(22);
							//queueFromworker_9_Tomaster);
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
			if (state >=0 && state <= 25){
				Optional result = exchange_0_25(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_0_Environment = new IEnvironment() {
		private int state = 0;
		
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(1);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(2);
							//queueFrommasterToworker_0_);
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
							masterQueue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(1);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(2);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),66));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
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
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_0_Queue.take().Message);
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
	private final IEnvironment worker_10_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_10_";
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
							masterQueue.put(new ProtocolMessage(box.get(),52));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(1);
							//queueFrommasterToworker_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(4);
							//queueFrommasterToworker_10_);
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
							masterQueue.put(new ProtocolMessage(box.get(),52));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(1);
							//queueFrommasterToworker_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(4);
							//queueFrommasterToworker_10_);
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
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_10_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),77));
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
	private final IEnvironment worker_11_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_11_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),81));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFrommasterToworker_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 48) {
							setState(0);
							//queueFrommasterToworker_11_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFrommasterToworker_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 48) {
							setState(0);
							//queueFrommasterToworker_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(0);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_11_Queue.take().Message);
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
	private final IEnvironment worker_12_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_12_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),85));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFrommasterToworker_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 50) {
							setState(1);
							//queueFrommasterToworker_12_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(3);
							//queueFrommasterToworker_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 50) {
							setState(1);
							//queueFrommasterToworker_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_12_Queue.take().Message);
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
	private final IEnvironment worker_13_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_13_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),43));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(2);
							//queueFrommasterToworker_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 53) {
							setState(3);
							//queueFrommasterToworker_13_);
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),43));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(2);
							//queueFrommasterToworker_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 53) {
							setState(3);
							//queueFrommasterToworker_13_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),89));
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
						setState(3);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_13_Queue.take().Message);
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
	private final IEnvironment worker_14_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_14_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_14_Queue.take().Message);
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 22) {
							setState(3);
							//queueFrommasterToworker_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(4);
							//queueFrommasterToworker_14_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 22) {
							setState(3);
							//queueFrommasterToworker_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(4);
							//queueFrommasterToworker_14_);
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
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),93));
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
	private final IEnvironment worker_15_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_15_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),97));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
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
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(0);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_15_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),38));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_15_Queue.take();
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(4);
							//queueFrommasterToworker_15_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 57) {
							setState(0);
							//queueFrommasterToworker_15_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),38));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_15_Queue.take();
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(4);
							//queueFrommasterToworker_15_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 57) {
							setState(0);
							//queueFrommasterToworker_15_);
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
	private final IEnvironment worker_16_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_16_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),99));
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
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_16_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_16_Queue.take();
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(4);
							//queueFrommasterToworker_16_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 58) {
							setState(1);
							//queueFrommasterToworker_16_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_16_Queue.take();
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(4);
							//queueFrommasterToworker_16_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 58) {
							setState(1);
							//queueFrommasterToworker_16_);
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
	private final IEnvironment worker_17_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_17_";
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
							masterQueue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_17_Queue.take();
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(1);
							//queueFrommasterToworker_17_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 59) {
							setState(3);
							//queueFrommasterToworker_17_);
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
							masterQueue.put(new ProtocolMessage(box.get(),34));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_17_Queue.take();
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(1);
							//queueFrommasterToworker_17_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 59) {
							setState(3);
							//queueFrommasterToworker_17_);
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
							masterQueue.put(new ProtocolMessage(box.get(),101));
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
						return Optional.of((Any)worker_17_Queue.take().Message);
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
	private final IEnvironment worker_18_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_18_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
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
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_18_Queue.take();
						if (objectToGet.OriginalTargetStateId == 30) {
							setState(2);
							//queueFrommasterToworker_18_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 60) {
							setState(3);
							//queueFrommasterToworker_18_);
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
							masterQueue.put(new ProtocolMessage(box.get(),33));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_18_Queue.take();
						if (objectToGet.OriginalTargetStateId == 30) {
							setState(2);
							//queueFrommasterToworker_18_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 60) {
							setState(3);
							//queueFrommasterToworker_18_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),103));
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
						setState(3);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_18_Queue.take().Message);
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
	private final IEnvironment worker_19_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_19_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_19_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(2);
							//queueFrommasterToworker_19_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 61) {
							setState(4);
							//queueFrommasterToworker_19_);
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
							masterQueue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_19_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(2);
							//queueFrommasterToworker_19_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 61) {
							setState(4);
							//queueFrommasterToworker_19_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_19_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),105));
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
		private int state = 2;
		
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
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),69));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 37) {
							setState(1);
							//queueFrommasterToworker_1_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 37) {
							setState(1);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(1);
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
	private final IEnvironment worker_2_Environment = new IEnvironment() {
		private int state = 3;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_2_Queue.take().Message);
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),71));
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
							masterQueue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(4);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 39) {
							setState(2);
							//queueFrommasterToworker_2_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(4);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 39) {
							setState(2);
							//queueFrommasterToworker_2_);
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
	private final IEnvironment worker_3_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_3_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_3_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),73));
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
							masterQueue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(4);
							//queueFrommasterToworker_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 40) {
							setState(2);
							//queueFrommasterToworker_3_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(4);
							//queueFrommasterToworker_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 40) {
							setState(2);
							//queueFrommasterToworker_3_);
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
	private final IEnvironment worker_4_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_4_";
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
							masterQueue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(1);
							//queueFrommasterToworker_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 42) {
							setState(4);
							//queueFrommasterToworker_4_);
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
							masterQueue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(1);
							//queueFrommasterToworker_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 42) {
							setState(4);
							//queueFrommasterToworker_4_);
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
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_4_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),75));
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
	private final IEnvironment worker_5_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_5_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_5_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(3);
							//queueFrommasterToworker_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 46) {
							setState(4);
							//queueFrommasterToworker_5_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(3);
							//queueFrommasterToworker_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 46) {
							setState(4);
							//queueFrommasterToworker_5_);
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
							masterQueue.put(new ProtocolMessage(box.get(),79));
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
	private final IEnvironment worker_6_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_6_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),83));
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
						setState(1);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_6_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(4);
							//queueFrommasterToworker_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 49) {
							setState(1);
							//queueFrommasterToworker_6_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(4);
							//queueFrommasterToworker_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 49) {
							setState(1);
							//queueFrommasterToworker_6_);
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
	private final IEnvironment worker_7_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_7_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(2);
							//queueFrommasterToworker_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(3);
							//queueFrommasterToworker_7_);
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
							masterQueue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(2);
							//queueFrommasterToworker_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(3);
							//queueFrommasterToworker_7_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),87));
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
						setState(3);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_7_Queue.take().Message);
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
	private final IEnvironment worker_8_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_8_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_8_Queue.take().Message);
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(3);
							//queueFrommasterToworker_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 54) {
							setState(4);
							//queueFrommasterToworker_8_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 26) {
							setState(3);
							//queueFrommasterToworker_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 54) {
							setState(4);
							//queueFrommasterToworker_8_);
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
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),91));
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
	private final IEnvironment worker_9_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "worker_9_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)worker_9_Queue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 28) {
							setState(3);
							//queueFrommasterToworker_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 56) {
							setState(4);
							//queueFrommasterToworker_9_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 28) {
							setState(3);
							//queueFrommasterToworker_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 56) {
							setState(4);
							//queueFrommasterToworker_9_);
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
							masterQueue.put(new ProtocolMessage(box.get(),95));
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
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "master": return masterEnvironment;
			case "worker_0_": return worker_0_Environment;
			case "worker_10_": return worker_10_Environment;
			case "worker_11_": return worker_11_Environment;
			case "worker_12_": return worker_12_Environment;
			case "worker_13_": return worker_13_Environment;
			case "worker_14_": return worker_14_Environment;
			case "worker_15_": return worker_15_Environment;
			case "worker_16_": return worker_16_Environment;
			case "worker_17_": return worker_17_Environment;
			case "worker_18_": return worker_18_Environment;
			case "worker_19_": return worker_19_Environment;
			case "worker_1_": return worker_1_Environment;
			case "worker_2_": return worker_2_Environment;
			case "worker_3_": return worker_3_Environment;
			case "worker_4_": return worker_4_Environment;
			case "worker_5_": return worker_5_Environment;
			case "worker_6_": return worker_6_Environment;
			case "worker_7_": return worker_7_Environment;
			case "worker_8_": return worker_8_Environment;
			case "worker_9_": return worker_9_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "worker_7_","worker_9_","worker_6_","worker_0_","worker_19_","worker_17_","worker_3_","worker_4_","worker_11_","worker_10_","worker_18_","master","worker_12_","worker_1_","worker_16_","worker_2_","worker_13_","worker_14_","worker_5_","worker_15_","worker_8_" };
	}
	
	@Override
	public String getState(){
		return "/" + masterEnvironment.getState() + "/" + worker_0_Environment.getState() + "/" + worker_10_Environment.getState() + "/" + worker_11_Environment.getState() + "/" + worker_12_Environment.getState() + "/" + worker_13_Environment.getState() + "/" + worker_14_Environment.getState() + "/" + worker_15_Environment.getState() + "/" + worker_16_Environment.getState() + "/" + worker_17_Environment.getState() + "/" + worker_18_Environment.getState() + "/" + worker_19_Environment.getState() + "/" + worker_1_Environment.getState() + "/" + worker_2_Environment.getState() + "/" + worker_3_Environment.getState() + "/" + worker_4_Environment.getState() + "/" + worker_5_Environment.getState() + "/" + worker_6_Environment.getState() + "/" + worker_7_Environment.getState() + "/" + worker_8_Environment.getState() + "/" + worker_9_Environment.getState() + "/";
	}
}
