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

public class MGProtocol_n_25 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTopsinv_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_24_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_6_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_18_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_9_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_20_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_22_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_17_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_15_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_19_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_23_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_16_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_14_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_12_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_16_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_15_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_13_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_13_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_20_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_19_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_21_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_17_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_24_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_12_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_21_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_10_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_22_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_14_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_6_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_18_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_23_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_10_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_18_Tomaster = new LinkedBlockingQueue<>(); 
	
	@Override
	public IEnvironment getEnvironment(String environmentName) throws Exception{
		switch (environmentName){
			case "interpd_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 2 :
						case 3 :
						case 4 :
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 1:
							if (queueFrommasterTointerpd_0_.peek() != null ) {
								monitor.notifyAll();
								state = 6;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_0_.take());
							}
							monitor.wait();
							break;
						case 5:
							if (queueFrommasterTointerpd_0_.peek() != null ) {
								monitor.notifyAll();
								state = 105;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_0_.take());
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
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 105:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 106;
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 528:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 529;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 25:
							if (queueFrommasterTointerpd_10_.peek() != null ) {
								monitor.notifyAll();
								state = 26;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_10_.take());
							}
							monitor.wait();
							break;
						case 74:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 75;
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 264:
							if (queueFrommasterTointerpd_10_.peek() != null ) {
								monitor.notifyAll();
								state = 265;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_10_.take());
							}
							monitor.wait();
							break;
						case 265:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 266;
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 538:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 539;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 27:
							if (queueFrommasterTointerpd_11_.peek() != null ) {
								monitor.notifyAll();
								state = 28;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_11_.take());
							}
							monitor.wait();
							break;
						case 76:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 77;
									queueFrominterpd_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 280:
							if (queueFrommasterTointerpd_11_.peek() != null ) {
								monitor.notifyAll();
								state = 281;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_11_.take());
							}
							monitor.wait();
							break;
						case 281:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 282;
									queueFrominterpd_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 539:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 540;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_12_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 29:
							if (queueFrommasterTointerpd_12_.peek() != null ) {
								monitor.notifyAll();
								state = 30;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_12_.take());
							}
							monitor.wait();
							break;
						case 78:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 79;
									queueFrominterpd_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 296:
							if (queueFrommasterTointerpd_12_.peek() != null ) {
								monitor.notifyAll();
								state = 297;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_12_.take());
							}
							monitor.wait();
							break;
						case 297:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 298;
									queueFrominterpd_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 540:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 541;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_13_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 31:
							if (queueFrommasterTointerpd_13_.peek() != null ) {
								monitor.notifyAll();
								state = 32;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_13_.take());
							}
							monitor.wait();
							break;
						case 80:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 81;
									queueFrominterpd_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 312:
							if (queueFrommasterTointerpd_13_.peek() != null ) {
								monitor.notifyAll();
								state = 313;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_13_.take());
							}
							monitor.wait();
							break;
						case 313:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 314;
									queueFrominterpd_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 541:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 542;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_14_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
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
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 33:
							if (queueFrommasterTointerpd_14_.peek() != null ) {
								monitor.notifyAll();
								state = 34;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_14_.take());
							}
							monitor.wait();
							break;
						case 82:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 83;
									queueFrominterpd_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 328:
							if (queueFrommasterTointerpd_14_.peek() != null ) {
								monitor.notifyAll();
								state = 329;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_14_.take());
							}
							monitor.wait();
							break;
						case 329:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 330;
									queueFrominterpd_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 542:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 543;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_15_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 36 :
						case 37 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 35:
							if (queueFrommasterTointerpd_15_.peek() != null ) {
								monitor.notifyAll();
								state = 36;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_15_.take());
							}
							monitor.wait();
							break;
						case 84:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 85;
									queueFrominterpd_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 344:
							if (queueFrommasterTointerpd_15_.peek() != null ) {
								monitor.notifyAll();
								state = 345;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_15_.take());
							}
							monitor.wait();
							break;
						case 345:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 346;
									queueFrominterpd_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 543:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 544;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_16_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
						case 29 :
						case 30 :
						case 31 :
						case 32 :
						case 33 :
						case 34 :
						case 35 :
						case 36 :
						case 38 :
						case 39 :
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 37:
							if (queueFrommasterTointerpd_16_.peek() != null ) {
								monitor.notifyAll();
								state = 38;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_16_.take());
							}
							monitor.wait();
							break;
						case 86:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 87;
									queueFrominterpd_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 360:
							if (queueFrommasterTointerpd_16_.peek() != null ) {
								monitor.notifyAll();
								state = 361;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_16_.take());
							}
							monitor.wait();
							break;
						case 361:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 362;
									queueFrominterpd_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 544:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 545;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_17_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 40 :
						case 41 :
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 39:
							if (queueFrommasterTointerpd_17_.peek() != null ) {
								monitor.notifyAll();
								state = 40;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_17_.take());
							}
							monitor.wait();
							break;
						case 88:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 89;
									queueFrominterpd_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 376:
							if (queueFrommasterTointerpd_17_.peek() != null ) {
								monitor.notifyAll();
								state = 377;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_17_.take());
							}
							monitor.wait();
							break;
						case 377:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 378;
									queueFrominterpd_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 545:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 546;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_18_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 41:
							if (queueFrommasterTointerpd_18_.peek() != null ) {
								monitor.notifyAll();
								state = 42;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_18_.take());
							}
							monitor.wait();
							break;
						case 90:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 91;
									queueFrominterpd_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 392:
							if (queueFrommasterTointerpd_18_.peek() != null ) {
								monitor.notifyAll();
								state = 393;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_18_.take());
							}
							monitor.wait();
							break;
						case 393:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 394;
									queueFrominterpd_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 546:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 547;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_19_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 43:
							if (queueFrommasterTointerpd_19_.peek() != null ) {
								monitor.notifyAll();
								state = 44;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_19_.take());
							}
							monitor.wait();
							break;
						case 92:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 93;
									queueFrominterpd_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 408:
							if (queueFrommasterTointerpd_19_.peek() != null ) {
								monitor.notifyAll();
								state = 409;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_19_.take());
							}
							monitor.wait();
							break;
						case 409:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 410;
									queueFrominterpd_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 547:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 548;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 6 :
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 7:
							if (queueFrommasterTointerpd_1_.peek() != null ) {
								monitor.notifyAll();
								state = 8;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_1_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 57;
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 120:
							if (queueFrommasterTointerpd_1_.peek() != null ) {
								monitor.notifyAll();
								state = 121;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_1_.take());
							}
							monitor.wait();
							break;
						case 121:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 122;
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 529:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 530;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_20_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 45:
							if (queueFrommasterTointerpd_20_.peek() != null ) {
								monitor.notifyAll();
								state = 46;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_20_.take());
							}
							monitor.wait();
							break;
						case 94:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 95;
									queueFrominterpd_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 424:
							if (queueFrommasterTointerpd_20_.peek() != null ) {
								monitor.notifyAll();
								state = 425;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_20_.take());
							}
							monitor.wait();
							break;
						case 425:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 426;
									queueFrominterpd_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 548:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 549;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_21_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 47:
							if (queueFrommasterTointerpd_21_.peek() != null ) {
								monitor.notifyAll();
								state = 48;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_21_.take());
							}
							monitor.wait();
							break;
						case 96:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 97;
									queueFrominterpd_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 440:
							if (queueFrommasterTointerpd_21_.peek() != null ) {
								monitor.notifyAll();
								state = 441;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_21_.take());
							}
							monitor.wait();
							break;
						case 441:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 442;
									queueFrominterpd_21_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 549:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 550;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_22_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 49:
							if (queueFrommasterTointerpd_22_.peek() != null ) {
								monitor.notifyAll();
								state = 50;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_22_.take());
							}
							monitor.wait();
							break;
						case 98:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 99;
									queueFrominterpd_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 456:
							if (queueFrommasterTointerpd_22_.peek() != null ) {
								monitor.notifyAll();
								state = 457;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_22_.take());
							}
							monitor.wait();
							break;
						case 457:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 458;
									queueFrominterpd_22_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 550:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 551;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_23_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 51:
							if (queueFrommasterTointerpd_23_.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_23_.take());
							}
							monitor.wait();
							break;
						case 100:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 101;
									queueFrominterpd_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 472:
							if (queueFrommasterTointerpd_23_.peek() != null ) {
								monitor.notifyAll();
								state = 473;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_23_.take());
							}
							monitor.wait();
							break;
						case 473:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 474;
									queueFrominterpd_23_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 551:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 552;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_24_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 53:
							if (queueFrommasterTointerpd_24_.peek() != null ) {
								monitor.notifyAll();
								state = 54;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_24_.take());
							}
							monitor.wait();
							break;
						case 102:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 103;
									queueFrominterpd_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 488:
							if (queueFrommasterTointerpd_24_.peek() != null ) {
								monitor.notifyAll();
								state = 489;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_24_.take());
							}
							monitor.wait();
							break;
						case 489:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 490;
									queueFrominterpd_24_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 552:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 553;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_2_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 9:
							if (queueFrommasterTointerpd_2_.peek() != null ) {
								monitor.notifyAll();
								state = 10;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_2_.take());
							}
							monitor.wait();
							break;
						case 58:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 59;
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 136:
							if (queueFrommasterTointerpd_2_.peek() != null ) {
								monitor.notifyAll();
								state = 137;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_2_.take());
							}
							monitor.wait();
							break;
						case 137:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 138;
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 530:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 531;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_3_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 11:
							if (queueFrommasterTointerpd_3_.peek() != null ) {
								monitor.notifyAll();
								state = 12;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_3_.take());
							}
							monitor.wait();
							break;
						case 60:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 61;
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 152:
							if (queueFrommasterTointerpd_3_.peek() != null ) {
								monitor.notifyAll();
								state = 153;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_3_.take());
							}
							monitor.wait();
							break;
						case 153:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 154;
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 531:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 532;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_4_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 13:
							if (queueFrommasterTointerpd_4_.peek() != null ) {
								monitor.notifyAll();
								state = 14;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_4_.take());
							}
							monitor.wait();
							break;
						case 62:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 63;
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 168:
							if (queueFrommasterTointerpd_4_.peek() != null ) {
								monitor.notifyAll();
								state = 169;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_4_.take());
							}
							monitor.wait();
							break;
						case 169:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 170;
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 532:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 533;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_5_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 15:
							if (queueFrommasterTointerpd_5_.peek() != null ) {
								monitor.notifyAll();
								state = 16;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_5_.take());
							}
							monitor.wait();
							break;
						case 64:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 65;
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 184:
							if (queueFrommasterTointerpd_5_.peek() != null ) {
								monitor.notifyAll();
								state = 185;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_5_.take());
							}
							monitor.wait();
							break;
						case 185:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 186;
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 533:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 534;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_6_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 17:
							if (queueFrommasterTointerpd_6_.peek() != null ) {
								monitor.notifyAll();
								state = 18;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_6_.take());
							}
							monitor.wait();
							break;
						case 66:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 67;
									queueFrominterpd_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 200:
							if (queueFrommasterTointerpd_6_.peek() != null ) {
								monitor.notifyAll();
								state = 201;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_6_.take());
							}
							monitor.wait();
							break;
						case 201:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 202;
									queueFrominterpd_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 534:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 535;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_7_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 19:
							if (queueFrommasterTointerpd_7_.peek() != null ) {
								monitor.notifyAll();
								state = 20;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_7_.take());
							}
							monitor.wait();
							break;
						case 68:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 69;
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 216:
							if (queueFrommasterTointerpd_7_.peek() != null ) {
								monitor.notifyAll();
								state = 217;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_7_.take());
							}
							monitor.wait();
							break;
						case 217:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 218;
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 535:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 536;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_8_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 21:
							if (queueFrommasterTointerpd_8_.peek() != null ) {
								monitor.notifyAll();
								state = 22;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_8_.take());
							}
							monitor.wait();
							break;
						case 70:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 71;
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 232:
							if (queueFrommasterTointerpd_8_.peek() != null ) {
								monitor.notifyAll();
								state = 233;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_8_.take());
							}
							monitor.wait();
							break;
						case 233:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 234;
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 536:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 537;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "interpd_9_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 23:
							if (queueFrommasterTointerpd_9_.peek() != null ) {
								monitor.notifyAll();
								state = 24;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_9_.take());
							}
							monitor.wait();
							break;
						case 72:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 73;
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 248:
							if (queueFrommasterTointerpd_9_.peek() != null ) {
								monitor.notifyAll();
								state = 249;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_9_.take());
							}
							monitor.wait();
							break;
						case 249:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 250;
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 537:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 538;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
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
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 1 :
						case 2 :
						case 3 :
						case 4 :
						case 5 :
						case 7 :
						case 9 :
						case 11 :
						case 13 :
						case 15 :
						case 17 :
						case 19 :
						case 21 :
						case 23 :
						case 25 :
						case 27 :
						case 29 :
						case 31 :
						case 33 :
						case 35 :
						case 37 :
						case 39 :
						case 41 :
						case 43 :
						case 45 :
						case 47 :
						case 49 :
						case 51 :
						case 53 :
						case 54 :
						case 56 :
						case 58 :
						case 60 :
						case 62 :
						case 64 :
						case 66 :
						case 68 :
						case 70 :
						case 72 :
						case 74 :
						case 76 :
						case 78 :
						case 80 :
						case 82 :
						case 84 :
						case 86 :
						case 88 :
						case 90 :
						case 92 :
						case 94 :
						case 96 :
						case 98 :
						case 100 :
						case 102 :
						case 105 :
						case 108 :
						case 109 :
						case 112 :
						case 113 :
						case 116 :
						case 117 :
						case 120 :
						case 121 :
						case 124 :
						case 125 :
						case 128 :
						case 129 :
						case 132 :
						case 133 :
						case 136 :
						case 137 :
						case 140 :
						case 141 :
						case 144 :
						case 145 :
						case 148 :
						case 149 :
						case 152 :
						case 153 :
						case 156 :
						case 157 :
						case 160 :
						case 161 :
						case 164 :
						case 165 :
						case 168 :
						case 169 :
						case 172 :
						case 173 :
						case 176 :
						case 177 :
						case 180 :
						case 181 :
						case 184 :
						case 185 :
						case 188 :
						case 189 :
						case 192 :
						case 193 :
						case 196 :
						case 197 :
							monitor.wait();
							break;
						case 0:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 6:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									monitor.notifyAll();
									state = 7;
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 8:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									monitor.notifyAll();
									state = 9;
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 10:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									monitor.notifyAll();
									state = 11;
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 12:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									monitor.notifyAll();
									state = 13;
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 14:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									monitor.notifyAll();
									state = 15;
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 16:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									monitor.notifyAll();
									state = 17;
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 18:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									monitor.notifyAll();
									state = 19;
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 20:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									monitor.notifyAll();
									state = 21;
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 22:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									monitor.notifyAll();
									state = 23;
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 24:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									monitor.notifyAll();
									state = 25;
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 26:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									monitor.notifyAll();
									state = 27;
									queueFrommasterTointerpd_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									monitor.notifyAll();
									state = 29;
									queueFrommasterTointerpd_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									monitor.notifyAll();
									state = 31;
									queueFrommasterTointerpd_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									monitor.notifyAll();
									state = 33;
									queueFrommasterTointerpd_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									monitor.notifyAll();
									state = 35;
									queueFrommasterTointerpd_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									monitor.notifyAll();
									state = 37;
									queueFrommasterTointerpd_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									monitor.notifyAll();
									state = 39;
									queueFrommasterTointerpd_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									monitor.notifyAll();
									state = 41;
									queueFrommasterTointerpd_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_19_";
								}
								if (receiver.equals("interpd_19_")) {
									monitor.notifyAll();
									state = 43;
									queueFrommasterTointerpd_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_20_";
								}
								if (receiver.equals("interpd_20_")) {
									monitor.notifyAll();
									state = 45;
									queueFrommasterTointerpd_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_21_";
								}
								if (receiver.equals("interpd_21_")) {
									monitor.notifyAll();
									state = 47;
									queueFrommasterTointerpd_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_22_";
								}
								if (receiver.equals("interpd_22_")) {
									monitor.notifyAll();
									state = 49;
									queueFrommasterTointerpd_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_23_";
								}
								if (receiver.equals("interpd_23_")) {
									monitor.notifyAll();
									state = 51;
									queueFrommasterTointerpd_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 52:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_24_";
								}
								if (receiver.equals("interpd_24_")) {
									monitor.notifyAll();
									state = 53;
									queueFrommasterTointerpd_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 55:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 56;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 57:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 58;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 59:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 60;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 61:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 62;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 63:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 64;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 65:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 66;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 67:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 68;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 69:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 70;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 71:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 72;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 73:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 74;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 75:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 76;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 77:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 78;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 79:
							if (queueFrominterpd_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 80;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 81:
							if (queueFrominterpd_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 82;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 83:
							if (queueFrominterpd_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 84;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 85:
							if (queueFrominterpd_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 86;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 87:
							if (queueFrominterpd_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 88;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 89:
							if (queueFrominterpd_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 90;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 91:
							if (queueFrominterpd_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 92;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 93:
							if (queueFrominterpd_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 94;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 95:
							if (queueFrominterpd_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 96;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 97:
							if (queueFrominterpd_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 98;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 99:
							if (queueFrominterpd_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 100;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 101:
							if (queueFrominterpd_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 102;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 103:
							if (queueFrominterpd_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 104;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 104:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 3;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 5;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 2;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 4;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.InterpMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_0_";
								}
								if (receiver.equals("interpd_0_")) {
									monitor.notifyAll();
									state = 1;
									queueFrommasterTointerpd_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 106:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 107;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 108;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 110:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 111;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 112;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 114:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 115;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 116;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 118:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									monitor.notifyAll();
									state = 120;
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 122:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 123;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 123:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 124;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 126:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 127;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 127:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 128;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 130:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 131;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 131:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 132;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 134:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 135;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 135:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									monitor.notifyAll();
									state = 136;
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 138:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 139;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 139:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 140;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 142:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 143;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 143:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 144;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 146:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 147;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 147:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 148;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 150:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 151;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 151:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									monitor.notifyAll();
									state = 152;
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 154:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 155;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 155:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 156;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 158:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 159;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 159:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 160;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 162:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 163;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 163:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 164;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 166:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 167;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 167:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									monitor.notifyAll();
									state = 168;
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 170:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 171;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 171:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 172;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 174:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 175;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 175:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 176;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 178:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 179;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 179:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 180;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 182:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 183;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									monitor.notifyAll();
									state = 184;
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 186:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 187;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 187:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 188;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 190:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 191;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 191:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 192;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 194:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 195;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 195:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 196;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 198:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 199;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 199:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									monitor.notifyAll();
									state = 200;
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 204 :
						case 205 :
						case 208 :
						case 209 :
						case 212 :
						case 213 :
						case 216 :
						case 217 :
						case 220 :
						case 221 :
						case 224 :
						case 225 :
						case 228 :
						case 229 :
						case 232 :
						case 233 :
						case 236 :
						case 237 :
						case 240 :
						case 241 :
						case 244 :
						case 245 :
						case 248 :
						case 249 :
						case 252 :
						case 253 :
						case 256 :
						case 257 :
						case 260 :
						case 261 :
						case 264 :
						case 265 :
						case 268 :
						case 269 :
						case 272 :
						case 273 :
						case 276 :
						case 277 :
						case 280 :
						case 281 :
						case 284 :
						case 285 :
						case 288 :
						case 289 :
						case 292 :
						case 293 :
						case 296 :
						case 297 :
						case 300 :
						case 301 :
						case 304 :
						case 305 :
						case 308 :
						case 309 :
						case 312 :
						case 313 :
						case 316 :
						case 317 :
						case 320 :
						case 321 :
						case 324 :
						case 325 :
						case 328 :
						case 329 :
						case 332 :
						case 333 :
						case 336 :
						case 337 :
						case 340 :
						case 341 :
						case 344 :
						case 345 :
						case 348 :
						case 349 :
						case 352 :
						case 353 :
						case 356 :
						case 357 :
						case 360 :
						case 361 :
						case 364 :
						case 365 :
						case 368 :
						case 369 :
						case 372 :
						case 373 :
						case 376 :
						case 377 :
						case 380 :
						case 381 :
						case 384 :
						case 385 :
						case 388 :
						case 389 :
						case 392 :
						case 393 :
						case 396 :
						case 397 :
							monitor.wait();
							break;
						case 202:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 203;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 203:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 204;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 206:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 207;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 207:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 208;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 210:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 211;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 211:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 212;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 214:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 215;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 215:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									monitor.notifyAll();
									state = 216;
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 218:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 219;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 219:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 220;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 222:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 223;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 223:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 224;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 226:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 227;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 227:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 228;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 230:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 231;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 231:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									monitor.notifyAll();
									state = 232;
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 234:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 235;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 235:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 236;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 238:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 239;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 239:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 240;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 242:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 243;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 243:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 244;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 246:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 247;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 247:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									monitor.notifyAll();
									state = 248;
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 250:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 251;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 251:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 252;
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 254:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 255;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 255:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 256;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 258:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 259;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 259:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 260;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 262:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 263;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 263:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									monitor.notifyAll();
									state = 264;
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 266:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 267;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 267:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 268;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 270:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 271;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 271:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 272;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 274:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 275;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 275:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 276;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 278:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 279;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 279:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									monitor.notifyAll();
									state = 280;
									queueFrommasterTointerpd_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 282:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 283;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 283:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 284;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 286:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 287;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 287:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 288;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 290:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 291;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 291:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 292;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 294:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 295;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 295:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_12_";
								}
								if (receiver.equals("interpd_12_")) {
									monitor.notifyAll();
									state = 296;
									queueFrommasterTointerpd_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 298:
							if (queueFrominterpd_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 299;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 299:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									monitor.notifyAll();
									state = 300;
									queueFrommasterTopsinv_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 302:
							if (queueFrompsinv_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 303;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 303:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									monitor.notifyAll();
									state = 304;
									queueFrommasterTorprj_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 306:
							if (queueFromrprj_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 307;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 307:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									monitor.notifyAll();
									state = 308;
									queueFrommasterToresid_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 310:
							if (queueFromresid_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 311;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 311:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_13_";
								}
								if (receiver.equals("interpd_13_")) {
									monitor.notifyAll();
									state = 312;
									queueFrommasterTointerpd_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 314:
							if (queueFrominterpd_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 315;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 315:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									monitor.notifyAll();
									state = 316;
									queueFrommasterTopsinv_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 318:
							if (queueFrompsinv_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 319;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 319:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									monitor.notifyAll();
									state = 320;
									queueFrommasterTorprj_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 322:
							if (queueFromrprj_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 323;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 323:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									monitor.notifyAll();
									state = 324;
									queueFrommasterToresid_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 326:
							if (queueFromresid_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 327;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 327:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_14_";
								}
								if (receiver.equals("interpd_14_")) {
									monitor.notifyAll();
									state = 328;
									queueFrommasterTointerpd_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 330:
							if (queueFrominterpd_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 331;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 331:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									monitor.notifyAll();
									state = 332;
									queueFrommasterTopsinv_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 334:
							if (queueFrompsinv_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 335;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 335:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									monitor.notifyAll();
									state = 336;
									queueFrommasterTorprj_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 338:
							if (queueFromrprj_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 339;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 339:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									monitor.notifyAll();
									state = 340;
									queueFrommasterToresid_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 342:
							if (queueFromresid_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 343;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 343:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_15_";
								}
								if (receiver.equals("interpd_15_")) {
									monitor.notifyAll();
									state = 344;
									queueFrommasterTointerpd_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 346:
							if (queueFrominterpd_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 347;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 347:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									monitor.notifyAll();
									state = 348;
									queueFrommasterTopsinv_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 350:
							if (queueFrompsinv_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 351;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 351:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									monitor.notifyAll();
									state = 352;
									queueFrommasterTorprj_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 354:
							if (queueFromrprj_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 355;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 355:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									monitor.notifyAll();
									state = 356;
									queueFrommasterToresid_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 358:
							if (queueFromresid_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 359;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 359:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_16_";
								}
								if (receiver.equals("interpd_16_")) {
									monitor.notifyAll();
									state = 360;
									queueFrommasterTointerpd_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 362:
							if (queueFrominterpd_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 363;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 363:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									monitor.notifyAll();
									state = 364;
									queueFrommasterTopsinv_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 366:
							if (queueFrompsinv_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 367;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 367:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									monitor.notifyAll();
									state = 368;
									queueFrommasterTorprj_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 370:
							if (queueFromrprj_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 371;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 371:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									monitor.notifyAll();
									state = 372;
									queueFrommasterToresid_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 374:
							if (queueFromresid_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 375;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 375:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_17_";
								}
								if (receiver.equals("interpd_17_")) {
									monitor.notifyAll();
									state = 376;
									queueFrommasterTointerpd_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 378:
							if (queueFrominterpd_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 379;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 379:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									monitor.notifyAll();
									state = 380;
									queueFrommasterTopsinv_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 382:
							if (queueFrompsinv_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 383;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 383:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									monitor.notifyAll();
									state = 384;
									queueFrommasterTorprj_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 386:
							if (queueFromrprj_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 387;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 387:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									monitor.notifyAll();
									state = 388;
									queueFrommasterToresid_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 390:
							if (queueFromresid_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 391;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 391:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_18_";
								}
								if (receiver.equals("interpd_18_")) {
									monitor.notifyAll();
									state = 392;
									queueFrommasterTointerpd_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 394:
							if (queueFrominterpd_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 395;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 395:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									monitor.notifyAll();
									state = 396;
									queueFrommasterTopsinv_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 398:
							if (queueFrompsinv_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 399;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 399:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									monitor.notifyAll();
									state = 400;
									queueFrommasterTorprj_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 404 :
						case 405 :
						case 408 :
						case 409 :
						case 412 :
						case 413 :
						case 416 :
						case 417 :
						case 420 :
						case 421 :
						case 424 :
						case 425 :
						case 428 :
						case 429 :
						case 432 :
						case 433 :
						case 436 :
						case 437 :
						case 440 :
						case 441 :
						case 444 :
						case 445 :
						case 448 :
						case 449 :
						case 452 :
						case 453 :
						case 456 :
						case 457 :
						case 460 :
						case 461 :
						case 464 :
						case 465 :
						case 468 :
						case 469 :
						case 472 :
						case 473 :
						case 476 :
						case 477 :
						case 480 :
						case 481 :
						case 484 :
						case 485 :
						case 488 :
						case 489 :
						case 492 :
						case 493 :
						case 496 :
						case 497 :
						case 500 :
						case 501 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 402:
							if (queueFromrprj_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 403;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 403:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									monitor.notifyAll();
									state = 404;
									queueFrommasterToresid_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 406:
							if (queueFromresid_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 407;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 407:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_19_";
								}
								if (receiver.equals("interpd_19_")) {
									monitor.notifyAll();
									state = 408;
									queueFrommasterTointerpd_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 410:
							if (queueFrominterpd_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 411;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 411:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_19_";
								}
								if (receiver.equals("psinv_19_")) {
									monitor.notifyAll();
									state = 412;
									queueFrommasterTopsinv_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 414:
							if (queueFrompsinv_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 415;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 415:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_19_";
								}
								if (receiver.equals("rprj_19_")) {
									monitor.notifyAll();
									state = 416;
									queueFrommasterTorprj_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 418:
							if (queueFromrprj_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 419;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 419:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_19_";
								}
								if (receiver.equals("resid_19_")) {
									monitor.notifyAll();
									state = 420;
									queueFrommasterToresid_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 422:
							if (queueFromresid_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 423;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 423:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_20_";
								}
								if (receiver.equals("interpd_20_")) {
									monitor.notifyAll();
									state = 424;
									queueFrommasterTointerpd_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 426:
							if (queueFrominterpd_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 427;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 427:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_20_";
								}
								if (receiver.equals("psinv_20_")) {
									monitor.notifyAll();
									state = 428;
									queueFrommasterTopsinv_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 430:
							if (queueFrompsinv_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 431;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 431:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_20_";
								}
								if (receiver.equals("rprj_20_")) {
									monitor.notifyAll();
									state = 432;
									queueFrommasterTorprj_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 434:
							if (queueFromrprj_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 435;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 435:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_20_";
								}
								if (receiver.equals("resid_20_")) {
									monitor.notifyAll();
									state = 436;
									queueFrommasterToresid_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 438:
							if (queueFromresid_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 439;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 439:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_21_";
								}
								if (receiver.equals("interpd_21_")) {
									monitor.notifyAll();
									state = 440;
									queueFrommasterTointerpd_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 442:
							if (queueFrominterpd_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 443;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 443:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_21_";
								}
								if (receiver.equals("psinv_21_")) {
									monitor.notifyAll();
									state = 444;
									queueFrommasterTopsinv_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 446:
							if (queueFrompsinv_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 447;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 447:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_21_";
								}
								if (receiver.equals("rprj_21_")) {
									monitor.notifyAll();
									state = 448;
									queueFrommasterTorprj_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 450:
							if (queueFromrprj_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 451;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 451:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_21_";
								}
								if (receiver.equals("resid_21_")) {
									monitor.notifyAll();
									state = 452;
									queueFrommasterToresid_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 454:
							if (queueFromresid_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 455;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 455:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_22_";
								}
								if (receiver.equals("interpd_22_")) {
									monitor.notifyAll();
									state = 456;
									queueFrommasterTointerpd_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 458:
							if (queueFrominterpd_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 459;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 459:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_22_";
								}
								if (receiver.equals("psinv_22_")) {
									monitor.notifyAll();
									state = 460;
									queueFrommasterTopsinv_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 462:
							if (queueFrompsinv_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 463;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 463:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_22_";
								}
								if (receiver.equals("rprj_22_")) {
									monitor.notifyAll();
									state = 464;
									queueFrommasterTorprj_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 466:
							if (queueFromrprj_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 467;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 467:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_22_";
								}
								if (receiver.equals("resid_22_")) {
									monitor.notifyAll();
									state = 468;
									queueFrommasterToresid_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 470:
							if (queueFromresid_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 471;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 471:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_23_";
								}
								if (receiver.equals("interpd_23_")) {
									monitor.notifyAll();
									state = 472;
									queueFrommasterTointerpd_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 474:
							if (queueFrominterpd_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 475;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 475:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_23_";
								}
								if (receiver.equals("psinv_23_")) {
									monitor.notifyAll();
									state = 476;
									queueFrommasterTopsinv_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 478:
							if (queueFrompsinv_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 479;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 479:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_23_";
								}
								if (receiver.equals("rprj_23_")) {
									monitor.notifyAll();
									state = 480;
									queueFrommasterTorprj_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 482:
							if (queueFromrprj_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 483;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 483:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_23_";
								}
								if (receiver.equals("resid_23_")) {
									monitor.notifyAll();
									state = 484;
									queueFrommasterToresid_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 486:
							if (queueFromresid_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 487;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 487:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_24_";
								}
								if (receiver.equals("interpd_24_")) {
									monitor.notifyAll();
									state = 488;
									queueFrommasterTointerpd_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 490:
							if (queueFrominterpd_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 491;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 491:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_24_";
								}
								if (receiver.equals("psinv_24_")) {
									monitor.notifyAll();
									state = 492;
									queueFrommasterTopsinv_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 494:
							if (queueFrompsinv_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 495;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 495:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_24_";
								}
								if (receiver.equals("rprj_24_")) {
									monitor.notifyAll();
									state = 496;
									queueFrommasterTorprj_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 498:
							if (queueFromrprj_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 499;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 499:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_24_";
								}
								if (receiver.equals("resid_24_")) {
									monitor.notifyAll();
									state = 500;
									queueFrommasterToresid_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 502:
							if (queueFromresid_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 503;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 503:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 504;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 504:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 505;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 505:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 506;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 506:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 507;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 507:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 508;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 508:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 509;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 509:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 510;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 510:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 511;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 511:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 512;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 512:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 513;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 513:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 514;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 514:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 515;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 515:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 516;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 516:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 517;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 517:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 518;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 518:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 519;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 519:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 520;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 520:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 521;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 521:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 522;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 522:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 523;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 523:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 524;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 524:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 525;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 525:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 526;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 526:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 527;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 527:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 528;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 553:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 554;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 554:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 555;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 555:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 556;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 556:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 557;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 557:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 558;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 558:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 559;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 559:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 560;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 560:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 561;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 561:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 562;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 562:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 563;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 563:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 564;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 564:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 565;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 565:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 566;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 566:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 567;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 567:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 568;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 568:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 569;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 569:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 570;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 570:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 571;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 571:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 572;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 572:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 573;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 573:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 574;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 574:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 575;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 575:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 576;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 576:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 577;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 577:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 578;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 705 :
						case 707 :
						case 709 :
						case 711 :
						case 713 :
						case 715 :
						case 717 :
						case 719 :
						case 721 :
						case 723 :
						case 725 :
						case 727 :
						case 729 :
						case 731 :
						case 733 :
						case 735 :
						case 737 :
						case 739 :
						case 741 :
						case 743 :
						case 745 :
						case 747 :
						case 749 :
						case 751 :
						case 752 :
						case 754 :
						case 756 :
						case 758 :
						case 760 :
						case 762 :
						case 764 :
						case 766 :
						case 768 :
						case 770 :
						case 772 :
						case 774 :
						case 776 :
						case 778 :
						case 780 :
						case 782 :
						case 784 :
						case 786 :
						case 788 :
						case 790 :
						case 792 :
						case 794 :
						case 796 :
						case 798 :
							monitor.wait();
							break;
						case 603:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 604;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 604:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 605;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 605:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 606;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 606:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 607;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 607:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 608;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 608:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 609;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 609:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 610;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 610:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 611;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 611:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 612;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 612:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 613;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 613:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 614;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 614:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 615;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 615:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 616;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 616:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 617;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 617:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 618;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 618:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 619;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 619:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 620;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 620:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 621;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 621:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 622;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 622:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 623;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 623:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 624;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 624:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 625;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 625:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 626;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 626:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 627;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 627:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 628;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 653:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 654;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 654:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 655;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 655:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 656;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 656:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 657;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 657:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 658;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 658:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 659;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 659:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 660;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 660:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 661;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 661:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 662;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 662:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 663;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 663:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 664;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 664:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 665;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 665:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 666;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 666:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 667;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 667:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 668;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 668:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 669;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 669:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 670;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 670:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 671;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 671:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 672;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 672:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 673;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 673:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 674;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 674:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 675;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 675:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 676;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 676:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 677;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 677:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 678;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 704:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 705;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 706:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 707;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 708:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 709;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 710:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 711;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 712:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 713;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 714:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 715;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 716:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 717;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 718:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 719;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 720:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 721;
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 722:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 723;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 724:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 725;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 726:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_12_";
								}
								if (receiver.equals("psinv_12_")) {
									monitor.notifyAll();
									state = 727;
									queueFrommasterTopsinv_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 728:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_13_";
								}
								if (receiver.equals("psinv_13_")) {
									monitor.notifyAll();
									state = 729;
									queueFrommasterTopsinv_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 730:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_14_";
								}
								if (receiver.equals("psinv_14_")) {
									monitor.notifyAll();
									state = 731;
									queueFrommasterTopsinv_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 732:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_15_";
								}
								if (receiver.equals("psinv_15_")) {
									monitor.notifyAll();
									state = 733;
									queueFrommasterTopsinv_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 734:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_16_";
								}
								if (receiver.equals("psinv_16_")) {
									monitor.notifyAll();
									state = 735;
									queueFrommasterTopsinv_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 736:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_17_";
								}
								if (receiver.equals("psinv_17_")) {
									monitor.notifyAll();
									state = 737;
									queueFrommasterTopsinv_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 738:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_18_";
								}
								if (receiver.equals("psinv_18_")) {
									monitor.notifyAll();
									state = 739;
									queueFrommasterTopsinv_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 740:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_19_";
								}
								if (receiver.equals("psinv_19_")) {
									monitor.notifyAll();
									state = 741;
									queueFrommasterTopsinv_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 742:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_20_";
								}
								if (receiver.equals("psinv_20_")) {
									monitor.notifyAll();
									state = 743;
									queueFrommasterTopsinv_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 744:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_21_";
								}
								if (receiver.equals("psinv_21_")) {
									monitor.notifyAll();
									state = 745;
									queueFrommasterTopsinv_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 746:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_22_";
								}
								if (receiver.equals("psinv_22_")) {
									monitor.notifyAll();
									state = 747;
									queueFrommasterTopsinv_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 748:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_23_";
								}
								if (receiver.equals("psinv_23_")) {
									monitor.notifyAll();
									state = 749;
									queueFrommasterTopsinv_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 750:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_24_";
								}
								if (receiver.equals("psinv_24_")) {
									monitor.notifyAll();
									state = 751;
									queueFrommasterTopsinv_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 753:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 754;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 755:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 756;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 757:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 758;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 759:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 760;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 761:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 762;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 763:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 764;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 765:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 766;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 767:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 768;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 769:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 770;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 771:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 772;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 773:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 774;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 775:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 776;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 777:
							if (queueFrompsinv_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 778;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 779:
							if (queueFrompsinv_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 780;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 781:
							if (queueFrompsinv_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 782;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 783:
							if (queueFrompsinv_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 784;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 785:
							if (queueFrompsinv_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 786;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 787:
							if (queueFrompsinv_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 788;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 789:
							if (queueFrompsinv_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 790;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 791:
							if (queueFrompsinv_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 792;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 793:
							if (queueFrompsinv_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 794;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 795:
							if (queueFrompsinv_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 796;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 797:
							if (queueFrompsinv_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 798;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 799:
							if (queueFrompsinv_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 800;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_23_Tomaster.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 803 :
						case 805 :
						case 807 :
						case 809 :
						case 811 :
						case 813 :
						case 815 :
						case 817 :
						case 819 :
						case 821 :
						case 823 :
						case 825 :
						case 827 :
						case 829 :
						case 831 :
						case 833 :
						case 835 :
						case 837 :
						case 839 :
						case 841 :
						case 843 :
						case 845 :
						case 847 :
						case 849 :
						case 850 :
						case 852 :
						case 854 :
						case 856 :
						case 858 :
						case 860 :
						case 862 :
						case 864 :
						case 866 :
						case 868 :
						case 870 :
						case 872 :
						case 874 :
						case 876 :
						case 878 :
						case 880 :
						case 882 :
						case 884 :
						case 886 :
						case 888 :
						case 890 :
						case 892 :
						case 894 :
						case 896 :
						case 898 :
						case 901 :
						case 903 :
						case 905 :
						case 907 :
						case 909 :
						case 911 :
						case 913 :
						case 915 :
						case 917 :
						case 919 :
						case 921 :
						case 923 :
						case 925 :
						case 927 :
						case 929 :
						case 931 :
						case 933 :
						case 935 :
						case 937 :
						case 939 :
						case 941 :
						case 943 :
						case 945 :
						case 947 :
						case 948 :
						case 950 :
						case 952 :
						case 954 :
						case 956 :
						case 958 :
						case 960 :
						case 962 :
						case 964 :
						case 966 :
						case 968 :
						case 970 :
						case 972 :
						case 974 :
						case 976 :
						case 978 :
						case 980 :
						case 982 :
						case 984 :
						case 986 :
						case 988 :
						case 990 :
						case 992 :
						case 994 :
						case 996 :
							monitor.wait();
							break;
						case 801:
							if (queueFrompsinv_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 104;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 802:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 803;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 804:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 805;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 806:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 807;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 808:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 809;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 810:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 811;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 812:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 813;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 814:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 815;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 816:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 817;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 818:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 819;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 820:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 821;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 822:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 823;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 824:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_12_";
								}
								if (receiver.equals("rprj_12_")) {
									monitor.notifyAll();
									state = 825;
									queueFrommasterTorprj_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 826:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_13_";
								}
								if (receiver.equals("rprj_13_")) {
									monitor.notifyAll();
									state = 827;
									queueFrommasterTorprj_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 828:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_14_";
								}
								if (receiver.equals("rprj_14_")) {
									monitor.notifyAll();
									state = 829;
									queueFrommasterTorprj_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 830:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_15_";
								}
								if (receiver.equals("rprj_15_")) {
									monitor.notifyAll();
									state = 831;
									queueFrommasterTorprj_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 832:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_16_";
								}
								if (receiver.equals("rprj_16_")) {
									monitor.notifyAll();
									state = 833;
									queueFrommasterTorprj_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 834:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_17_";
								}
								if (receiver.equals("rprj_17_")) {
									monitor.notifyAll();
									state = 835;
									queueFrommasterTorprj_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 836:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_18_";
								}
								if (receiver.equals("rprj_18_")) {
									monitor.notifyAll();
									state = 837;
									queueFrommasterTorprj_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 838:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_19_";
								}
								if (receiver.equals("rprj_19_")) {
									monitor.notifyAll();
									state = 839;
									queueFrommasterTorprj_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 840:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_20_";
								}
								if (receiver.equals("rprj_20_")) {
									monitor.notifyAll();
									state = 841;
									queueFrommasterTorprj_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 842:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_21_";
								}
								if (receiver.equals("rprj_21_")) {
									monitor.notifyAll();
									state = 843;
									queueFrommasterTorprj_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 844:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_22_";
								}
								if (receiver.equals("rprj_22_")) {
									monitor.notifyAll();
									state = 845;
									queueFrommasterTorprj_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 846:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_23_";
								}
								if (receiver.equals("rprj_23_")) {
									monitor.notifyAll();
									state = 847;
									queueFrommasterTorprj_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 848:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_24_";
								}
								if (receiver.equals("rprj_24_")) {
									monitor.notifyAll();
									state = 849;
									queueFrommasterTorprj_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 851:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 852;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 853:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 854;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 855:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 856;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 857:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 858;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 859:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 860;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 861:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 862;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 863:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 864;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 865:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 866;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 867:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 868;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 869:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 870;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 871:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 872;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 873:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 874;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 875:
							if (queueFromrprj_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 876;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 877:
							if (queueFromrprj_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 878;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 879:
							if (queueFromrprj_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 880;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 881:
							if (queueFromrprj_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 882;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 883:
							if (queueFromrprj_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 884;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 885:
							if (queueFromrprj_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 886;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 887:
							if (queueFromrprj_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 888;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 889:
							if (queueFromrprj_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 890;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 891:
							if (queueFromrprj_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 892;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 893:
							if (queueFromrprj_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 894;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 895:
							if (queueFromrprj_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 896;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 897:
							if (queueFromrprj_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 898;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 899:
							if (queueFromrprj_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 104;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_24_Tomaster.take());
							}
							monitor.wait();
							break;
						case 900:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 901;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 902:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 903;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 904:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 905;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 906:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 907;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 908:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 909;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 910:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 911;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 912:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 913;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 914:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 915;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 916:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 917;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 918:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 919;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 920:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 921;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 922:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_12_";
								}
								if (receiver.equals("resid_12_")) {
									monitor.notifyAll();
									state = 923;
									queueFrommasterToresid_12_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 924:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_13_";
								}
								if (receiver.equals("resid_13_")) {
									monitor.notifyAll();
									state = 925;
									queueFrommasterToresid_13_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 926:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_14_";
								}
								if (receiver.equals("resid_14_")) {
									monitor.notifyAll();
									state = 927;
									queueFrommasterToresid_14_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 928:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_15_";
								}
								if (receiver.equals("resid_15_")) {
									monitor.notifyAll();
									state = 929;
									queueFrommasterToresid_15_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 930:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_16_";
								}
								if (receiver.equals("resid_16_")) {
									monitor.notifyAll();
									state = 931;
									queueFrommasterToresid_16_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 932:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_17_";
								}
								if (receiver.equals("resid_17_")) {
									monitor.notifyAll();
									state = 933;
									queueFrommasterToresid_17_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 934:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_18_";
								}
								if (receiver.equals("resid_18_")) {
									monitor.notifyAll();
									state = 935;
									queueFrommasterToresid_18_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 936:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_19_";
								}
								if (receiver.equals("resid_19_")) {
									monitor.notifyAll();
									state = 937;
									queueFrommasterToresid_19_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 938:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_20_";
								}
								if (receiver.equals("resid_20_")) {
									monitor.notifyAll();
									state = 939;
									queueFrommasterToresid_20_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 940:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_21_";
								}
								if (receiver.equals("resid_21_")) {
									monitor.notifyAll();
									state = 941;
									queueFrommasterToresid_21_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 942:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_22_";
								}
								if (receiver.equals("resid_22_")) {
									monitor.notifyAll();
									state = 943;
									queueFrommasterToresid_22_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 944:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_23_";
								}
								if (receiver.equals("resid_23_")) {
									monitor.notifyAll();
									state = 945;
									queueFrommasterToresid_23_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 946:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_24_";
								}
								if (receiver.equals("resid_24_")) {
									monitor.notifyAll();
									state = 947;
									queueFrommasterToresid_24_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 949:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 950;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 951:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 952;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 953:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 954;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 955:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 956;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 957:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 958;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 959:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 960;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 961:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 962;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 963:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 964;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 965:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 966;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 967:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 968;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 969:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 970;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 971:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 972;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 973:
							if (queueFromresid_12_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 974;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_12_Tomaster.take());
							}
							monitor.wait();
							break;
						case 975:
							if (queueFromresid_13_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 976;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_13_Tomaster.take());
							}
							monitor.wait();
							break;
						case 977:
							if (queueFromresid_14_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 978;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_14_Tomaster.take());
							}
							monitor.wait();
							break;
						case 979:
							if (queueFromresid_15_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 980;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_15_Tomaster.take());
							}
							monitor.wait();
							break;
						case 981:
							if (queueFromresid_16_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 982;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_16_Tomaster.take());
							}
							monitor.wait();
							break;
						case 983:
							if (queueFromresid_17_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 984;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_17_Tomaster.take());
							}
							monitor.wait();
							break;
						case 985:
							if (queueFromresid_18_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 986;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_18_Tomaster.take());
							}
							monitor.wait();
							break;
						case 987:
							if (queueFromresid_19_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 988;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_19_Tomaster.take());
							}
							monitor.wait();
							break;
						case 989:
							if (queueFromresid_20_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 990;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_20_Tomaster.take());
							}
							monitor.wait();
							break;
						case 991:
							if (queueFromresid_21_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 992;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_21_Tomaster.take());
							}
							monitor.wait();
							break;
						case 993:
							if (queueFromresid_22_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 994;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_22_Tomaster.take());
							}
							monitor.wait();
							break;
						case 995:
							if (queueFromresid_23_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 996;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_23_Tomaster.take());
							}
							monitor.wait();
							break;
						case 997:
							if (queueFromresid_24_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 104;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_24_Tomaster.take());
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
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 2:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 704;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 108:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 109;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 109:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 110;
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 578:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 579;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 752:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 753;
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_10_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 268:
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 269;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
							}
							monitor.wait();
							break;
						case 269:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 270;
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 588:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 589;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 723:
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 724;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
							}
							monitor.wait();
							break;
						case 772:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 773;
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_11_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 284:
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 285;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
							}
							monitor.wait();
							break;
						case 285:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 286;
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 589:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 590;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 725:
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 726;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
							}
							monitor.wait();
							break;
						case 774:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 775;
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_12_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 300:
							if (queueFrommasterTopsinv_12_.peek() != null ) {
								monitor.notifyAll();
								state = 301;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_12_.take());
							}
							monitor.wait();
							break;
						case 301:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 302;
									queueFrompsinv_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 590:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 591;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 727:
							if (queueFrommasterTopsinv_12_.peek() != null ) {
								monitor.notifyAll();
								state = 728;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_12_.take());
							}
							monitor.wait();
							break;
						case 776:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 777;
									queueFrompsinv_12_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_13_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 316:
							if (queueFrommasterTopsinv_13_.peek() != null ) {
								monitor.notifyAll();
								state = 317;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_13_.take());
							}
							monitor.wait();
							break;
						case 317:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 318;
									queueFrompsinv_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 591:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 592;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 729:
							if (queueFrommasterTopsinv_13_.peek() != null ) {
								monitor.notifyAll();
								state = 730;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_13_.take());
							}
							monitor.wait();
							break;
						case 778:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 779;
									queueFrompsinv_13_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_14_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 332:
							if (queueFrommasterTopsinv_14_.peek() != null ) {
								monitor.notifyAll();
								state = 333;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_14_.take());
							}
							monitor.wait();
							break;
						case 333:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 334;
									queueFrompsinv_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 592:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 593;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 731:
							if (queueFrommasterTopsinv_14_.peek() != null ) {
								monitor.notifyAll();
								state = 732;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_14_.take());
							}
							monitor.wait();
							break;
						case 780:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 781;
									queueFrompsinv_14_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_15_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 348:
							if (queueFrommasterTopsinv_15_.peek() != null ) {
								monitor.notifyAll();
								state = 349;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_15_.take());
							}
							monitor.wait();
							break;
						case 349:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 350;
									queueFrompsinv_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 593:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 594;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 733:
							if (queueFrommasterTopsinv_15_.peek() != null ) {
								monitor.notifyAll();
								state = 734;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_15_.take());
							}
							monitor.wait();
							break;
						case 782:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 783;
									queueFrompsinv_15_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_16_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 364:
							if (queueFrommasterTopsinv_16_.peek() != null ) {
								monitor.notifyAll();
								state = 365;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_16_.take());
							}
							monitor.wait();
							break;
						case 365:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 366;
									queueFrompsinv_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 594:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 595;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 735:
							if (queueFrommasterTopsinv_16_.peek() != null ) {
								monitor.notifyAll();
								state = 736;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_16_.take());
							}
							monitor.wait();
							break;
						case 784:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 785;
									queueFrompsinv_16_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_17_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 380:
							if (queueFrommasterTopsinv_17_.peek() != null ) {
								monitor.notifyAll();
								state = 381;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_17_.take());
							}
							monitor.wait();
							break;
						case 381:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 382;
									queueFrompsinv_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 595:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 596;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 737:
							if (queueFrommasterTopsinv_17_.peek() != null ) {
								monitor.notifyAll();
								state = 738;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_17_.take());
							}
							monitor.wait();
							break;
						case 786:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 787;
									queueFrompsinv_17_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_18_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 396:
							if (queueFrommasterTopsinv_18_.peek() != null ) {
								monitor.notifyAll();
								state = 397;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_18_.take());
							}
							monitor.wait();
							break;
						case 397:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 398;
									queueFrompsinv_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 596:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 597;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 739:
							if (queueFrommasterTopsinv_18_.peek() != null ) {
								monitor.notifyAll();
								state = 740;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_18_.take());
							}
							monitor.wait();
							break;
						case 788:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 789;
									queueFrompsinv_18_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_19_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 412:
							if (queueFrommasterTopsinv_19_.peek() != null ) {
								monitor.notifyAll();
								state = 413;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_19_.take());
							}
							monitor.wait();
							break;
						case 413:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 414;
									queueFrompsinv_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 597:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 598;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 705 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 754 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 741:
							if (queueFrommasterTopsinv_19_.peek() != null ) {
								monitor.notifyAll();
								state = 742;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_19_.take());
							}
							monitor.wait();
							break;
						case 790:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 791;
									queueFrompsinv_19_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_1_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 124:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 125;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
						case 125:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 126;
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 428 :
						case 429 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 598 :
						case 599 :
							monitor.wait();
							break;
						case 579:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 580;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :
						case 628 :
						case 629 :
						case 630 :
						case 631 :
						case 632 :
						case 633 :
						case 634 :
						case 635 :
						case 636 :
						case 637 :
						case 638 :
						case 639 :
						case 640 :
						case 641 :
						case 642 :
						case 643 :
						case 644 :
						case 645 :
						case 646 :
						case 647 :
						case 648 :
						case 649 :
						case 650 :
						case 651 :
						case 652 :
						case 653 :
						case 654 :
						case 655 :
						case 656 :
						case 657 :
						case 658 :
						case 659 :
						case 660 :
						case 661 :
						case 662 :
						case 663 :
						case 664 :
						case 665 :
						case 666 :
						case 667 :
						case 668 :
						case 669 :
						case 670 :
						case 671 :
						case 672 :
						case 673 :
						case 674 :
						case 675 :
						case 676 :
						case 677 :
						case 678 :
						case 679 :
						case 680 :
						case 681 :
						case 682 :
						case 683 :
						case 684 :
						case 685 :
						case 686 :
						case 687 :
						case 688 :
						case 689 :
						case 690 :
						case 691 :
						case 692 :
						case 693 :
						case 694 :
						case 695 :
						case 696 :
						case 697 :
						case 698 :
						case 699 :
						case 700 :
						case 701 :
						case 702 :
						case 703 :
						case 704 :
						case 706 :
						case 707 :
						case 708 :
						case 709 :
						case 710 :
						case 711 :
						case 712 :
						case 713 :
						case 714 :
						case 715 :
						case 716 :
						case 717 :
						case 718 :
						case 719 :
						case 720 :
						case 721 :
						case 722 :
						case 723 :
						case 724 :
						case 725 :
						case 726 :
						case 727 :
						case 728 :
						case 729 :
						case 730 :
						case 731 :
						case 732 :
						case 733 :
						case 734 :
						case 735 :
						case 736 :
						case 737 :
						case 738 :
						case 739 :
						case 740 :
						case 741 :
						case 742 :
						case 743 :
						case 744 :
						case 745 :
						case 746 :
						case 747 :
						case 748 :
						case 749 :
						case 750 :
						case 751 :
						case 752 :
						case 753 :
						case 755 :
						case 756 :
						case 757 :
						case 758 :
						case 759 :
						case 760 :
						case 761 :
						case 762 :
						case 763 :
						case 764 :
						case 765 :
						case 766 :
						case 767 :
						case 768 :
						case 769 :
						case 770 :
						case 771 :
						case 772 :
						case 773 :
						case 774 :
						case 775 :
						case 776 :
						case 777 :
						case 778 :
						case 779 :
						case 780 :
						case 781 :
						case 782 :
						case 783 :
						case 784 :
						case 785 :
						case 786 :
						case 787 :
						case 788 :
						case 789 :
						case 790 :
						case 791 :
						case 792 :
						case 793 :
						case 794 :
						case 795 :
						case 796 :
						case 797 :
						case 798 :
						case 799 :
							monitor.wait();
							break;
						case 705:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 706;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
						case 754:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 755;
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_800_998(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 800 :
						case 801 :
						case 802 :
						case 803 :
						case 804 :
						case 805 :
						case 806 :
						case 807 :
						case 808 :
						case 809 :
						case 810 :
						case 811 :
						case 812 :
						case 813 :
						case 814 :
						case 815 :
						case 816 :
						case 817 :
						case 818 :
						case 819 :
						case 820 :
						case 821 :
						case 822 :
						case 823 :
						case 824 :
						case 825 :
						case 826 :
						case 827 :
						case 828 :
						case 829 :
						case 830 :
						case 831 :
						case 832 :
						case 833 :
						case 834 :
						case 835 :
						case 836 :
						case 837 :
						case 838 :
						case 839 :
						case 840 :
						case 841 :
						case 842 :
						case 843 :
						case 844 :
						case 845 :
						case 846 :
						case 847 :
						case 848 :
						case 849 :
						case 850 :
						case 851 :
						case 852 :
						case 853 :
						case 854 :
						case 855 :
						case 856 :
						case 857 :
						case 858 :
						case 859 :
						case 860 :
						case 861 :
						case 862 :
						case 863 :
						case 864 :
						case 865 :
						case 866 :
						case 867 :
						case 868 :
						case 869 :
						case 870 :
						case 871 :
						case 872 :
						case 873 :
						case 874 :
						case 875 :
						case 876 :
						case 877 :
						case 878 :
						case 879 :
						case 880 :
						case 881 :
						case 882 :
						case 883 :
						case 884 :
						case 885 :
						case 886 :
						case 887 :
						case 888 :
						case 889 :
						case 890 :
						case 891 :
						case 892 :
						case 893 :
						case 894 :
						case 895 :
						case 896 :
						case 897 :
						case 898 :
						case 899 :
						case 900 :
						case 901 :
						case 902 :
						case 903 :
						case 904 :
						case 905 :
						case 906 :
						case 907 :
						case 908 :
						case 909 :
						case 910 :
						case 911 :
						case 912 :
						case 913 :
						case 914 :
						case 915 :
						case 916 :
						case 917 :
						case 918 :
						case 919 :
						case 920 :
						case 921 :
						case 922 :
						case 923 :
						case 924 :
						case 925 :
						case 926 :
						case 927 :
						case 928 :
						case 929 :
						case 930 :
						case 931 :
						case 932 :
						case 933 :
						case 934 :
						case 935 :
						case 936 :
						case 937 :
						case 938 :
						case 939 :
						case 940 :
						case 941 :
						case 942 :
						case 943 :
						case 944 :
						case 945 :
						case 946 :
						case 947 :
						case 948 :
						case 949 :
						case 950 :
						case 951 :
						case 952 :
						case 953 :
						case 954 :
						case 955 :
						case 956 :
						case 957 :
						case 958 :
						case 959 :
						case 960 :
						case 961 :
						case 962 :
						case 963 :
						case 964 :
						case 965 :
						case 966 :
						case 967 :
						case 968 :
						case 969 :
						case 970 :
						case 971 :
						case 972 :
						case 973 :
						case 974 :
						case 975 :
						case 976 :
						case 977 :
						case 978 :
						case 979 :
						case 980 :
						case 981 :
						case 982 :
						case 983 :
						case 984 :
						case 985 :
						case 986 :
						case 987 :
						case 988 :
						case 989 :
						case 990 :
						case 991 :
						case 992 :
						case 993 :
						case 994 :
						case 995 :
						case 996 :
						case 997 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				@Override
				public <Any, AnyInput> Optional<Any> exchange(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					synchronized (monitor){
						while (true){
							if (state >=0 && state <= 199){
								var result = exchange_0_199(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=200 && state <= 399){
								var result = exchange_200_399(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=400 && state <= 599){
								var result = exchange_400_599(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=600 && state <= 799){
								var result = exchange_600_799(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
							if (state >=800 && state <= 998){
								var result = exchange_800_998(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_20_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 23 :
						case 24 :
						case 25 :
						case 26 :
						case 27 :
						case 28 :
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
						case 42 :
						case 43 :
						case 44 :
						case 45 :
						case 46 :
						case 47 :
						case 48 :
						case 49 :
						case 50 :
						case 51 :
						case 52 :
						case 53 :
						case 54 :
						case 55 :
						case 56 :
						case 57 :
						case 58 :
						case 59 :
						case 60 :
						case 61 :
						case 62 :
						case 63 :
						case 64 :
						case 65 :
						case 66 :
						case 67 :
						case 68 :
						case 69 :
						case 70 :
						case 71 :
						case 72 :
						case 73 :
						case 74 :
						case 75 :
						case 76 :
						case 77 :
						case 78 :
						case 79 :
						case 80 :
						case 81 :
						case 82 :
						case 83 :
						case 84 :
						case 85 :
						case 86 :
						case 87 :
						case 88 :
						case 89 :
						case 90 :
						case 91 :
						case 92 :
						case 93 :
						case 94 :
						case 95 :
						case 96 :
						case 97 :
						case 98 :
						case 99 :
						case 100 :
						case 101 :
						case 102 :
						case 103 :
						case 104 :
						case 105 :
						case 106 :
						case 107 :
						case 108 :
						case 109 :
						case 110 :
						case 111 :
						case 112 :
						case 113 :
						case 114 :
						case 115 :
						case 116 :
						case 117 :
						case 118 :
						case 119 :
						case 120 :
						case 121 :
						case 122 :
						case 123 :
						case 124 :
						case 125 :
						case 126 :
						case 127 :
						case 128 :
						case 129 :
						case 130 :
						case 131 :
						case 132 :
						case 133 :
						case 134 :
						case 135 :
						case 136 :
						case 137 :
						case 138 :
						case 139 :
						case 140 :
						case 141 :
						case 142 :
						case 143 :
						case 144 :
						case 145 :
						case 146 :
						case 147 :
						case 148 :
						case 149 :
						case 150 :
						case 151 :
						case 152 :
						case 153 :
						case 154 :
						case 155 :
						case 156 :
						case 157 :
						case 158 :
						case 159 :
						case 160 :
						case 161 :
						case 162 :
						case 163 :
						case 164 :
						case 165 :
						case 166 :
						case 167 :
						case 168 :
						case 169 :
						case 170 :
						case 171 :
						case 172 :
						case 173 :
						case 174 :
						case 175 :
						case 176 :
						case 177 :
						case 178 :
						case 179 :
						case 180 :
						case 181 :
						case 182 :
						case 183 :
						case 184 :
						case 185 :
						case 186 :
						case 187 :
						case 188 :
						case 189 :
						case 190 :
						case 191 :
						case 192 :
						case 193 :
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_200_399(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 200 :
						case 201 :
						case 202 :
						case 203 :
						case 204 :
						case 205 :
						case 206 :
						case 207 :
						case 208 :
						case 209 :
						case 210 :
						case 211 :
						case 212 :
						case 213 :
						case 214 :
						case 215 :
						case 216 :
						case 217 :
						case 218 :
						case 219 :
						case 220 :
						case 221 :
						case 222 :
						case 223 :
						case 224 :
						case 225 :
						case 226 :
						case 227 :
						case 228 :
						case 229 :
						case 230 :
						case 231 :
						case 232 :
						case 233 :
						case 234 :
						case 235 :
						case 236 :
						case 237 :
						case 238 :
						case 239 :
						case 240 :
						case 241 :
						case 242 :
						case 243 :
						case 244 :
						case 245 :
						case 246 :
						case 247 :
						case 248 :
						case 249 :
						case 250 :
						case 251 :
						case 252 :
						case 253 :
						case 254 :
						case 255 :
						case 256 :
						case 257 :
						case 258 :
						case 259 :
						case 260 :
						case 261 :
						case 262 :
						case 263 :
						case 264 :
						case 265 :
						case 266 :
						case 267 :
						case 268 :
						case 269 :
						case 270 :
						case 271 :
						case 272 :
						case 273 :
						case 274 :
						case 275 :
						case 276 :
						case 277 :
						case 278 :
						case 279 :
						case 280 :
						case 281 :
						case 282 :
						case 283 :
						case 284 :
						case 285 :
						case 286 :
						case 287 :
						case 288 :
						case 289 :
						case 290 :
						case 291 :
						case 292 :
						case 293 :
						case 294 :
						case 295 :
						case 296 :
						case 297 :
						case 298 :
						case 299 :
						case 300 :
						case 301 :
						case 302 :
						case 303 :
						case 304 :
						case 305 :
						case 306 :
						case 307 :
						case 308 :
						case 309 :
						case 310 :
						case 311 :
						case 312 :
						case 313 :
						case 314 :
						case 315 :
						case 316 :
						case 317 :
						case 318 :
						case 319 :
						case 320 :
						case 321 :
						case 322 :
						case 323 :
						case 324 :
						case 325 :
						case 326 :
						case 327 :
						case 328 :
						case 329 :
						case 330 :
						case 331 :
						case 332 :
						case 333 :
						case 334 :
						case 335 :
						case 336 :
						case 337 :
						case 338 :
						case 339 :
						case 340 :
						case 341 :
						case 342 :
						case 343 :
						case 344 :
						case 345 :
						case 346 :
						case 347 :
						case 348 :
						case 349 :
						case 350 :
						case 351 :
						case 352 :
						case 353 :
						case 354 :
						case 355 :
						case 356 :
						case 357 :
						case 358 :
						case 359 :
						case 360 :
						case 361 :
						case 362 :
						case 363 :
						case 364 :
						case 365 :
						case 366 :
						case 367 :
						case 368 :
						case 369 :
						case 370 :
						case 371 :
						case 372 :
						case 373 :
						case 374 :
						case 375 :
						case 376 :
						case 377 :
						case 378 :
						case 379 :
						case 380 :
						case 381 :
						case 382 :
						case 383 :
						case 384 :
						case 385 :
						case 386 :
						case 387 :
						case 388 :
						case 389 :
						case 390 :
						case 391 :
						case 392 :
						case 393 :
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_599(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
						case 408 :
						case 409 :
						case 410 :
						case 411 :
						case 412 :
						case 413 :
						case 414 :
						case 415 :
						case 416 :
						case 417 :
						case 418 :
						case 419 :
						case 420 :
						case 421 :
						case 422 :
						case 423 :
						case 424 :
						case 425 :
						case 426 :
						case 427 :
						case 430 :
						case 431 :
						case 432 :
						case 433 :
						case 434 :
						case 435 :
						case 436 :
						case 437 :
						case 438 :
						case 439 :
						case 440 :
						case 441 :
						case 442 :
						case 443 :
						case 444 :
						case 445 :
						case 446 :
						case 447 :
						case 448 :
						case 449 :
						case 450 :
						case 451 :
						case 452 :
						case 453 :
						case 454 :
						case 455 :
						case 456 :
						case 457 :
						case 458 :
						case 459 :
						case 460 :
						case 461 :
						case 462 :
						case 463 :
						case 464 :
						case 465 :
						case 466 :
						case 467 :
						case 468 :
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
						case 478 :
						case 479 :
						case 480 :
						case 481 :
						case 482 :
						case 483 :
						case 484 :
						case 485 :
						case 486 :
						case 487 :
						case 488 :
						case 489 :
						case 490 :
						case 491 :
						case 492 :
						case 493 :
						case 494 :
						case 495 :
						case 496 :
						case 497 :
						case 498 :
						case 499 :
						case 500 :
						case 501 :
						case 502 :
						case 503 :
						case 504 :
						case 505 :
						case 506 :
						case 507 :
						case 508 :
						case 509 :
						case 510 :
						case 511 :
						case 512 :
						case 513 :
						case 514 :
						case 515 :
						case 516 :
						case 517 :
						case 518 :
						case 519 :
						case 520 :
						case 521 :
						case 522 :
						case 523 :
						case 524 :
						case 525 :
						case 526 :
						case 527 :
						case 528 :
						case 529 :
						case 530 :
						case 531 :
						case 532 :
						case 533 :
						case 534 :
						case 535 :
						case 536 :
						case 537 :
						case 538 :
						case 539 :
						case 540 :
						case 541 :
						case 542 :
						case 543 :
						case 544 :
						case 545 :
						case 546 :
						case 547 :
						case 548 :
						case 549 :
						case 550 :
						case 551 :
						case 552 :
						case 553 :
						case 554 :
						case 555 :
						case 556 :
						case 557 :
						case 558 :
						case 559 :
						case 560 :
						case 561 :
						case 562 :
						case 563 :
						case 564 :
						case 565 :
						case 566 :
						case 567 :
						case 568 :
						case 569 :
						case 570 :
						case 571 :
						case 572 :
						case 573 :
						case 574 :
						case 575 :
						case 576 :
						case 577 :
						case 578 :
						case 579 :
						case 580 :
						case 581 :
						case 582 :
						case 583 :
						case 584 :
						case 585 :
						case 586 :
						case 587 :
						case 588 :
						case 589 :
						case 590 :
						case 591 :
						case 592 :
						case 593 :
						case 594 :
						case 595 :
						case 596 :
						case 597 :
						case 599 :
							monitor.wait();
							break;
						case 428:
							if (queueFrommasterTopsinv_20_.peek() != null ) {
								monitor.notifyAll();
								state = 429;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_20_.take());
							}
							monitor.wait();
							break;
						case 429:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 430;
									queueFrompsinv_20_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 598:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 599;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_600_799(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 600 :
						case 601 :
						case 602 :
						case 603 :
						case 604 :
						case 605 :
						case 606 :
						case 607 :
						case 608 :
						case 609 :
						case 610 :
						case 611 :
						case 612 :
						case 613 :
						case 614 :
						case 615 :
						case 616 :
						case 617 :
						case 618 :
						case 619 :
						case 620 :
						case 621 :
						case 622 :
						case 623 :
						case 624 :
						case 625 :
						case 626 :
						case 627 :