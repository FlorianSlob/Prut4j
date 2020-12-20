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

public class RockPaperScissorsProtocol implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFromplayer_0_Toplayer_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_2_Toplayer_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_1_Toplayer_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_2_Toplayer_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_0_Toplayer_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromplayer_1_Toplayer_2_ = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "player_0_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				public int getState(){
					return 0;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_37(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 3 :
						case 5 :
						case 6 :
						case 10 :
						case 11 :
						case 12 :
						case 16 :
						case 17 :
						case 19 :
						case 20 :
						case 21 :
						case 22 :
						case 27 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(3);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(1);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(2);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 4:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 7:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(10);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 8:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(35);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 9:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(36);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 13:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(16);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 14:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(33);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 15:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(34);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "player_2_","player_1_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(2);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "player_1_","player_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(1);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									int rnd = new Random().nextInt(2);
									String[] receiverOptionsArray = new String[]{ "player_1_","player_2_" };
									receiver = receiverOptionsArray[rnd];
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(3);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 23:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(24);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(19);
									queueFromplayer_0_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 25:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(5);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 28:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_0_.isEmpty()) {
								monitor.notifyAll();
								setState(29);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_0_.take());
							}
							monitor.wait();
							break;
						case 29:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(20);
									queueFromplayer_0_Toplayer_2_.put(box.get());
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
							if (state >=0 && state <= 37){
								Optional result = exchange_0_37(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "player_1_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				public int getState(){
					return 0;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_37(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 4 :
						case 5 :
						case 7 :
						case 8 :
						case 9 :
						case 11 :
						case 12 :
						case 13 :
						case 14 :
						case 15 :
						case 16 :
						case 20 :
						case 21 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 33 :
						case 34 :
							monitor.wait();
							break;
						case 1:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(4);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 2:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(26);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 3:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(25);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(7);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(8);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(9);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(11);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 17:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(18);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 19:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(22);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(23);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(23);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(23);
									queueFromplayer_1_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 31:
							if (!box.isPresent() && !queueFromplayer_2_Toplayer_1_.isEmpty()) {
								monitor.notifyAll();
								setState(32);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_2_Toplayer_1_.take());
							}
							monitor.wait();
							break;
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(21);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 35:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(11);
									queueFromplayer_1_Toplayer_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_2_";
								}
								if (receiver.equals("player_2_")) {
									monitor.notifyAll();
									setState(11);
									queueFromplayer_1_Toplayer_2_.put(box.get());
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
							if (state >=0 && state <= 37){
								Optional result = exchange_0_37(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "player_2_": return new IEnvironment() {
				
				public void setState(int newState){
					state = newState;
				}
				
				public int getState(){
					return 0;
				}
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_37(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 6 :
						case 7 :
						case 8 :
						case 9 :
						case 10 :
						case 13 :
						case 14 :
						case 15 :
						case 17 :
						case 18 :
						case 19 :
						case 22 :
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 28 :
						case 29 :
						case 31 :
						case 32 :
						case 35 :
						case 36 :
							monitor.wait();
							break;
						case 5:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_2_.isEmpty()) {
								monitor.notifyAll();
								setState(6);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_2_.take());
							}
							monitor.wait();
							break;
						case 11:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_2_.isEmpty()) {
								monitor.notifyAll();
								setState(12);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_2_.take());
							}
							monitor.wait();
							break;
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(15);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(13);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(14);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(17);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 20:
							if (!box.isPresent() && !queueFromplayer_0_Toplayer_2_.isEmpty()) {
								monitor.notifyAll();
								setState(27);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_0_Toplayer_2_.take());
							}
							monitor.wait();
							break;
						case 21:
							if (!box.isPresent() && !queueFromplayer_1_Toplayer_2_.isEmpty()) {
								monitor.notifyAll();
								setState(30);
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromplayer_1_Toplayer_2_.take());
							}
							monitor.wait();
							break;
						case 27:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(28);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(28);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_0_";
								}
								if (receiver.equals("player_0_")) {
									monitor.notifyAll();
									setState(28);
									queueFromplayer_2_Toplayer_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(31);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(31);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Rock.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(31);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 33:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Paper.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(17);
									queueFromplayer_2_Toplayer_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.rockpaperscissors.Scissors.class ) {
								if (receiver == null) {
									receiver = "player_1_";
								}
								if (receiver.equals("player_1_")) {
									monitor.notifyAll();
									setState(17);
									queueFromplayer_2_Toplayer_1_.put(box.get());
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
							if (state >=0 && state <= 37){
								Optional result = exchange_0_37(box, receiver, isCloseAction);
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
		return new String[] { "player_2_","player_0_","player_1_" };
	}
	
	@Override
	public String getState(){
		return ""+this.state;
	}
}
