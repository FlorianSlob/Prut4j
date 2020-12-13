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

public class CGProtocol_strict_n_16 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> worker_1_Queue = new LinkedBlockingQueue<>();
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_38(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_1_","worker_0_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_1_")) {
							setState(27);
							worker_1_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(28);
							worker_0_Queue.put(new ProtocolMessage(box.get(),3));
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
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(15);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						setState(17);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
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
				case 4:
					if(!box.isPresent() && !isCloseAction){
						setState(17);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 5:
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
				case 6:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(22);
							worker_0_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(9);
							worker_0_Queue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(12);
							worker_0_Queue.put(new ProtocolMessage(box.get(),70));
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
				case 7:
					if(!box.isPresent() && !isCloseAction){
						setState(17);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(33);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(34);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 9:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(4);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 67) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 70) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(4);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(16);
							worker_1_Queue.put(new ProtocolMessage(box.get(),11));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(4);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 67) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 70) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(7);
							worker_0_Queue.put(new ProtocolMessage(box.get(),75));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(4);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 67) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(22);
							worker_1_Queue.put(new ProtocolMessage(box.get(),6));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(14);
							worker_1_Queue.put(new ProtocolMessage(box.get(),8));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(10);
							worker_1_Queue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(11);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.CGThreads.CGMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(15);
							worker_0_Queue.put(new ProtocolMessage(box.get(),1));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(6);
							worker_1_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							int rnd = new Random().nextInt(2);
							String[] receiverOptionsArray = new String[]{ "worker_0_","worker_1_" };
							receiver = receiverOptionsArray[rnd];
						}
						if (receiver.equals("worker_0_")) {
							setState(28);
							worker_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(27);
							worker_1_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
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
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(35);
							worker_0_Queue.put(new ProtocolMessage(box.get(),79));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
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
				case 21:
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
				case 22:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 62) {
							setState(16);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(2);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 64) {
							setState(4);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 67) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 70) {
							setState(7);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(24);
							worker_1_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 24:
					if(!box.isPresent() && !isCloseAction){
						setState(36);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 25:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(33);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(34);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 26:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(33);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(34);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_0_";
						}
						if (receiver.equals("worker_0_")) {
							setState(26);
							worker_0_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(8);
							worker_0_Queue.put(new ProtocolMessage(box.get(),54));
							return Optional.empty();
						}
						if (receiver.equals("worker_0_")) {
							setState(25);
							worker_0_Queue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(19);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 28:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "worker_1_";
						}
						if (receiver.equals("worker_1_")) {
							setState(26);
							worker_1_Queue.put(new ProtocolMessage(box.get(),16));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(29);
							worker_1_Queue.put(new ProtocolMessage(box.get(),18));
							return Optional.empty();
						}
						if (receiver.equals("worker_1_")) {
							setState(32);
							worker_1_Queue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
						setState(23);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 29:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(33);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(34);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 51) {
							setState(35);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = masterQueue.take();
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 45) {
							setState(24);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(33);
							//queueFromworker_0_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 47) {
							setState(34);
							//queueFromworker_1_Tomaster);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 33:
					if(!box.isPresent() && !isCloseAction){
						setState(36);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 34:
					if(!box.isPresent() && !isCloseAction){
						setState(36);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 35:
					if(!box.isPresent() && !isCloseAction){
						setState(36);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 36:
					if (isCloseAction) {
						setState(20);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(37);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(18);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(3);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(5);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(21);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(31);
						return Optional.empty();
					}
					if (isCloseAction) {
						setState(30);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 37:
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
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 38){
				Optional result = exchange_0_38(box, receiver, isCloseAction);
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_13(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(8);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(12);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(6);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(7);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 54) {
							setState(10);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 55) {
							setState(3);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 56) {
							setState(11);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 59) {
							setState(2);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 70) {
							setState(4);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 71) {
							setState(5);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 75) {
							setState(5);
							//queueFrommasterToworker_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 79) {
							setState(11);
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),69));
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
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),53));
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
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),69));
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
							masterQueue.put(new ProtocolMessage(box.get(),69));
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),69));
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
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),53));
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
							masterQueue.put(new ProtocolMessage(box.get(),7));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),10));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),62));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),69));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 9:
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
				case 10:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),53));
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
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),53));
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
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),20));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(9);
							masterQueue.put(new ProtocolMessage(box.get(),53));
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
			if (state >=0 && state <= 13){
				Optional result = exchange_0_13(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment worker_1_Environment = new IEnvironment() {
		private int state = 11;
		
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
		
		public <Any, AnyInput> Optional<Any> exchange_0_13(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),55));
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
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),13));
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
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),51));
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
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),73));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),70));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),67));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),13));
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),77));
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
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),70));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),67));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),13));
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),23));
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
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),67));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),13));
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),47));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 11:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = worker_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(5);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(6);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 6) {
							setState(7);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 8) {
							setState(9);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 10) {
							setState(12);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 16) {
							setState(1);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 18) {
							setState(4);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 20) {
							setState(10);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(8);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 44) {
							setState(8);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 61) {
							setState(3);
							//queueFrommasterToworker_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 12:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),64));
							return Optional.empty();
						}
						if (receiver.equals("master")) {
							setState(11);
							masterQueue.put(new ProtocolMessage(box.get(),13));
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
			if (state >=0 && state <= 13){
				Optional result = exchange_0_13(box, receiver, isCloseAction);
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
		return new String[] { "master","worker_1_","worker_0_" };
	}
	
	@Override
	public String getState(){
		return "/" + masterEnvironment.getState() + "/" + worker_0_Environment.getState() + "/" + worker_1_Environment.getState() + "/";
	}
}
