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

public class FTProtocol_n_7 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTofft_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_1_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "evolve_0_": return new IEnvironment() {
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
									setState(4);
									queueFromevolve_0_Tomaster.put(box.get());
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
									queueFromevolve_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToevolve_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterToevolve_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
			case "evolve_1_": return new IEnvironment() {
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
									queueFromevolve_1_Tomaster.put(box.get());
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
									queueFromevolve_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToevolve_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(1);
								//queueFrommasterToevolve_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterToevolve_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									setState(4);
									queueFromevolve_2_Tomaster.put(box.get());
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
									queueFromevolve_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToevolve_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterToevolve_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
						case 1 :
							wait();
							break;
						case 0:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterToevolve_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								//queueFrommasterToevolve_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromevolve_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromevolve_3_Tomaster.put(box.get());
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
			case "evolve_4_": return new IEnvironment() {
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
									setState(2);
									queueFromevolve_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromevolve_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToevolve_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterToevolve_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
							Any objectToGet = (Any)queueFrommasterToevolve_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(4);
								//queueFrommasterToevolve_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterToevolve_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromevolve_5_Tomaster.put(box.get());
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
									queueFromevolve_5_Tomaster.put(box.get());
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
									setState(2);
									queueFromevolve_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromevolve_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToevolve_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterToevolve_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTofft_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(4);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(4);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_0_Tomaster.put(box.get());
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
			case "fft_1_": return new IEnvironment() {
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
									queueFromfft_1_Tomaster.put(box.get());
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
									queueFromfft_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(1);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(1);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_2_Tomaster.put(box.get());
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
									queueFromfft_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTofft_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(1);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(1);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
			case "fft_3_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterTofft_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(2);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(2);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
									queueFromfft_3_Tomaster.put(box.get());
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
									queueFromfft_3_Tomaster.put(box.get());
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
			case "fft_4_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterTofft_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromfft_4_Tomaster.put(box.get());
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
									queueFromfft_4_Tomaster.put(box.get());
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
			case "fft_5_": return new IEnvironment() {
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
									setState(4);
									queueFromfft_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromfft_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterTofft_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(2);
								//queueFrommasterTofft_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(2);
								//queueFrommasterTofft_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
							Any objectToGet = (Any)queueFrommasterTofft_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(4);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_6_Tomaster.put(box.get());
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
									queueFromfft_6_Tomaster.put(box.get());
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
			case "master": return new IEnvironment() {
				private int state = 0;
				
				public void setState(int newState){
					state = newState;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_76(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
									setState(13);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(70);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(5);
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(29);
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_0_Tomaster.take());
						case 3:
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_1_Tomaster.take());
						case 4:
							setState(6);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_2_Tomaster.take());
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(7);
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 6:
							setState(8);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_3_Tomaster.take());
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									setState(9);
									queueFrommasterToevolve_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 8:
							setState(10);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_4_Tomaster.take());
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									setState(11);
									queueFrommasterToevolve_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 10:
							setState(12);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_5_Tomaster.take());
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									setState(14);
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 12:
							setState(28);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_6_Tomaster.take());
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(16);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									setState(15);
									queueFrommasterToevolve_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(18);
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(17);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(19);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 18:
							setState(20);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_0_Tomaster.take());
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(21);
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 20:
							setState(22);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_1_Tomaster.take());
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(23);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 22:
							setState(24);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_2_Tomaster.take());
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(2);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 24:
							setState(25);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_3_Tomaster.take());
						case 25:
							setState(26);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_4_Tomaster.take());
						case 26:
							setState(27);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_5_Tomaster.take());
						case 27:
							setState(28);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_6_Tomaster.take());
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(29);
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(13);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(5);
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(70);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 29:
							setState(30);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_0_Tomaster.take());
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(31);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 31:
							setState(32);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_0_Tomaster.take());
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(33);
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 33:
							setState(34);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_1_Tomaster.take());
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(35);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 35:
							setState(36);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_1_Tomaster.take());
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									setState(37);
									queueFrommasterToevolve_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 37:
							setState(38);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_2_Tomaster.take());
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(39);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 39:
							setState(40);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_2_Tomaster.take());
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									setState(41);
									queueFrommasterToevolve_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 41:
							setState(42);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_3_Tomaster.take());
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(43);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 43:
							setState(44);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_3_Tomaster.take());
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									setState(45);
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 45:
							setState(46);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_4_Tomaster.take());
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(47);
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 47:
							setState(48);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_4_Tomaster.take());
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									setState(49);
									queueFrommasterToevolve_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 49:
							setState(50);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_5_Tomaster.take());
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(51);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 51:
							setState(52);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_5_Tomaster.take());
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(53);
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 53:
							setState(54);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_6_Tomaster.take());
						case 54:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(55);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 55:
							setState(56);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_6_Tomaster.take());
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
								setState(1);
								return Optional.empty();
							}
						case 70:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(71);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(72);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 72:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(73);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(74);
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 74:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(75);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(2);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 76){
							Optional result = exchange_0_76(box, receiver, isCloseAction);
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
		return new String[] { "evolve_2_","fft_3_","fft_2_","evolve_3_","fft_5_","evolve_0_","evolve_5_","fft_4_","fft_6_","fft_1_","evolve_4_","master","evolve_6_","evolve_1_","fft_0_" };
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
