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

public class MGProtocol_n_19 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<ProtocolMessage> interpd_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_18_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_9_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> masterQueue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_18_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> psinv_9_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_18_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> resid_9_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_14_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_15_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_16_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_17_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_18_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_9_Queue = new LinkedBlockingQueue<>();
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "interpd_0_": return new IEnvironment() {
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
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),43));
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
			case "interpd_10_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),242));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = interpd_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 25) {
								setState(4);
								//queueFrommasterTointerpd_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 240) {
								setState(1);
								//queueFrommasterTointerpd_10_);
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
									masterQueue.put(new ProtocolMessage(box.get(),63));
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
			case "interpd_11_": return new IEnvironment() {
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),65));
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
									masterQueue.put(new ProtocolMessage(box.get(),258));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = interpd_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 27) {
								setState(0);
								//queueFrommasterTointerpd_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 256) {
								setState(2);
								//queueFrommasterTointerpd_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
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
			case "interpd_12_": return new IEnvironment() {
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),274));
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
									masterQueue.put(new ProtocolMessage(box.get(),67));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = interpd_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 29) {
								setState(2);
								//queueFrommasterTointerpd_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 272) {
								setState(1);
								//queueFrommasterTointerpd_12_);
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
			case "interpd_13_": return new IEnvironment() {
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),290));
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
									masterQueue.put(new ProtocolMessage(box.get(),69));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = interpd_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 31) {
								setState(2);
								//queueFrommasterTointerpd_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 288) {
								setState(1);
								//queueFrommasterTointerpd_13_);
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
			case "interpd_14_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = interpd_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 33) {
								setState(4);
								//queueFrommasterTointerpd_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 304) {
								setState(3);
								//queueFrommasterTointerpd_14_);
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
									masterQueue.put(new ProtocolMessage(box.get(),306));
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
									masterQueue.put(new ProtocolMessage(box.get(),71));
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
			case "interpd_15_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),322));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 35) {
								setState(4);
								//queueFrommasterTointerpd_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 320) {
								setState(1);
								//queueFrommasterTointerpd_15_);
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
									masterQueue.put(new ProtocolMessage(box.get(),73));
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
			case "interpd_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),338));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 37) {
								setState(4);
								//queueFrommasterTointerpd_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 336) {
								setState(1);
								//queueFrommasterTointerpd_16_);
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
									masterQueue.put(new ProtocolMessage(box.get(),75));
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
			case "interpd_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),354));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 39) {
								setState(4);
								//queueFrommasterTointerpd_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 352) {
								setState(1);
								//queueFrommasterTointerpd_17_);
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
									masterQueue.put(new ProtocolMessage(box.get(),77));
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
			case "interpd_18_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),370));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_18_Queue.take();
							if (objectToGet.OriginalTargetStateId == 41) {
								setState(4);
								//queueFrommasterTointerpd_18_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 368) {
								setState(1);
								//queueFrommasterTointerpd_18_);
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
									masterQueue.put(new ProtocolMessage(box.get(),79));
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
									masterQueue.put(new ProtocolMessage(box.get(),98));
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
							if (objectToGet.OriginalTargetStateId == 96) {
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
									masterQueue.put(new ProtocolMessage(box.get(),45));
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
									masterQueue.put(new ProtocolMessage(box.get(),114));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = interpd_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 9) {
								setState(4);
								//queueFrommasterTointerpd_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 112) {
								setState(1);
								//queueFrommasterTointerpd_2_);
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
									masterQueue.put(new ProtocolMessage(box.get(),47));
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
									masterQueue.put(new ProtocolMessage(box.get(),49));
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
									masterQueue.put(new ProtocolMessage(box.get(),130));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = interpd_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 11) {
								setState(0);
								//queueFrommasterTointerpd_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 128) {
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
			case "interpd_4_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),146));
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
									masterQueue.put(new ProtocolMessage(box.get(),51));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = interpd_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 13) {
								setState(2);
								//queueFrommasterTointerpd_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 144) {
								setState(1);
								//queueFrommasterTointerpd_4_);
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
			case "interpd_5_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),162));
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
									masterQueue.put(new ProtocolMessage(box.get(),53));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = interpd_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 15) {
								setState(2);
								//queueFrommasterTointerpd_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 160) {
								setState(1);
								//queueFrommasterTointerpd_5_);
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
			case "interpd_6_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = interpd_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 17) {
								setState(3);
								//queueFrommasterTointerpd_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 176) {
								setState(2);
								//queueFrommasterTointerpd_6_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),178));
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
									masterQueue.put(new ProtocolMessage(box.get(),55));
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
			case "interpd_7_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),194));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = interpd_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 19) {
								setState(3);
								//queueFrommasterTointerpd_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 192) {
								setState(1);
								//queueFrommasterTointerpd_7_);
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
									masterQueue.put(new ProtocolMessage(box.get(),57));
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
			case "interpd_8_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),210));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = interpd_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 21) {
								setState(3);
								//queueFrommasterTointerpd_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 208) {
								setState(1);
								//queueFrommasterTointerpd_8_);
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
									masterQueue.put(new ProtocolMessage(box.get(),59));
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
			case "interpd_9_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),226));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = interpd_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 23) {
								setState(4);
								//queueFrommasterTointerpd_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 224) {
								setState(1);
								//queueFrommasterTointerpd_9_);
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
									masterQueue.put(new ProtocolMessage(box.get(),61));
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 2 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(6);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(15);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(73);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(89);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(164);
									resid_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
						case 1:
							if (isCloseAction) {
								setState(3);
								return Optional.empty();
							}
						case 3:
							if (isCloseAction) {
								setState(4);
								return Optional.empty();
							}
						case 4:
							if (isCloseAction) {
								setState(5);
								return Optional.empty();
							}
						case 5:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 6:
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
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(8);
									interpd_2_Queue.put(new ProtocolMessage(box.get(),9));
									return Optional.empty();
								}
							}
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(9);
									interpd_3_Queue.put(new ProtocolMessage(box.get(),11));
									return Optional.empty();
								}
							}
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									setState(10);
									interpd_4_Queue.put(new ProtocolMessage(box.get(),13));
									return Optional.empty();
								}
							}
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									setState(11);
									interpd_5_Queue.put(new ProtocolMessage(box.get(),15));
									return Optional.empty();
								}
							}
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									setState(12);
									interpd_6_Queue.put(new ProtocolMessage(box.get(),17));
									return Optional.empty();
								}
							}
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									setState(13);
									interpd_7_Queue.put(new ProtocolMessage(box.get(),19));
									return Optional.empty();
								}
							}
						case 13:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									setState(14);
									interpd_8_Queue.put(new ProtocolMessage(box.get(),21));
									return Optional.empty();
								}
							}
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									setState(16);
									interpd_9_Queue.put(new ProtocolMessage(box.get(),23));
									return Optional.empty();
								}
							}
						case 15:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(18);
									psinv_1_Queue.put(new ProtocolMessage(box.get(),537));
									return Optional.empty();
								}
							}
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									setState(17);
									interpd_10_Queue.put(new ProtocolMessage(box.get(),25));
									return Optional.empty();
								}
							}
						case 17:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									setState(19);
									interpd_11_Queue.put(new ProtocolMessage(box.get(),27));
									return Optional.empty();
								}
							}
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(20);
									psinv_2_Queue.put(new ProtocolMessage(box.get(),539));
									return Optional.empty();
								}
							}
						case 19:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									setState(21);
									interpd_12_Queue.put(new ProtocolMessage(box.get(),29));
									return Optional.empty();
								}
							}
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(22);
									psinv_3_Queue.put(new ProtocolMessage(box.get(),541));
									return Optional.empty();
								}
							}
						case 21:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									setState(23);
									interpd_13_Queue.put(new ProtocolMessage(box.get(),31));
									return Optional.empty();
								}
							}
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									setState(24);
									psinv_4_Queue.put(new ProtocolMessage(box.get(),543));
									return Optional.empty();
								}
							}
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									setState(25);
									interpd_14_Queue.put(new ProtocolMessage(box.get(),33));
									return Optional.empty();
								}
							}
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									setState(26);
									psinv_5_Queue.put(new ProtocolMessage(box.get(),545));
									return Optional.empty();
								}
							}
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									setState(27);
									interpd_15_Queue.put(new ProtocolMessage(box.get(),35));
									return Optional.empty();
								}
							}
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									setState(28);
									psinv_6_Queue.put(new ProtocolMessage(box.get(),547));
									return Optional.empty();
								}
							}
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									setState(29);
									interpd_16_Queue.put(new ProtocolMessage(box.get(),37));
									return Optional.empty();
								}
							}
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									setState(30);
									psinv_7_Queue.put(new ProtocolMessage(box.get(),549));
									return Optional.empty();
								}
							}
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									setState(31);
									interpd_17_Queue.put(new ProtocolMessage(box.get(),39));
									return Optional.empty();
								}
							}
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									setState(32);
									psinv_8_Queue.put(new ProtocolMessage(box.get(),551));
									return Optional.empty();
								}
							}
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									setState(34);
									interpd_18_Queue.put(new ProtocolMessage(box.get(),41));
									return Optional.empty();
								}
							}
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									setState(33);
									psinv_9_Queue.put(new ProtocolMessage(box.get(),553));
									return Optional.empty();
								}
							}
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									setState(35);
									psinv_10_Queue.put(new ProtocolMessage(box.get(),555));
									return Optional.empty();
								}
							}
						case 34:
							setState(36);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									setState(37);
									psinv_11_Queue.put(new ProtocolMessage(box.get(),557));
									return Optional.empty();
								}
							}
						case 36:
							setState(38);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									setState(39);
									psinv_12_Queue.put(new ProtocolMessage(box.get(),559));
									return Optional.empty();
								}
							}
						case 38:
							setState(40);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									setState(41);
									psinv_13_Queue.put(new ProtocolMessage(box.get(),561));
									return Optional.empty();
								}
							}
						case 40:
							setState(42);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									setState(43);
									psinv_14_Queue.put(new ProtocolMessage(box.get(),563));
									return Optional.empty();
								}
							}
						case 42:
							setState(44);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 43:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									setState(45);
									psinv_15_Queue.put(new ProtocolMessage(box.get(),565));
									return Optional.empty();
								}
							}
						case 44:
							setState(46);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									setState(47);
									psinv_16_Queue.put(new ProtocolMessage(box.get(),567));
									return Optional.empty();
								}
							}
						case 46:
							setState(48);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									setState(49);
									psinv_17_Queue.put(new ProtocolMessage(box.get(),569));
									return Optional.empty();
								}
							}
						case 48:
							setState(50);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									setState(52);
									psinv_18_Queue.put(new ProtocolMessage(box.get(),571));
									return Optional.empty();
								}
							}
						case 50:
							setState(51);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 51:
							setState(53);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 52:
							setState(54);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 53:
							setState(55);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 54:
							setState(56);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 55:
							setState(57);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 56:
							setState(58);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 57:
							setState(59);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 58:
							setState(60);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 59:
							setState(61);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 60:
							setState(62);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 61:
							setState(63);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 62:
							setState(64);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 63:
							setState(65);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 64:
							setState(66);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 65:
							setState(67);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 66:
							setState(68);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 67:
							setState(69);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 68:
							setState(70);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 69:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 70:
							setState(72);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(6);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),1));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(89);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(164);
									resid_0_Queue.put(new ProtocolMessage(box.get(),4));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(73);
									interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(15);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
									return Optional.empty();
								}
							}
						case 72:
							setState(75);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 73:
							setState(74);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 74:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(77);
									psinv_0_Queue.put(new ProtocolMessage(box.get(),84));
									return Optional.empty();
								}
							}
						case 75:
							setState(76);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 76:
							setState(79);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 77:
							setState(78);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 78:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(81);
									rprj_0_Queue.put(new ProtocolMessage(box.get(),88));
									return Optional.empty();
								}
							}
						case 79:
							setState(80);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 80:
							setState(83);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 81:
							setState(82);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 82:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(85);
									resid_0_Queue.put(new ProtocolMessage(box.get(),92));
									return Optional.empty();
								}
							}
						case 83:
							setState(84);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 84:
							setState(87);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 85:
							setState(86);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 86:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									setState(90);
									interpd_1_Queue.put(new ProtocolMessage(box.get(),96));
									return Optional.empty();
								}
							}
						case 87:
							setState(88);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 88:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(92);
									rprj_1_Queue.put(new ProtocolMessage(box.get(),611));
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
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(93);
									psinv_1_Queue.put(new ProtocolMessage(box.get(),100));
									return Optional.empty();
								}
							}
						case 92:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(94);
									rprj_2_Queue.put(new ProtocolMessage(box.get(),613));
									return Optional.empty();
								}
							}
						case 93:
							setState(95);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 94:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(96);
									rprj_3_Queue.put(new ProtocolMessage(box.get(),615));
									return Optional.empty();
								}
							}
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(97);
									rprj_1_Queue.put(new ProtocolMessage(box.get(),104));
									return Optional.empty();
								}
							}
						case 96:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									setState(98);
									rprj_4_Queue.put(new ProtocolMessage(box.get(),617));
									return Optional.empty();
								}
							}
						case 97:
							setState(99);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 98:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									setState(100);
									rprj_5_Queue.put(new ProtocolMessage(box.get(),619));
									return Optional.empty();
								}
							}
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(101);
									resid_1_Queue.put(new ProtocolMessage(box.get(),108));
									return Optional.empty();
								}
							}
						case 100:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									setState(102);
									rprj_6_Queue.put(new ProtocolMessage(box.get(),621));
									return Optional.empty();
								}
							}
						case 101:
							setState(103);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 102:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									setState(104);
									rprj_7_Queue.put(new ProtocolMessage(box.get(),623));
									return Optional.empty();
								}
							}
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(105);
									interpd_2_Queue.put(new ProtocolMessage(box.get(),112));
									return Optional.empty();
								}
							}
						case 104:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									setState(106);
									rprj_8_Queue.put(new ProtocolMessage(box.get(),625));
									return Optional.empty();
								}
							}
						case 105:
							setState(107);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 106:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									setState(108);
									rprj_9_Queue.put(new ProtocolMessage(box.get(),627));
									return Optional.empty();
								}
							}
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(109);
									psinv_2_Queue.put(new ProtocolMessage(box.get(),116));
									return Optional.empty();
								}
							}
						case 108:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									setState(110);
									rprj_10_Queue.put(new ProtocolMessage(box.get(),629));
									return Optional.empty();
								}
							}
						case 109:
							setState(111);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 110:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									setState(112);
									rprj_11_Queue.put(new ProtocolMessage(box.get(),631));
									return Optional.empty();
								}
							}
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(113);
									rprj_2_Queue.put(new ProtocolMessage(box.get(),120));
									return Optional.empty();
								}
							}
						case 112:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									setState(114);
									rprj_12_Queue.put(new ProtocolMessage(box.get(),633));
									return Optional.empty();
								}
							}
						case 113:
							setState(115);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 114:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									setState(116);
									rprj_13_Queue.put(new ProtocolMessage(box.get(),635));
									return Optional.empty();
								}
							}
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(117);
									resid_2_Queue.put(new ProtocolMessage(box.get(),124));
									return Optional.empty();
								}
							}
						case 116:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									setState(118);
									rprj_14_Queue.put(new ProtocolMessage(box.get(),637));
									return Optional.empty();
								}
							}
						case 117:
							setState(119);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 118:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									setState(120);
									rprj_15_Queue.put(new ProtocolMessage(box.get(),639));
									return Optional.empty();
								}
							}
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(121);
									interpd_3_Queue.put(new ProtocolMessage(box.get(),128));
									return Optional.empty();
								}
							}
						case 120:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									setState(122);
									rprj_16_Queue.put(new ProtocolMessage(box.get(),641));
									return Optional.empty();
								}
							}
						case 121:
							setState(123);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 122:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									setState(124);
									rprj_17_Queue.put(new ProtocolMessage(box.get(),643));
									return Optional.empty();
								}
							}
						case 123:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(125);
									psinv_3_Queue.put(new ProtocolMessage(box.get(),132));
									return Optional.empty();
								}
							}
						case 124:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									setState(127);
									rprj_18_Queue.put(new ProtocolMessage(box.get(),645));
									return Optional.empty();
								}
							}
						case 125:
							setState(126);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 126:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(129);
									rprj_3_Queue.put(new ProtocolMessage(box.get(),136));
									return Optional.empty();
								}
							}
						case 127:
							setState(128);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 128:
							setState(131);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 129:
							setState(130);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 130:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(133);
									resid_3_Queue.put(new ProtocolMessage(box.get(),140));
									return Optional.empty();
								}
							}
						case 131:
							setState(132);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 132:
							setState(135);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 133:
							setState(134);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 134:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									setState(137);
									interpd_4_Queue.put(new ProtocolMessage(box.get(),144));
									return Optional.empty();
								}
							}
						case 135:
							setState(136);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 136:
							setState(139);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 137:
							setState(138);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 138:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									setState(141);
									psinv_4_Queue.put(new ProtocolMessage(box.get(),148));
									return Optional.empty();
								}
							}
						case 139:
							setState(140);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 140:
							setState(143);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 141:
							setState(142);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 142:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									setState(145);
									rprj_4_Queue.put(new ProtocolMessage(box.get(),152));
									return Optional.empty();
								}
							}
						case 143:
							setState(144);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 144:
							setState(147);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 145:
							setState(146);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 146:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									setState(149);
									resid_4_Queue.put(new ProtocolMessage(box.get(),156));
									return Optional.empty();
								}
							}
						case 147:
							setState(148);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 148:
							setState(151);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 149:
							setState(150);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 150:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									setState(153);
									interpd_5_Queue.put(new ProtocolMessage(box.get(),160));
									return Optional.empty();
								}
							}
						case 151:
							setState(152);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 152:
							setState(155);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 153:
							setState(154);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 154:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									setState(157);
									psinv_5_Queue.put(new ProtocolMessage(box.get(),164));
									return Optional.empty();
								}
							}
						case 155:
							setState(156);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 156:
							setState(159);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 157:
							setState(158);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 158:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									setState(161);
									rprj_5_Queue.put(new ProtocolMessage(box.get(),168));
									return Optional.empty();
								}
							}
						case 159:
							setState(160);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 160:
							setState(163);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 161:
							setState(162);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 162:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									setState(165);
									resid_5_Queue.put(new ProtocolMessage(box.get(),172));
									return Optional.empty();
								}
							}
						case 163:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 164:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(166);
									resid_1_Queue.put(new ProtocolMessage(box.get(),685));
									return Optional.empty();
								}
							}
						case 165:
							setState(167);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 166:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(168);
									resid_2_Queue.put(new ProtocolMessage(box.get(),687));
									return Optional.empty();
								}
							}
						case 167:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									setState(169);
									interpd_6_Queue.put(new ProtocolMessage(box.get(),176));
									return Optional.empty();
								}
							}
						case 168:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(170);
									resid_3_Queue.put(new ProtocolMessage(box.get(),689));
									return Optional.empty();
								}
							}
						case 169:
							setState(171);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 170:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									setState(172);
									resid_4_Queue.put(new ProtocolMessage(box.get(),691));
									return Optional.empty();
								}
							}
						case 171:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									setState(173);
									psinv_6_Queue.put(new ProtocolMessage(box.get(),180));
									return Optional.empty();
								}
							}
						case 172:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									setState(174);
									resid_5_Queue.put(new ProtocolMessage(box.get(),693));
									return Optional.empty();
								}
							}
						case 173:
							setState(175);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 174:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									setState(176);
									resid_6_Queue.put(new ProtocolMessage(box.get(),695));
									return Optional.empty();
								}
							}
						case 175:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									setState(177);
									rprj_6_Queue.put(new ProtocolMessage(box.get(),184));
									return Optional.empty();
								}
							}
						case 176:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									setState(178);
									resid_7_Queue.put(new ProtocolMessage(box.get(),697));
									return Optional.empty();
								}
							}
						case 177:
							setState(179);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 178:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									setState(180);
									resid_8_Queue.put(new ProtocolMessage(box.get(),699));
									return Optional.empty();
								}
							}
						case 179:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									setState(181);
									resid_6_Queue.put(new ProtocolMessage(box.get(),188));
									return Optional.empty();
								}
							}
						case 180:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									setState(182);
									resid_9_Queue.put(new ProtocolMessage(box.get(),701));
									return Optional.empty();
								}
							}
						case 181:
							setState(183);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 182:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									setState(184);
									resid_10_Queue.put(new ProtocolMessage(box.get(),703));
									return Optional.empty();
								}
							}
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									setState(185);
									interpd_7_Queue.put(new ProtocolMessage(box.get(),192));
									return Optional.empty();
								}
							}
						case 184:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									setState(186);
									resid_11_Queue.put(new ProtocolMessage(box.get(),705));
									return Optional.empty();
								}
							}
						case 185:
							setState(187);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 186:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									setState(188);
									resid_12_Queue.put(new ProtocolMessage(box.get(),707));
									return Optional.empty();
								}
							}
						case 187:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									setState(189);
									psinv_7_Queue.put(new ProtocolMessage(box.get(),196));
									return Optional.empty();
								}
							}
						case 188:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									setState(190);
									resid_13_Queue.put(new ProtocolMessage(box.get(),709));
									return Optional.empty();
								}
							}
						case 189:
							setState(191);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 190:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									setState(192);
									resid_14_Queue.put(new ProtocolMessage(box.get(),711));
									return Optional.empty();
								}
							}
						case 191:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									setState(193);
									rprj_7_Queue.put(new ProtocolMessage(box.get(),200));
									return Optional.empty();
								}
							}
						case 192:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									setState(194);
									resid_15_Queue.put(new ProtocolMessage(box.get(),713));
									return Optional.empty();
								}
							}
						case 193:
							setState(195);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 194:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									setState(196);
									resid_16_Queue.put(new ProtocolMessage(box.get(),715));
									return Optional.empty();
								}
							}
						case 195:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									setState(197);
									resid_7_Queue.put(new ProtocolMessage(box.get(),204));
									return Optional.empty();
								}
							}
						case 196:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									setState(198);
									resid_17_Queue.put(new ProtocolMessage(box.get(),717));
									return Optional.empty();
								}
							}
						case 197:
							setState(199);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 198:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									setState(200);
									resid_18_Queue.put(new ProtocolMessage(box.get(),719));
									return Optional.empty();
								}
							}
						case 199:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									setState(201);
									interpd_8_Queue.put(new ProtocolMessage(box.get(),208));
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_378(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200:
							setState(203);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 201:
							setState(202);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 202:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									setState(205);
									psinv_8_Queue.put(new ProtocolMessage(box.get(),212));
									return Optional.empty();
								}
							}
						case 203:
							setState(204);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 204:
							setState(207);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 205:
							setState(206);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 206:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									setState(209);
									rprj_8_Queue.put(new ProtocolMessage(box.get(),216));
									return Optional.empty();
								}
							}
						case 207:
							setState(208);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 208:
							setState(211);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 209:
							setState(210);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 210:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									setState(213);
									resid_8_Queue.put(new ProtocolMessage(box.get(),220));
									return Optional.empty();
								}
							}
						case 211:
							setState(212);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 212:
							setState(215);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 213:
							setState(214);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 214:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									setState(217);
									interpd_9_Queue.put(new ProtocolMessage(box.get(),224));
									return Optional.empty();
								}
							}
						case 215:
							setState(216);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 216:
							setState(219);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 217:
							setState(218);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 218:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									setState(221);
									psinv_9_Queue.put(new ProtocolMessage(box.get(),228));
									return Optional.empty();
								}
							}
						case 219:
							setState(220);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 220:
							setState(223);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 221:
							setState(222);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 222:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									setState(225);
									rprj_9_Queue.put(new ProtocolMessage(box.get(),232));
									return Optional.empty();
								}
							}
						case 223:
							setState(224);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 224:
							setState(227);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 225:
							setState(226);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 226:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									setState(229);
									resid_9_Queue.put(new ProtocolMessage(box.get(),236));
									return Optional.empty();
								}
							}
						case 227:
							setState(228);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 228:
							setState(231);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 229:
							setState(230);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 230:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									setState(233);
									interpd_10_Queue.put(new ProtocolMessage(box.get(),240));
									return Optional.empty();
								}
							}
						case 231:
							setState(232);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 232:
							setState(235);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 233:
							setState(234);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 234:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									setState(237);
									psinv_10_Queue.put(new ProtocolMessage(box.get(),244));
									return Optional.empty();
								}
							}
						case 235:
							setState(236);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 236:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 237:
							setState(238);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 238:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									setState(239);
									rprj_10_Queue.put(new ProtocolMessage(box.get(),248));
									return Optional.empty();
								}
							}
						case 239:
							setState(240);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 240:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									setState(241);
									resid_10_Queue.put(new ProtocolMessage(box.get(),252));
									return Optional.empty();
								}
							}
						case 241:
							setState(242);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 242:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									setState(243);
									interpd_11_Queue.put(new ProtocolMessage(box.get(),256));
									return Optional.empty();
								}
							}
						case 243:
							setState(244);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 244:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									setState(245);
									psinv_11_Queue.put(new ProtocolMessage(box.get(),260));
									return Optional.empty();
								}
							}
						case 245:
							setState(246);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 246:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									setState(247);
									rprj_11_Queue.put(new ProtocolMessage(box.get(),264));
									return Optional.empty();
								}
							}
						case 247:
							setState(248);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 248:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									setState(249);
									resid_11_Queue.put(new ProtocolMessage(box.get(),268));
									return Optional.empty();
								}
							}
						case 249:
							setState(250);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 250:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									setState(251);
									interpd_12_Queue.put(new ProtocolMessage(box.get(),272));
									return Optional.empty();
								}
							}
						case 251:
							setState(252);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 252:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									setState(253);
									psinv_12_Queue.put(new ProtocolMessage(box.get(),276));
									return Optional.empty();
								}
							}
						case 253:
							setState(254);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 254:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									setState(255);
									rprj_12_Queue.put(new ProtocolMessage(box.get(),280));
									return Optional.empty();
								}
							}
						case 255:
							setState(256);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 256:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									setState(257);
									resid_12_Queue.put(new ProtocolMessage(box.get(),284));
									return Optional.empty();
								}
							}
						case 257:
							setState(258);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 258:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									setState(259);
									interpd_13_Queue.put(new ProtocolMessage(box.get(),288));
									return Optional.empty();
								}
							}
						case 259:
							setState(260);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 260:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									setState(261);
									psinv_13_Queue.put(new ProtocolMessage(box.get(),292));
									return Optional.empty();
								}
							}
						case 261:
							setState(262);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 262:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									setState(263);
									rprj_13_Queue.put(new ProtocolMessage(box.get(),296));
									return Optional.empty();
								}
							}
						case 263:
							setState(264);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 264:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									setState(265);
									resid_13_Queue.put(new ProtocolMessage(box.get(),300));
									return Optional.empty();
								}
							}
						case 265:
							setState(266);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 266:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									setState(267);
									interpd_14_Queue.put(new ProtocolMessage(box.get(),304));
									return Optional.empty();
								}
							}
						case 267:
							setState(268);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 268:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									setState(269);
									psinv_14_Queue.put(new ProtocolMessage(box.get(),308));
									return Optional.empty();
								}
							}
						case 269:
							setState(270);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 270:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									setState(271);
									rprj_14_Queue.put(new ProtocolMessage(box.get(),312));
									return Optional.empty();
								}
							}
						case 271:
							setState(272);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 272:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									setState(273);
									resid_14_Queue.put(new ProtocolMessage(box.get(),316));
									return Optional.empty();
								}
							}
						case 273:
							setState(274);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 274:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									setState(275);
									interpd_15_Queue.put(new ProtocolMessage(box.get(),320));
									return Optional.empty();
								}
							}
						case 275:
							setState(276);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 276:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									setState(277);
									psinv_15_Queue.put(new ProtocolMessage(box.get(),324));
									return Optional.empty();
								}
							}
						case 277:
							setState(278);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 278:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									setState(279);
									rprj_15_Queue.put(new ProtocolMessage(box.get(),328));
									return Optional.empty();
								}
							}
						case 279:
							setState(280);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 280:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									setState(281);
									resid_15_Queue.put(new ProtocolMessage(box.get(),332));
									return Optional.empty();
								}
							}
						case 281:
							setState(282);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 282:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									setState(283);
									interpd_16_Queue.put(new ProtocolMessage(box.get(),336));
									return Optional.empty();
								}
							}
						case 283:
							setState(284);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 284:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									setState(285);
									psinv_16_Queue.put(new ProtocolMessage(box.get(),340));
									return Optional.empty();
								}
							}
						case 285:
							setState(286);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 286:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									setState(287);
									rprj_16_Queue.put(new ProtocolMessage(box.get(),344));
									return Optional.empty();
								}
							}
						case 287:
							setState(288);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 288:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									setState(289);
									resid_16_Queue.put(new ProtocolMessage(box.get(),348));
									return Optional.empty();
								}
							}
						case 289:
							setState(290);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 290:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									setState(291);
									interpd_17_Queue.put(new ProtocolMessage(box.get(),352));
									return Optional.empty();
								}
							}
						case 291:
							setState(292);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 292:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									setState(293);
									psinv_17_Queue.put(new ProtocolMessage(box.get(),356));
									return Optional.empty();
								}
							}
						case 293:
							setState(294);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 294:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									setState(295);
									rprj_17_Queue.put(new ProtocolMessage(box.get(),360));
									return Optional.empty();
								}
							}
						case 295:
							setState(296);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 296:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									setState(297);
									resid_17_Queue.put(new ProtocolMessage(box.get(),364));
									return Optional.empty();
								}
							}
						case 297:
							setState(298);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 298:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									setState(299);
									interpd_18_Queue.put(new ProtocolMessage(box.get(),368));
									return Optional.empty();
								}
							}
						case 299:
							setState(300);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 300:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									setState(301);
									psinv_18_Queue.put(new ProtocolMessage(box.get(),372));
									return Optional.empty();
								}
							}
						case 301:
							setState(302);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 302:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									setState(303);
									rprj_18_Queue.put(new ProtocolMessage(box.get(),376));
									return Optional.empty();
								}
							}
						case 303:
							setState(304);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 304:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									setState(305);
									resid_18_Queue.put(new ProtocolMessage(box.get(),380));
									return Optional.empty();
								}
							}
						case 305:
							setState(306);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)masterQueue.take().Message);
						case 306:
							if (isCloseAction) {
								setState(307);
								return Optional.empty();
							}
						case 307:
							if (isCloseAction) {
								setState(308);
								return Optional.empty();
							}
						case 308:
							if (isCloseAction) {
								setState(309);
								return Optional.empty();
							}
						case 309:
							if (isCloseAction) {
								setState(310);
								return Optional.empty();
							}
						case 310:
							if (isCloseAction) {
								setState(311);
								return Optional.empty();
							}
						case 311:
							if (isCloseAction) {
								setState(312);
								return Optional.empty();
							}
						case 312:
							if (isCloseAction) {
								setState(313);
								return Optional.empty();
							}
						case 313:
							if (isCloseAction) {
								setState(314);
								return Optional.empty();
							}
						case 314:
							if (isCloseAction) {
								setState(315);
								return Optional.empty();
							}
						case 315:
							if (isCloseAction) {
								setState(316);
								return Optional.empty();
							}
						case 316:
							if (isCloseAction) {
								setState(317);
								return Optional.empty();
							}
						case 317:
							if (isCloseAction) {
								setState(318);
								return Optional.empty();
							}
						case 318:
							if (isCloseAction) {
								setState(319);
								return Optional.empty();
							}
						case 319:
							if (isCloseAction) {
								setState(320);
								return Optional.empty();
							}
						case 320:
							if (isCloseAction) {
								setState(321);
								return Optional.empty();
							}
						case 321:
							if (isCloseAction) {
								setState(322);
								return Optional.empty();
							}
						case 322:
							if (isCloseAction) {
								setState(323);
								return Optional.empty();
							}
						case 323:
							if (isCloseAction) {
								setState(324);
								return Optional.empty();
							}
						case 324:
							if (isCloseAction) {
								setState(325);
								return Optional.empty();
							}
						case 325:
							if (isCloseAction) {
								setState(326);
								return Optional.empty();
							}
						case 326:
							if (isCloseAction) {
								setState(327);
								return Optional.empty();
							}
						case 327:
							if (isCloseAction) {
								setState(328);
								return Optional.empty();
							}
						case 328:
							if (isCloseAction) {
								setState(329);
								return Optional.empty();
							}
						case 329:
							if (isCloseAction) {
								setState(330);
								return Optional.empty();
							}
						case 330:
							if (isCloseAction) {
								setState(331);
								return Optional.empty();
							}
						case 331:
							if (isCloseAction) {
								setState(332);
								return Optional.empty();
							}
						case 332:
							if (isCloseAction) {
								setState(333);
								return Optional.empty();
							}
						case 333:
							if (isCloseAction) {
								setState(334);
								return Optional.empty();
							}
						case 334:
							if (isCloseAction) {
								setState(335);
								return Optional.empty();
							}
						case 335:
							if (isCloseAction) {
								setState(336);
								return Optional.empty();
							}
						case 336:
							if (isCloseAction) {
								setState(337);
								return Optional.empty();
							}
						case 337:
							if (isCloseAction) {
								setState(338);
								return Optional.empty();
							}
						case 338:
							if (isCloseAction) {
								setState(339);
								return Optional.empty();
							}
						case 339:
							if (isCloseAction) {
								setState(340);
								return Optional.empty();
							}
						case 340:
							if (isCloseAction) {
								setState(341);
								return Optional.empty();
							}
						case 341:
							if (isCloseAction) {
								setState(342);
								return Optional.empty();
							}
						case 342:
							if (isCloseAction) {
								setState(343);
								return Optional.empty();
							}
						case 343:
							if (isCloseAction) {
								setState(344);
								return Optional.empty();
							}
						case 344:
							if (isCloseAction) {
								setState(345);
								return Optional.empty();
							}
						case 345:
							if (isCloseAction) {
								setState(346);
								return Optional.empty();
							}
						case 346:
							if (isCloseAction) {
								setState(347);
								return Optional.empty();
							}
						case 347:
							if (isCloseAction) {
								setState(348);
								return Optional.empty();
							}
						case 348:
							if (isCloseAction) {
								setState(349);
								return Optional.empty();
							}
						case 349:
							if (isCloseAction) {
								setState(350);
								return Optional.empty();
							}
						case 350:
							if (isCloseAction) {
								setState(351);
								return Optional.empty();
							}
						case 351:
							if (isCloseAction) {
								setState(352);
								return Optional.empty();
							}
						case 352:
							if (isCloseAction) {
								setState(353);
								return Optional.empty();
							}
						case 353:
							if (isCloseAction) {
								setState(354);
								return Optional.empty();
							}
						case 354:
							if (isCloseAction) {
								setState(355);
								return Optional.empty();
							}
						case 355:
							if (isCloseAction) {
								setState(356);
								return Optional.empty();
							}
						case 356:
							if (isCloseAction) {
								setState(357);
								return Optional.empty();
							}
						case 357:
							if (isCloseAction) {
								setState(358);
								return Optional.empty();
							}
						case 358:
							if (isCloseAction) {
								setState(359);
								return Optional.empty();
							}
						case 359:
							if (isCloseAction) {
								setState(360);
								return Optional.empty();
							}
						case 360:
							if (isCloseAction) {
								setState(361);
								return Optional.empty();
							}
						case 361:
							if (isCloseAction) {
								setState(362);
								return Optional.empty();
							}
						case 362:
							if (isCloseAction) {
								setState(363);
								return Optional.empty();
							}
						case 363:
							if (isCloseAction) {
								setState(364);
								return Optional.empty();
							}
						case 364:
							if (isCloseAction) {
								setState(365);
								return Optional.empty();
							}
						case 365:
							if (isCloseAction) {
								setState(366);
								return Optional.empty();
							}
						case 366:
							if (isCloseAction) {
								setState(367);
								return Optional.empty();
							}
						case 367:
							if (isCloseAction) {
								setState(368);
								return Optional.empty();
							}
						case 368:
							if (isCloseAction) {
								setState(369);
								return Optional.empty();
							}
						case 369:
							if (isCloseAction) {
								setState(370);
								return Optional.empty();
							}
						case 370:
							if (isCloseAction) {
								setState(371);
								return Optional.empty();
							}
						case 371:
							if (isCloseAction) {
								setState(372);
								return Optional.empty();
							}
						case 372:
							if (isCloseAction) {
								setState(373);
								return Optional.empty();
							}
						case 373:
							if (isCloseAction) {
								setState(374);
								return Optional.empty();
							}
						case 374:
							if (isCloseAction) {
								setState(375);
								return Optional.empty();
							}
						case 375:
							if (isCloseAction) {
								setState(376);
								return Optional.empty();
							}
						case 376:
							if (isCloseAction) {
								setState(377);
								return Optional.empty();
							}
						case 377:
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
						if (state >=0 && state <= 199){
							Optional result = exchange_0_199(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
						if (state >=200 && state <= 378){
							Optional result = exchange_200_378(box, receiver, isCloseAction);
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),86));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = psinv_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 2) {
								setState(4);
								//queueFrommasterTopsinv_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 84) {
								setState(1);
								//queueFrommasterTopsinv_0_);
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
									masterQueue.put(new ProtocolMessage(box.get(),573));
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
			case "psinv_10_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),593));
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
									masterQueue.put(new ProtocolMessage(box.get(),246));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = psinv_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 244) {
								setState(3);
								//queueFrommasterTopsinv_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 555) {
								setState(1);
								//queueFrommasterTopsinv_10_);
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
			case "psinv_11_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = psinv_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 260) {
								setState(4);
								//queueFrommasterTopsinv_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 557) {
								setState(2);
								//queueFrommasterTopsinv_11_);
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
									masterQueue.put(new ProtocolMessage(box.get(),595));
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
									masterQueue.put(new ProtocolMessage(box.get(),262));
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
			case "psinv_12_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = psinv_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 276) {
								setState(4);
								//queueFrommasterTopsinv_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 559) {
								setState(3);
								//queueFrommasterTopsinv_12_);
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
									masterQueue.put(new ProtocolMessage(box.get(),597));
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
									masterQueue.put(new ProtocolMessage(box.get(),278));
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
			case "psinv_13_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = psinv_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 292) {
								setState(2);
								//queueFrommasterTopsinv_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 561) {
								setState(4);
								//queueFrommasterTopsinv_13_);
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
									masterQueue.put(new ProtocolMessage(box.get(),294));
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
									masterQueue.put(new ProtocolMessage(box.get(),599));
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
			case "psinv_14_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),310));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = psinv_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 308) {
								setState(1);
								//queueFrommasterTopsinv_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 563) {
								setState(4);
								//queueFrommasterTopsinv_14_);
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
									masterQueue.put(new ProtocolMessage(box.get(),601));
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
			case "psinv_15_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),326));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = psinv_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 324) {
								setState(1);
								//queueFrommasterTopsinv_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 565) {
								setState(4);
								//queueFrommasterTopsinv_15_);
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
									masterQueue.put(new ProtocolMessage(box.get(),603));
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
			case "psinv_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),342));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = psinv_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 340) {
								setState(1);
								//queueFrommasterTopsinv_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 567) {
								setState(4);
								//queueFrommasterTopsinv_16_);
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
									masterQueue.put(new ProtocolMessage(box.get(),605));
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
			case "psinv_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),358));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = psinv_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 356) {
								setState(1);
								//queueFrommasterTopsinv_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 569) {
								setState(4);
								//queueFrommasterTopsinv_17_);
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
									masterQueue.put(new ProtocolMessage(box.get(),607));
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
			case "psinv_18_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),609));
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
									masterQueue.put(new ProtocolMessage(box.get(),374));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = psinv_18_Queue.take();
							if (objectToGet.OriginalTargetStateId == 372) {
								setState(2);
								//queueFrommasterTopsinv_18_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 571) {
								setState(1);
								//queueFrommasterTopsinv_18_);
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
			case "psinv_1_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),102));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = psinv_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 100) {
								setState(1);
								//queueFrommasterTopsinv_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 537) {
								setState(4);
								//queueFrommasterTopsinv_1_);
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
									masterQueue.put(new ProtocolMessage(box.get(),575));
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),577));
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
									masterQueue.put(new ProtocolMessage(box.get(),118));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							ProtocolMessage objectToGet = psinv_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 116) {
								setState(2);
								//queueFrommasterTopsinv_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 539) {
								setState(1);
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
							ProtocolMessage objectToGet = psinv_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 132) {
								setState(3);
								//queueFrommasterTopsinv_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 541) {
								setState(2);
								//queueFrommasterTopsinv_3_);
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
									masterQueue.put(new ProtocolMessage(box.get(),579));
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
									masterQueue.put(new ProtocolMessage(box.get(),134));
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
			case "psinv_4_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = psinv_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 148) {
								setState(3);
								//queueFrommasterTopsinv_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 543) {
								setState(2);
								//queueFrommasterTopsinv_4_);
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
									masterQueue.put(new ProtocolMessage(box.get(),581));
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
									masterQueue.put(new ProtocolMessage(box.get(),150));
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
			case "psinv_5_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = psinv_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 164) {
								setState(2);
								//queueFrommasterTopsinv_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 545) {
								setState(3);
								//queueFrommasterTopsinv_5_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),166));
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
									masterQueue.put(new ProtocolMessage(box.get(),583));
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
			case "psinv_6_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),182));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = psinv_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 180) {
								setState(1);
								//queueFrommasterTopsinv_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 547) {
								setState(3);
								//queueFrommasterTopsinv_6_);
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
									masterQueue.put(new ProtocolMessage(box.get(),585));
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
			case "psinv_7_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),198));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = psinv_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 196) {
								setState(1);
								//queueFrommasterTopsinv_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 549) {
								setState(3);
								//queueFrommasterTopsinv_7_);
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
									masterQueue.put(new ProtocolMessage(box.get(),587));
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
			case "psinv_8_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),214));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = psinv_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 212) {
								setState(2);
								//queueFrommasterTopsinv_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 551) {
								setState(4);
								//queueFrommasterTopsinv_8_);
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
									masterQueue.put(new ProtocolMessage(box.get(),589));
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
			case "psinv_9_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),230));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = psinv_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 228) {
								setState(2);
								//queueFrommasterTopsinv_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 553) {
								setState(4);
								//queueFrommasterTopsinv_9_);
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
									masterQueue.put(new ProtocolMessage(box.get(),591));
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
				private int state = 0;
				
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
							ProtocolMessage objectToGet = resid_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 4) {
								setState(1);
								//queueFrommasterToresid_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 92) {
								setState(4);
								//queueFrommasterToresid_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									masterQueue.put(new ProtocolMessage(box.get(),721));
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(2);
								return Optional.empty();
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),94));
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
			case "resid_10_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),741));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = resid_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 252) {
								setState(3);
								//queueFrommasterToresid_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 703) {
								setState(1);
								//queueFrommasterToresid_10_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),254));
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
			case "resid_11_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),743));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = resid_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 268) {
								setState(3);
								//queueFrommasterToresid_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 705) {
								setState(1);
								//queueFrommasterToresid_11_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),270));
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
			case "resid_12_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),745));
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
									masterQueue.put(new ProtocolMessage(box.get(),286));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = resid_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 284) {
								setState(3);
								//queueFrommasterToresid_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 707) {
								setState(2);
								//queueFrommasterToresid_12_);
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
			case "resid_13_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 300) {
								setState(4);
								//queueFrommasterToresid_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 709) {
								setState(3);
								//queueFrommasterToresid_13_);
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
									masterQueue.put(new ProtocolMessage(box.get(),747));
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
									masterQueue.put(new ProtocolMessage(box.get(),302));
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
			case "resid_14_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 316) {
								setState(4);
								//queueFrommasterToresid_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 711) {
								setState(3);
								//queueFrommasterToresid_14_);
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
									masterQueue.put(new ProtocolMessage(box.get(),749));
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
									masterQueue.put(new ProtocolMessage(box.get(),318));
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
			case "resid_15_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 332) {
								setState(3);
								//queueFrommasterToresid_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 713) {
								setState(4);
								//queueFrommasterToresid_15_);
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
									setState(1);
									masterQueue.put(new ProtocolMessage(box.get(),334));
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
									masterQueue.put(new ProtocolMessage(box.get(),751));
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
			case "resid_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),753));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 348) {
								setState(4);
								//queueFrommasterToresid_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 715) {
								setState(1);
								//queueFrommasterToresid_16_);
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
			case "resid_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),755));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 364) {
								setState(4);
								//queueFrommasterToresid_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 717) {
								setState(1);
								//queueFrommasterToresid_17_);
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
									masterQueue.put(new ProtocolMessage(box.get(),366));
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
			case "resid_18_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),757));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_18_Queue.take();
							if (objectToGet.OriginalTargetStateId == 380) {
								setState(4);
								//queueFrommasterToresid_18_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 719) {
								setState(1);
								//queueFrommasterToresid_18_);
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
									masterQueue.put(new ProtocolMessage(box.get(),382));
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
			case "resid_1_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),723));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = resid_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 108) {
								setState(4);
								//queueFrommasterToresid_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 685) {
								setState(1);
								//queueFrommasterToresid_1_);
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
									masterQueue.put(new ProtocolMessage(box.get(),110));
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),725));
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
							if (objectToGet.OriginalTargetStateId == 124) {
								setState(4);
								//queueFrommasterToresid_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 687) {
								setState(1);
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
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),126));
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
									setState(3);
									masterQueue.put(new ProtocolMessage(box.get(),727));
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
							if (objectToGet.OriginalTargetStateId == 140) {
								setState(4);
								//queueFrommasterToresid_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 689) {
								setState(1);
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
									setState(2);
									masterQueue.put(new ProtocolMessage(box.get(),142));
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
			case "resid_4_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),729));
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
									masterQueue.put(new ProtocolMessage(box.get(),158));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = resid_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 156) {
								setState(3);
								//queueFrommasterToresid_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 691) {
								setState(2);
								//queueFrommasterToresid_4_);
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
			case "resid_5_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 172) {
								setState(4);
								//queueFrommasterToresid_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 693) {
								setState(3);
								//queueFrommasterToresid_5_);
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
									masterQueue.put(new ProtocolMessage(box.get(),731));
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
									masterQueue.put(new ProtocolMessage(box.get(),174));
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
			case "resid_6_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 188) {
								setState(4);
								//queueFrommasterToresid_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 695) {
								setState(3);
								//queueFrommasterToresid_6_);
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
									masterQueue.put(new ProtocolMessage(box.get(),733));
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
									masterQueue.put(new ProtocolMessage(box.get(),190));
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
			case "resid_7_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = resid_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 204) {
								setState(3);
								//queueFrommasterToresid_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 697) {
								setState(4);
								//queueFrommasterToresid_7_);
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
									masterQueue.put(new ProtocolMessage(box.get(),206));
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
									masterQueue.put(new ProtocolMessage(box.get(),735));
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
			case "resid_8_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),737));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = resid_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 220) {
								setState(4);
								//queueFrommasterToresid_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 699) {
								setState(1);
								//queueFrommasterToresid_8_);
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
									masterQueue.put(new ProtocolMessage(box.get(),222));
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
			case "resid_9_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),739));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = resid_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 236) {
								setState(3);
								//queueFrommasterToresid_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 701) {
								setState(1);
								//queueFrommasterToresid_9_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),238));
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
			case "rprj_0_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),647));
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
									masterQueue.put(new ProtocolMessage(box.get(),90));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = rprj_0_Queue.take();
							if (objectToGet.OriginalTargetStateId == 3) {
								setState(1);
								//queueFrommasterTorprj_0_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 88) {
								setState(2);
								//queueFrommasterTorprj_0_);
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
			case "rprj_10_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),250));
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
									masterQueue.put(new ProtocolMessage(box.get(),667));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_10_Queue.take();
							if (objectToGet.OriginalTargetStateId == 248) {
								setState(2);
								//queueFrommasterTorprj_10_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 629) {
								setState(3);
								//queueFrommasterTorprj_10_);
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
			case "rprj_11_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),266));
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
									masterQueue.put(new ProtocolMessage(box.get(),669));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_11_Queue.take();
							if (objectToGet.OriginalTargetStateId == 264) {
								setState(1);
								//queueFrommasterTorprj_11_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 631) {
								setState(3);
								//queueFrommasterTorprj_11_);
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
			case "rprj_12_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = rprj_12_Queue.take();
							if (objectToGet.OriginalTargetStateId == 280) {
								setState(2);
								//queueFrommasterTorprj_12_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 633) {
								setState(4);
								//queueFrommasterTorprj_12_);
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
									masterQueue.put(new ProtocolMessage(box.get(),282));
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
									masterQueue.put(new ProtocolMessage(box.get(),671));
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
			case "rprj_13_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),673));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = rprj_13_Queue.take();
							if (objectToGet.OriginalTargetStateId == 296) {
								setState(3);
								//queueFrommasterTorprj_13_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 635) {
								setState(1);
								//queueFrommasterTorprj_13_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),298));
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
			case "rprj_14_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),675));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = rprj_14_Queue.take();
							if (objectToGet.OriginalTargetStateId == 312) {
								setState(3);
								//queueFrommasterTorprj_14_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 637) {
								setState(1);
								//queueFrommasterTorprj_14_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),314));
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
			case "rprj_15_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),677));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = rprj_15_Queue.take();
							if (objectToGet.OriginalTargetStateId == 328) {
								setState(3);
								//queueFrommasterTorprj_15_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 639) {
								setState(1);
								//queueFrommasterTorprj_15_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),330));
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
			case "rprj_16_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),679));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = rprj_16_Queue.take();
							if (objectToGet.OriginalTargetStateId == 344) {
								setState(3);
								//queueFrommasterTorprj_16_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 641) {
								setState(1);
								//queueFrommasterTorprj_16_);
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
									setState(4);
									masterQueue.put(new ProtocolMessage(box.get(),346));
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
			case "rprj_17_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),681));
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
									masterQueue.put(new ProtocolMessage(box.get(),362));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = rprj_17_Queue.take();
							if (objectToGet.OriginalTargetStateId == 360) {
								setState(2);
								//queueFrommasterTorprj_17_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 643) {
								setState(1);
								//queueFrommasterTorprj_17_);
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
			case "rprj_18_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),378));
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
									masterQueue.put(new ProtocolMessage(box.get(),683));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_18_Queue.take();
							if (objectToGet.OriginalTargetStateId == 376) {
								setState(2);
								//queueFrommasterTorprj_18_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 645) {
								setState(3);
								//queueFrommasterTorprj_18_);
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
									masterQueue.put(new ProtocolMessage(box.get(),649));
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
									masterQueue.put(new ProtocolMessage(box.get(),106));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = rprj_1_Queue.take();
							if (objectToGet.OriginalTargetStateId == 104) {
								setState(2);
								//queueFrommasterTorprj_1_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 611) {
								setState(1);
								//queueFrommasterTorprj_1_);
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
			case "rprj_2_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),122));
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
									masterQueue.put(new ProtocolMessage(box.get(),651));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_2_Queue.take();
							if (objectToGet.OriginalTargetStateId == 120) {
								setState(2);
								//queueFrommasterTorprj_2_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 613) {
								setState(3);
								//queueFrommasterTorprj_2_);
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
			case "rprj_3_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),138));
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
									masterQueue.put(new ProtocolMessage(box.get(),653));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_3_Queue.take();
							if (objectToGet.OriginalTargetStateId == 136) {
								setState(2);
								//queueFrommasterTorprj_3_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 615) {
								setState(3);
								//queueFrommasterTorprj_3_);
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
			case "rprj_4_": return new IEnvironment() {
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
							ProtocolMessage objectToGet = rprj_4_Queue.take();
							if (objectToGet.OriginalTargetStateId == 152) {
								setState(3);
								//queueFrommasterTorprj_4_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 617) {
								setState(4);
								//queueFrommasterTorprj_4_);
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
									masterQueue.put(new ProtocolMessage(box.get(),154));
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
									masterQueue.put(new ProtocolMessage(box.get(),655));
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
			case "rprj_5_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),657));
									return Optional.empty();
								}
							}
						case 2:
							ProtocolMessage objectToGet = rprj_5_Queue.take();
							if (objectToGet.OriginalTargetStateId == 168) {
								setState(4);
								//queueFrommasterTorprj_5_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 619) {
								setState(1);
								//queueFrommasterTorprj_5_);
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
									masterQueue.put(new ProtocolMessage(box.get(),170));
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
			case "rprj_6_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),659));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = rprj_6_Queue.take();
							if (objectToGet.OriginalTargetStateId == 184) {
								setState(4);
								//queueFrommasterTorprj_6_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 621) {
								setState(1);
								//queueFrommasterTorprj_6_);
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
									masterQueue.put(new ProtocolMessage(box.get(),186));
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
			case "rprj_7_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),661));
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							ProtocolMessage objectToGet = rprj_7_Queue.take();
							if (objectToGet.OriginalTargetStateId == 200) {
								setState(4);
								//queueFrommasterTorprj_7_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 623) {
								setState(1);
								//queueFrommasterTorprj_7_);
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
									masterQueue.put(new ProtocolMessage(box.get(),202));
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
			case "rprj_8_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),663));
									return Optional.empty();
								}
							}
						case 3:
							ProtocolMessage objectToGet = rprj_8_Queue.take();
							if (objectToGet.OriginalTargetStateId == 216) {
								setState(4);
								//queueFrommasterTorprj_8_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 625) {
								setState(2);
								//queueFrommasterTorprj_8_);
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
									masterQueue.put(new ProtocolMessage(box.get(),218));
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
			case "rprj_9_": return new IEnvironment() {
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
									masterQueue.put(new ProtocolMessage(box.get(),665));
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
									masterQueue.put(new ProtocolMessage(box.get(),234));
									return Optional.empty();
								}
							}
						case 4:
							ProtocolMessage objectToGet = rprj_9_Queue.take();
							if (objectToGet.OriginalTargetStateId == 232) {
								setState(3);
								//queueFrommasterTorprj_9_);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)objectToGet.Message);
							}
							if (objectToGet.OriginalTargetStateId == 627) {
								setState(2);
								//queueFrommasterTorprj_9_);
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
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "interpd_16_","rprj_15_","resid_10_","rprj_13_","psinv_1_","resid_0_","rprj_7_","resid_11_","interpd_8_","psinv_14_","rprj_0_","resid_18_","rprj_8_","interpd_10_","interpd_3_","interpd_0_","resid_3_","resid_8_","resid_9_","resid_5_","resid_12_","resid_13_","interpd_4_","psinv_4_","rprj_6_","rprj_5_","interpd_9_","psinv_15_","resid_14_","interpd_14_","psinv_3_","interpd_13_","psinv_10_","psinv_0_","rprj_18_","psinv_11_","rprj_10_","resid_15_","rprj_3_","interpd_12_","psinv_5_","interpd_5_","psinv_2_","resid_16_","resid_4_","resid_6_","interpd_18_","psinv_9_","psinv_8_","psinv_12_","interpd_17_","interpd_11_","psinv_16_","psinv_6_","interpd_1_","rprj_11_","rprj_4_","resid_17_","resid_7_","rprj_12_","psinv_17_","rprj_1_","interpd_6_","psinv_18_","interpd_7_","rprj_17_","resid_2_","interpd_2_","psinv_13_","psinv_7_","interpd_15_","master","rprj_16_","rprj_2_","rprj_9_","rprj_14_","resid_1_" };
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
