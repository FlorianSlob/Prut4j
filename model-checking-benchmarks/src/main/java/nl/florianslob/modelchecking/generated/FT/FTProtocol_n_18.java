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

public class FTProtocol_n_18 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<ProtocolMessage> evolve_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> evolve_9_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> fft_9_Queue = new LinkedBlockingQueue<>();
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),77));
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
			case "evolve_10_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 24) {
								setState(3);
								//queueFrommasterToevolve_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 155) {
								setState(4);
								//queueFrommasterToevolve_10_);
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
									masterQueue.put(new ProtocolMessage(box.get(),60));
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
			case "evolve_11_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),165));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = evolve_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 26) {
								setState(4);
								//queueFrommasterToevolve_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 163) {
								setState(1);
								//queueFrommasterToevolve_11_);
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
			case "evolve_12_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 28) {
								setState(4);
								//queueFrommasterToevolve_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 171) {
								setState(3);
								//queueFrommasterToevolve_12_);
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
									masterQueue.put(new ProtocolMessage(box.get(),173));
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
									masterQueue.put(new ProtocolMessage(box.get(),64));
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
			case "evolve_13_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 30) {
								setState(2);
								//queueFrommasterToevolve_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 179) {
								setState(3);
								//queueFrommasterToevolve_13_);
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
									masterQueue.put(new ProtocolMessage(box.get(),66));
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
									masterQueue.put(new ProtocolMessage(box.get(),181));
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
			case "evolve_14_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),68));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = evolve_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 32) {
								setState(1);
								//queueFrommasterToevolve_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 187) {
								setState(4);
								//queueFrommasterToevolve_14_);
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
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),189));
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
			case "evolve_15_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),197));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = evolve_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 34) {
								setState(3);
								//queueFrommasterToevolve_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 195) {
								setState(1);
								//queueFrommasterToevolve_15_);
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
									masterQueue.put(new ProtocolMessage(box.get(),70));
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
			case "evolve_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),72));
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
									masterQueue.put(new ProtocolMessage(box.get(),205));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = evolve_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 36) {
								setState(1);
								//queueFrommasterToevolve_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 203) {
								setState(2);
								//queueFrommasterToevolve_16_);
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
			case "evolve_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),213));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = evolve_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 38) {
								setState(3);
								//queueFrommasterToevolve_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 211) {
								setState(1);
								//queueFrommasterToevolve_17_);
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
									masterQueue.put(new ProtocolMessage(box.get(),74));
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
									masterQueue.put(new ProtocolMessage(box.get(),85));
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
							if (objectToGet.OriginalTargetStateId == 83) {
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
									masterQueue.put(new ProtocolMessage(box.get(),42));
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
			case "evolve_2_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 8) {
								setState(2);
								//queueFrommasterToevolve_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 91) {
								setState(3);
								//queueFrommasterToevolve_2_);
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
									masterQueue.put(new ProtocolMessage(box.get(),44));
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
									masterQueue.put(new ProtocolMessage(box.get(),93));
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
			case "evolve_3_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),101));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = evolve_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 10) {
								setState(3);
								//queueFrommasterToevolve_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 99) {
								setState(1);
								//queueFrommasterToevolve_3_);
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
									masterQueue.put(new ProtocolMessage(box.get(),46));
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
			case "evolve_4_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 12) {
								setState(4);
								//queueFrommasterToevolve_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 107) {
								setState(3);
								//queueFrommasterToevolve_4_);
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
									masterQueue.put(new ProtocolMessage(box.get(),109));
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
									masterQueue.put(new ProtocolMessage(box.get(),48));
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
			case "evolve_5_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = evolve_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 14) {
								setState(2);
								//queueFrommasterToevolve_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 115) {
								setState(4);
								//queueFrommasterToevolve_5_);
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
									masterQueue.put(new ProtocolMessage(box.get(),50));
									return Optional.empty();
								}
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
									masterQueue.put(new ProtocolMessage(box.get(),117));
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
			case "evolve_6_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),52));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = evolve_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 16) {
								setState(2);
								//queueFrommasterToevolve_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 123) {
								setState(4);
								//queueFrommasterToevolve_6_);
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
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),125));
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
			case "evolve_7_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),133));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = evolve_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 18) {
								setState(4);
								//queueFrommasterToevolve_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 131) {
								setState(2);
								//queueFrommasterToevolve_7_);
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
									masterQueue.put(new ProtocolMessage(box.get(),54));
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
			case "evolve_8_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),56));
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
									masterQueue.put(new ProtocolMessage(box.get(),141));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = evolve_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 20) {
								setState(2);
								//queueFrommasterToevolve_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 139) {
								setState(3);
								//queueFrommasterToevolve_8_);
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
			case "evolve_9_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),149));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = evolve_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 22) {
								setState(4);
								//queueFrommasterToevolve_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 147) {
								setState(1);
								//queueFrommasterToevolve_9_);
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
									masterQueue.put(new ProtocolMessage(box.get(),58));
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
									masterQueue.put(new ProtocolMessage(box.get(),81));
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
							if (objectToGet.OriginalTargetStateId == 79) {
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
									masterQueue.put(new ProtocolMessage(box.get(),326));
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
			case "fft_10_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),161));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = fft_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 159) {
								setState(0);
								//queueFrommasterTofft_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 310) {
								setState(3);
								//queueFrommasterTofft_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 380) {
								setState(3);
								//queueFrommasterTofft_10_);
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
									masterQueue.put(new ProtocolMessage(box.get(),346));
									return Optional.empty();
								}
							}
						case 4:
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
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "fft_11_": return new IEnvironment() {
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
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),169));
									return Optional.empty();
								}
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),348));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 167) {
								setState(1);
								//queueFrommasterTofft_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 312) {
								setState(3);
								//queueFrommasterTofft_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 382) {
								setState(3);
								//queueFrommasterTofft_11_);
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
			case "fft_12_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),177));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = fft_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 175) {
								setState(0);
								//queueFrommasterTofft_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 314) {
								setState(4);
								//queueFrommasterTofft_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 384) {
								setState(4);
								//queueFrommasterTofft_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),350));
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
			case "fft_13_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = fft_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 183) {
								setState(2);
								//queueFrommasterTofft_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 316) {
								setState(4);
								//queueFrommasterTofft_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 386) {
								setState(4);
								//queueFrommasterTofft_13_);
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),185));
									return Optional.empty();
								}
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
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),352));
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
			case "fft_14_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),193));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = fft_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 191) {
								setState(0);
								//queueFrommasterTofft_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 318) {
								setState(3);
								//queueFrommasterTofft_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 388) {
								setState(3);
								//queueFrommasterTofft_14_);
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
									masterQueue.put(new ProtocolMessage(box.get(),354));
									return Optional.empty();
								}
							}
						case 4:
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
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "fft_15_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),356));
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),201));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = fft_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 199) {
								setState(2);
								//queueFrommasterTofft_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 320) {
								setState(1);
								//queueFrommasterTofft_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 390) {
								setState(1);
								//queueFrommasterTofft_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
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
			case "fft_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),209));
									return Optional.empty();
								}
							}
						case 1:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),358));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 207) {
								setState(0);
								//queueFrommasterTofft_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 322) {
								setState(3);
								//queueFrommasterTofft_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 392) {
								setState(3);
								//queueFrommasterTofft_16_);
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
			case "fft_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),360));
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
									masterQueue.put(new ProtocolMessage(box.get(),217));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 215) {
								setState(3);
								//queueFrommasterTofft_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 324) {
								setState(2);
								//queueFrommasterTofft_17_);
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
			case "fft_1_": return new IEnvironment() {
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
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 2:
							ProtocolMessage objectToGet = fft_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 87) {
								setState(4);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 292) {
								setState(3);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 362) {
								setState(3);
								//queueFrommasterTofft_1_);
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
									masterQueue.put(new ProtocolMessage(box.get(),328));
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
									masterQueue.put(new ProtocolMessage(box.get(),89));
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
			case "fft_2_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),97));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = fft_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 95) {
								setState(0);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 294) {
								setState(4);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 364) {
								setState(4);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),330));
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
			case "fft_3_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),105));
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
									masterQueue.put(new ProtocolMessage(box.get(),332));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 103) {
								setState(2);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 296) {
								setState(3);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 366) {
								setState(3);
								//queueFrommasterTofft_3_);
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
			case "fft_4_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),113));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = fft_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 111) {
								setState(0);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 298) {
								setState(4);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 368) {
								setState(4);
								//queueFrommasterTofft_4_);
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
									masterQueue.put(new ProtocolMessage(box.get(),334));
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
			case "fft_5_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = fft_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 119) {
								setState(3);
								//queueFrommasterTofft_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 300) {
								setState(4);
								//queueFrommasterTofft_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 370) {
								setState(4);
								//queueFrommasterTofft_5_);
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
									masterQueue.put(new ProtocolMessage(box.get(),121));
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
									masterQueue.put(new ProtocolMessage(box.get(),336));
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
			case "fft_6_": return new IEnvironment() {
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),129));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = fft_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 127) {
								setState(0);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 302) {
								setState(3);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 372) {
								setState(3);
								//queueFrommasterTofft_6_);
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
									masterQueue.put(new ProtocolMessage(box.get(),338));
									return Optional.empty();
								}
							}
						case 4:
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
						if (state >=0 && state <= 5){
							Optional result = exchange_0_5(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "fft_7_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),340));
									return Optional.empty();
								}
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
									masterQueue.put(new ProtocolMessage(box.get(),137));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = fft_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 135) {
								setState(3);
								//queueFrommasterTofft_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 304) {
								setState(1);
								//queueFrommasterTofft_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 374) {
								setState(1);
								//queueFrommasterTofft_7_);
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
			case "fft_8_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),145));
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),342));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = fft_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 143) {
								setState(0);
								//queueFrommasterTofft_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 306) {
								setState(2);
								//queueFrommasterTofft_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 376) {
								setState(2);
								//queueFrommasterTofft_8_);
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
			case "fft_9_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = fft_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 151) {
								setState(3);
								//queueFrommasterTofft_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 308) {
								setState(2);
								//queueFrommasterTofft_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 378) {
								setState(2);
								//queueFrommasterTofft_9_);
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
									masterQueue.put(new ProtocolMessage(box.get(),344));
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
									masterQueue.put(new ProtocolMessage(box.get(),153));
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
			case "master": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_197(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(180);
									fft_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
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
									setState(38);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(145);
									fft_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
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
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									setState(7);
									evolve_5_Queue.put(new ProtocolMessage(box.get(),14));
									return Optional.empty();
								}
							}
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(8);
									evolve_6_Queue.put(new ProtocolMessage(box.get(),16));
									return Optional.empty();
								}
							}
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									setState(9);
									evolve_7_Queue.put(new ProtocolMessage(box.get(),18));
									return Optional.empty();
								}
							}
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									setState(10);
									evolve_8_Queue.put(new ProtocolMessage(box.get(),20));
									return Optional.empty();
								}
							}
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									setState(11);
									evolve_9_Queue.put(new ProtocolMessage(box.get(),22));
									return Optional.empty();
								}
							}
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									setState(12);
									evolve_10_Queue.put(new ProtocolMessage(box.get(),24));
									return Optional.empty();
								}
							}
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									setState(13);
									evolve_11_Queue.put(new ProtocolMessage(box.get(),26));
									return Optional.empty();
								}
							}
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									setState(14);
									evolve_12_Queue.put(new ProtocolMessage(box.get(),28));
									return Optional.empty();
								}
							}
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									setState(15);
									evolve_13_Queue.put(new ProtocolMessage(box.get(),30));
									return Optional.empty();
								}
							}
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_14_";
								}
								if (receiver.equals("evolve_14_")) {
									setState(16);
									evolve_14_Queue.put(new ProtocolMessage(box.get(),32));
									return Optional.empty();
								}
							}
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_15_";
								}
								if (receiver.equals("evolve_15_")) {
									setState(17);
									evolve_15_Queue.put(new ProtocolMessage(box.get(),34));
									return Optional.empty();
								}
							}
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_16_";
								}
								if (receiver.equals("evolve_16_")) {
									setState(18);
									evolve_16_Queue.put(new ProtocolMessage(box.get(),36));
									return Optional.empty();
								}
							}
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_17_";
								}
								if (receiver.equals("evolve_17_")) {
									setState(19);
									evolve_17_Queue.put(new ProtocolMessage(box.get(),38));
									return Optional.empty();
								}
							}
						case 19:
							setState(20);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 20:
							setState(21);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 21:
							setState(22);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 22:
							setState(23);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 23:
							setState(24);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 24:
							setState(25);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 25:
							setState(26);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 26:
							setState(27);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 27:
							setState(28);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 28:
							setState(29);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 29:
							setState(30);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 30:
							setState(31);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 31:
							setState(32);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 32:
							setState(33);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 33:
							setState(34);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 34:
							setState(35);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 35:
							setState(36);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 36:
							setState(37);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 37:
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
									setState(38);
									evolve_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(145);
									fft_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(180);
									fft_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
						case 38:
							setState(39);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(40);
									fft_0_Queue.put(new ProtocolMessage(box.get(),79));
									return Optional.empty();
								}
							}
						case 40:
							setState(41);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(42);
									evolve_1_Queue.put(new ProtocolMessage(box.get(),83));
									return Optional.empty();
								}
							}
						case 42:
							setState(43);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 43:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(44);
									fft_1_Queue.put(new ProtocolMessage(box.get(),87));
									return Optional.empty();
								}
							}
						case 44:
							setState(45);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									setState(46);
									evolve_2_Queue.put(new ProtocolMessage(box.get(),91));
									return Optional.empty();
								}
							}
						case 46:
							setState(47);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(48);
									fft_2_Queue.put(new ProtocolMessage(box.get(),95));
									return Optional.empty();
								}
							}
						case 48:
							setState(49);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									setState(50);
									evolve_3_Queue.put(new ProtocolMessage(box.get(),99));
									return Optional.empty();
								}
							}
						case 50:
							setState(51);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 51:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(52);
									fft_3_Queue.put(new ProtocolMessage(box.get(),103));
									return Optional.empty();
								}
							}
						case 52:
							setState(53);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 53:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									setState(54);
									evolve_4_Queue.put(new ProtocolMessage(box.get(),107));
									return Optional.empty();
								}
							}
						case 54:
							setState(55);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(56);
									fft_4_Queue.put(new ProtocolMessage(box.get(),111));
									return Optional.empty();
								}
							}
						case 56:
							setState(57);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 57:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									setState(58);
									evolve_5_Queue.put(new ProtocolMessage(box.get(),115));
									return Optional.empty();
								}
							}
						case 58:
							setState(59);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 59:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(60);
									fft_5_Queue.put(new ProtocolMessage(box.get(),119));
									return Optional.empty();
								}
							}
						case 60:
							setState(61);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 61:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(62);
									evolve_6_Queue.put(new ProtocolMessage(box.get(),123));
									return Optional.empty();
								}
							}
						case 62:
							setState(63);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 63:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(64);
									fft_6_Queue.put(new ProtocolMessage(box.get(),127));
									return Optional.empty();
								}
							}
						case 64:
							setState(65);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 65:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									setState(66);
									evolve_7_Queue.put(new ProtocolMessage(box.get(),131));
									return Optional.empty();
								}
							}
						case 66:
							setState(67);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 67:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(68);
									fft_7_Queue.put(new ProtocolMessage(box.get(),135));
									return Optional.empty();
								}
							}
						case 68:
							setState(69);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 69:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									setState(70);
									evolve_8_Queue.put(new ProtocolMessage(box.get(),139));
									return Optional.empty();
								}
							}
						case 70:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(72);
									fft_8_Queue.put(new ProtocolMessage(box.get(),143));
									return Optional.empty();
								}
							}
						case 72:
							setState(73);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									setState(74);
									evolve_9_Queue.put(new ProtocolMessage(box.get(),147));
									return Optional.empty();
								}
							}
						case 74:
							setState(75);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(76);
									fft_9_Queue.put(new ProtocolMessage(box.get(),151));
									return Optional.empty();
								}
							}
						case 76:
							setState(77);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									setState(78);
									evolve_10_Queue.put(new ProtocolMessage(box.get(),155));
									return Optional.empty();
								}
							}
						case 78:
							setState(79);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(80);
									fft_10_Queue.put(new ProtocolMessage(box.get(),159));
									return Optional.empty();
								}
							}
						case 80:
							setState(81);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 81:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									setState(82);
									evolve_11_Queue.put(new ProtocolMessage(box.get(),163));
									return Optional.empty();
								}
							}
						case 82:
							setState(83);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(84);
									fft_11_Queue.put(new ProtocolMessage(box.get(),167));
									return Optional.empty();
								}
							}
						case 84:
							setState(85);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									setState(86);
									evolve_12_Queue.put(new ProtocolMessage(box.get(),171));
									return Optional.empty();
								}
							}
						case 86:
							setState(87);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(88);
									fft_12_Queue.put(new ProtocolMessage(box.get(),175));
									return Optional.empty();
								}
							}
						case 88:
							setState(89);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									setState(90);
									evolve_13_Queue.put(new ProtocolMessage(box.get(),179));
									return Optional.empty();
								}
							}
						case 90:
							setState(91);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(92);
									fft_13_Queue.put(new ProtocolMessage(box.get(),183));
									return Optional.empty();
								}
							}
						case 92:
							setState(93);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_14_";
								}
								if (receiver.equals("evolve_14_")) {
									setState(94);
									evolve_14_Queue.put(new ProtocolMessage(box.get(),187));
									return Optional.empty();
								}
							}
						case 94:
							setState(95);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									setState(96);
									fft_14_Queue.put(new ProtocolMessage(box.get(),191));
									return Optional.empty();
								}
							}
						case 96:
							setState(97);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_15_";
								}
								if (receiver.equals("evolve_15_")) {
									setState(98);
									evolve_15_Queue.put(new ProtocolMessage(box.get(),195));
									return Optional.empty();
								}
							}
						case 98:
							setState(99);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									setState(100);
									fft_15_Queue.put(new ProtocolMessage(box.get(),199));
									return Optional.empty();
								}
							}
						case 100:
							setState(101);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_16_";
								}
								if (receiver.equals("evolve_16_")) {
									setState(102);
									evolve_16_Queue.put(new ProtocolMessage(box.get(),203));
									return Optional.empty();
								}
							}
						case 102:
							setState(103);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									setState(104);
									fft_16_Queue.put(new ProtocolMessage(box.get(),207));
									return Optional.empty();
								}
							}
						case 104:
							setState(105);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_17_";
								}
								if (receiver.equals("evolve_17_")) {
									setState(106);
									evolve_17_Queue.put(new ProtocolMessage(box.get(),211));
									return Optional.empty();
								}
							}
						case 106:
							setState(107);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									setState(108);
									fft_17_Queue.put(new ProtocolMessage(box.get(),215));
									return Optional.empty();
								}
							}
						case 108:
							setState(109);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 109:
							if (isCloseAction) {
								setState(110);
								return Optional.empty();
							}
						case 110:
							if (isCloseAction) {
								setState(111);
								return Optional.empty();
							}
						case 111:
							if (isCloseAction) {
								setState(112);
								return Optional.empty();
							}
						case 112:
							if (isCloseAction) {
								setState(113);
								return Optional.empty();
							}
						case 113:
							if (isCloseAction) {
								setState(114);
								return Optional.empty();
							}
						case 114:
							if (isCloseAction) {
								setState(115);
								return Optional.empty();
							}
						case 115:
							if (isCloseAction) {
								setState(116);
								return Optional.empty();
							}
						case 116:
							if (isCloseAction) {
								setState(117);
								return Optional.empty();
							}
						case 117:
							if (isCloseAction) {
								setState(118);
								return Optional.empty();
							}
						case 118:
							if (isCloseAction) {
								setState(119);
								return Optional.empty();
							}
						case 119:
							if (isCloseAction) {
								setState(120);
								return Optional.empty();
							}
						case 120:
							if (isCloseAction) {
								setState(121);
								return Optional.empty();
							}
						case 121:
							if (isCloseAction) {
								setState(122);
								return Optional.empty();
							}
						case 122:
							if (isCloseAction) {
								setState(123);
								return Optional.empty();
							}
						case 123:
							if (isCloseAction) {
								setState(124);
								return Optional.empty();
							}
						case 124:
							if (isCloseAction) {
								setState(125);
								return Optional.empty();
							}
						case 125:
							if (isCloseAction) {
								setState(126);
								return Optional.empty();
							}
						case 126:
							if (isCloseAction) {
								setState(127);
								return Optional.empty();
							}
						case 127:
							if (isCloseAction) {
								setState(128);
								return Optional.empty();
							}
						case 128:
							if (isCloseAction) {
								setState(129);
								return Optional.empty();
							}
						case 129:
							if (isCloseAction) {
								setState(130);
								return Optional.empty();
							}
						case 130:
							if (isCloseAction) {
								setState(131);
								return Optional.empty();
							}
						case 131:
							if (isCloseAction) {
								setState(132);
								return Optional.empty();
							}
						case 132:
							if (isCloseAction) {
								setState(133);
								return Optional.empty();
							}
						case 133:
							if (isCloseAction) {
								setState(134);
								return Optional.empty();
							}
						case 134:
							if (isCloseAction) {
								setState(135);
								return Optional.empty();
							}
						case 135:
							if (isCloseAction) {
								setState(136);
								return Optional.empty();
							}
						case 136:
							if (isCloseAction) {
								setState(137);
								return Optional.empty();
							}
						case 137:
							if (isCloseAction) {
								setState(138);
								return Optional.empty();
							}
						case 138:
							if (isCloseAction) {
								setState(139);
								return Optional.empty();
							}
						case 139:
							if (isCloseAction) {
								setState(140);
								return Optional.empty();
							}
						case 140:
							if (isCloseAction) {
								setState(141);
								return Optional.empty();
							}
						case 141:
							if (isCloseAction) {
								setState(142);
								return Optional.empty();
							}
						case 142:
							if (isCloseAction) {
								setState(143);
								return Optional.empty();
							}
						case 143:
							if (isCloseAction) {
								setState(144);
								return Optional.empty();
							}
						case 144:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 145:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(146);
									fft_1_Queue.put(new ProtocolMessage(box.get(),292));
									return Optional.empty();
								}
							}
						case 146:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(147);
									fft_2_Queue.put(new ProtocolMessage(box.get(),294));
									return Optional.empty();
								}
							}
						case 147:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(148);
									fft_3_Queue.put(new ProtocolMessage(box.get(),296));
									return Optional.empty();
								}
							}
						case 148:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(149);
									fft_4_Queue.put(new ProtocolMessage(box.get(),298));
									return Optional.empty();
								}
							}
						case 149:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(150);
									fft_5_Queue.put(new ProtocolMessage(box.get(),300));
									return Optional.empty();
								}
							}
						case 150:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(151);
									fft_6_Queue.put(new ProtocolMessage(box.get(),302));
									return Optional.empty();
								}
							}
						case 151:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(152);
									fft_7_Queue.put(new ProtocolMessage(box.get(),304));
									return Optional.empty();
								}
							}
						case 152:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(153);
									fft_8_Queue.put(new ProtocolMessage(box.get(),306));
									return Optional.empty();
								}
							}
						case 153:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(154);
									fft_9_Queue.put(new ProtocolMessage(box.get(),308));
									return Optional.empty();
								}
							}
						case 154:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(155);
									fft_10_Queue.put(new ProtocolMessage(box.get(),310));
									return Optional.empty();
								}
							}
						case 155:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(156);
									fft_11_Queue.put(new ProtocolMessage(box.get(),312));
									return Optional.empty();
								}
							}
						case 156:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(157);
									fft_12_Queue.put(new ProtocolMessage(box.get(),314));
									return Optional.empty();
								}
							}
						case 157:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(158);
									fft_13_Queue.put(new ProtocolMessage(box.get(),316));
									return Optional.empty();
								}
							}
						case 158:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									setState(159);
									fft_14_Queue.put(new ProtocolMessage(box.get(),318));
									return Optional.empty();
								}
							}
						case 159:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									setState(160);
									fft_15_Queue.put(new ProtocolMessage(box.get(),320));
									return Optional.empty();
								}
							}
						case 160:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									setState(161);
									fft_16_Queue.put(new ProtocolMessage(box.get(),322));
									return Optional.empty();
								}
							}
						case 161:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									setState(162);
									fft_17_Queue.put(new ProtocolMessage(box.get(),324));
									return Optional.empty();
								}
							}
						case 162:
							setState(163);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 163:
							setState(164);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 164:
							setState(165);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 165:
							setState(166);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 166:
							setState(167);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 167:
							setState(168);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 168:
							setState(169);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 169:
							setState(170);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 170:
							setState(171);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 171:
							setState(172);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 172:
							setState(173);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 173:
							setState(174);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 174:
							setState(175);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 175:
							setState(176);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 176:
							setState(177);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 177:
							setState(178);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 178:
							setState(179);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 179:
							setState(37);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 180:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(181);
									fft_1_Queue.put(new ProtocolMessage(box.get(),362));
									return Optional.empty();
								}
							}
						case 181:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(182);
									fft_2_Queue.put(new ProtocolMessage(box.get(),364));
									return Optional.empty();
								}
							}
						case 182:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(183);
									fft_3_Queue.put(new ProtocolMessage(box.get(),366));
									return Optional.empty();
								}
							}
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(184);
									fft_4_Queue.put(new ProtocolMessage(box.get(),368));
									return Optional.empty();
								}
							}
						case 184:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(185);
									fft_5_Queue.put(new ProtocolMessage(box.get(),370));
									return Optional.empty();
								}
							}
						case 185:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(186);
									fft_6_Queue.put(new ProtocolMessage(box.get(),372));
									return Optional.empty();
								}
							}
						case 186:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(187);
									fft_7_Queue.put(new ProtocolMessage(box.get(),374));
									return Optional.empty();
								}
							}
						case 187:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(188);
									fft_8_Queue.put(new ProtocolMessage(box.get(),376));
									return Optional.empty();
								}
							}
						case 188:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(189);
									fft_9_Queue.put(new ProtocolMessage(box.get(),378));
									return Optional.empty();
								}
							}
						case 189:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(190);
									fft_10_Queue.put(new ProtocolMessage(box.get(),380));
									return Optional.empty();
								}
							}
						case 190:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(191);
									fft_11_Queue.put(new ProtocolMessage(box.get(),382));
									return Optional.empty();
								}
							}
						case 191:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(192);
									fft_12_Queue.put(new ProtocolMessage(box.get(),384));
									return Optional.empty();
								}
							}
						case 192:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(193);
									fft_13_Queue.put(new ProtocolMessage(box.get(),386));
									return Optional.empty();
								}
							}
						case 193:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_14_";
								}
								if (receiver.equals("fft_14_")) {
									setState(194);
									fft_14_Queue.put(new ProtocolMessage(box.get(),388));
									return Optional.empty();
								}
							}
						case 194:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_15_";
								}
								if (receiver.equals("fft_15_")) {
									setState(195);
									fft_15_Queue.put(new ProtocolMessage(box.get(),390));
									return Optional.empty();
								}
							}
						case 195:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_16_";
								}
								if (receiver.equals("fft_16_")) {
									setState(196);
									fft_16_Queue.put(new ProtocolMessage(box.get(),392));
									return Optional.empty();
								}
							}
						case 196:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_17_";
								}
								if (receiver.equals("fft_17_")) {
									setState(162);
									fft_17_Queue.put(new ProtocolMessage(box.get(),324));
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 197){
							Optional result = exchange_0_197(box, receiver, isCloseAction);
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
		return new String[] { "evolve_0_","fft_2_","fft_17_","evolve_6_","evolve_8_","fft_14_","evolve_16_","fft_0_","evolve_12_","fft_7_","master","evolve_15_","fft_8_","evolve_5_","fft_5_","fft_9_","fft_10_","evolve_17_","evolve_3_","fft_4_","evolve_7_","fft_3_","evolve_1_","evolve_10_","fft_16_","evolve_11_","evolve_4_","fft_13_","fft_1_","evolve_9_","fft_12_","evolve_14_","fft_6_","fft_15_","evolve_2_","evolve_13_","fft_11_" };
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
