/* !!! IMPORTANT !!!
 * !!! This code is generated from a protocol definition. !!!
 * !!! Any Changes made to this code could be overridden. !!!
 * !!! If you want to change the protocol, change its definition and regenerate this code. !!!
 **/
package nl.florianslob.modelchecking.generated.FT;

// Import types from the API
import nl.florianslob.modelchecking.base.api.v2.*;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class FTProtocol_n_1 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTofft_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_0_ = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_58(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 2 :
						case 4 :
						case 6 :
						case 7 :
						case 10 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 19 :
						case 22 :
						case 25 :
						case 26 :
						case 27 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 47 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
							monitor.wait();
							break;
						case 1:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 5;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 8;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 6;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 10;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 11;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 13;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 19;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 18:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 22;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 20:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 30;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 37;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 23:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 25;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 24:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 29;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 28:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 33:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 25;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 34:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 32;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 35:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 36:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 29;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 39;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 41;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 47;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 48:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 44;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 45;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 50:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 51;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 51:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 47;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 57:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 51;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 58){
								var result = exchange_0_58(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_58(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 3 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 10 :
						case 12 :
						case 16 :
						case 21 :
						case 24 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 31 :
						case 32 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 41 :
						case 42 :
						case 43 :
						case 45 :
						case 46 :
						case 47 :
						case 49 :
						case 50 :
						case 51 :
						case 53 :
						case 55 :
						case 56 :
						case 57 :
							monitor.wait();
							break;
						case 2:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 4:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 54;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 48;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 44;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 39;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 14:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 15;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 16;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 21;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 18:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 24;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 19:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 31;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 20:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 34;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 22:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 26;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 23:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 28;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 25:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 30:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 32;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 33:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 28;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 38:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 15;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 41;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 16;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 45;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 49;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 53;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 55;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 58){
								var result = exchange_0_58(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "master": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_58(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 5 :
						case 9 :
						case 11 :
						case 14 :
						case 15 :
						case 23 :
						case 25 :
						case 27 :
						case 28 :
						case 33 :
						case 35 :
						case 38 :
						case 40 :
						case 44 :
						case 46 :
						case 48 :
						case 50 :
						case 51 :
						case 52 :
						case 57 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									var receiverOptionsArray = new String[]{ "evolve_0_","fft_0_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 6:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 7;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									var receiverOptionsArray = new String[]{ "evolve_0_","fft_0_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 12;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 14;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 13:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 38;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 16:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 17;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 17:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 18;
								return Optional.empty();
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 20;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 18:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 23;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 19:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 22;
								return Optional.empty();
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 30;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 20:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 33;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 21:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 36;
								return Optional.empty();
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 34;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 22:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 25;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 24:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 28;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 26:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 29:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 30:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 25;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 31:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 32;
								return Optional.empty();
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 29;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 32:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 27;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 34:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 35;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 36:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 28;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 32;
								return Optional.empty();
							}
							if (isCloseAction) {
								monitor.notifyAll();
								state = 29;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 39:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 40;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 43;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 42;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 42:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 17;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 43:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 17;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 45:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 46;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 47:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 17;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 50;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 53:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 7;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 48;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 49;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 56;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 57;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 58){
								var result = exchange_0_58(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "evolve_0_","fft_0_","master" };
	}
	
	@Override
	public Object[] dummies(){
		return new Object[]{"TestStringDummy"};
	}
	
	@Override
	public int getState(){
		return this.state;
	}
}
