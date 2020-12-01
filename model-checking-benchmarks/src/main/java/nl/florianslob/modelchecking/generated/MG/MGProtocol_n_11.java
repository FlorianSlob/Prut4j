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

public class MGProtocol_n_11 implements IProtocol {
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTorprj_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_6_Tomaster = new LinkedBlockingQueue<>(); 
	
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
									setState(4);
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTointerpd_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_0_Tomaster.put(box.get());
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
			case "interpd_10_": return new IEnvironment() {
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
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_10_Tomaster.put(box.get());
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
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTointerpd_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_1_Tomaster.put(box.get());
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
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTointerpd_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_2_Tomaster.put(box.get());
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
									queueFrominterpd_3_Tomaster.put(box.get());
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
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(0);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
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
			case "interpd_4_": return new IEnvironment() {
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
									queueFrominterpd_4_Tomaster.put(box.get());
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
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
			case "interpd_5_": return new IEnvironment() {
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
									queueFrominterpd_5_Tomaster.put(box.get());
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
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
			case "interpd_6_": return new IEnvironment() {
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
							Any objectToGet = (Any)queueFrommasterTointerpd_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
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
									setState(0);
									queueFrominterpd_6_Tomaster.put(box.get());
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
									queueFrominterpd_6_Tomaster.put(box.get());
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
			case "interpd_7_": return new IEnvironment() {
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
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_7_Tomaster.put(box.get());
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
			case "interpd_8_": return new IEnvironment() {
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
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_8_Tomaster.put(box.get());
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
			case "interpd_9_": return new IEnvironment() {
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
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTointerpd_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
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
									queueFrominterpd_9_Tomaster.put(box.get());
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
						case 1 :
							wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(176);
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(24);
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(155);
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(197);
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(2);
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									setState(3);
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(4);
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(5);
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 5:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									setState(6);
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									setState(7);
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 7:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									setState(8);
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									setState(9);
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 9:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									setState(10);
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									setState(11);
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 11:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									setState(12);
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 12:
							setState(13);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
						case 13:
							setState(14);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
						case 14:
							setState(15);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
						case 15:
							setState(16);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
						case 16:
							setState(17);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
						case 17:
							setState(18);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
						case 18:
							setState(19);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
						case 19:
							setState(20);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
						case 20:
							setState(21);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
						case 21:
							setState(22);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
						case 22:
							setState(23);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
						case 23:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(176);
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(155);
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(2);
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(197);
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									setState(24);
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 24:
							setState(25);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									setState(26);
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 26:
							setState(27);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									setState(28);
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 28:
							setState(29);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_0_Tomaster.take());
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									setState(30);
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
						case 30:
							setState(31);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_0_Tomaster.take());
						case 31:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									setState(32);
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 32:
							setState(33);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(34);
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 34:
							setState(35);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(36);
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 36:
							setState(37);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_1_Tomaster.take());
						case 37:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(38);
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 38:
							setState(39);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_1_Tomaster.take());
						case 39:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									setState(40);
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 40:
							setState(41);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
						case 41:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(42);
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 42:
							setState(43);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
						case 43:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(44);
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 44:
							setState(45);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_2_Tomaster.take());
						case 45:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(46);
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 46:
							setState(47);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_2_Tomaster.take());
						case 47:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									setState(48);
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 48:
							setState(49);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
						case 49:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(50);
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 50:
							setState(51);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
						case 51:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(52);
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 52:
							setState(53);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_3_Tomaster.take());
						case 53:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(54);
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 54:
							setState(55);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_3_Tomaster.take());
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									setState(56);
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 56:
							setState(57);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
						case 57:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									setState(58);
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 58:
							setState(59);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
						case 59:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									setState(60);
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 60:
							setState(61);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_4_Tomaster.take());
						case 61:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									setState(62);
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 62:
							setState(63);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_4_Tomaster.take());
						case 63:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									setState(64);
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 64:
							setState(65);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
						case 65:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									setState(66);
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 66:
							setState(67);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
						case 67:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									setState(68);
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 68:
							setState(69);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_5_Tomaster.take());
						case 69:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									setState(70);
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 70:
							setState(71);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_5_Tomaster.take());
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									setState(72);
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 72:
							setState(73);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									setState(74);
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 74:
							setState(75);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									setState(76);
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 76:
							setState(77);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_6_Tomaster.take());
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									setState(78);
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 78:
							setState(79);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_6_Tomaster.take());
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									setState(80);
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 80:
							setState(81);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
						case 81:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									setState(82);
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 82:
							setState(83);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									setState(84);
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 84:
							setState(85);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_7_Tomaster.take());
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									setState(86);
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 86:
							setState(87);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_7_Tomaster.take());
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									setState(88);
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 88:
							setState(89);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									setState(90);
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 90:
							setState(91);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									setState(92);
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 92:
							setState(93);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_8_Tomaster.take());
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									setState(94);
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 94:
							setState(95);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_8_Tomaster.take());
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									setState(96);
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 96:
							setState(97);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									setState(98);
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 98:
							setState(99);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									setState(100);
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 100:
							setState(101);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_9_Tomaster.take());
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									setState(102);
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 102:
							setState(103);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_9_Tomaster.take());
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									setState(104);
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 104:
							setState(105);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									setState(106);
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 106:
							setState(107);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									setState(108);
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 108:
							setState(109);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_10_Tomaster.take());
						case 109:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									setState(110);
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 110:
							setState(111);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_10_Tomaster.take());
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
								setState(145);
								return Optional.empty();
							}
						case 145:
							if (isCloseAction) {
								setState(146);
								return Optional.empty();
							}
						case 146:
							if (isCloseAction) {
								setState(147);
								return Optional.empty();
							}
						case 147:
							if (isCloseAction) {
								setState(148);
								return Optional.empty();
							}
						case 148:
							if (isCloseAction) {
								setState(149);
								return Optional.empty();
							}
						case 149:
							if (isCloseAction) {
								setState(150);
								return Optional.empty();
							}
						case 150:
							if (isCloseAction) {
								setState(151);
								return Optional.empty();
							}
						case 151:
							if (isCloseAction) {
								setState(152);
								return Optional.empty();
							}
						case 152:
							if (isCloseAction) {
								setState(153);
								return Optional.empty();
							}
						case 153:
							if (isCloseAction) {
								setState(154);
								return Optional.empty();
							}
						case 154:
							if (isCloseAction) {
								setState(1);
								return Optional.empty();
							}
						case 155:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									setState(156);
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 156:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									setState(157);
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 157:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									setState(158);
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 158:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									setState(159);
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 159:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									setState(160);
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 160:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									setState(161);
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 161:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									setState(162);
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 162:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									setState(163);
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 163:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									setState(164);
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 164:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									setState(165);
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 165:
							setState(166);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
						case 166:
							setState(167);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
						case 167:
							setState(168);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
						case 168:
							setState(169);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
						case 169:
							setState(170);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
						case 170:
							setState(171);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
						case 171:
							setState(172);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
						case 172:
							setState(173);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
						case 173:
							setState(174);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
						case 174:
							setState(175);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
						case 175:
							setState(23);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
						case 176:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									setState(177);
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 177:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									setState(178);
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 178:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									setState(179);
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
						case 179:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									setState(180);
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 180:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									setState(181);
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 181:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									setState(182);
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 182:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									setState(183);
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									setState(184);
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 184:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									setState(185);
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 185:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									setState(186);
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 186:
							setState(187);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_0_Tomaster.take());
						case 187:
							setState(188);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_1_Tomaster.take());
						case 188:
							setState(189);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_2_Tomaster.take());
						case 189:
							setState(190);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_3_Tomaster.take());
						case 190:
							setState(191);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_4_Tomaster.take());
						case 191:
							setState(192);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_5_Tomaster.take());
						case 192:
							setState(193);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_6_Tomaster.take());
						case 193:
							setState(194);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_7_Tomaster.take());
						case 194:
							setState(195);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_8_Tomaster.take());
						case 195:
							setState(196);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_9_Tomaster.take());
						case 196:
							setState(23);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromrprj_10_Tomaster.take());
						case 197:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									setState(198);
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
						case 198:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									setState(199);
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
						case 199:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									setState(200);
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_218(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									setState(201);
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
						case 201:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									setState(202);
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
						case 202:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									setState(203);
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
						case 203:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									setState(204);
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
						case 204:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									setState(205);
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
						case 205:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									setState(206);
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
						case 206:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									setState(207);
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
						case 207:
							setState(208);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_0_Tomaster.take());
						case 208:
							setState(209);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_1_Tomaster.take());
						case 209:
							setState(210);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_2_Tomaster.take());
						case 210:
							setState(211);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_3_Tomaster.take());
						case 211:
							setState(212);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_4_Tomaster.take());
						case 212:
							setState(213);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_5_Tomaster.take());
						case 213:
							setState(214);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_6_Tomaster.take());
						case 214:
							setState(215);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_7_Tomaster.take());
						case 215:
							setState(216);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_8_Tomaster.take());
						case 216:
							setState(217);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_9_Tomaster.take());
						case 217:
							setState(23);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)queueFromresid_10_Tomaster.take());
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
						if (state >=200 && state <= 218){
							Optional result = exchange_200_218(box, receiver, isCloseAction);
							if(result != null)
							  return (Optional<Any>) result;
						}
					}
					
				}
			};
			case "psinv_0_": return new IEnvironment() {
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
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
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
									queueFrompsinv_0_Tomaster.put(box.get());
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
									queueFrompsinv_10_Tomaster.put(box.get());
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
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTopsinv_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(1);
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
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_1_Tomaster.put(box.get());
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
									queueFrompsinv_2_Tomaster.put(box.get());
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
									queueFrompsinv_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTopsinv_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(1);
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
							Any objectToGet = (Any)queueFrommasterTopsinv_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(2);
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
									queueFrompsinv_3_Tomaster.put(box.get());
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
									queueFrompsinv_3_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterTopsinv_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(3);
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
									setState(1);
									queueFrompsinv_4_Tomaster.put(box.get());
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
									queueFrompsinv_4_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterTopsinv_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_5_Tomaster.put(box.get());
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
									queueFrompsinv_5_Tomaster.put(box.get());
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
			case "psinv_6_": return new IEnvironment() {
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
									queueFrompsinv_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_6_Tomaster.put(box.get());
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
			case "psinv_7_": return new IEnvironment() {
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
									queueFrompsinv_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_7_Tomaster.put(box.get());
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
									queueFrompsinv_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_8_Tomaster.put(box.get());
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFrompsinv_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTopsinv_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class) {
								setState(4);
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
									queueFrompsinv_9_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToresid_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
						case 1:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(0);
									queueFromresid_0_Tomaster.put(box.get());
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
									queueFromresid_0_Tomaster.put(box.get());
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
									queueFromresid_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToresid_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(2);
									queueFromresid_10_Tomaster.put(box.get());
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
									queueFromresid_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterToresid_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(4);
									queueFromresid_1_Tomaster.put(box.get());
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
			case "resid_2_": return new IEnvironment() {
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
									queueFromresid_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterToresid_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(4);
									queueFromresid_2_Tomaster.put(box.get());
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
			case "resid_3_": return new IEnvironment() {
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
									queueFromresid_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterToresid_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(4);
									queueFromresid_3_Tomaster.put(box.get());
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
									queueFromresid_4_Tomaster.put(box.get());
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
									queueFromresid_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterToresid_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(2);
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
							Any objectToGet = (Any)queueFrommasterToresid_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(3);
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
									setState(1);
									queueFromresid_5_Tomaster.put(box.get());
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
									queueFromresid_5_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToresid_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(3);
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
									queueFromresid_6_Tomaster.put(box.get());
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
									queueFromresid_6_Tomaster.put(box.get());
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
							Any objectToGet = (Any)queueFrommasterToresid_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(4);
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
									queueFromresid_7_Tomaster.put(box.get());
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
									queueFromresid_7_Tomaster.put(box.get());
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
									queueFromresid_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToresid_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(2);
									queueFromresid_8_Tomaster.put(box.get());
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
									queueFromresid_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							if (isCloseAction) {
								setState(0);
								return Optional.empty();
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterToresid_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class) {
								setState(1);
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
									setState(2);
									queueFromresid_9_Tomaster.put(box.get());
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(4);
									queueFromrprj_0_Tomaster.put(box.get());
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
									queueFromrprj_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTorprj_0_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
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
									queueFromrprj_10_Tomaster.put(box.get());
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
									queueFromrprj_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTorprj_10_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(3);
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
									queueFromrprj_1_Tomaster.put(box.get());
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
									queueFromrprj_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTorprj_1_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(2);
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
									queueFromrprj_2_Tomaster.put(box.get());
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
									queueFromrprj_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTorprj_2_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(3);
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
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									setState(2);
									queueFromrprj_3_Tomaster.put(box.get());
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
									queueFromrprj_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 4:
							Any objectToGet = (Any)queueFrommasterTorprj_3_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(1);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(3);
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
							Any objectToGet = (Any)queueFrommasterTorprj_4_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(4);
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
									queueFromrprj_4_Tomaster.put(box.get());
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
									queueFromrprj_4_Tomaster.put(box.get());
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
									queueFromrprj_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTorprj_5_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
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
									setState(4);
									queueFromrprj_5_Tomaster.put(box.get());
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
			case "rprj_6_": return new IEnvironment() {
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
									queueFromrprj_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTorprj_6_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
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
									setState(4);
									queueFromrprj_6_Tomaster.put(box.get());
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
			case "rprj_7_": return new IEnvironment() {
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
									queueFromrprj_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTorprj_7_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
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
									setState(4);
									queueFromrprj_7_Tomaster.put(box.get());
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
			case "rprj_8_": return new IEnvironment() {
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
									queueFromrprj_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 2:
							Any objectToGet = (Any)queueFrommasterTorprj_8_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(3);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
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
									setState(4);
									queueFromrprj_8_Tomaster.put(box.get());
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
			case "rprj_9_": return new IEnvironment() {
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
									queueFromrprj_9_Tomaster.put(box.get());
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
									queueFromrprj_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
						case 3:
							Any objectToGet = (Any)queueFrommasterTorprj_9_.take();
							if (objectToGet.getClass() == discourje.examples.npb3.impl.ExitMessage.class) {
								setState(2);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of(objectToGet);
							}
							if (objectToGet.getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class) {
								setState(1);
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
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "psinv_10_","rprj_6_","interpd_0_","resid_8_","interpd_9_","resid_9_","resid_1_","interpd_3_","psinv_3_","resid_4_","resid_10_","interpd_6_","rprj_7_","resid_5_","psinv_5_","resid_2_","rprj_4_","rprj_3_","rprj_1_","psinv_6_","psinv_2_","psinv_7_","rprj_2_","master","interpd_1_","psinv_4_","interpd_5_","rprj_8_","resid_0_","resid_7_","interpd_10_","interpd_4_","psinv_9_","interpd_7_","interpd_2_","psinv_0_","rprj_9_","psinv_1_","interpd_8_","rprj_0_","rprj_5_","resid_6_","psinv_8_","resid_3_","rprj_10_" };
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
