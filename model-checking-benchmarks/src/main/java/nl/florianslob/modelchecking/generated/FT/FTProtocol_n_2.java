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

public class FTProtocol_n_2 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTofft_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_1_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_42(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 2 :
						case 3 :
						case 5 :
						case 6 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
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
						case 4:
							if (queueFrommasterToevolve_0_.peek() != null ) {
								monitor.notifyAll();
								state = 12;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_0_.take());
							}
							monitor.wait();
							break;
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 8;
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 12:
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
						case 28:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 29;
								return Optional.empty();
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
							if (state >=0 && state <= 42){
								Optional result = exchange_0_42(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "evolve_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_42(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 7 :
						case 8 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
							monitor.wait();
							break;
						case 6:
							if (queueFrommasterToevolve_1_.peek() != null ) {
								monitor.notifyAll();
								state = 7;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_1_.take());
							}
							monitor.wait();
							break;
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 10;
									queueFromevolve_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 19:
							if (queueFrommasterToevolve_1_.peek() != null ) {
								monitor.notifyAll();
								state = 20;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToevolve_1_.take());
							}
							monitor.wait();
							break;
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 21;
									queueFromevolve_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 29:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 30;
								return Optional.empty();
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
							if (state >=0 && state <= 42){
								Optional result = exchange_0_42(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_42(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
							monitor.wait();
							break;
						case 2:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 35;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 41;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterTofft_0_.peek() != null ) {
								monitor.notifyAll();
								state = 16;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_0_.take());
							}
							monitor.wait();
							break;
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 17;
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 32:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 33;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 38;
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
							if (state >=0 && state <= 42){
								Optional result = exchange_0_42(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "fft_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_42(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 17 :
						case 18 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 34 :
						case 35 :
						case 37 :
						case 38 :
						case 40 :
						case 41 :
							monitor.wait();
							break;
						case 23:
							if (queueFrommasterTofft_1_.peek() != null ) {
								monitor.notifyAll();
								state = 24;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_1_.take());
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 25;
									queueFromfft_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 33:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 34;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 36:
							if (queueFrommasterTofft_1_.peek() != null ) {
								monitor.notifyAll();
								state = 37;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTofft_1_.take());
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
									state = 40;
									queueFromfft_1_Tomaster.put(box.get());
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
							if (state >=0 && state <= 42){
								Optional result = exchange_0_42(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_42(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 6 :
						case 7 :
						case 9 :
						case 12 :
						case 15 :
						case 16 :
						case 19 :
						case 20 :
						case 23 :
						case 24 :
						case 28 :
						case 29 :
						case 32 :
						case 33 :
						case 34 :
						case 36 :
						case 37 :
						case 39 :
							monitor.wait();
							break;
						case 0:
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 4;
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									monitor.notifyAll();
									state = 6;
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 8:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 9;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 10:
							if (queueFromevolve_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 11;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 11:
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 13:
							if (queueFromevolve_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 14;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 18;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									monitor.notifyAll();
									state = 19;
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 21:
							if (queueFromevolve_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 22;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromevolve_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 23;
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 25:
							if (queueFromfft_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 26;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_1_Tomaster.take());
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
						case 27:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 28;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 30:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 31;
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
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 38:
							if (queueFromfft_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 39;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 40:
							if (queueFromfft_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 11;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromfft_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									monitor.notifyAll();
									state = 36;
									queueFrommasterTofft_1_.put(box.get());
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
							if (state >=0 && state <= 42){
								Optional result = exchange_0_42(box, receiver, isCloseAction);
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
		return new String[] { "fft_1_","fft_0_","evolve_1_","master","evolve_0_" };
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
