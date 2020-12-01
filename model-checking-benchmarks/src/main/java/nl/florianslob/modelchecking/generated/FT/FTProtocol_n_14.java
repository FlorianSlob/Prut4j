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

public class FTProtocol_n_14 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterToevolve_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTofft_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromfft_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromevolve_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToevolve_0_ = new LinkedBlockingQueue<>(); 
	
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
							Any objectToGet = (Any)queueFrommasterToevolve_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(4);
								//queueFrommasterToevolve_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterToevolve_0_);
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
									queueFromevolve_0_Tomaster.put(box.get());
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
									queueFromevolve_0_Tomaster.put(box.get());
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
			case "evolve_10_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterToevolve_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								//queueFrommasterToevolve_10_);
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
									queueFromevolve_10_Tomaster.put(box.get());
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
									queueFromevolve_10_Tomaster.put(box.get());
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
									queueFromevolve_11_Tomaster.put(box.get());
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
									queueFromevolve_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToevolve_11_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterToevolve_11_);
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
			case "evolve_12_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterToevolve_12_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								//queueFrommasterToevolve_12_);
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
									queueFromevolve_12_Tomaster.put(box.get());
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
									queueFromevolve_12_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToevolve_13_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(4);
								//queueFrommasterToevolve_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterToevolve_13_);
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
									setState(3);
									queueFromevolve_13_Tomaster.put(box.get());
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
									queueFromevolve_13_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToevolve_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								//queueFrommasterToevolve_2_);
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
									queueFromevolve_2_Tomaster.put(box.get());
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
									queueFromevolve_2_Tomaster.put(box.get());
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
			case "evolve_3_": return new IEnvironment() {
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
									setState(3);
									queueFromevolve_3_Tomaster.put(box.get());
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
									queueFromevolve_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToevolve_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								//queueFrommasterToevolve_3_);
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
			case "evolve_4_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterToevolve_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterToevolve_4_);
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
									queueFromevolve_4_Tomaster.put(box.get());
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
									queueFromevolve_4_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToevolve_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterToevolve_5_);
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
									queueFromevolve_5_Tomaster.put(box.get());
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
									queueFromevolve_5_Tomaster.put(box.get());
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
			case "evolve_6_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterToevolve_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(2);
								//queueFrommasterToevolve_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterToevolve_6_);
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
									queueFromevolve_6_Tomaster.put(box.get());
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
									queueFromevolve_6_Tomaster.put(box.get());
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
			case "evolve_7_": return new IEnvironment() {
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
									queueFromevolve_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterToevolve_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(3);
								//queueFrommasterToevolve_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								//queueFrommasterToevolve_7_);
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
									queueFromevolve_7_Tomaster.put(box.get());
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
			case "evolve_8_": return new IEnvironment() {
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
									queueFromevolve_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToevolve_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(4);
								//queueFrommasterToevolve_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterToevolve_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									queueFromevolve_8_Tomaster.put(box.get());
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
			case "evolve_9_": return new IEnvironment() {
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
									queueFromevolve_9_Tomaster.put(box.get());
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
									queueFromevolve_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToevolve_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class) {
								setState(1);
								//queueFrommasterToevolve_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterToevolve_9_);
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
								setState(0);
								//queueFrommasterTofft_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTofft_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_10_);
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
									queueFromfft_10_Tomaster.put(box.get());
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
									queueFromfft_11_Tomaster.put(box.get());
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
									queueFromfft_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTofft_11_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterTofft_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(1);
								//queueFrommasterTofft_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(1);
								//queueFrommasterTofft_11_);
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
			case "fft_12_": return new IEnvironment() {
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
									queueFromfft_12_Tomaster.put(box.get());
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
									queueFromfft_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_12_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_12_);
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
			case "fft_13_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterTofft_13_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								//queueFrommasterTofft_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_13_);
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
									queueFromfft_13_Tomaster.put(box.get());
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
									queueFromfft_13_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterTofft_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(4);
								//queueFrommasterTofft_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(4);
								//queueFrommasterTofft_1_);
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
									queueFromfft_1_Tomaster.put(box.get());
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
									queueFromfft_1_Tomaster.put(box.get());
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
									setState(4);
									queueFromfft_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTofft_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_2_);
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
									queueFromfft_2_Tomaster.put(box.get());
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
									queueFromfft_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(1);
								//queueFrommasterTofft_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(1);
								//queueFrommasterTofft_3_);
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
			case "fft_4_": return new IEnvironment() {
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
									queueFromfft_4_Tomaster.put(box.get());
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
									queueFromfft_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(2);
								//queueFrommasterTofft_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(2);
								//queueFrommasterTofft_4_);
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
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(1);
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
									setState(4);
									queueFromfft_5_Tomaster.put(box.get());
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
									queueFromfft_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTofft_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_6_);
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
									queueFromfft_6_Tomaster.put(box.get());
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
									setState(2);
									queueFromfft_7_Tomaster.put(box.get());
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
									queueFromfft_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTofft_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								//queueFrommasterTofft_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(3);
								//queueFrommasterTofft_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(3);
								//queueFrommasterTofft_7_);
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
			case "fft_8_": return new IEnvironment() {
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
									queueFromfft_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTofft_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(0);
								//queueFrommasterTofft_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(4);
								//queueFrommasterTofft_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(4);
								//queueFrommasterTofft_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
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
									queueFromfft_8_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterTofft_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								//queueFrommasterTofft_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class) {
								setState(4);
								//queueFrommasterTofft_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class) {
								setState(4);
								//queueFrommasterTofft_9_);
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
									setState(3);
									queueFromfft_9_Tomaster.put(box.get());
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
									queueFromfft_9_Tomaster.put(box.get());
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_153(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
							wait();
							break;
						case 0:
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(25);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(139);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(56);
									queueFrommasterToevolve_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							setState(3);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_1_Tomaster.take());
						case 3:
							setState(4);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_2_Tomaster.take());
						case 4:
							setState(6);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_3_Tomaster.take());
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
							return Optional.of((Any)queueFromfft_4_Tomaster.take());
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
							return Optional.of((Any)queueFromfft_5_Tomaster.take());
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
							return Optional.of((Any)queueFromfft_6_Tomaster.take());
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									setState(13);
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 12:
							setState(14);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_7_Tomaster.take());
						case 13:
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
						case 14:
							setState(16);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_8_Tomaster.take());
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(17);
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 16:
							setState(18);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_9_Tomaster.take());
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									setState(19);
									queueFrommasterToevolve_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 18:
							setState(20);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_10_Tomaster.take());
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									setState(21);
									queueFrommasterToevolve_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 20:
							setState(22);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_11_Tomaster.take());
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									setState(23);
									queueFrommasterToevolve_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 22:
							setState(24);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_12_Tomaster.take());
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									setState(26);
									queueFrommasterToevolve_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 24:
							setState(55);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_13_Tomaster.take());
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(28);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									setState(27);
									queueFrommasterToevolve_11_.put(box.get());
									return Optional.empty();
								}
							}
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									setState(29);
									queueFrommasterToevolve_12_.put(box.get());
									return Optional.empty();
								}
							}
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(30);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.EvolveMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									setState(32);
									queueFrommasterToevolve_13_.put(box.get());
									return Optional.empty();
								}
							}
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(31);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(33);
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 32:
							setState(34);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_0_Tomaster.take());
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(35);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 34:
							setState(36);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_1_Tomaster.take());
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(37);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 36:
							setState(38);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_2_Tomaster.take());
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(39);
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 38:
							setState(40);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_3_Tomaster.take());
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(41);
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 40:
							setState(42);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_4_Tomaster.take());
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(43);
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 42:
							setState(44);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_5_Tomaster.take());
						case 43:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(45);
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 44:
							setState(46);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_6_Tomaster.take());
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(47);
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
						case 46:
							setState(48);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_7_Tomaster.take());
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(49);
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
						case 48:
							setState(50);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_8_Tomaster.take());
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(152);
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
						case 50:
							setState(51);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_9_Tomaster.take());
						case 51:
							setState(52);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_10_Tomaster.take());
						case 52:
							setState(53);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_11_Tomaster.take());
						case 53:
							setState(54);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_12_Tomaster.take());
						case 54:
							setState(55);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_13_Tomaster.take());
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_0_";
								}
								if (receiver.equals("evolve_0_")) {
									setState(56);
									queueFrommasterToevolve_0_.put(box.get());
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
									setState(139);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTSetVariablesMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(25);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 56:
							setState(57);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_0_Tomaster.take());
						case 57:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_0_";
								}
								if (receiver.equals("fft_0_")) {
									setState(58);
									queueFrommasterTofft_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 58:
							setState(59);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_0_Tomaster.take());
						case 59:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_1_";
								}
								if (receiver.equals("evolve_1_")) {
									setState(60);
									queueFrommasterToevolve_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 60:
							setState(61);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_1_Tomaster.take());
						case 61:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(62);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 62:
							setState(63);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_1_Tomaster.take());
						case 63:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_2_";
								}
								if (receiver.equals("evolve_2_")) {
									setState(64);
									queueFrommasterToevolve_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 64:
							setState(65);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_2_Tomaster.take());
						case 65:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(66);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 66:
							setState(67);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_2_Tomaster.take());
						case 67:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_3_";
								}
								if (receiver.equals("evolve_3_")) {
									setState(68);
									queueFrommasterToevolve_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 68:
							setState(69);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_3_Tomaster.take());
						case 69:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(70);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 70:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_3_Tomaster.take());
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_4_";
								}
								if (receiver.equals("evolve_4_")) {
									setState(72);
									queueFrommasterToevolve_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 72:
							setState(73);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_4_Tomaster.take());
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
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
							setState(75);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_4_Tomaster.take());
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_5_";
								}
								if (receiver.equals("evolve_5_")) {
									setState(76);
									queueFrommasterToevolve_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 76:
							setState(77);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_5_Tomaster.take());
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(78);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 78:
							setState(79);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_5_Tomaster.take());
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_6_";
								}
								if (receiver.equals("evolve_6_")) {
									setState(80);
									queueFrommasterToevolve_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 80:
							setState(81);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_6_Tomaster.take());
						case 81:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(82);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 82:
							setState(83);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_6_Tomaster.take());
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_7_";
								}
								if (receiver.equals("evolve_7_")) {
									setState(84);
									queueFrommasterToevolve_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 84:
							setState(85);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_7_Tomaster.take());
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(86);
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 86:
							setState(87);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_7_Tomaster.take());
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_8_";
								}
								if (receiver.equals("evolve_8_")) {
									setState(88);
									queueFrommasterToevolve_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 88:
							setState(89);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_8_Tomaster.take());
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(90);
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 90:
							setState(91);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_8_Tomaster.take());
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_9_";
								}
								if (receiver.equals("evolve_9_")) {
									setState(92);
									queueFrommasterToevolve_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 92:
							setState(93);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_9_Tomaster.take());
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(94);
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 94:
							setState(95);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_9_Tomaster.take());
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_10_";
								}
								if (receiver.equals("evolve_10_")) {
									setState(96);
									queueFrommasterToevolve_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 96:
							setState(97);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_10_Tomaster.take());
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(98);
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 98:
							setState(99);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_10_Tomaster.take());
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_11_";
								}
								if (receiver.equals("evolve_11_")) {
									setState(100);
									queueFrommasterToevolve_11_.put(box.get());
									return Optional.empty();
								}
							}
						case 100:
							setState(101);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_11_Tomaster.take());
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(102);
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
						case 102:
							setState(103);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_11_Tomaster.take());
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_12_";
								}
								if (receiver.equals("evolve_12_")) {
									setState(104);
									queueFrommasterToevolve_12_.put(box.get());
									return Optional.empty();
								}
							}
						case 104:
							setState(105);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_12_Tomaster.take());
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(106);
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
						case 106:
							setState(107);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_12_Tomaster.take());
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "evolve_13_";
								}
								if (receiver.equals("evolve_13_")) {
									setState(108);
									queueFrommasterToevolve_13_.put(box.get());
									return Optional.empty();
								}
							}
						case 108:
							setState(109);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromevolve_13_Tomaster.take());
						case 109:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(110);
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
						case 110:
							setState(111);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_13_Tomaster.take());
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
								setState(1);
								return Optional.empty();
							}
						case 139:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_1_";
								}
								if (receiver.equals("fft_1_")) {
									setState(140);
									queueFrommasterTofft_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 140:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_2_";
								}
								if (receiver.equals("fft_2_")) {
									setState(141);
									queueFrommasterTofft_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 141:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_3_";
								}
								if (receiver.equals("fft_3_")) {
									setState(142);
									queueFrommasterTofft_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 142:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_4_";
								}
								if (receiver.equals("fft_4_")) {
									setState(143);
									queueFrommasterTofft_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 143:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_5_";
								}
								if (receiver.equals("fft_5_")) {
									setState(144);
									queueFrommasterTofft_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 144:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_6_";
								}
								if (receiver.equals("fft_6_")) {
									setState(145);
									queueFrommasterTofft_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 145:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_7_";
								}
								if (receiver.equals("fft_7_")) {
									setState(146);
									queueFrommasterTofft_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 146:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_8_";
								}
								if (receiver.equals("fft_8_")) {
									setState(147);
									queueFrommasterTofft_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 147:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_9_";
								}
								if (receiver.equals("fft_9_")) {
									setState(148);
									queueFrommasterTofft_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 148:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_10_";
								}
								if (receiver.equals("fft_10_")) {
									setState(149);
									queueFrommasterTofft_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 149:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_11_";
								}
								if (receiver.equals("fft_11_")) {
									setState(150);
									queueFrommasterTofft_11_.put(box.get());
									return Optional.empty();
								}
							}
						case 150:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_12_";
								}
								if (receiver.equals("fft_12_")) {
									setState(151);
									queueFrommasterTofft_12_.put(box.get());
									return Optional.empty();
								}
							}
						case 151:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.FTThreads.FFTMessage.class ) {
								if (receiver == null) {
									receiver = "fft_13_";
								}
								if (receiver.equals("fft_13_")) {
									setState(152);
									queueFrommasterTofft_13_.put(box.get());
									return Optional.empty();
								}
							}
						case 152:
							setState(2);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromfft_0_Tomaster.take());
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					while (true){
						if (state >=0 && state <= 153){
							Optional result = exchange_0_153(box, receiver, isCloseAction);
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
		return new String[] { "fft_6_","evolve_0_","fft_9_","evolve_3_","evolve_13_","fft_5_","fft_1_","evolve_9_","evolve_4_","fft_2_","fft_13_","evolve_1_","evolve_10_","fft_7_","evolve_12_","evolve_7_","evolve_5_","fft_10_","fft_12_","evolve_8_","fft_3_","fft_11_","fft_4_","evolve_11_","fft_8_","fft_0_","master","evolve_6_","evolve_2_" };
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
