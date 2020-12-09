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

public class MGProtocol_n_15 implements IProtocol {
	private final BlockingQueue<ProtocolMessage> interpd_0_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_10_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_11_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_12_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_13_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> interpd_14_Queue = new LinkedBlockingQueue<>();
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
	private final BlockingQueue<ProtocolMessage> rprj_1_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_2_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_3_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_4_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_5_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_6_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_7_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_8_Queue = new LinkedBlockingQueue<>();
	private final BlockingQueue<ProtocolMessage> rprj_9_Queue = new LinkedBlockingQueue<>();
	private final IEnvironment interpd_0_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_0_";
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
							masterQueue.put(new ProtocolMessage(box.get(),66));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),35));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 1) {
							setState(2);
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
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_10_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_10_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),55));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 25) {
							setState(2);
							//queueFrommasterTointerpd_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 224) {
							setState(1);
							//queueFrommasterTointerpd_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_11_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_11_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),57));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 27) {
							setState(2);
							//queueFrommasterTointerpd_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 240) {
							setState(1);
							//queueFrommasterTointerpd_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_12_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_12_";
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
							masterQueue.put(new ProtocolMessage(box.get(),258));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),59));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 29) {
							setState(2);
							//queueFrommasterTointerpd_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 256) {
							setState(1);
							//queueFrommasterTointerpd_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_13_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_13_";
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
							masterQueue.put(new ProtocolMessage(box.get(),274));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),61));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 31) {
							setState(3);
							//queueFrommasterTointerpd_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 272) {
							setState(1);
							//queueFrommasterTointerpd_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_14_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_14_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 33) {
							setState(4);
							//queueFrommasterTointerpd_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 288) {
							setState(2);
							//queueFrommasterTointerpd_14_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),290));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							masterQueue.put(new ProtocolMessage(box.get(),63));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_1_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_1_";
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
							masterQueue.put(new ProtocolMessage(box.get(),82));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),37));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 7) {
							setState(2);
							//queueFrommasterTointerpd_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 80) {
							setState(1);
							//queueFrommasterTointerpd_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_2_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_2_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),98));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),39));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 9) {
							setState(3);
							//queueFrommasterTointerpd_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 96) {
							setState(2);
							//queueFrommasterTointerpd_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_3_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_3_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),41));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 11) {
							setState(3);
							//queueFrommasterTointerpd_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 112) {
							setState(1);
							//queueFrommasterTointerpd_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_4_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_4_";
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
							masterQueue.put(new ProtocolMessage(box.get(),130));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),43));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 13) {
							setState(3);
							//queueFrommasterTointerpd_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 128) {
							setState(1);
							//queueFrommasterTointerpd_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_5_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_5_";
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
							masterQueue.put(new ProtocolMessage(box.get(),146));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),45));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 15) {
							setState(3);
							//queueFrommasterTointerpd_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 144) {
							setState(1);
							//queueFrommasterTointerpd_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_6_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_6_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 17) {
							setState(4);
							//queueFrommasterTointerpd_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 160) {
							setState(2);
							//queueFrommasterTointerpd_6_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),162));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							masterQueue.put(new ProtocolMessage(box.get(),47));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_7_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_7_";
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
							masterQueue.put(new ProtocolMessage(box.get(),49));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),178));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 19) {
							setState(0);
							//queueFrommasterTointerpd_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 176) {
							setState(2);
							//queueFrommasterTointerpd_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_8_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_8_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),51));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 21) {
							setState(2);
							//queueFrommasterTointerpd_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 192) {
							setState(1);
							//queueFrommasterTointerpd_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment interpd_9_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "interpd_9_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),53));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = interpd_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 23) {
							setState(2);
							//queueFrommasterTointerpd_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 208) {
							setState(1);
							//queueFrommasterTointerpd_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
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
				case 1 :
					wait();
					break;
				case 0:
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
							setState(27);
							resid_0_Queue.put(new ProtocolMessage(box.get(),4));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_0_";
						}
						if (receiver.equals("interpd_0_")) {
							setState(65);
							interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_0_";
						}
						if (receiver.equals("rprj_0_")) {
							setState(283);
							rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_0_";
						}
						if (receiver.equals("psinv_0_")) {
							setState(254);
							psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						setState(3);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						setState(4);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						setState(6);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 6:
					if(!box.isPresent() && !isCloseAction){
						setState(8);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 8:
					if(!box.isPresent() && !isCloseAction){
						setState(10);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 10:
					if(!box.isPresent() && !isCloseAction){
						setState(12);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 11:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_4_";
						}
						if (receiver.equals("interpd_4_")) {
							setState(13);
							interpd_4_Queue.put(new ProtocolMessage(box.get(),13));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 12:
					if(!box.isPresent() && !isCloseAction){
						setState(14);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 13:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_5_";
						}
						if (receiver.equals("interpd_5_")) {
							setState(15);
							interpd_5_Queue.put(new ProtocolMessage(box.get(),15));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 14:
					if(!box.isPresent() && !isCloseAction){
						setState(16);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 15:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_6_";
						}
						if (receiver.equals("interpd_6_")) {
							setState(17);
							interpd_6_Queue.put(new ProtocolMessage(box.get(),17));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 16:
					if(!box.isPresent() && !isCloseAction){
						setState(18);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 17:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_7_";
						}
						if (receiver.equals("interpd_7_")) {
							setState(19);
							interpd_7_Queue.put(new ProtocolMessage(box.get(),19));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 18:
					if(!box.isPresent() && !isCloseAction){
						setState(20);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 19:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_8_";
						}
						if (receiver.equals("interpd_8_")) {
							setState(21);
							interpd_8_Queue.put(new ProtocolMessage(box.get(),21));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 20:
					if(!box.isPresent() && !isCloseAction){
						setState(22);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 21:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_9_";
						}
						if (receiver.equals("interpd_9_")) {
							setState(23);
							interpd_9_Queue.put(new ProtocolMessage(box.get(),23));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 22:
					if(!box.isPresent() && !isCloseAction){
						setState(24);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 23:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_10_";
						}
						if (receiver.equals("interpd_10_")) {
							setState(25);
							interpd_10_Queue.put(new ProtocolMessage(box.get(),25));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 24:
					if(!box.isPresent() && !isCloseAction){
						setState(26);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 25:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_11_";
						}
						if (receiver.equals("interpd_11_")) {
							setState(28);
							interpd_11_Queue.put(new ProtocolMessage(box.get(),27));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 26:
					if(!box.isPresent() && !isCloseAction){
						setState(63);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 27:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_1_";
						}
						if (receiver.equals("resid_1_")) {
							setState(30);
							resid_1_Queue.put(new ProtocolMessage(box.get(),541));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 28:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_12_";
						}
						if (receiver.equals("interpd_12_")) {
							setState(29);
							interpd_12_Queue.put(new ProtocolMessage(box.get(),29));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 29:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_13_";
						}
						if (receiver.equals("interpd_13_")) {
							setState(31);
							interpd_13_Queue.put(new ProtocolMessage(box.get(),31));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 30:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_2_";
						}
						if (receiver.equals("resid_2_")) {
							setState(32);
							resid_2_Queue.put(new ProtocolMessage(box.get(),543));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 31:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_14_";
						}
						if (receiver.equals("interpd_14_")) {
							setState(34);
							interpd_14_Queue.put(new ProtocolMessage(box.get(),33));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 32:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_3_";
						}
						if (receiver.equals("resid_3_")) {
							setState(33);
							resid_3_Queue.put(new ProtocolMessage(box.get(),545));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 33:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_4_";
						}
						if (receiver.equals("resid_4_")) {
							setState(35);
							resid_4_Queue.put(new ProtocolMessage(box.get(),547));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_5_";
						}
						if (receiver.equals("resid_5_")) {
							setState(37);
							resid_5_Queue.put(new ProtocolMessage(box.get(),549));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 36:
					if(!box.isPresent() && !isCloseAction){
						setState(38);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 37:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_6_";
						}
						if (receiver.equals("resid_6_")) {
							setState(39);
							resid_6_Queue.put(new ProtocolMessage(box.get(),551));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 38:
					if(!box.isPresent() && !isCloseAction){
						setState(40);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 39:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_7_";
						}
						if (receiver.equals("resid_7_")) {
							setState(41);
							resid_7_Queue.put(new ProtocolMessage(box.get(),553));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 40:
					if(!box.isPresent() && !isCloseAction){
						setState(42);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 41:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_8_";
						}
						if (receiver.equals("resid_8_")) {
							setState(43);
							resid_8_Queue.put(new ProtocolMessage(box.get(),555));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 42:
					if(!box.isPresent() && !isCloseAction){
						setState(44);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 43:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_9_";
						}
						if (receiver.equals("resid_9_")) {
							setState(45);
							resid_9_Queue.put(new ProtocolMessage(box.get(),557));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 44:
					if(!box.isPresent() && !isCloseAction){
						setState(46);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 45:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_10_";
						}
						if (receiver.equals("resid_10_")) {
							setState(47);
							resid_10_Queue.put(new ProtocolMessage(box.get(),559));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 46:
					if(!box.isPresent() && !isCloseAction){
						setState(48);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 47:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_11_";
						}
						if (receiver.equals("resid_11_")) {
							setState(49);
							resid_11_Queue.put(new ProtocolMessage(box.get(),561));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 48:
					if(!box.isPresent() && !isCloseAction){
						setState(50);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 49:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_12_";
						}
						if (receiver.equals("resid_12_")) {
							setState(51);
							resid_12_Queue.put(new ProtocolMessage(box.get(),563));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 50:
					if(!box.isPresent() && !isCloseAction){
						setState(52);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 51:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_13_";
						}
						if (receiver.equals("resid_13_")) {
							setState(53);
							resid_13_Queue.put(new ProtocolMessage(box.get(),565));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 52:
					if(!box.isPresent() && !isCloseAction){
						setState(54);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 53:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_14_";
						}
						if (receiver.equals("resid_14_")) {
							setState(56);
							resid_14_Queue.put(new ProtocolMessage(box.get(),567));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 54:
					if(!box.isPresent() && !isCloseAction){
						setState(55);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 55:
					if(!box.isPresent() && !isCloseAction){
						setState(57);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 56:
					if(!box.isPresent() && !isCloseAction){
						setState(58);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 57:
					if(!box.isPresent() && !isCloseAction){
						setState(59);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 58:
					if(!box.isPresent() && !isCloseAction){
						setState(60);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 59:
					if(!box.isPresent() && !isCloseAction){
						setState(61);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 60:
					if(!box.isPresent() && !isCloseAction){
						setState(62);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 61:
					if(!box.isPresent() && !isCloseAction){
						setState(63);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 62:
					if(!box.isPresent() && !isCloseAction){
						setState(64);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 63:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_0_";
						}
						if (receiver.equals("psinv_0_")) {
							setState(254);
							psinv_0_Queue.put(new ProtocolMessage(box.get(),2));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
						if (receiver == null) {
							receiver = "resid_0_";
						}
						if (receiver.equals("resid_0_")) {
							setState(27);
							resid_0_Queue.put(new ProtocolMessage(box.get(),4));
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
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_0_";
						}
						if (receiver.equals("rprj_0_")) {
							setState(283);
							rprj_0_Queue.put(new ProtocolMessage(box.get(),3));
							return Optional.empty();
						}
					}
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_0_";
						}
						if (receiver.equals("interpd_0_")) {
							setState(65);
							interpd_0_Queue.put(new ProtocolMessage(box.get(),5));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 64:
					if(!box.isPresent() && !isCloseAction){
						setState(67);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 65:
					if(!box.isPresent() && !isCloseAction){
						setState(66);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 66:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_0_";
						}
						if (receiver.equals("psinv_0_")) {
							setState(69);
							psinv_0_Queue.put(new ProtocolMessage(box.get(),68));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 67:
					if(!box.isPresent() && !isCloseAction){
						setState(68);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 68:
					if(!box.isPresent() && !isCloseAction){
						setState(71);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 69:
					if(!box.isPresent() && !isCloseAction){
						setState(70);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 70:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_0_";
						}
						if (receiver.equals("rprj_0_")) {
							setState(73);
							rprj_0_Queue.put(new ProtocolMessage(box.get(),72));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 71:
					if(!box.isPresent() && !isCloseAction){
						setState(72);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 72:
					if(!box.isPresent() && !isCloseAction){
						setState(75);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 73:
					if(!box.isPresent() && !isCloseAction){
						setState(74);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 74:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_0_";
						}
						if (receiver.equals("resid_0_")) {
							setState(77);
							resid_0_Queue.put(new ProtocolMessage(box.get(),76));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 75:
					if(!box.isPresent() && !isCloseAction){
						setState(76);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 76:
					if(!box.isPresent() && !isCloseAction){
						setState(79);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 77:
					if(!box.isPresent() && !isCloseAction){
						setState(78);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 78:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_1_";
						}
						if (receiver.equals("interpd_1_")) {
							setState(81);
							interpd_1_Queue.put(new ProtocolMessage(box.get(),80));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 79:
					if(!box.isPresent() && !isCloseAction){
						setState(80);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 80:
					if(!box.isPresent() && !isCloseAction){
						setState(83);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 81:
					if(!box.isPresent() && !isCloseAction){
						setState(82);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 82:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_1_";
						}
						if (receiver.equals("psinv_1_")) {
							setState(85);
							psinv_1_Queue.put(new ProtocolMessage(box.get(),84));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 83:
					if(!box.isPresent() && !isCloseAction){
						setState(84);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 84:
					if(!box.isPresent() && !isCloseAction){
						setState(63);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 85:
					if(!box.isPresent() && !isCloseAction){
						setState(86);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 86:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_1_";
						}
						if (receiver.equals("rprj_1_")) {
							setState(87);
							rprj_1_Queue.put(new ProtocolMessage(box.get(),88));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 87:
					if(!box.isPresent() && !isCloseAction){
						setState(88);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 88:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_1_";
						}
						if (receiver.equals("resid_1_")) {
							setState(89);
							resid_1_Queue.put(new ProtocolMessage(box.get(),92));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 89:
					if(!box.isPresent() && !isCloseAction){
						setState(90);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 90:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_2_";
						}
						if (receiver.equals("interpd_2_")) {
							setState(91);
							interpd_2_Queue.put(new ProtocolMessage(box.get(),96));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 91:
					if(!box.isPresent() && !isCloseAction){
						setState(92);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 92:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_2_";
						}
						if (receiver.equals("psinv_2_")) {
							setState(93);
							psinv_2_Queue.put(new ProtocolMessage(box.get(),100));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 93:
					if(!box.isPresent() && !isCloseAction){
						setState(94);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 94:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_2_";
						}
						if (receiver.equals("rprj_2_")) {
							setState(95);
							rprj_2_Queue.put(new ProtocolMessage(box.get(),104));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 95:
					if(!box.isPresent() && !isCloseAction){
						setState(96);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 96:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_2_";
						}
						if (receiver.equals("resid_2_")) {
							setState(97);
							resid_2_Queue.put(new ProtocolMessage(box.get(),108));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 97:
					if(!box.isPresent() && !isCloseAction){
						setState(98);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 98:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_3_";
						}
						if (receiver.equals("interpd_3_")) {
							setState(99);
							interpd_3_Queue.put(new ProtocolMessage(box.get(),112));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 99:
					if(!box.isPresent() && !isCloseAction){
						setState(100);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 100:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_3_";
						}
						if (receiver.equals("psinv_3_")) {
							setState(101);
							psinv_3_Queue.put(new ProtocolMessage(box.get(),116));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 101:
					if(!box.isPresent() && !isCloseAction){
						setState(102);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 102:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_3_";
						}
						if (receiver.equals("rprj_3_")) {
							setState(103);
							rprj_3_Queue.put(new ProtocolMessage(box.get(),120));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 103:
					if(!box.isPresent() && !isCloseAction){
						setState(104);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 104:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_3_";
						}
						if (receiver.equals("resid_3_")) {
							setState(105);
							resid_3_Queue.put(new ProtocolMessage(box.get(),124));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 105:
					if(!box.isPresent() && !isCloseAction){
						setState(106);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 106:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_4_";
						}
						if (receiver.equals("interpd_4_")) {
							setState(107);
							interpd_4_Queue.put(new ProtocolMessage(box.get(),128));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 107:
					if(!box.isPresent() && !isCloseAction){
						setState(108);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 108:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_4_";
						}
						if (receiver.equals("psinv_4_")) {
							setState(109);
							psinv_4_Queue.put(new ProtocolMessage(box.get(),132));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 109:
					if(!box.isPresent() && !isCloseAction){
						setState(110);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 110:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_4_";
						}
						if (receiver.equals("rprj_4_")) {
							setState(111);
							rprj_4_Queue.put(new ProtocolMessage(box.get(),136));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 111:
					if(!box.isPresent() && !isCloseAction){
						setState(112);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 112:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_4_";
						}
						if (receiver.equals("resid_4_")) {
							setState(113);
							resid_4_Queue.put(new ProtocolMessage(box.get(),140));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 113:
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
							receiver = "interpd_5_";
						}
						if (receiver.equals("interpd_5_")) {
							setState(115);
							interpd_5_Queue.put(new ProtocolMessage(box.get(),144));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 115:
					if(!box.isPresent() && !isCloseAction){
						setState(116);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 116:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_5_";
						}
						if (receiver.equals("psinv_5_")) {
							setState(117);
							psinv_5_Queue.put(new ProtocolMessage(box.get(),148));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 117:
					if(!box.isPresent() && !isCloseAction){
						setState(118);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 118:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_5_";
						}
						if (receiver.equals("rprj_5_")) {
							setState(119);
							rprj_5_Queue.put(new ProtocolMessage(box.get(),152));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 119:
					if(!box.isPresent() && !isCloseAction){
						setState(120);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 120:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_5_";
						}
						if (receiver.equals("resid_5_")) {
							setState(121);
							resid_5_Queue.put(new ProtocolMessage(box.get(),156));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 121:
					if(!box.isPresent() && !isCloseAction){
						setState(122);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 122:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_6_";
						}
						if (receiver.equals("interpd_6_")) {
							setState(123);
							interpd_6_Queue.put(new ProtocolMessage(box.get(),160));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 123:
					if(!box.isPresent() && !isCloseAction){
						setState(124);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 124:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_6_";
						}
						if (receiver.equals("psinv_6_")) {
							setState(125);
							psinv_6_Queue.put(new ProtocolMessage(box.get(),164));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 125:
					if(!box.isPresent() && !isCloseAction){
						setState(126);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 126:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_6_";
						}
						if (receiver.equals("rprj_6_")) {
							setState(127);
							rprj_6_Queue.put(new ProtocolMessage(box.get(),168));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 127:
					if(!box.isPresent() && !isCloseAction){
						setState(128);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 128:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_6_";
						}
						if (receiver.equals("resid_6_")) {
							setState(129);
							resid_6_Queue.put(new ProtocolMessage(box.get(),172));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 129:
					if(!box.isPresent() && !isCloseAction){
						setState(130);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 130:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_7_";
						}
						if (receiver.equals("interpd_7_")) {
							setState(131);
							interpd_7_Queue.put(new ProtocolMessage(box.get(),176));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 131:
					if(!box.isPresent() && !isCloseAction){
						setState(132);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 132:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_7_";
						}
						if (receiver.equals("psinv_7_")) {
							setState(133);
							psinv_7_Queue.put(new ProtocolMessage(box.get(),180));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 133:
					if(!box.isPresent() && !isCloseAction){
						setState(134);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 134:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_7_";
						}
						if (receiver.equals("rprj_7_")) {
							setState(135);
							rprj_7_Queue.put(new ProtocolMessage(box.get(),184));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 135:
					if(!box.isPresent() && !isCloseAction){
						setState(136);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 136:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_7_";
						}
						if (receiver.equals("resid_7_")) {
							setState(137);
							resid_7_Queue.put(new ProtocolMessage(box.get(),188));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 137:
					if(!box.isPresent() && !isCloseAction){
						setState(138);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 138:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_8_";
						}
						if (receiver.equals("interpd_8_")) {
							setState(139);
							interpd_8_Queue.put(new ProtocolMessage(box.get(),192));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 139:
					if(!box.isPresent() && !isCloseAction){
						setState(140);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 140:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_8_";
						}
						if (receiver.equals("psinv_8_")) {
							setState(141);
							psinv_8_Queue.put(new ProtocolMessage(box.get(),196));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 141:
					if(!box.isPresent() && !isCloseAction){
						setState(142);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 142:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_8_";
						}
						if (receiver.equals("rprj_8_")) {
							setState(143);
							rprj_8_Queue.put(new ProtocolMessage(box.get(),200));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 143:
					if(!box.isPresent() && !isCloseAction){
						setState(144);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 144:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_8_";
						}
						if (receiver.equals("resid_8_")) {
							setState(145);
							resid_8_Queue.put(new ProtocolMessage(box.get(),204));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 145:
					if(!box.isPresent() && !isCloseAction){
						setState(146);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 146:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_9_";
						}
						if (receiver.equals("interpd_9_")) {
							setState(147);
							interpd_9_Queue.put(new ProtocolMessage(box.get(),208));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 147:
					if(!box.isPresent() && !isCloseAction){
						setState(148);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 148:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_9_";
						}
						if (receiver.equals("psinv_9_")) {
							setState(149);
							psinv_9_Queue.put(new ProtocolMessage(box.get(),212));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 149:
					if(!box.isPresent() && !isCloseAction){
						setState(150);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 150:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_9_";
						}
						if (receiver.equals("rprj_9_")) {
							setState(151);
							rprj_9_Queue.put(new ProtocolMessage(box.get(),216));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 151:
					if(!box.isPresent() && !isCloseAction){
						setState(152);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 152:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_9_";
						}
						if (receiver.equals("resid_9_")) {
							setState(153);
							resid_9_Queue.put(new ProtocolMessage(box.get(),220));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 153:
					if(!box.isPresent() && !isCloseAction){
						setState(154);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 154:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_10_";
						}
						if (receiver.equals("interpd_10_")) {
							setState(155);
							interpd_10_Queue.put(new ProtocolMessage(box.get(),224));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 155:
					if(!box.isPresent() && !isCloseAction){
						setState(156);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 156:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_10_";
						}
						if (receiver.equals("psinv_10_")) {
							setState(157);
							psinv_10_Queue.put(new ProtocolMessage(box.get(),228));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 157:
					if(!box.isPresent() && !isCloseAction){
						setState(158);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 158:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_10_";
						}
						if (receiver.equals("rprj_10_")) {
							setState(159);
							rprj_10_Queue.put(new ProtocolMessage(box.get(),232));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 159:
					if(!box.isPresent() && !isCloseAction){
						setState(160);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 160:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_10_";
						}
						if (receiver.equals("resid_10_")) {
							setState(161);
							resid_10_Queue.put(new ProtocolMessage(box.get(),236));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 161:
					if(!box.isPresent() && !isCloseAction){
						setState(162);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 162:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_11_";
						}
						if (receiver.equals("interpd_11_")) {
							setState(163);
							interpd_11_Queue.put(new ProtocolMessage(box.get(),240));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 163:
					if(!box.isPresent() && !isCloseAction){
						setState(164);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 164:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_11_";
						}
						if (receiver.equals("psinv_11_")) {
							setState(165);
							psinv_11_Queue.put(new ProtocolMessage(box.get(),244));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 165:
					if(!box.isPresent() && !isCloseAction){
						setState(166);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 166:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_11_";
						}
						if (receiver.equals("rprj_11_")) {
							setState(167);
							rprj_11_Queue.put(new ProtocolMessage(box.get(),248));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 167:
					if(!box.isPresent() && !isCloseAction){
						setState(168);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 168:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_11_";
						}
						if (receiver.equals("resid_11_")) {
							setState(169);
							resid_11_Queue.put(new ProtocolMessage(box.get(),252));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 169:
					if(!box.isPresent() && !isCloseAction){
						setState(170);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 170:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_12_";
						}
						if (receiver.equals("interpd_12_")) {
							setState(171);
							interpd_12_Queue.put(new ProtocolMessage(box.get(),256));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 171:
					if(!box.isPresent() && !isCloseAction){
						setState(172);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 172:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_12_";
						}
						if (receiver.equals("psinv_12_")) {
							setState(173);
							psinv_12_Queue.put(new ProtocolMessage(box.get(),260));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 173:
					if(!box.isPresent() && !isCloseAction){
						setState(174);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 174:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_12_";
						}
						if (receiver.equals("rprj_12_")) {
							setState(175);
							rprj_12_Queue.put(new ProtocolMessage(box.get(),264));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 175:
					if(!box.isPresent() && !isCloseAction){
						setState(176);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 176:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_12_";
						}
						if (receiver.equals("resid_12_")) {
							setState(177);
							resid_12_Queue.put(new ProtocolMessage(box.get(),268));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 177:
					if(!box.isPresent() && !isCloseAction){
						setState(178);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 178:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_13_";
						}
						if (receiver.equals("interpd_13_")) {
							setState(179);
							interpd_13_Queue.put(new ProtocolMessage(box.get(),272));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 179:
					if(!box.isPresent() && !isCloseAction){
						setState(180);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 180:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_13_";
						}
						if (receiver.equals("psinv_13_")) {
							setState(181);
							psinv_13_Queue.put(new ProtocolMessage(box.get(),276));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 181:
					if(!box.isPresent() && !isCloseAction){
						setState(182);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 182:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_13_";
						}
						if (receiver.equals("rprj_13_")) {
							setState(183);
							rprj_13_Queue.put(new ProtocolMessage(box.get(),280));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 183:
					if(!box.isPresent() && !isCloseAction){
						setState(184);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 184:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_13_";
						}
						if (receiver.equals("resid_13_")) {
							setState(185);
							resid_13_Queue.put(new ProtocolMessage(box.get(),284));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 185:
					if(!box.isPresent() && !isCloseAction){
						setState(186);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 186:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "interpd_14_";
						}
						if (receiver.equals("interpd_14_")) {
							setState(187);
							interpd_14_Queue.put(new ProtocolMessage(box.get(),288));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 187:
					if(!box.isPresent() && !isCloseAction){
						setState(188);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 188:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_14_";
						}
						if (receiver.equals("psinv_14_")) {
							setState(189);
							psinv_14_Queue.put(new ProtocolMessage(box.get(),292));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 189:
					if(!box.isPresent() && !isCloseAction){
						setState(190);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 190:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_14_";
						}
						if (receiver.equals("rprj_14_")) {
							setState(191);
							rprj_14_Queue.put(new ProtocolMessage(box.get(),296));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 191:
					if(!box.isPresent() && !isCloseAction){
						setState(192);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 192:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
						if (receiver == null) {
							receiver = "resid_14_";
						}
						if (receiver.equals("resid_14_")) {
							setState(193);
							resid_14_Queue.put(new ProtocolMessage(box.get(),300));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 193:
					if(!box.isPresent() && !isCloseAction){
						setState(194);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 194:
					if (isCloseAction) {
						setState(195);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 195:
					if (isCloseAction) {
						setState(196);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 196:
					if (isCloseAction) {
						setState(197);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 197:
					if (isCloseAction) {
						setState(198);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 198:
					if (isCloseAction) {
						setState(199);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 199:
					if (isCloseAction) {
						setState(200);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		public <Any, AnyInput> Optional<Any> exchange_200_298(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 200:
					if (isCloseAction) {
						setState(201);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 201:
					if (isCloseAction) {
						setState(202);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 202:
					if (isCloseAction) {
						setState(203);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 203:
					if (isCloseAction) {
						setState(204);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 204:
					if (isCloseAction) {
						setState(205);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 205:
					if (isCloseAction) {
						setState(206);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 206:
					if (isCloseAction) {
						setState(207);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 207:
					if (isCloseAction) {
						setState(208);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 208:
					if (isCloseAction) {
						setState(209);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 209:
					if (isCloseAction) {
						setState(210);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 210:
					if (isCloseAction) {
						setState(211);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 211:
					if (isCloseAction) {
						setState(212);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 212:
					if (isCloseAction) {
						setState(213);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 213:
					if (isCloseAction) {
						setState(214);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 214:
					if (isCloseAction) {
						setState(215);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 215:
					if (isCloseAction) {
						setState(216);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 216:
					if (isCloseAction) {
						setState(217);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 217:
					if (isCloseAction) {
						setState(218);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 218:
					if (isCloseAction) {
						setState(219);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 219:
					if (isCloseAction) {
						setState(220);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 220:
					if (isCloseAction) {
						setState(221);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 221:
					if (isCloseAction) {
						setState(222);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 222:
					if (isCloseAction) {
						setState(223);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 223:
					if (isCloseAction) {
						setState(224);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 224:
					if (isCloseAction) {
						setState(225);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 225:
					if (isCloseAction) {
						setState(226);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 226:
					if (isCloseAction) {
						setState(227);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 227:
					if (isCloseAction) {
						setState(228);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 228:
					if (isCloseAction) {
						setState(229);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 229:
					if (isCloseAction) {
						setState(230);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 230:
					if (isCloseAction) {
						setState(231);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 231:
					if (isCloseAction) {
						setState(232);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 232:
					if (isCloseAction) {
						setState(233);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 233:
					if (isCloseAction) {
						setState(234);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 234:
					if (isCloseAction) {
						setState(235);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 235:
					if (isCloseAction) {
						setState(236);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 236:
					if (isCloseAction) {
						setState(237);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 237:
					if (isCloseAction) {
						setState(238);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 238:
					if (isCloseAction) {
						setState(239);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 239:
					if (isCloseAction) {
						setState(240);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 240:
					if (isCloseAction) {
						setState(241);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 241:
					if (isCloseAction) {
						setState(242);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 242:
					if (isCloseAction) {
						setState(243);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 243:
					if (isCloseAction) {
						setState(244);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 244:
					if (isCloseAction) {
						setState(245);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 245:
					if (isCloseAction) {
						setState(246);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 246:
					if (isCloseAction) {
						setState(247);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 247:
					if (isCloseAction) {
						setState(248);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 248:
					if (isCloseAction) {
						setState(249);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 249:
					if (isCloseAction) {
						setState(250);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 250:
					if (isCloseAction) {
						setState(251);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 251:
					if (isCloseAction) {
						setState(252);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 252:
					if (isCloseAction) {
						setState(253);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 253:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 254:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_1_";
						}
						if (receiver.equals("psinv_1_")) {
							setState(255);
							psinv_1_Queue.put(new ProtocolMessage(box.get(),425));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 255:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_2_";
						}
						if (receiver.equals("psinv_2_")) {
							setState(256);
							psinv_2_Queue.put(new ProtocolMessage(box.get(),427));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 256:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_3_";
						}
						if (receiver.equals("psinv_3_")) {
							setState(257);
							psinv_3_Queue.put(new ProtocolMessage(box.get(),429));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 257:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_4_";
						}
						if (receiver.equals("psinv_4_")) {
							setState(258);
							psinv_4_Queue.put(new ProtocolMessage(box.get(),431));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 258:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_5_";
						}
						if (receiver.equals("psinv_5_")) {
							setState(259);
							psinv_5_Queue.put(new ProtocolMessage(box.get(),433));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 259:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_6_";
						}
						if (receiver.equals("psinv_6_")) {
							setState(260);
							psinv_6_Queue.put(new ProtocolMessage(box.get(),435));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 260:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_7_";
						}
						if (receiver.equals("psinv_7_")) {
							setState(261);
							psinv_7_Queue.put(new ProtocolMessage(box.get(),437));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 261:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_8_";
						}
						if (receiver.equals("psinv_8_")) {
							setState(262);
							psinv_8_Queue.put(new ProtocolMessage(box.get(),439));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 262:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_9_";
						}
						if (receiver.equals("psinv_9_")) {
							setState(263);
							psinv_9_Queue.put(new ProtocolMessage(box.get(),441));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 263:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_10_";
						}
						if (receiver.equals("psinv_10_")) {
							setState(264);
							psinv_10_Queue.put(new ProtocolMessage(box.get(),443));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 264:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_11_";
						}
						if (receiver.equals("psinv_11_")) {
							setState(265);
							psinv_11_Queue.put(new ProtocolMessage(box.get(),445));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 265:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_12_";
						}
						if (receiver.equals("psinv_12_")) {
							setState(266);
							psinv_12_Queue.put(new ProtocolMessage(box.get(),447));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 266:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_13_";
						}
						if (receiver.equals("psinv_13_")) {
							setState(267);
							psinv_13_Queue.put(new ProtocolMessage(box.get(),449));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 267:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
						if (receiver == null) {
							receiver = "psinv_14_";
						}
						if (receiver.equals("psinv_14_")) {
							setState(268);
							psinv_14_Queue.put(new ProtocolMessage(box.get(),451));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 268:
					if(!box.isPresent() && !isCloseAction){
						setState(269);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 269:
					if(!box.isPresent() && !isCloseAction){
						setState(270);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 270:
					if(!box.isPresent() && !isCloseAction){
						setState(271);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 271:
					if(!box.isPresent() && !isCloseAction){
						setState(272);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 272:
					if(!box.isPresent() && !isCloseAction){
						setState(273);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 273:
					if(!box.isPresent() && !isCloseAction){
						setState(274);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 274:
					if(!box.isPresent() && !isCloseAction){
						setState(275);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 275:
					if(!box.isPresent() && !isCloseAction){
						setState(276);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 276:
					if(!box.isPresent() && !isCloseAction){
						setState(277);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 277:
					if(!box.isPresent() && !isCloseAction){
						setState(278);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 278:
					if(!box.isPresent() && !isCloseAction){
						setState(279);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 279:
					if(!box.isPresent() && !isCloseAction){
						setState(280);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 280:
					if(!box.isPresent() && !isCloseAction){
						setState(281);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 281:
					if(!box.isPresent() && !isCloseAction){
						setState(282);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 282:
					if(!box.isPresent() && !isCloseAction){
						setState(63);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
					}
					throw new NotAllowedTransitionException();
				case 283:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_1_";
						}
						if (receiver.equals("rprj_1_")) {
							setState(284);
							rprj_1_Queue.put(new ProtocolMessage(box.get(),483));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 284:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_2_";
						}
						if (receiver.equals("rprj_2_")) {
							setState(285);
							rprj_2_Queue.put(new ProtocolMessage(box.get(),485));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 285:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_3_";
						}
						if (receiver.equals("rprj_3_")) {
							setState(286);
							rprj_3_Queue.put(new ProtocolMessage(box.get(),487));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 286:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_4_";
						}
						if (receiver.equals("rprj_4_")) {
							setState(287);
							rprj_4_Queue.put(new ProtocolMessage(box.get(),489));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 287:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_5_";
						}
						if (receiver.equals("rprj_5_")) {
							setState(288);
							rprj_5_Queue.put(new ProtocolMessage(box.get(),491));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 288:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_6_";
						}
						if (receiver.equals("rprj_6_")) {
							setState(289);
							rprj_6_Queue.put(new ProtocolMessage(box.get(),493));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 289:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_7_";
						}
						if (receiver.equals("rprj_7_")) {
							setState(290);
							rprj_7_Queue.put(new ProtocolMessage(box.get(),495));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 290:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_8_";
						}
						if (receiver.equals("rprj_8_")) {
							setState(291);
							rprj_8_Queue.put(new ProtocolMessage(box.get(),497));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 291:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_9_";
						}
						if (receiver.equals("rprj_9_")) {
							setState(292);
							rprj_9_Queue.put(new ProtocolMessage(box.get(),499));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 292:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_10_";
						}
						if (receiver.equals("rprj_10_")) {
							setState(293);
							rprj_10_Queue.put(new ProtocolMessage(box.get(),501));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 293:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_11_";
						}
						if (receiver.equals("rprj_11_")) {
							setState(294);
							rprj_11_Queue.put(new ProtocolMessage(box.get(),503));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 294:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_12_";
						}
						if (receiver.equals("rprj_12_")) {
							setState(295);
							rprj_12_Queue.put(new ProtocolMessage(box.get(),505));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 295:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_13_";
						}
						if (receiver.equals("rprj_13_")) {
							setState(296);
							rprj_13_Queue.put(new ProtocolMessage(box.get(),507));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 296:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
						if (receiver == null) {
							receiver = "rprj_14_";
						}
						if (receiver.equals("rprj_14_")) {
							setState(297);
							rprj_14_Queue.put(new ProtocolMessage(box.get(),509));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 297:
					if(!box.isPresent() && !isCloseAction){
						setState(2);
						// Disabling unchecked inspection: We did check the class in the if statement above
						//noinspection unchecked
						return Optional.of((Any)masterQueue.take().Message);
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
			if (state >=200 && state <= 298){
				Optional result = exchange_200_298(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_0_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_0_";
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
							masterQueue.put(new ProtocolMessage(box.get(),453));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),70));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 2) {
							setState(1);
							//queueFrommasterTopsinv_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 68) {
							setState(2);
							//queueFrommasterTopsinv_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_10_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_10_";
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
							masterQueue.put(new ProtocolMessage(box.get(),230));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),473));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 228) {
							setState(1);
							//queueFrommasterTopsinv_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 443) {
							setState(3);
							//queueFrommasterTopsinv_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_11_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_11_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 244) {
							setState(2);
							//queueFrommasterTopsinv_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 445) {
							setState(4);
							//queueFrommasterTopsinv_11_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),246));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							masterQueue.put(new ProtocolMessage(box.get(),475));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_12_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_12_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 260) {
							setState(2);
							//queueFrommasterTopsinv_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 447) {
							setState(4);
							//queueFrommasterTopsinv_12_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),262));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							masterQueue.put(new ProtocolMessage(box.get(),477));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_13_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_13_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 276) {
							setState(2);
							//queueFrommasterTopsinv_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 449) {
							setState(4);
							//queueFrommasterTopsinv_13_);
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),278));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							masterQueue.put(new ProtocolMessage(box.get(),479));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_14_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_14_";
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
							masterQueue.put(new ProtocolMessage(box.get(),481));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),294));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 292) {
							setState(2);
							//queueFrommasterTopsinv_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 451) {
							setState(1);
							//queueFrommasterTopsinv_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_1_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_1_";
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
							masterQueue.put(new ProtocolMessage(box.get(),86));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),455));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 84) {
							setState(1);
							//queueFrommasterTopsinv_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 425) {
							setState(2);
							//queueFrommasterTopsinv_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_2_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_2_";
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
							masterQueue.put(new ProtocolMessage(box.get(),102));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),457));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 100) {
							setState(1);
							//queueFrommasterTopsinv_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 427) {
							setState(2);
							//queueFrommasterTopsinv_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_3_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_3_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 116) {
							setState(2);
							//queueFrommasterTopsinv_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 429) {
							setState(3);
							//queueFrommasterTopsinv_3_);
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),118));
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),459));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_4_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_4_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 132) {
							setState(3);
							//queueFrommasterTopsinv_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 431) {
							setState(4);
							//queueFrommasterTopsinv_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),134));
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
							masterQueue.put(new ProtocolMessage(box.get(),461));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_5_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_5_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 148) {
							setState(3);
							//queueFrommasterTopsinv_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 433) {
							setState(4);
							//queueFrommasterTopsinv_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),150));
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
							masterQueue.put(new ProtocolMessage(box.get(),463));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_6_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_6_";
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
							masterQueue.put(new ProtocolMessage(box.get(),465));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),166));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 164) {
							setState(3);
							//queueFrommasterTopsinv_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 435) {
							setState(1);
							//queueFrommasterTopsinv_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_7_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_7_";
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
							masterQueue.put(new ProtocolMessage(box.get(),467));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),182));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 180) {
							setState(3);
							//queueFrommasterTopsinv_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 437) {
							setState(1);
							//queueFrommasterTopsinv_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_8_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_8_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),469));
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),198));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 196) {
							setState(3);
							//queueFrommasterTopsinv_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 439) {
							setState(2);
							//queueFrommasterTopsinv_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment psinv_9_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "psinv_9_";
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
							masterQueue.put(new ProtocolMessage(box.get(),214));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),471));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = psinv_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 212) {
							setState(1);
							//queueFrommasterTopsinv_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 441) {
							setState(3);
							//queueFrommasterTopsinv_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_0_Environment = new IEnvironment() {
		private int state = 0;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_0_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 1 :
					wait();
					break;
				case 0:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 4) {
							setState(2);
							//queueFrommasterToresid_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 76) {
							setState(4);
							//queueFrommasterToresid_0_);
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
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),569));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(1);
						return Optional.empty();
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),78));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_10_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_10_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 236) {
							setState(4);
							//queueFrommasterToresid_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 559) {
							setState(3);
							//queueFrommasterToresid_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),589));
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
							masterQueue.put(new ProtocolMessage(box.get(),238));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_11_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_11_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 252) {
							setState(3);
							//queueFrommasterToresid_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 561) {
							setState(4);
							//queueFrommasterToresid_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),254));
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
							masterQueue.put(new ProtocolMessage(box.get(),591));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_12_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_12_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),270));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 268) {
							setState(3);
							//queueFrommasterToresid_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 563) {
							setState(1);
							//queueFrommasterToresid_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_13_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_13_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 284) {
							setState(4);
							//queueFrommasterToresid_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 565) {
							setState(2);
							//queueFrommasterToresid_13_);
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
							masterQueue.put(new ProtocolMessage(box.get(),595));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),286));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_14_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_14_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 300) {
							setState(4);
							//queueFrommasterToresid_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 567) {
							setState(2);
							//queueFrommasterToresid_14_);
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
							masterQueue.put(new ProtocolMessage(box.get(),597));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),302));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_1_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_1_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 92) {
							setState(4);
							//queueFrommasterToresid_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 541) {
							setState(3);
							//queueFrommasterToresid_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),571));
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
							masterQueue.put(new ProtocolMessage(box.get(),94));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_2_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_2_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 108) {
							setState(4);
							//queueFrommasterToresid_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 543) {
							setState(3);
							//queueFrommasterToresid_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
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
							masterQueue.put(new ProtocolMessage(box.get(),110));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_3_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_3_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 124) {
							setState(3);
							//queueFrommasterToresid_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 545) {
							setState(4);
							//queueFrommasterToresid_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),126));
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
							masterQueue.put(new ProtocolMessage(box.get(),575));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_4_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_4_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),142));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 140) {
							setState(3);
							//queueFrommasterToresid_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 547) {
							setState(1);
							//queueFrommasterToresid_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_5_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_5_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 156) {
							setState(3);
							//queueFrommasterToresid_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 549) {
							setState(2);
							//queueFrommasterToresid_5_);
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
							masterQueue.put(new ProtocolMessage(box.get(),579));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),158));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_6_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_6_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 172) {
							setState(3);
							//queueFrommasterToresid_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 551) {
							setState(2);
							//queueFrommasterToresid_6_);
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
							masterQueue.put(new ProtocolMessage(box.get(),581));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),174));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_7_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_7_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 188) {
							setState(3);
							//queueFrommasterToresid_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 553) {
							setState(2);
							//queueFrommasterToresid_7_);
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
							masterQueue.put(new ProtocolMessage(box.get(),583));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),190));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_8_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_8_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 204) {
							setState(4);
							//queueFrommasterToresid_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 555) {
							setState(3);
							//queueFrommasterToresid_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),206));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment resid_9_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "resid_9_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = resid_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 220) {
							setState(4);
							//queueFrommasterToresid_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 557) {
							setState(3);
							//queueFrommasterToresid_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
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
							masterQueue.put(new ProtocolMessage(box.get(),222));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_0_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_0_";
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
							masterQueue.put(new ProtocolMessage(box.get(),74));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_0_Queue.take();
						if (objectToGet.OriginalTargetStateId == 3) {
							setState(4);
							//queueFrommasterTorprj_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 72) {
							setState(1);
							//queueFrommasterTorprj_0_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),511));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_10_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_10_";
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
							masterQueue.put(new ProtocolMessage(box.get(),531));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),234));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_10_Queue.take();
						if (objectToGet.OriginalTargetStateId == 232) {
							setState(3);
							//queueFrommasterTorprj_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 501) {
							setState(1);
							//queueFrommasterTorprj_10_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_11_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_11_";
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
							masterQueue.put(new ProtocolMessage(box.get(),533));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),250));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_11_Queue.take();
						if (objectToGet.OriginalTargetStateId == 248) {
							setState(3);
							//queueFrommasterTorprj_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 503) {
							setState(1);
							//queueFrommasterTorprj_11_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_12_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_12_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_12_Queue.take();
						if (objectToGet.OriginalTargetStateId == 264) {
							setState(4);
							//queueFrommasterTorprj_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 505) {
							setState(3);
							//queueFrommasterTorprj_12_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),535));
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
							masterQueue.put(new ProtocolMessage(box.get(),266));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_13_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_13_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_13_Queue.take();
						if (objectToGet.OriginalTargetStateId == 280) {
							setState(4);
							//queueFrommasterTorprj_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 507) {
							setState(3);
							//queueFrommasterTorprj_13_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),537));
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
							masterQueue.put(new ProtocolMessage(box.get(),282));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_14_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_14_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_14_Queue.take();
						if (objectToGet.OriginalTargetStateId == 296) {
							setState(3);
							//queueFrommasterTorprj_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 509) {
							setState(4);
							//queueFrommasterTorprj_14_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 2:
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
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),298));
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
							masterQueue.put(new ProtocolMessage(box.get(),539));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_1_Environment = new IEnvironment() {
		private int state = 3;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_1_";
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
							masterQueue.put(new ProtocolMessage(box.get(),513));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),90));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_1_Queue.take();
						if (objectToGet.OriginalTargetStateId == 88) {
							setState(2);
							//queueFrommasterTorprj_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 483) {
							setState(1);
							//queueFrommasterTorprj_1_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_2_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_2_";
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
							masterQueue.put(new ProtocolMessage(box.get(),515));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),106));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_2_Queue.take();
						if (objectToGet.OriginalTargetStateId == 104) {
							setState(2);
							//queueFrommasterTorprj_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 485) {
							setState(1);
							//queueFrommasterTorprj_2_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_3_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_3_";
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
							masterQueue.put(new ProtocolMessage(box.get(),517));
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
							setState(3);
							masterQueue.put(new ProtocolMessage(box.get(),122));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (isCloseAction) {
						setState(0);
						return Optional.empty();
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_3_Queue.take();
						if (objectToGet.OriginalTargetStateId == 120) {
							setState(2);
							//queueFrommasterTorprj_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 487) {
							setState(1);
							//queueFrommasterTorprj_3_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_4_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_4_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_4_Queue.take();
						if (objectToGet.OriginalTargetStateId == 136) {
							setState(3);
							//queueFrommasterTorprj_4_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 489) {
							setState(2);
							//queueFrommasterTorprj_4_);
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
							masterQueue.put(new ProtocolMessage(box.get(),519));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),138));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_5_Environment = new IEnvironment() {
		private int state = 1;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_5_";
		}
		
		public <Any, AnyInput> Optional<Any> exchange_0_5(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			switch (state){
				case 0 :
					wait();
					break;
				case 1:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_5_Queue.take();
						if (objectToGet.OriginalTargetStateId == 152) {
							setState(3);
							//queueFrommasterTorprj_5_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 491) {
							setState(2);
							//queueFrommasterTorprj_5_);
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
							masterQueue.put(new ProtocolMessage(box.get(),521));
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
							setState(4);
							masterQueue.put(new ProtocolMessage(box.get(),154));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if (isCloseAction) {
						setState(0);
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_6_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_6_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_6_Queue.take();
						if (objectToGet.OriginalTargetStateId == 168) {
							setState(3);
							//queueFrommasterTorprj_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 493) {
							setState(4);
							//queueFrommasterTorprj_6_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(0);
							masterQueue.put(new ProtocolMessage(box.get(),170));
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
							masterQueue.put(new ProtocolMessage(box.get(),523));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_7_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_7_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_7_Queue.take();
						if (objectToGet.OriginalTargetStateId == 184) {
							setState(3);
							//queueFrommasterTorprj_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 495) {
							setState(4);
							//queueFrommasterTorprj_7_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),186));
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
							masterQueue.put(new ProtocolMessage(box.get(),525));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_8_Environment = new IEnvironment() {
		private int state = 2;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_8_";
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 2:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_8_Queue.take();
						if (objectToGet.OriginalTargetStateId == 200) {
							setState(3);
							//queueFrommasterTorprj_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 497) {
							setState(4);
							//queueFrommasterTorprj_8_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(1);
							masterQueue.put(new ProtocolMessage(box.get(),202));
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
							masterQueue.put(new ProtocolMessage(box.get(),527));
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
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	private final IEnvironment rprj_9_Environment = new IEnvironment() {
		private int state = 4;
		
		public int getState(){
			return state;
		}
		
		public void setState(int newState){
			state = newState;
		}
		
		@Override
		public String getName(){
			return "rprj_9_";
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
							masterQueue.put(new ProtocolMessage(box.get(),529));
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
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 3:
					if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
						if (receiver == null) {
							receiver = "master";
						}
						if (receiver.equals("master")) {
							setState(2);
							masterQueue.put(new ProtocolMessage(box.get(),218));
							return Optional.empty();
						}
					}
					if(!box.isPresent() && !isCloseAction){
					}
					throw new NotAllowedTransitionException();
				case 4:
					if(!box.isPresent() && !isCloseAction){
						ProtocolMessage objectToGet = rprj_9_Queue.take();
						if (objectToGet.OriginalTargetStateId == 216) {
							setState(3);
							//queueFrommasterTorprj_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
						if (objectToGet.OriginalTargetStateId == 499) {
							setState(1);
							//queueFrommasterTorprj_9_);
							// Disabling unchecked inspection: We did check the class in the if statement above
							//noinspection unchecked
							return Optional.of((Any)objectToGet.Message);
						}
					}
					throw new NotAllowedTransitionException();
			}
			return null;
		}
		
		@Override
		public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
			if (state >=0 && state <= 5){
				Optional result = exchange_0_5(box, receiver, isCloseAction);
				if(result != null)
				  return (Optional<Any>) result;
			}
			 throw new NotAllowedTransitionException();
			
		}
	};
	
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "interpd_0_": return interpd_0_Environment;
			case "interpd_10_": return interpd_10_Environment;
			case "interpd_11_": return interpd_11_Environment;
			case "interpd_12_": return interpd_12_Environment;
			case "interpd_13_": return interpd_13_Environment;
			case "interpd_14_": return interpd_14_Environment;
			case "interpd_1_": return interpd_1_Environment;
			case "interpd_2_": return interpd_2_Environment;
			case "interpd_3_": return interpd_3_Environment;
			case "interpd_4_": return interpd_4_Environment;
			case "interpd_5_": return interpd_5_Environment;
			case "interpd_6_": return interpd_6_Environment;
			case "interpd_7_": return interpd_7_Environment;
			case "interpd_8_": return interpd_8_Environment;
			case "interpd_9_": return interpd_9_Environment;
			case "master": return masterEnvironment;
			case "psinv_0_": return psinv_0_Environment;
			case "psinv_10_": return psinv_10_Environment;
			case "psinv_11_": return psinv_11_Environment;
			case "psinv_12_": return psinv_12_Environment;
			case "psinv_13_": return psinv_13_Environment;
			case "psinv_14_": return psinv_14_Environment;
			case "psinv_1_": return psinv_1_Environment;
			case "psinv_2_": return psinv_2_Environment;
			case "psinv_3_": return psinv_3_Environment;
			case "psinv_4_": return psinv_4_Environment;
			case "psinv_5_": return psinv_5_Environment;
			case "psinv_6_": return psinv_6_Environment;
			case "psinv_7_": return psinv_7_Environment;
			case "psinv_8_": return psinv_8_Environment;
			case "psinv_9_": return psinv_9_Environment;
			case "resid_0_": return resid_0_Environment;
			case "resid_10_": return resid_10_Environment;
			case "resid_11_": return resid_11_Environment;
			case "resid_12_": return resid_12_Environment;
			case "resid_13_": return resid_13_Environment;
			case "resid_14_": return resid_14_Environment;
			case "resid_1_": return resid_1_Environment;
			case "resid_2_": return resid_2_Environment;
			case "resid_3_": return resid_3_Environment;
			case "resid_4_": return resid_4_Environment;
			case "resid_5_": return resid_5_Environment;
			case "resid_6_": return resid_6_Environment;
			case "resid_7_": return resid_7_Environment;
			case "resid_8_": return resid_8_Environment;
			case "resid_9_": return resid_9_Environment;
			case "rprj_0_": return rprj_0_Environment;
			case "rprj_10_": return rprj_10_Environment;
			case "rprj_11_": return rprj_11_Environment;
			case "rprj_12_": return rprj_12_Environment;
			case "rprj_13_": return rprj_13_Environment;
			case "rprj_14_": return rprj_14_Environment;
			case "rprj_1_": return rprj_1_Environment;
			case "rprj_2_": return rprj_2_Environment;
			case "rprj_3_": return rprj_3_Environment;
			case "rprj_4_": return rprj_4_Environment;
			case "rprj_5_": return rprj_5_Environment;
			case "rprj_6_": return rprj_6_Environment;
			case "rprj_7_": return rprj_7_Environment;
			case "rprj_8_": return rprj_8_Environment;
			case "rprj_9_": return rprj_9_Environment;
			default: throw new Exception("Unknown environment");
		}
	}
	
	@Override
	public String[] threadNames(){
		return new String[] { "resid_3_","rprj_8_","resid_7_","rprj_14_","psinv_1_","psinv_10_","interpd_9_","rprj_12_","interpd_3_","interpd_5_","interpd_0_","rprj_6_","rprj_11_","resid_14_","psinv_13_","interpd_10_","psinv_5_","rprj_4_","interpd_8_","psinv_11_","resid_9_","resid_4_","rprj_1_","psinv_4_","rprj_13_","interpd_2_","rprj_10_","psinv_2_","interpd_4_","resid_8_","resid_5_","psinv_0_","interpd_6_","interpd_1_","resid_1_","interpd_14_","resid_13_","master","psinv_7_","psinv_14_","resid_0_","interpd_7_","rprj_0_","rprj_2_","rprj_5_","interpd_11_","resid_2_","psinv_12_","interpd_12_","rprj_7_","resid_10_","psinv_6_","psinv_8_","psinv_3_","resid_11_","interpd_13_","rprj_3_","resid_6_","resid_12_","psinv_9_","rprj_9_" };
	}
	
	@Override
	public String getState(){
		return "/" + interpd_0_Environment.getState() + "/" + interpd_10_Environment.getState() + "/" + interpd_11_Environment.getState() + "/" + interpd_12_Environment.getState() + "/" + interpd_13_Environment.getState() + "/" + interpd_14_Environment.getState() + "/" + interpd_1_Environment.getState() + "/" + interpd_2_Environment.getState() + "/" + interpd_3_Environment.getState() + "/" + interpd_4_Environment.getState() + "/" + interpd_5_Environment.getState() + "/" + interpd_6_Environment.getState() + "/" + interpd_7_Environment.getState() + "/" + interpd_8_Environment.getState() + "/" + interpd_9_Environment.getState() + "/" + masterEnvironment.getState() + "/" + psinv_0_Environment.getState() + "/" + psinv_10_Environment.getState() + "/" + psinv_11_Environment.getState() + "/" + psinv_12_Environment.getState() + "/" + psinv_13_Environment.getState() + "/" + psinv_14_Environment.getState() + "/" + psinv_1_Environment.getState() + "/" + psinv_2_Environment.getState() + "/" + psinv_3_Environment.getState() + "/" + psinv_4_Environment.getState() + "/" + psinv_5_Environment.getState() + "/" + psinv_6_Environment.getState() + "/" + psinv_7_Environment.getState() + "/" + psinv_8_Environment.getState() + "/" + psinv_9_Environment.getState() + "/" + resid_0_Environment.getState() + "/" + resid_10_Environment.getState() + "/" + resid_11_Environment.getState() + "/" + resid_12_Environment.getState() + "/" + resid_13_Environment.getState() + "/" + resid_14_Environment.getState() + "/" + resid_1_Environment.getState() + "/" + resid_2_Environment.getState() + "/" + resid_3_Environment.getState() + "/" + resid_4_Environment.getState() + "/" + resid_5_Environment.getState() + "/" + resid_6_Environment.getState() + "/" + resid_7_Environment.getState() + "/" + resid_8_Environment.getState() + "/" + resid_9_Environment.getState() + "/" + rprj_0_Environment.getState() + "/" + rprj_10_Environment.getState() + "/" + rprj_11_Environment.getState() + "/" + rprj_12_Environment.getState() + "/" + rprj_13_Environment.getState() + "/" + rprj_14_Environment.getState() + "/" + rprj_1_Environment.getState() + "/" + rprj_2_Environment.getState() + "/" + rprj_3_Environment.getState() + "/" + rprj_4_Environment.getState() + "/" + rprj_5_Environment.getState() + "/" + rprj_6_Environment.getState() + "/" + rprj_7_Environment.getState() + "/" + rprj_8_Environment.getState() + "/" + rprj_9_Environment.getState() + "/";
	}
}
