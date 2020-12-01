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

public class MGProtocol_n_4 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<ProtocolMessage> interpd_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_3_Queue = new LinkedBlockingQueue<>();
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "interpd_0_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),22));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = interpd_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 1) {
								setState(4);
								//queueFrommasterTointerpd_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 5) {
								setState(1);
								//queueFrommasterTointerpd_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),13));
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
			case "interpd_1_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),38));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 7) {
								setState(4);
								//queueFrommasterTointerpd_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 36) {
								setState(1);
								//queueFrommasterTointerpd_1_);
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
									masterQueue.put(new ProtocolMessage(box.get(),15));
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
			case "interpd_2_": return new IEnvironment() {
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
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),17));
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),54));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = interpd_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 9) {
								setState(0);
								//queueFrommasterTointerpd_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 52) {
								setState(2);
								//queueFrommasterTointerpd_2_);
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
			case "interpd_3_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),19));
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),70));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = interpd_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 11) {
								setState(1);
								//queueFrommasterTointerpd_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 68) {
								setState(2);
								//queueFrommasterTointerpd_3_);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_78(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(72);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(3);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(5);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(15);
									resid_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(21);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
									return Optional.empty();
								}
							}
						case 2:
							setState(19);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(4);
									rprj_1_Queue.put(new ProtocolMessage(box.get(),131));
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(6);
									rprj_2_Queue.put(new ProtocolMessage(box.get(),133));
									return Optional.empty();
								}
							}
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									setState(7);
									interpd_1_Queue.put(new ProtocolMessage(box.get(),7));
									return Optional.empty();
								}
							}
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(8);
									rprj_3_Queue.put(new ProtocolMessage(box.get(),135));
									return Optional.empty();
								}
							}
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(9);
									interpd_2_Queue.put(new ProtocolMessage(box.get(),9));
									return Optional.empty();
								}
							}
						case 8:
							setState(10);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(11);
									interpd_3_Queue.put(new ProtocolMessage(box.get(),11));
									return Optional.empty();
								}
							}
						case 10:
							setState(12);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 11:
							setState(13);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 12:
							setState(14);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 13:
							setState(16);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 14:
							setState(19);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(17);
									resid_1_Queue.put(new ProtocolMessage(box.get(),145));
									return Optional.empty();
								}
							}
						case 16:
							setState(18);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(20);
									resid_2_Queue.put(new ProtocolMessage(box.get(),147));
									return Optional.empty();
								}
							}
						case 18:
							setState(19);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(5);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(15);
									resid_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(72);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(3);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(21);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
									return Optional.empty();
								}
							}
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(23);
									resid_3_Queue.put(new ProtocolMessage(box.get(),149));
									return Optional.empty();
								}
							}
						case 21:
							setState(22);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(25);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),24));
									return Optional.empty();
								}
							}
						case 23:
							setState(24);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 24:
							setState(27);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 25:
							setState(26);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(29);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),28));
									return Optional.empty();
								}
							}
						case 27:
							setState(28);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 28:
							setState(19);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 29:
							setState(30);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(31);
									resid_0_Queue.put(new ProtocolMessage(box.get(),32));
									return Optional.empty();
								}
							}
						case 31:
							setState(32);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									setState(33);
									interpd_1_Queue.put(new ProtocolMessage(box.get(),36));
									return Optional.empty();
								}
							}
						case 33:
							setState(34);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(35);
									psinv_1_Queue.put(new ProtocolMessage(box.get(),40));
									return Optional.empty();
								}
							}
						case 35:
							setState(36);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(37);
									rprj_1_Queue.put(new ProtocolMessage(box.get(),44));
									return Optional.empty();
								}
							}
						case 37:
							setState(38);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(39);
									resid_1_Queue.put(new ProtocolMessage(box.get(),48));
									return Optional.empty();
								}
							}
						case 39:
							setState(40);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(41);
									interpd_2_Queue.put(new ProtocolMessage(box.get(),52));
									return Optional.empty();
								}
							}
						case 41:
							setState(42);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(43);
									psinv_2_Queue.put(new ProtocolMessage(box.get(),56));
									return Optional.empty();
								}
							}
						case 43:
							setState(44);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(45);
									rprj_2_Queue.put(new ProtocolMessage(box.get(),60));
									return Optional.empty();
								}
							}
						case 45:
							setState(46);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(47);
									resid_2_Queue.put(new ProtocolMessage(box.get(),64));
									return Optional.empty();
								}
							}
						case 47:
							setState(48);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(49);
									interpd_3_Queue.put(new ProtocolMessage(box.get(),68));
									return Optional.empty();
								}
							}
						case 49:
							setState(50);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(51);
									psinv_3_Queue.put(new ProtocolMessage(box.get(),72));
									return Optional.empty();
								}
							}
						case 51:
							setState(52);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(53);
									rprj_3_Queue.put(new ProtocolMessage(box.get(),76));
									return Optional.empty();
								}
							}
						case 53:
							setState(54);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(55);
									resid_3_Queue.put(new ProtocolMessage(box.get(),80));
									return Optional.empty();
								}
							}
						case 55:
							setState(56);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 56:
							if (isCloseAction) {
								setState(57);
								return Optional.empty();
							}
						case 57:
							if (isCloseAction) {
								setState(58);
								return Optional.empty();
							}
						case 58:
							if (isCloseAction) {
								setState(59);
								return Optional.empty();
							}
						case 59:
							if (isCloseAction) {
								setState(60);
								return Optional.empty();
							}
						case 60:
							if (isCloseAction) {
								setState(61);
								return Optional.empty();
							}
						case 61:
							if (isCloseAction) {
								setState(62);
								return Optional.empty();
							}
						case 62:
							if (isCloseAction) {
								setState(63);
								return Optional.empty();
							}
						case 63:
							if (isCloseAction) {
								setState(64);
								return Optional.empty();
							}
						case 64:
							if (isCloseAction) {
								setState(65);
								return Optional.empty();
							}
						case 65:
							if (isCloseAction) {
								setState(66);
								return Optional.empty();
							}
						case 66:
							if (isCloseAction) {
								setState(67);
								return Optional.empty();
							}
						case 67:
							if (isCloseAction) {
								setState(68);
								return Optional.empty();
							}
						case 68:
							if (isCloseAction) {
								setState(69);
								return Optional.empty();
							}
						case 69:
							if (isCloseAction) {
								setState(70);
								return Optional.empty();
							}
						case 70:
							if (isCloseAction) {
								setState(71);
								return Optional.empty();
							}
						case 71:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 72:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(73);
									psinv_1_Queue.put(new ProtocolMessage(box.get(),117));
									return Optional.empty();
								}
							}
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(74);
									psinv_2_Queue.put(new ProtocolMessage(box.get(),119));
									return Optional.empty();
								}
							}
						case 74:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(75);
									psinv_3_Queue.put(new ProtocolMessage(box.get(),121));
									return Optional.empty();
								}
							}
						case 75:
							setState(76);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 76:
							setState(77);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 77:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 78){
							Optional result = exchange_0_78(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "psinv_0_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),26));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = psinv_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 2) {
								setState(3);
								//queueFrommasterTopsinv_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 24) {
								setState(1);
								//queueFrommasterTopsinv_0_);
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
									masterQueue.put(new ProtocolMessage(box.get(),123));
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
			case "psinv_1_": return new IEnvironment() {
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
						case 1 :
							wait();
							break;
						case 0:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									masterQueue.put(new ProtocolMessage(box.get(),42));
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
									masterQueue.put(new ProtocolMessage(box.get(),125));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = psinv_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 40) {
								setState(2);
								//queueFrommasterTopsinv_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 117) {
								setState(3);
								//queueFrommasterTopsinv_1_);
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
			case "psinv_2_": return new IEnvironment() {
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
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),58));
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
									masterQueue.put(new ProtocolMessage(box.get(),127));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = psinv_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 56) {
								setState(2);
								//queueFrommasterTopsinv_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 119) {
								setState(3);
								//queueFrommasterTopsinv_2_);
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
			case "psinv_3_": return new IEnvironment() {
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
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),129));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = psinv_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 72) {
								setState(4);
								//queueFrommasterTopsinv_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 121) {
								setState(1);
								//queueFrommasterTopsinv_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),74));
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
			case "resid_0_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),34));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = resid_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 4) {
								setState(3);
								//queueFrommasterToresid_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 32) {
								setState(1);
								//queueFrommasterToresid_0_);
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
									masterQueue.put(new ProtocolMessage(box.get(),151));
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
			case "resid_1_": return new IEnvironment() {
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
						case 1 :
							wait();
							break;
						case 0:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							ProtocolMessage objectToGet = resid_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 48) {
								setState(3);
								//queueFrommasterToresid_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 145) {
								setState(4);
								//queueFrommasterToresid_1_);
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
									setState(0);
									masterQueue.put(new ProtocolMessage(box.get(),50));
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),153));
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
			case "resid_2_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),66));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 64) {
								setState(1);
								//queueFrommasterToresid_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 147) {
								setState(4);
								//queueFrommasterToresid_2_);
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
									masterQueue.put(new ProtocolMessage(box.get(),155));
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
			case "resid_3_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),82));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 80) {
								setState(1);
								//queueFrommasterToresid_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 149) {
								setState(4);
								//queueFrommasterToresid_3_);
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
									masterQueue.put(new ProtocolMessage(box.get(),157));
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
			case "rprj_0_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),137));
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
									masterQueue.put(new ProtocolMessage(box.get(),30));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 3) {
								setState(2);
								//queueFrommasterTorprj_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 28) {
								setState(3);
								//queueFrommasterTorprj_0_);
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
			case "rprj_1_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),139));
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
									masterQueue.put(new ProtocolMessage(box.get(),46));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 44) {
								setState(3);
								//queueFrommasterTorprj_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 131) {
								setState(2);
								//queueFrommasterTorprj_1_);
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
			case "rprj_2_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = rprj_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 60) {
								setState(4);
								//queueFrommasterTorprj_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 133) {
								setState(3);
								//queueFrommasterTorprj_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),141));
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),62));
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
			case "rprj_3_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = rprj_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 76) {
								setState(3);
								//queueFrommasterTorprj_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 135) {
								setState(4);
								//queueFrommasterTorprj_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),78));
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),143));
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
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "interpd_1_","psinv_2_","psinv_3_","psinv_1_","rprj_2_","rprj_0_","interpd_2_","resid_2_","resid_3_","master","interpd_0_","rprj_1_","rprj_3_","resid_1_","resid_0_","psinv_0_","interpd_3_" };
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
