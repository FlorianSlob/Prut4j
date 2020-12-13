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

public class CGProtocol_strict_n_3 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_2_Queue = new LinkedBlockingQueue<>();
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 2 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(3);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(64);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(12);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(208);
							worker_2_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(3);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(168);
							worker_1_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(228);
							worker_2_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(30);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 1:
					if (isCloseAction) {
						setState(279);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(240);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(135);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(137);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 170) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(37);
							worker_1_Queue.put(new ProtocolMessage(box.get(),153));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(255);
							worker_1_Queue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(55);
							worker_1_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(80);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (isCloseAction) {
						setState(242);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(280);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(137);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(138);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 175) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(210);
							worker_2_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(27);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 369) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 11:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 373) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(160);
							worker_1_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(45);
							worker_2_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(90);
							worker_1_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(131);
							worker_2_Queue.put(new ProtocolMessage(box.get(),12));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(32);
							worker_1_Queue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(211);
							worker_2_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(9);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(15);
							worker_2_Queue.put(new ProtocolMessage(box.get(),24));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(219);
							worker_2_Queue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(28);
							worker_2_Queue.put(new ProtocolMessage(box.get(),359));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(115);
							worker_2_Queue.put(new ProtocolMessage(box.get(),334));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 15:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 16:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(3);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(228);
							worker_2_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(168);
							worker_1_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(30);
							worker_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(3);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(208);
							worker_2_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(64);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(12);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 17:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 375) {
							setState(101);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 18:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(51);
							worker_1_Queue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(198);
							worker_2_Queue.put(new ProtocolMessage(box.get(),38));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 19:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 20:
					if (isCloseAction) {
						setState(246);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(39);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(237);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(278);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(279);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(240);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(242);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(280);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(135);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(136);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(137);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(138);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(22);
							worker_2_Queue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 23:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 24:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 357) {
							setState(28);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 25:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 26:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(219);
							worker_2_Queue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(115);
							worker_2_Queue.put(new ProtocolMessage(box.get(),334));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(28);
							worker_2_Queue.put(new ProtocolMessage(box.get(),359));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(68);
							worker_2_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(206);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(34);
							worker_2_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 28:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 299) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 361) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 29:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 207) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 260) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(266);
							worker_2_Queue.put(new ProtocolMessage(box.get(),30));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(161);
							worker_1_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(163);
							worker_1_Queue.put(new ProtocolMessage(box.get(),32));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(241);
							worker_2_Queue.put(new ProtocolMessage(box.get(),33));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(247);
							worker_2_Queue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(204);
							worker_1_Queue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(18);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(62);
							worker_1_Queue.put(new ProtocolMessage(box.get(),374));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(108);
							worker_1_Queue.put(new ProtocolMessage(box.get(),349));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(199);
							worker_1_Queue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(244);
							worker_1_Queue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(256);
							worker_1_Queue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(17);
							worker_1_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 434) {
							setState(205);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(250);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(251);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 444) {
							setState(212);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 447) {
							setState(179);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(109);
							worker_2_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(165);
							worker_2_Queue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(227);
							worker_2_Queue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(176);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 277) {
							setState(175);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(162);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(159);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 33:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 197) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 34:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 35:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 163) {
							setState(55);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 36:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 306) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 37:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 154) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 38:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 207) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 317) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 41:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 42:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 307) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 45:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(81);
							worker_1_Queue.put(new ProtocolMessage(box.get(),273));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(209);
							worker_1_Queue.put(new ProtocolMessage(box.get(),275));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(109);
							worker_1_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(62);
							worker_1_Queue.put(new ProtocolMessage(box.get(),374));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(108);
							worker_1_Queue.put(new ProtocolMessage(box.get(),349));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(199);
							worker_1_Queue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(244);
							worker_1_Queue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(256);
							worker_1_Queue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(17);
							worker_1_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(148);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 434) {
							setState(205);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(250);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(251);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 444) {
							setState(212);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 447) {
							setState(179);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 46:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(78);
							worker_2_Queue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(225);
							worker_2_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(86);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(84);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 210) {
							setState(239);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 241) {
							setState(104);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 47:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 48:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 49:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 50:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(55);
							worker_2_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(270);
							worker_2_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(185);
							worker_2_Queue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 52:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 290) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 53:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 54:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 248) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 55:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 154) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 56:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 318) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 57:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(28);
							worker_0_Queue.put(new ProtocolMessage(box.get(),359));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(147);
							worker_0_Queue.put(new ProtocolMessage(box.get(),360));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(272);
							worker_0_Queue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 58:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 59:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 255) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 60:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 343) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 61:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(147);
							worker_0_Queue.put(new ProtocolMessage(box.get(),360));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(272);
							worker_0_Queue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(28);
							worker_0_Queue.put(new ProtocolMessage(box.get(),359));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 62:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 375) {
							setState(101);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 63:
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 64:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(160);
							worker_0_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(184);
							worker_2_Queue.put(new ProtocolMessage(box.get(),271));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(154);
							worker_2_Queue.put(new ProtocolMessage(box.get(),380));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(144);
							worker_0_Queue.put(new ProtocolMessage(box.get(),272));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(67);
							worker_2_Queue.put(new ProtocolMessage(box.get(),382));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(263);
							worker_0_Queue.put(new ProtocolMessage(box.get(),354));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(215);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 65:
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 66:
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 67:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(259);
							worker_0_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(275);
							worker_0_Queue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(281);
							worker_0_Queue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 382) {
							setState(61);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 390) {
							setState(146);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(224);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(222);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 68:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 290) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 69:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 70:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 71:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 72:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 73:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 74:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 75:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(115);
							worker_2_Queue.put(new ProtocolMessage(box.get(),334));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(219);
							worker_2_Queue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 76:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 344) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 77:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 78:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 79:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 80:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(74);
							worker_1_Queue.put(new ProtocolMessage(box.get(),160));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 81:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 278) {
							setState(68);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 357) {
							setState(28);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 375) {
							setState(101);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 82:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 256) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 83:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(281);
							worker_0_Queue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(17);
							worker_0_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(224);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(222);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 396) {
							setState(150);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 400) {
							setState(93);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 84:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(185);
							worker_2_Queue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 85:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 163) {
							setState(55);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 86:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 87:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 260) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 88:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(232);
							worker_0_Queue.put(new ProtocolMessage(box.get(),240));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(223);
							worker_0_Queue.put(new ProtocolMessage(box.get(),242));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(225);
							worker_0_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(149);
							worker_0_Queue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(69);
							worker_0_Queue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(50);
							worker_0_Queue.put(new ProtocolMessage(box.get(),257));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(169);
							worker_0_Queue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(269);
							worker_0_Queue.put(new ProtocolMessage(box.get(),261));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(267);
							worker_0_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 409) {
							setState(120);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 417) {
							setState(178);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(236);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(235);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 423) {
							setState(188);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 427) {
							setState(139);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 89:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 90:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(209);
							worker_2_Queue.put(new ProtocolMessage(box.get(),275));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(109);
							worker_2_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(53);
							worker_2_Queue.put(new ProtocolMessage(box.get(),330));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(165);
							worker_2_Queue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(227);
							worker_2_Queue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(220);
							worker_2_Queue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(176);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 277) {
							setState(175);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(162);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(159);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 329) {
							setState(75);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 91:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 92:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 93:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(11);
							worker_0_Queue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(101);
							worker_0_Queue.put(new ProtocolMessage(box.get(),402));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(192);
							worker_0_Queue.put(new ProtocolMessage(box.get(),378));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 94:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 95:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 96:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 180) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 180) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 97:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 181) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 181) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 98:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 182) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 182) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 99:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 100:
					if (isCloseAction) {
						setState(48);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(133);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(151);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(194);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(157);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(197);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(164);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(200);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(91);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(92);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(94);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(95);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 101:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 352) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 373) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 102:
					if (isCloseAction) {
						setState(91);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 103:
					if (isCloseAction) {
						setState(92);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 104:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(264);
							worker_2_Queue.put(new ProtocolMessage(box.get(),246));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(122);
							worker_2_Queue.put(new ProtocolMessage(box.get(),215));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 105:
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(94);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 106:
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(95);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 107:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(25);
							worker_1_Queue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(123);
							worker_1_Queue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(267);
							worker_1_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(113);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(111);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 235) {
							setState(265);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 266) {
							setState(141);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 108:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 109:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 278) {
							setState(68);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 110:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(19);
							worker_2_Queue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(231);
							worker_2_Queue.put(new ProtocolMessage(box.get(),211));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(78);
							worker_2_Queue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(223);
							worker_2_Queue.put(new ProtocolMessage(box.get(),242));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(225);
							worker_2_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 162) {
							setState(112);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(86);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(84);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 210) {
							setState(239);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 241) {
							setState(104);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 111:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(255);
							worker_1_Queue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(80);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 112:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(185);
							worker_2_Queue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(270);
							worker_2_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 113:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(38);
							worker_1_Queue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(114);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 114:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(74);
							worker_1_Queue.put(new ProtocolMessage(box.get(),160));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 115:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 299) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 116:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(264);
							worker_0_Queue.put(new ProtocolMessage(box.get(),246));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(158);
							worker_0_Queue.put(new ProtocolMessage(box.get(),247));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(54);
							worker_0_Queue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 117:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 118:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 119:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 120:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(158);
							worker_0_Queue.put(new ProtocolMessage(box.get(),247));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(54);
							worker_0_Queue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(264);
							worker_0_Queue.put(new ProtocolMessage(box.get(),246));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 121:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 122:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 170) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 123:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 124:
					if(!box.isPresent() && !isCloseAction){
						setState(217);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 125:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(225);
							worker_0_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(149);
							worker_0_Queue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(69);
							worker_0_Queue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 409) {
							setState(120);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 417) {
							setState(178);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(236);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(235);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 126:
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 127:
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 128:
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 129:
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 130:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(11);
							worker_0_Queue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(192);
							worker_0_Queue.put(new ProtocolMessage(box.get(),378));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(101);
							worker_0_Queue.put(new ProtocolMessage(box.get(),402));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 131:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(209);
							worker_1_Queue.put(new ProtocolMessage(box.get(),275));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(109);
							worker_1_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(108);
							worker_1_Queue.put(new ProtocolMessage(box.get(),349));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(199);
							worker_1_Queue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(244);
							worker_1_Queue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(256);
							worker_1_Queue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(148);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 434) {
							setState(205);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(250);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(251);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 444) {
							setState(212);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 132:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(270);
							worker_2_Queue.put(new ProtocolMessage(box.get(),42));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(185);
							worker_2_Queue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(55);
							worker_2_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 133:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 134:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(69);
							worker_0_Queue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(169);
							worker_0_Queue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(267);
							worker_0_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(236);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(235);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 423) {
							setState(188);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 427) {
							setState(139);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 135:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 136:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 137:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 138:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 139:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(87);
							worker_0_Queue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(29);
							worker_0_Queue.put(new ProtocolMessage(box.get(),269));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(207);
							worker_0_Queue.put(new ProtocolMessage(box.get(),264));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 140:
					if (isCloseAction) {
						setState(135);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 141:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(38);
							worker_1_Queue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(29);
							worker_1_Queue.put(new ProtocolMessage(box.get(),269));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(177);
							worker_1_Queue.put(new ProtocolMessage(box.get(),238));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(114);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 142:
					if (isCloseAction) {
						setState(136);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 143:
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(137);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 144:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),355));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(53);
							worker_2_Queue.put(new ProtocolMessage(box.get(),330));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(165);
							worker_2_Queue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(227);
							worker_2_Queue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(220);
							worker_2_Queue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(259);
							worker_2_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 277) {
							setState(175);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(162);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(159);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 329) {
							setState(75);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 354) {
							setState(14);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 145:
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(138);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 146:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(272);
							worker_0_Queue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(147);
							worker_0_Queue.put(new ProtocolMessage(box.get(),360));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 147:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 361) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 148:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(68);
							worker_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(52);
							worker_1_Queue.put(new ProtocolMessage(box.get(),279));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(195);
							worker_1_Queue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(245);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 149:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 150:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(192);
							worker_0_Queue.put(new ProtocolMessage(box.get(),378));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(11);
							worker_0_Queue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 151:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 152:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 153:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 154:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(24);
							worker_0_Queue.put(new ProtocolMessage(box.get(),355));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(259);
							worker_0_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(275);
							worker_0_Queue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(281);
							worker_0_Queue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(167);
							worker_0_Queue.put(new ProtocolMessage(box.get(),370));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 382) {
							setState(61);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 390) {
							setState(146);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(224);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(222);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 396) {
							setState(150);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 155:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(87);
							worker_0_Queue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(207);
							worker_0_Queue.put(new ProtocolMessage(box.get(),264));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(29);
							worker_0_Queue.put(new ProtocolMessage(box.get(),269));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 156:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 157:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 158:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 248) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 159:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(34);
							worker_2_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 160:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(81);
							worker_2_Queue.put(new ProtocolMessage(box.get(),273));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(209);
							worker_2_Queue.put(new ProtocolMessage(box.get(),275));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(109);
							worker_2_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(24);
							worker_2_Queue.put(new ProtocolMessage(box.get(),355));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(53);
							worker_2_Queue.put(new ProtocolMessage(box.get(),330));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(165);
							worker_2_Queue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(227);
							worker_2_Queue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(220);
							worker_2_Queue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(259);
							worker_2_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(176);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 277) {
							setState(175);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(162);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(159);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 329) {
							setState(75);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 354) {
							setState(14);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 161:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(232);
							worker_2_Queue.put(new ProtocolMessage(box.get(),240));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(85);
							worker_2_Queue.put(new ProtocolMessage(box.get(),209));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(35);
							worker_2_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(19);
							worker_2_Queue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(231);
							worker_2_Queue.put(new ProtocolMessage(box.get(),211));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(78);
							worker_2_Queue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(223);
							worker_2_Queue.put(new ProtocolMessage(box.get(),242));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(225);
							worker_2_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(132);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 162) {
							setState(112);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(86);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(84);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 210) {
							setState(239);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 241) {
							setState(104);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 162:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(219);
							worker_2_Queue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 163:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(85);
							worker_2_Queue.put(new ProtocolMessage(box.get(),209));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(35);
							worker_2_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(19);
							worker_2_Queue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(231);
							worker_2_Queue.put(new ProtocolMessage(box.get(),211));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(78);
							worker_2_Queue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(132);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 162) {
							setState(112);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(86);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(84);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 210) {
							setState(239);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 164:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 165:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 166:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 167:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(192);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 168:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(88);
							worker_2_Queue.put(new ProtocolMessage(box.get(),405));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(161);
							worker_0_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(110);
							worker_0_Queue.put(new ProtocolMessage(box.get(),239));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(254);
							worker_2_Queue.put(new ProtocolMessage(box.get(),407));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(125);
							worker_2_Queue.put(new ProtocolMessage(box.get(),409));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(46);
							worker_0_Queue.put(new ProtocolMessage(box.get(),241));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(230);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 169:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 170:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(244);
							worker_1_Queue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(256);
							worker_1_Queue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(17);
							worker_1_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(250);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(251);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 444) {
							setState(212);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 447) {
							setState(179);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 171:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 309) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 309) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 172:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 310) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 310) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 173:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 311) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 311) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 174:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 175:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(34);
							worker_2_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(206);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 176:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(206);
							worker_2_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(34);
							worker_2_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(68);
							worker_2_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(13);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 177:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 207) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 178:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(54);
							worker_0_Queue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(158);
							worker_0_Queue.put(new ProtocolMessage(box.get(),247));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 179:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(274);
							worker_1_Queue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(101);
							worker_1_Queue.put(new ProtocolMessage(box.get(),402));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(182);
							worker_1_Queue.put(new ProtocolMessage(box.get(),377));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(252);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 180:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 177) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 181:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(274);
							worker_1_Queue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(182);
							worker_1_Queue.put(new ProtocolMessage(box.get(),377));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(101);
							worker_1_Queue.put(new ProtocolMessage(box.get(),402));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(252);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 182:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 352) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 183:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(275);
							worker_0_Queue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(281);
							worker_0_Queue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(167);
							worker_0_Queue.put(new ProtocolMessage(box.get(),370));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(62);
							worker_0_Queue.put(new ProtocolMessage(box.get(),374));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(17);
							worker_0_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 390) {
							setState(146);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(224);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(222);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 396) {
							setState(150);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 400) {
							setState(93);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 184:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(81);
							worker_0_Queue.put(new ProtocolMessage(box.get(),273));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(24);
							worker_0_Queue.put(new ProtocolMessage(box.get(),355));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(259);
							worker_0_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(275);
							worker_0_Queue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(281);
							worker_0_Queue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(167);
							worker_0_Queue.put(new ProtocolMessage(box.get(),370));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(4);
							worker_0_Queue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(62);
							worker_0_Queue.put(new ProtocolMessage(box.get(),374));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(17);
							worker_0_Queue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 382) {
							setState(61);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 390) {
							setState(146);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(224);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 392) {
							setState(222);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 396) {
							setState(150);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 400) {
							setState(93);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 185:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 186:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 188) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 187:
					if (isCloseAction) {
						setState(151);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(194);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(91);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(92);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 188:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(207);
							worker_0_Queue.put(new ProtocolMessage(box.get(),264));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(87);
							worker_0_Queue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 189:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 190:
					if (isCloseAction) {
						setState(157);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(197);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(91);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(94);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 191:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 192:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 373) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 193:
					if (isCloseAction) {
						setState(164);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(200);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(43);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(94);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(95);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 194:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 195:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 290) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 196:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 178) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 197:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 198:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(55);
							worker_1_Queue.put(new ProtocolMessage(box.get(),40));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(37);
							worker_1_Queue.put(new ProtocolMessage(box.get(),153));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(255);
							worker_1_Queue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(80);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 199:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		public <Any, AnyInput> Optional<Any> exchange_200_283(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 200:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 201:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 303) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 202:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(122);
							worker_2_Queue.put(new ProtocolMessage(box.get(),215));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(264);
							worker_2_Queue.put(new ProtocolMessage(box.get(),246));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 203:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(255);
							worker_1_Queue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(37);
							worker_1_Queue.put(new ProtocolMessage(box.get(),153));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(80);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 204:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(35);
							worker_2_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(19);
							worker_2_Queue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(8);
							worker_2_Queue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(132);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 162) {
							setState(112);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(86);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 165) {
							setState(84);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 205:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(195);
							worker_1_Queue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(52);
							worker_1_Queue.put(new ProtocolMessage(box.get(),279));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(245);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 206:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 282) {
							setState(15);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 207:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 199) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 229) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 260) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 208:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(184);
							worker_1_Queue.put(new ProtocolMessage(box.get(),271));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(45);
							worker_0_Queue.put(new ProtocolMessage(box.get(),9));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(31);
							worker_0_Queue.put(new ProtocolMessage(box.get(),431));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(183);
							worker_1_Queue.put(new ProtocolMessage(box.get(),399));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(83);
							worker_1_Queue.put(new ProtocolMessage(box.get(),400));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(170);
							worker_0_Queue.put(new ProtocolMessage(box.get(),447));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(258);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 209:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 278) {
							setState(68);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(206);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 314) {
							setState(191);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(52);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 210:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(68);
							worker_1_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(52);
							worker_1_Queue.put(new ProtocolMessage(box.get(),279));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(195);
							worker_1_Queue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(245);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 211:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(109);
							worker_1_Queue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(199);
							worker_1_Queue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(244);
							worker_1_Queue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(148);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 434) {
							setState(205);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(250);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 440) {
							setState(251);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 212:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(182);
							worker_1_Queue.put(new ProtocolMessage(box.get(),377));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(274);
							worker_1_Queue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(252);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 213:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 189) {
							setState(74);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 214:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(41);
							worker_1_Queue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(25);
							worker_1_Queue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(268);
							worker_1_Queue.put(new ProtocolMessage(box.get(),230));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(123);
							worker_1_Queue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(269);
							worker_1_Queue.put(new ProtocolMessage(box.get(),261));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(267);
							worker_1_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 201) {
							setState(203);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(113);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(111);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 235) {
							setState(265);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 266) {
							setState(141);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 215:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_2_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(26);
							worker_0_Queue.put(new ProtocolMessage(box.get(),383));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(57);
							worker_2_Queue.put(new ProtocolMessage(box.get(),384));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 216:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(153);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(152);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 287) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 325) {
							setState(156);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 217:
					if (isCloseAction) {
						setState(20);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(100);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(229);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(243);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(282);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(187);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(248);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(190);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(193);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(6);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(253);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(102);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(140);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(126);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(142);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(103);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(127);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(63);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(65);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(66);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(105);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(128);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(143);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(129);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(145);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(106);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 218:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(189);
							worker_0_Queue.put(new ProtocolMessage(box.get(),388));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 219:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 299) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 220:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 221:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 304) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 222:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(272);
							worker_0_Queue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 223:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(264);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 224:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(11);
							worker_0_Queue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(218);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 225:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(264);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 226:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 224) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 227:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 228:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(88);
							worker_1_Queue.put(new ProtocolMessage(box.get(),405));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(266);
							worker_0_Queue.put(new ProtocolMessage(box.get(),30));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(273);
							worker_1_Queue.put(new ProtocolMessage(box.get(),426));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(214);
							worker_0_Queue.put(new ProtocolMessage(box.get(),265));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(107);
							worker_0_Queue.put(new ProtocolMessage(box.get(),266));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(134);
							worker_1_Queue.put(new ProtocolMessage(box.get(),427));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(260);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 229:
					if (isCloseAction) {
						setState(48);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(246);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(151);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(237);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(157);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(240);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(242);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(164);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 230:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_2_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_2_")) {
							setState(116);
							worker_2_Queue.put(new ProtocolMessage(box.get(),411));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(202);
							worker_0_Queue.put(new ProtocolMessage(box.get(),410));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 231:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 232:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 163) {
							setState(55);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(270);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(262);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(122);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(264);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 262) {
							setState(29);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 233:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(124);
							worker_0_Queue.put(new ProtocolMessage(box.get(),415));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 234:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(99);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 191) {
							setState(89);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 225) {
							setState(124);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 235:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(54);
							worker_0_Queue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 236:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(87);
							worker_0_Queue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(233);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 237:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 238:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(15);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 239:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(122);
							worker_2_Queue.put(new ProtocolMessage(box.get(),215));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(3);
							worker_2_Queue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(21);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 240:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 241:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(85);
							worker_1_Queue.put(new ProtocolMessage(box.get(),209));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(35);
							worker_1_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(41);
							worker_1_Queue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(25);
							worker_1_Queue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(268);
							worker_1_Queue.put(new ProtocolMessage(box.get(),230));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(123);
							worker_1_Queue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(5);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 201) {
							setState(203);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(113);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(111);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 235) {
							setState(265);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 242:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 243:
					if (isCloseAction) {
						setState(151);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(237);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(73);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 244:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 245:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(156);
							worker_1_Queue.put(new ProtocolMessage(box.get(),438));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 246:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 247:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(35);
							worker_1_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(41);
							worker_1_Queue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(25);
							worker_1_Queue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(5);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 201) {
							setState(203);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(113);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(111);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 248:
					if (isCloseAction) {
						setState(157);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(240);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(72);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 249:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 250:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(195);
							worker_1_Queue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(245);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 251:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(274);
							worker_1_Queue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(252);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 252:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(156);
							worker_1_Queue.put(new ProtocolMessage(box.get(),438));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 253:
					if (isCloseAction) {
						setState(242);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(164);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(42);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(119);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(77);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(79);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(121);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 254:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(223);
							worker_0_Queue.put(new ProtocolMessage(box.get(),242));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(225);
							worker_0_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(149);
							worker_0_Queue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(69);
							worker_0_Queue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(50);
							worker_0_Queue.put(new ProtocolMessage(box.get(),257));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(169);
							worker_0_Queue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 409) {
							setState(120);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 417) {
							setState(178);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(236);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(235);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 423) {
							setState(188);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 255:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 154) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 256:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(40);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 316) {
							setState(56);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(216);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(261);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 346) {
							setState(271);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(182);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 257:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(38);
							worker_1_Queue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(177);
							worker_1_Queue.put(new ProtocolMessage(box.get(),238));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(29);
							worker_1_Queue.put(new ProtocolMessage(box.get(),269));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(114);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 258:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(130);
							worker_1_Queue.put(new ProtocolMessage(box.get(),453));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(181);
							worker_0_Queue.put(new ProtocolMessage(box.get(),452));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 259:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(201);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(221);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(115);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 357) {
							setState(28);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 260:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(155);
							worker_1_Queue.put(new ProtocolMessage(box.get(),458));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(257);
							worker_0_Queue.put(new ProtocolMessage(box.get(),457));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 261:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 326) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 262:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 174) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 263:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_2_";
						}
						if (receiver.equals("worker_2_")) {
							setState(227);
							worker_2_Queue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(220);
							worker_2_Queue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("worker_2_")) {
							setState(259);
							worker_2_Queue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(162);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 294) {
							setState(159);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 329) {
							setState(75);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 354) {
							setState(14);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 264:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 170) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 171) {
							setState(22);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(89);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(70);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 217) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 248) {
							setState(124);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 265:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(177);
							worker_1_Queue.put(new ProtocolMessage(box.get(),238));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(38);
							worker_1_Queue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(114);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 266:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(232);
							worker_1_Queue.put(new ProtocolMessage(box.get(),240));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(85);
							worker_1_Queue.put(new ProtocolMessage(box.get(),209));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(35);
							worker_1_Queue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(41);
							worker_1_Queue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(25);
							worker_1_Queue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(268);
							worker_1_Queue.put(new ProtocolMessage(box.get(),230));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(123);
							worker_1_Queue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(269);
							worker_1_Queue.put(new ProtocolMessage(box.get(),261));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(267);
							worker_1_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(5);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 201) {
							setState(203);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(113);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 203) {
							setState(111);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 235) {
							setState(265);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 266) {
							setState(141);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 267:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 262) {
							setState(29);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 268:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 269:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(196);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(180);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(97);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(98);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 179) {
							setState(96);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 185) {
							setState(249);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(213);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 187) {
							setState(186);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(37);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(276);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(33);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 221) {
							setState(23);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(226);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 223) {
							setState(234);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 227) {
							setState(47);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(177);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(158);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(59);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(82);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(207);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 262) {
							setState(29);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 270:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(22);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 271:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 348) {
							setState(189);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 272:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 361) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 273:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(149);
							worker_0_Queue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(69);
							worker_0_Queue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(50);
							worker_0_Queue.put(new ProtocolMessage(box.get(),257));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(169);
							worker_0_Queue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(269);
							worker_0_Queue.put(new ProtocolMessage(box.get(),261));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(267);
							worker_0_Queue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 417) {
							setState(178);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(236);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 419) {
							setState(235);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 423) {
							setState(188);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 427) {
							setState(139);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 274:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(166);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 320) {
							setState(174);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 328) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 352) {
							setState(156);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 275:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(44);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 305) {
							setState(36);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 340) {
							setState(238);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(147);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 276:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(70);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 146) {
							setState(71);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 150) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 196) {
							setState(74);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 277:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(166);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 301) {
							setState(152);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 336) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 368) {
							setState(189);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 278:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 279:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 280:
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(2);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 281:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(172);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(173);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 308) {
							setState(171);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(76);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 342) {
							setState(60);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(277);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(10);
							//queueFromworker_2_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 282:
					if (isCloseAction) {
						setState(237);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(278);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(135);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(117);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(136);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(118);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(49);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(58);
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
			if (state >=0 && state <= 199){
				Optional result = exchange_0_199(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			if (state >=200 && state <= 283){
				Optional result = exchange_200_283(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_0_Environment = new IEnvironment() {
		private int state = 23;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_53(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
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
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
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
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),214));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),333));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),237));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),237));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),333));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),434));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),446));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),277));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),333));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),434));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),446));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 23:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(20);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(30);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(51);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(18);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(34);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 30) {
							setState(24);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 239) {
							setState(31);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 240) {
							setState(41);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 241) {
							setState(7);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 242) {
							setState(48);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 243) {
							setState(37);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(9);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 246) {
							setState(39);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 247) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 248) {
							setState(21);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 249) {
							setState(49);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 251) {
							setState(39);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(5);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 253) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 254) {
							setState(50);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 255) {
							setState(21);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 256) {
							setState(29);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 257) {
							setState(10);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 258) {
							setState(16);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 259) {
							setState(17);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 260) {
							setState(29);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 261) {
							setState(26);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 262) {
							setState(38);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 263) {
							setState(8);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 264) {
							setState(17);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 265) {
							setState(43);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 266) {
							setState(14);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 267) {
							setState(13);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 269) {
							setState(8);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 272) {
							setState(40);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 273) {
							setState(52);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 354) {
							setState(11);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 355) {
							setState(46);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 356) {
							setState(15);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 357) {
							setState(27);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 359) {
							setState(28);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 360) {
							setState(45);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 361) {
							setState(12);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 362) {
							setState(44);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 364) {
							setState(28);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 365) {
							setState(33);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 366) {
							setState(45);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 367) {
							setState(35);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 368) {
							setState(12);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 369) {
							setState(19);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 370) {
							setState(25);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 371) {
							setState(42);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 372) {
							setState(6);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 373) {
							setState(19);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 374) {
							setState(22);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 375) {
							setState(2);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 376) {
							setState(3);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 378) {
							setState(6);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 383) {
							setState(15);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 388) {
							setState(44);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 402) {
							setState(3);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 410) {
							setState(37);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 415) {
							setState(49);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 431) {
							setState(36);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 447) {
							setState(47);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 448) {
							setState(32);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 452) {
							setState(32);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 457) {
							setState(13);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 24:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),201));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),237));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 26:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 28:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 29:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),36));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),162));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),214));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),201));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),237));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),162));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),214));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),446));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 33:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 34:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),162));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),214));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 35:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 36:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),434));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),446));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 37:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),214));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 38:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),277));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),333));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 41:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),163));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 42:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),193));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),207));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),201));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),237));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 45:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 46:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 47:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),446));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 48:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),171));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),170));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),185));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),199));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 49:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 50:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),219));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),14));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),277));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),333));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 52:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),295));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),338));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),299));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),314));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),328));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),322));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(23);
							masterQueue.put(new ProtocolMessage(box.get(),352));
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
			if (state >=0 && state <= 53){
				Optional result = exchange_0_53(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_1_Environment = new IEnvironment() {
		private int state = 33;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_53(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),210));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),241));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),406));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),409));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),417));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),425));
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
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
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
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
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
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),210));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),329));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),425));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 24:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),409));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),417));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),425));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 26:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 28:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 29:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),354));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),329));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),210));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),213));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),241));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),390));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),398));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 33:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(50);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 5) {
							setState(0);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(29);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(17);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 14) {
							setState(44);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(52);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(39);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(31);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 32) {
							setState(8);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 35) {
							setState(46);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 37) {
							setState(11);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 40) {
							setState(40);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 153) {
							setState(26);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 154) {
							setState(22);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 155) {
							setState(15);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 160) {
							setState(15);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 161) {
							setState(11);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 163) {
							setState(4);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 192) {
							setState(40);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 193) {
							setState(10);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 194) {
							setState(26);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 195) {
							setState(9);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 196) {
							setState(22);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 197) {
							setState(5);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 198) {
							setState(15);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 207) {
							setState(5);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 209) {
							setState(28);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 230) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 231) {
							setState(14);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 232) {
							setState(41);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 238) {
							setState(41);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 240) {
							setState(20);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 261) {
							setState(45);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 262) {
							setState(6);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 263) {
							setState(49);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 269) {
							setState(49);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 271) {
							setState(51);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 273) {
							setState(36);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 275) {
							setState(27);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 276) {
							setState(52);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 278) {
							setState(16);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 279) {
							setState(30);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 290) {
							setState(25);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 291) {
							setState(19);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 321) {
							setState(39);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 322) {
							setState(21);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 323) {
							setState(30);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 324) {
							setState(13);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 325) {
							setState(25);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 326) {
							setState(7);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 327) {
							setState(19);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 349) {
							setState(2);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 350) {
							setState(12);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 351) {
							setState(38);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 352) {
							setState(7);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 374) {
							setState(23);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 375) {
							setState(34);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 376) {
							setState(37);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 377) {
							setState(38);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 399) {
							setState(32);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 400) {
							setState(42);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 401) {
							setState(48);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 402) {
							setState(37);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 405) {
							setState(24);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 426) {
							setState(43);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 427) {
							setState(35);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 428) {
							setState(18);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 438) {
							setState(19);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 453) {
							setState(48);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 458) {
							setState(18);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 34:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 35:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),425));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 36:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 37:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 38:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 41:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 42:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),398));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),417));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),425));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 45:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),221));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 46:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),44));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),165));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),169));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 47:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 48:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),398));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 49:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),191));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),229));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(47);
							masterQueue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 50:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),379));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),354));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),329));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),382));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),390));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),398));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),298));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),305));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),320));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),332));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),340));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),348));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),357));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),365));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),373));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),382));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),390));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),398));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 52:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),282));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(33);
							masterQueue.put(new ProtocolMessage(box.get(),289));
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
			if (state >=0 && state <= 53){
				Optional result = exchange_0_53(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_2_Environment = new IEnvironment() {
		private int state = 28;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_53(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),235));
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
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
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
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),386));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),396));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),400));
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
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 5:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),386));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),396));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 7:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),413));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),386));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),396));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),400));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),450));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),447));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),444));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),436));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),436));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),444));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),436));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),413));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),423));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),392));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),386));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),413));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 24:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),235));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),266));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),413));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),423));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),427));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),455));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 26:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 28:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(10);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(24);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(38);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 12) {
							setState(13);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(40);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(12);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(43);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(35);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(25);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 24) {
							setState(14);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 30) {
							setState(42);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 33) {
							setState(1);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 36) {
							setState(45);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 38) {
							setState(46);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 40) {
							setState(37);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 42) {
							setState(26);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(15);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(21);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 143) {
							setState(21);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 163) {
							setState(30);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 166) {
							setState(19);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 169) {
							setState(17);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 170) {
							setState(27);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 174) {
							setState(15);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 175) {
							setState(27);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 184) {
							setState(26);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 192) {
							setState(37);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 200) {
							setState(46);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 209) {
							setState(47);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 211) {
							setState(49);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 213) {
							setState(4);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 215) {
							setState(8);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 220) {
							setState(8);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 240) {
							setState(33);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 242) {
							setState(32);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(39);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 246) {
							setState(7);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 251) {
							setState(7);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 271) {
							setState(3);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 273) {
							setState(50);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 275) {
							setState(44);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 278) {
							setState(41);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 281) {
							setState(14);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 295) {
							setState(31);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 298) {
							setState(23);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 299) {
							setState(34);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 303) {
							setState(25);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 304) {
							setState(34);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 313) {
							setState(35);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 321) {
							setState(43);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 330) {
							setState(48);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 332) {
							setState(2);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 334) {
							setState(11);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 339) {
							setState(11);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 355) {
							setState(5);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 357) {
							setState(22);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 359) {
							setState(51);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 364) {
							setState(51);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 380) {
							setState(6);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 382) {
							setState(18);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 384) {
							setState(52);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 389) {
							setState(52);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 405) {
							setState(36);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 407) {
							setState(16);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 409) {
							setState(9);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 411) {
							setState(20);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 416) {
							setState(20);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 433) {
							setState(12);
							//queueFrommasterToworker_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 29:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 33:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 34:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 35:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 36:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),419));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),413));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),423));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),427));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 37:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 38:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),447));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),444));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),436));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),440));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),436));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 41:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 42:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),235));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),254));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),258));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),266));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 45:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),203));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 46:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 47:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),195));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),231));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 48:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 49:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),146));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),179));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),187));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),150));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),223));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),217));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(29);
							masterQueue.put(new ProtocolMessage(box.get(),227));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 50:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),287));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),308));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),316));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),324));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),342));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),346));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),350));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),367));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),371));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),375));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 52:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),26));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),301));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),336));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),361));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(28);
							masterQueue.put(new ProtocolMessage(box.get(),386));
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
			if (state >=0 && state <= 53){
				Optional result = exchange_0_53(box, receiver, isCloseAction);
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
			case "worker_2_": return worker_2_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "worker_1_","worker_2_","worker_0_","master" };
	}
	
	@Override
	public String getState(){
		return "/" + masterEnvironment.getState() + "/" + worker_0_Environment.getState() + "/" + worker_1_Environment.getState() + "/" + worker_2_Environment.getState() + "/";
	}
}
