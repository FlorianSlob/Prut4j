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

public class MGProtocol_n_12 implements IProtocol {
	private volatile int state = 0;
	private final Object monitor = this;
	
	private final BlockingQueue<Object> queueFrommasterTorprj_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_7_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_8_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_3_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_6_Tomaster = new LinkedBlockingQueue<>(); 
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
	private final BlockingQueue<Object> queueFromrprj_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_4_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_8_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_1_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_7_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_3_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_5_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_11_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_5_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_2_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTointerpd_0_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromrprj_9_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTopsinv_1_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_6_ = new LinkedBlockingQueue<>(); 
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
	private final BlockingQueue<Object> queueFrommasterTopsinv_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrompsinv_4_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterTorprj_10_ = new LinkedBlockingQueue<>(); 
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
	private final BlockingQueue<Object> queueFrommasterTointerpd_11_ = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFromresid_0_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrominterpd_2_Tomaster = new LinkedBlockingQueue<>(); 
	private final BlockingQueue<Object> queueFrommasterToresid_11_ = new LinkedBlockingQueue<>(); 
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
								state = 53;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_0_.take());
							}
							monitor.wait();
							break;
						case 28:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 29;
									queueFrominterpd_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 53:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 54;
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
						case 255:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 256;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 48:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 49;
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
						case 212:
							if (queueFrommasterTointerpd_10_.peek() != null ) {
								monitor.notifyAll();
								state = 213;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_10_.take());
							}
							monitor.wait();
							break;
						case 213:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 214;
									queueFrominterpd_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 265:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 266;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 50:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 51;
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
						case 228:
							if (queueFrommasterTointerpd_11_.peek() != null ) {
								monitor.notifyAll();
								state = 229;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_11_.take());
							}
							monitor.wait();
							break;
						case 229:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 230;
									queueFrominterpd_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 266:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 267;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 30:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 31;
									queueFrominterpd_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 68:
							if (queueFrommasterTointerpd_1_.peek() != null ) {
								monitor.notifyAll();
								state = 69;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_1_.take());
							}
							monitor.wait();
							break;
						case 69:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 70;
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
						case 256:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 257;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 32:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 33;
									queueFrominterpd_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 84:
							if (queueFrommasterTointerpd_2_.peek() != null ) {
								monitor.notifyAll();
								state = 85;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_2_.take());
							}
							monitor.wait();
							break;
						case 85:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 86;
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
						case 257:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 258;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 34:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 35;
									queueFrominterpd_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 100:
							if (queueFrommasterTointerpd_3_.peek() != null ) {
								monitor.notifyAll();
								state = 101;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_3_.take());
							}
							monitor.wait();
							break;
						case 101:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 102;
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
						case 258:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 259;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 36:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 37;
									queueFrominterpd_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 116:
							if (queueFrommasterTointerpd_4_.peek() != null ) {
								monitor.notifyAll();
								state = 117;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_4_.take());
							}
							monitor.wait();
							break;
						case 117:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 118;
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
						case 259:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 260;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 38:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 39;
									queueFrominterpd_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 132:
							if (queueFrommasterTointerpd_5_.peek() != null ) {
								monitor.notifyAll();
								state = 133;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_5_.take());
							}
							monitor.wait();
							break;
						case 133:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 134;
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
						case 260:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 261;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 40:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 41;
									queueFrominterpd_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 148:
							if (queueFrommasterTointerpd_6_.peek() != null ) {
								monitor.notifyAll();
								state = 149;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_6_.take());
							}
							monitor.wait();
							break;
						case 149:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 150;
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
						case 261:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 262;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 42:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 43;
									queueFrominterpd_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 164:
							if (queueFrommasterTointerpd_7_.peek() != null ) {
								monitor.notifyAll();
								state = 165;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_7_.take());
							}
							monitor.wait();
							break;
						case 165:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 166;
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
						case 262:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 263;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 44:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 45;
									queueFrominterpd_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 180:
							if (queueFrommasterTointerpd_8_.peek() != null ) {
								monitor.notifyAll();
								state = 181;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_8_.take());
							}
							monitor.wait();
							break;
						case 181:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 182;
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
						case 263:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 264;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 46:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 47;
									queueFrominterpd_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 196:
							if (queueFrommasterTointerpd_9_.peek() != null ) {
								monitor.notifyAll();
								state = 197;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTointerpd_9_.take());
							}
							monitor.wait();
							break;
						case 197:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 198;
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
						case 264:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 265;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 28 :
						case 30 :
						case 32 :
						case 34 :
						case 36 :
						case 38 :
						case 40 :
						case 42 :
						case 44 :
						case 46 :
						case 48 :
						case 50 :
						case 53 :
						case 56 :
						case 57 :
						case 60 :
						case 61 :
						case 64 :
						case 65 :
						case 68 :
						case 69 :
						case 72 :
						case 73 :
						case 76 :
						case 77 :
						case 80 :
						case 81 :
						case 84 :
						case 85 :
						case 88 :
						case 89 :
						case 92 :
						case 93 :
						case 96 :
						case 97 :
						case 100 :
						case 101 :
						case 104 :
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
						case 29:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 30;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 31:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 32;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 33:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 34;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 35:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 36;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 37:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 38;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 39:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 40;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 41:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 42;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 43:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 44;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 45:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 46;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 47:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 48;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 49:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 50;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 51:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 52:
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
						case 54:
							if (queueFrominterpd_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 55;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 55:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_0_";
								}
								if (receiver.equals("psinv_0_")) {
									monitor.notifyAll();
									state = 56;
									queueFrommasterTopsinv_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 58:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 59;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 59:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_0_";
								}
								if (receiver.equals("rprj_0_")) {
									monitor.notifyAll();
									state = 60;
									queueFrommasterTorprj_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 62:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 63;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 63:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_0_";
								}
								if (receiver.equals("resid_0_")) {
									monitor.notifyAll();
									state = 64;
									queueFrommasterToresid_0_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 66:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 67;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 67:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_1_";
								}
								if (receiver.equals("interpd_1_")) {
									monitor.notifyAll();
									state = 68;
									queueFrommasterTointerpd_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 70:
							if (queueFrominterpd_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 71;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 71:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 72;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 74:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 75;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 75:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 76;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 78:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 79;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 79:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 80;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 82:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 83;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 83:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_2_";
								}
								if (receiver.equals("interpd_2_")) {
									monitor.notifyAll();
									state = 84;
									queueFrommasterTointerpd_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 86:
							if (queueFrominterpd_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 87;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 87:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 88;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 90:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 91;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 91:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 92;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 94:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 95;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 95:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 96;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 98:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 99;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 99:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_3_";
								}
								if (receiver.equals("interpd_3_")) {
									monitor.notifyAll();
									state = 100;
									queueFrommasterTointerpd_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 102:
							if (queueFrominterpd_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 103;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 103:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 104;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 106:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 107;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 107:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 108;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 110:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 111;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 111:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 112;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 114:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 115;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 115:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_4_";
								}
								if (receiver.equals("interpd_4_")) {
									monitor.notifyAll();
									state = 116;
									queueFrommasterTointerpd_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 118:
							if (queueFrominterpd_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 119;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 119:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 120;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 122:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 123;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 123:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 124;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 126:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 127;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 127:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 128;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 130:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 131;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 131:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_5_";
								}
								if (receiver.equals("interpd_5_")) {
									monitor.notifyAll();
									state = 132;
									queueFrommasterTointerpd_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 134:
							if (queueFrominterpd_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 135;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 135:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 136;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 138:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 139;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 139:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 140;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 142:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 143;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 143:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 144;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 146:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 147;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 147:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_6_";
								}
								if (receiver.equals("interpd_6_")) {
									monitor.notifyAll();
									state = 148;
									queueFrommasterTointerpd_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 150:
							if (queueFrominterpd_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 151;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 151:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 152;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 154:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 155;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 155:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 156;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 158:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 159;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 159:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 160;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 162:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 163;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 163:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_7_";
								}
								if (receiver.equals("interpd_7_")) {
									monitor.notifyAll();
									state = 164;
									queueFrommasterTointerpd_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 166:
							if (queueFrominterpd_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 167;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 167:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 168;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 170:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 171;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 171:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 172;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 174:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 175;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 175:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 176;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 178:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 179;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 179:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_8_";
								}
								if (receiver.equals("interpd_8_")) {
									monitor.notifyAll();
									state = 180;
									queueFrommasterTointerpd_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 182:
							if (queueFrominterpd_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 183;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 183:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 184;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 186:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 187;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 187:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 188;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 190:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 191;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 191:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 192;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 194:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 195;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 195:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_9_";
								}
								if (receiver.equals("interpd_9_")) {
									monitor.notifyAll();
									state = 196;
									queueFrommasterTointerpd_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 198:
							if (queueFrominterpd_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 199;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 199:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 200;
									queueFrommasterTopsinv_9_.put(box.get());
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
						case 341 :
						case 343 :
						case 345 :
						case 347 :
						case 349 :
						case 351 :
						case 353 :
						case 355 :
						case 357 :
						case 359 :
						case 361 :
						case 362 :
						case 364 :
						case 366 :
						case 368 :
						case 370 :
						case 372 :
						case 374 :
						case 376 :
						case 378 :
						case 380 :
						case 382 :
						case 384 :
						case 387 :
						case 389 :
						case 391 :
						case 393 :
						case 395 :
						case 397 :
						case 399 :
							monitor.wait();
							break;
						case 202:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 203;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 203:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 204;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 206:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 207;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 207:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 208;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 210:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 211;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 211:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_10_";
								}
								if (receiver.equals("interpd_10_")) {
									monitor.notifyAll();
									state = 212;
									queueFrommasterTointerpd_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 214:
							if (queueFrominterpd_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 215;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 215:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 216;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 218:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 219;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 219:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 220;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 222:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 223;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 223:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 224;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 226:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 227;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 227:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "interpd_11_";
								}
								if (receiver.equals("interpd_11_")) {
									monitor.notifyAll();
									state = 228;
									queueFrommasterTointerpd_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 230:
							if (queueFrominterpd_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 231;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrominterpd_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 231:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 232;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 234:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 235;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 235:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 236;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 238:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 239;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 239:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.ExitMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 240;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 242:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 243;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 243:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 244;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 244:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 245;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 245:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 246;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 246:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 247;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 247:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 248;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 248:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 249;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 249:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 250;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 250:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 251;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 251:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 252;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 252:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 253;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 253:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 254;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 254:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 255;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 267:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 268;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 268:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 269;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 269:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 270;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 270:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 271;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 271:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 272;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 272:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 273;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 273:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 274;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 274:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 275;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 275:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 276;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 276:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 277;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 277:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 278;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 278:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 279;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 291:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 292;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 292:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 293;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 293:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 294;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 294:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 295;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 295:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 296;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 296:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 297;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 297:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 298;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 298:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 299;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 299:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 300;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 300:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 301;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 301:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 302;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 302:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 303;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 315:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 316;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 316:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 317;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 317:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 318;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 318:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 319;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 319:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 320;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 320:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 321;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 321:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 322;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 322:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 323;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 323:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 324;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 324:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 325;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 325:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 326;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 326:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 327;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 340:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_1_";
								}
								if (receiver.equals("psinv_1_")) {
									monitor.notifyAll();
									state = 341;
									queueFrommasterTopsinv_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 342:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_2_";
								}
								if (receiver.equals("psinv_2_")) {
									monitor.notifyAll();
									state = 343;
									queueFrommasterTopsinv_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 344:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_3_";
								}
								if (receiver.equals("psinv_3_")) {
									monitor.notifyAll();
									state = 345;
									queueFrommasterTopsinv_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 346:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_4_";
								}
								if (receiver.equals("psinv_4_")) {
									monitor.notifyAll();
									state = 347;
									queueFrommasterTopsinv_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 348:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_5_";
								}
								if (receiver.equals("psinv_5_")) {
									monitor.notifyAll();
									state = 349;
									queueFrommasterTopsinv_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 350:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_6_";
								}
								if (receiver.equals("psinv_6_")) {
									monitor.notifyAll();
									state = 351;
									queueFrommasterTopsinv_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 352:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_7_";
								}
								if (receiver.equals("psinv_7_")) {
									monitor.notifyAll();
									state = 353;
									queueFrommasterTopsinv_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 354:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_8_";
								}
								if (receiver.equals("psinv_8_")) {
									monitor.notifyAll();
									state = 355;
									queueFrommasterTopsinv_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 356:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_9_";
								}
								if (receiver.equals("psinv_9_")) {
									monitor.notifyAll();
									state = 357;
									queueFrommasterTopsinv_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 358:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_10_";
								}
								if (receiver.equals("psinv_10_")) {
									monitor.notifyAll();
									state = 359;
									queueFrommasterTopsinv_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 360:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.PsinvMessage.class ) {
								if (receiver == null) {
									receiver = "psinv_11_";
								}
								if (receiver.equals("psinv_11_")) {
									monitor.notifyAll();
									state = 361;
									queueFrommasterTopsinv_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 363:
							if (queueFrompsinv_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 364;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 365:
							if (queueFrompsinv_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 366;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 367:
							if (queueFrompsinv_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 368;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 369:
							if (queueFrompsinv_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 370;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 371:
							if (queueFrompsinv_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 372;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 373:
							if (queueFrompsinv_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 374;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 375:
							if (queueFrompsinv_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 376;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 377:
							if (queueFrompsinv_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 378;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 379:
							if (queueFrompsinv_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 380;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 381:
							if (queueFrompsinv_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 382;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 383:
							if (queueFrompsinv_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 384;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 385:
							if (queueFrompsinv_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrompsinv_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 386:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_1_";
								}
								if (receiver.equals("rprj_1_")) {
									monitor.notifyAll();
									state = 387;
									queueFrommasterTorprj_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 388:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_2_";
								}
								if (receiver.equals("rprj_2_")) {
									monitor.notifyAll();
									state = 389;
									queueFrommasterTorprj_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 390:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_3_";
								}
								if (receiver.equals("rprj_3_")) {
									monitor.notifyAll();
									state = 391;
									queueFrommasterTorprj_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 392:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_4_";
								}
								if (receiver.equals("rprj_4_")) {
									monitor.notifyAll();
									state = 393;
									queueFrommasterTorprj_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 394:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_5_";
								}
								if (receiver.equals("rprj_5_")) {
									monitor.notifyAll();
									state = 395;
									queueFrommasterTorprj_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 396:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_6_";
								}
								if (receiver.equals("rprj_6_")) {
									monitor.notifyAll();
									state = 397;
									queueFrommasterTorprj_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 398:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_7_";
								}
								if (receiver.equals("rprj_7_")) {
									monitor.notifyAll();
									state = 399;
									queueFrommasterTorprj_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 401 :
						case 403 :
						case 405 :
						case 407 :
						case 408 :
						case 410 :
						case 412 :
						case 414 :
						case 416 :
						case 418 :
						case 420 :
						case 422 :
						case 424 :
						case 426 :
						case 428 :
						case 430 :
						case 433 :
						case 435 :
						case 437 :
						case 439 :
						case 441 :
						case 443 :
						case 445 :
						case 447 :
						case 449 :
						case 451 :
						case 453 :
						case 454 :
						case 456 :
						case 458 :
						case 460 :
						case 462 :
						case 464 :
						case 466 :
						case 468 :
						case 470 :
						case 472 :
						case 474 :
						case 476 :
							monitor.wait();
							break;
						case 400:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_8_";
								}
								if (receiver.equals("rprj_8_")) {
									monitor.notifyAll();
									state = 401;
									queueFrommasterTorprj_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 402:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_9_";
								}
								if (receiver.equals("rprj_9_")) {
									monitor.notifyAll();
									state = 403;
									queueFrommasterTorprj_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 404:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_10_";
								}
								if (receiver.equals("rprj_10_")) {
									monitor.notifyAll();
									state = 405;
									queueFrommasterTorprj_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 406:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.RprjMessage.class ) {
								if (receiver == null) {
									receiver = "rprj_11_";
								}
								if (receiver.equals("rprj_11_")) {
									monitor.notifyAll();
									state = 407;
									queueFrommasterTorprj_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 409:
							if (queueFromrprj_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 410;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 411:
							if (queueFromrprj_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 412;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 413:
							if (queueFromrprj_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 414;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 415:
							if (queueFromrprj_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 416;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 417:
							if (queueFromrprj_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 418;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 419:
							if (queueFromrprj_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 420;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 421:
							if (queueFromrprj_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 422;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 423:
							if (queueFromrprj_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 424;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 425:
							if (queueFromrprj_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 426;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 427:
							if (queueFromrprj_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 428;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 429:
							if (queueFromrprj_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 430;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 431:
							if (queueFromrprj_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromrprj_11_Tomaster.take());
							}
							monitor.wait();
							break;
						case 432:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_1_";
								}
								if (receiver.equals("resid_1_")) {
									monitor.notifyAll();
									state = 433;
									queueFrommasterToresid_1_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 434:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_2_";
								}
								if (receiver.equals("resid_2_")) {
									monitor.notifyAll();
									state = 435;
									queueFrommasterToresid_2_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 436:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_3_";
								}
								if (receiver.equals("resid_3_")) {
									monitor.notifyAll();
									state = 437;
									queueFrommasterToresid_3_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 438:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_4_";
								}
								if (receiver.equals("resid_4_")) {
									monitor.notifyAll();
									state = 439;
									queueFrommasterToresid_4_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 440:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_5_";
								}
								if (receiver.equals("resid_5_")) {
									monitor.notifyAll();
									state = 441;
									queueFrommasterToresid_5_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 442:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_6_";
								}
								if (receiver.equals("resid_6_")) {
									monitor.notifyAll();
									state = 443;
									queueFrommasterToresid_6_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 444:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_7_";
								}
								if (receiver.equals("resid_7_")) {
									monitor.notifyAll();
									state = 445;
									queueFrommasterToresid_7_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 446:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_8_";
								}
								if (receiver.equals("resid_8_")) {
									monitor.notifyAll();
									state = 447;
									queueFrommasterToresid_8_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 448:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_9_";
								}
								if (receiver.equals("resid_9_")) {
									monitor.notifyAll();
									state = 449;
									queueFrommasterToresid_9_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 450:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_10_";
								}
								if (receiver.equals("resid_10_")) {
									monitor.notifyAll();
									state = 451;
									queueFrommasterToresid_10_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 452:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.MGThreads.ResidMessage.class ) {
								if (receiver == null) {
									receiver = "resid_11_";
								}
								if (receiver.equals("resid_11_")) {
									monitor.notifyAll();
									state = 453;
									queueFrommasterToresid_11_.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 455:
							if (queueFromresid_0_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 456;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_0_Tomaster.take());
							}
							monitor.wait();
							break;
						case 457:
							if (queueFromresid_1_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 458;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_1_Tomaster.take());
							}
							monitor.wait();
							break;
						case 459:
							if (queueFromresid_2_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 460;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_2_Tomaster.take());
							}
							monitor.wait();
							break;
						case 461:
							if (queueFromresid_3_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 462;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_3_Tomaster.take());
							}
							monitor.wait();
							break;
						case 463:
							if (queueFromresid_4_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 464;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_4_Tomaster.take());
							}
							monitor.wait();
							break;
						case 465:
							if (queueFromresid_5_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 466;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_5_Tomaster.take());
							}
							monitor.wait();
							break;
						case 467:
							if (queueFromresid_6_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 468;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_6_Tomaster.take());
							}
							monitor.wait();
							break;
						case 469:
							if (queueFromresid_7_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 470;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_7_Tomaster.take());
							}
							monitor.wait();
							break;
						case 471:
							if (queueFromresid_8_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 472;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_8_Tomaster.take());
							}
							monitor.wait();
							break;
						case 473:
							if (queueFromresid_9_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 474;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_9_Tomaster.take());
							}
							monitor.wait();
							break;
						case 475:
							if (queueFromresid_10_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 476;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_10_Tomaster.take());
							}
							monitor.wait();
							break;
						case 477:
							if (queueFromresid_11_Tomaster.peek() != null ) {
								monitor.notifyAll();
								state = 52;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFromresid_11_Tomaster.take());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 2:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 340;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 56:
							if (queueFrommasterTopsinv_0_.peek() != null ) {
								monitor.notifyAll();
								state = 57;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_0_.take());
							}
							monitor.wait();
							break;
						case 57:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 58;
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
						case 279:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 280;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 362:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 363;
									queueFrompsinv_0_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 217;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
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
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 289:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 290;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 359:
							if (queueFrommasterTopsinv_10_.peek() != null ) {
								monitor.notifyAll();
								state = 360;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_10_.take());
							}
							monitor.wait();
							break;
						case 382:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 383;
									queueFrompsinv_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 233;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
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
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 290:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 291;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 361:
							if (queueFrommasterTopsinv_11_.peek() != null ) {
								monitor.notifyAll();
								state = 362;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_11_.take());
							}
							monitor.wait();
							break;
						case 384:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 385;
									queueFrompsinv_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
						case 72:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 73;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
						case 73:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 74;
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
							if (isCloseAction) {
								monitor.notifyAll();
								state = 281;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 341:
							if (queueFrommasterTopsinv_1_.peek() != null ) {
								monitor.notifyAll();
								state = 342;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_1_.take());
							}
							monitor.wait();
							break;
						case 364:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 365;
									queueFrompsinv_1_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_2_": return new IEnvironment() {
				
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
						case 88:
							if (queueFrommasterTopsinv_2_.peek() != null ) {
								monitor.notifyAll();
								state = 89;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_2_.take());
							}
							monitor.wait();
							break;
						case 89:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 90;
									queueFrompsinv_2_Tomaster.put(box.get());
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
						case 281:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 282;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 343:
							if (queueFrommasterTopsinv_2_.peek() != null ) {
								monitor.notifyAll();
								state = 344;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_2_.take());
							}
							monitor.wait();
							break;
						case 366:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 367;
									queueFrompsinv_2_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_3_": return new IEnvironment() {
				
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
						case 104:
							if (queueFrommasterTopsinv_3_.peek() != null ) {
								monitor.notifyAll();
								state = 105;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_3_.take());
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
									queueFrompsinv_3_Tomaster.put(box.get());
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
						case 282:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 283;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 345:
							if (queueFrommasterTopsinv_3_.peek() != null ) {
								monitor.notifyAll();
								state = 346;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_3_.take());
							}
							monitor.wait();
							break;
						case 368:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 369;
									queueFrompsinv_3_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_4_": return new IEnvironment() {
				
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
						case 120:
							if (queueFrommasterTopsinv_4_.peek() != null ) {
								monitor.notifyAll();
								state = 121;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_4_.take());
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
									queueFrompsinv_4_Tomaster.put(box.get());
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
						case 283:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 284;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 347:
							if (queueFrommasterTopsinv_4_.peek() != null ) {
								monitor.notifyAll();
								state = 348;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_4_.take());
							}
							monitor.wait();
							break;
						case 370:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 371;
									queueFrompsinv_4_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_5_": return new IEnvironment() {
				
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
						case 136:
							if (queueFrommasterTopsinv_5_.peek() != null ) {
								monitor.notifyAll();
								state = 137;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_5_.take());
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
									queueFrompsinv_5_Tomaster.put(box.get());
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
							if (isCloseAction) {
								monitor.notifyAll();
								state = 285;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 349:
							if (queueFrommasterTopsinv_5_.peek() != null ) {
								monitor.notifyAll();
								state = 350;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_5_.take());
							}
							monitor.wait();
							break;
						case 372:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 373;
									queueFrompsinv_5_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_6_": return new IEnvironment() {
				
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
						case 152:
							if (queueFrommasterTopsinv_6_.peek() != null ) {
								monitor.notifyAll();
								state = 153;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_6_.take());
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
									queueFrompsinv_6_Tomaster.put(box.get());
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
						case 285:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 286;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 351:
							if (queueFrommasterTopsinv_6_.peek() != null ) {
								monitor.notifyAll();
								state = 352;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_6_.take());
							}
							monitor.wait();
							break;
						case 374:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 375;
									queueFrompsinv_6_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_7_": return new IEnvironment() {
				
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
						case 168:
							if (queueFrommasterTopsinv_7_.peek() != null ) {
								monitor.notifyAll();
								state = 169;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_7_.take());
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
									queueFrompsinv_7_Tomaster.put(box.get());
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
						case 286:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 287;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 353:
							if (queueFrommasterTopsinv_7_.peek() != null ) {
								monitor.notifyAll();
								state = 354;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_7_.take());
							}
							monitor.wait();
							break;
						case 376:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 377;
									queueFrompsinv_7_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_8_": return new IEnvironment() {
				
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
						case 184:
							if (queueFrommasterTopsinv_8_.peek() != null ) {
								monitor.notifyAll();
								state = 185;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_8_.take());
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
									queueFrompsinv_8_Tomaster.put(box.get());
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
						case 287:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 288;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 355:
							if (queueFrommasterTopsinv_8_.peek() != null ) {
								monitor.notifyAll();
								state = 356;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_8_.take());
							}
							monitor.wait();
							break;
						case 378:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 379;
									queueFrompsinv_8_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "psinv_9_": return new IEnvironment() {
				
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
							if (queueFrommasterTopsinv_9_.peek() != null ) {
								monitor.notifyAll();
								state = 201;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_9_.take());
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
									queueFrompsinv_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 288:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 289;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 357:
							if (queueFrommasterTopsinv_9_.peek() != null ) {
								monitor.notifyAll();
								state = 358;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTopsinv_9_.take());
							}
							monitor.wait();
							break;
						case 380:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 381;
									queueFrompsinv_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_0_": return new IEnvironment() {
				
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
						case 4:
							if (queueFrommasterToresid_0_.peek() != null ) {
								monitor.notifyAll();
								state = 432;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_0_.take());
							}
							monitor.wait();
							break;
						case 64:
							if (queueFrommasterToresid_0_.peek() != null ) {
								monitor.notifyAll();
								state = 65;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_0_.take());
							}
							monitor.wait();
							break;
						case 65:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 66;
									queueFromresid_0_Tomaster.put(box.get());
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
						case 327:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 328;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 454:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 455;
									queueFromresid_0_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_10_": return new IEnvironment() {
				
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
						case 224:
							if (queueFrommasterToresid_10_.peek() != null ) {
								monitor.notifyAll();
								state = 225;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_10_.take());
							}
							monitor.wait();
							break;
						case 225:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 226;
									queueFromresid_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 337:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 338;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 475 :
						case 476 :
						case 477 :
							monitor.wait();
							break;
						case 451:
							if (queueFrommasterToresid_10_.peek() != null ) {
								monitor.notifyAll();
								state = 452;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_10_.take());
							}
							monitor.wait();
							break;
						case 474:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 475;
									queueFromresid_10_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_11_": return new IEnvironment() {
				
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
						case 240:
							if (queueFrommasterToresid_11_.peek() != null ) {
								monitor.notifyAll();
								state = 241;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_11_.take());
							}
							monitor.wait();
							break;
						case 241:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 242;
									queueFromresid_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 338:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 339;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 477 :
							monitor.wait();
							break;
						case 453:
							if (queueFrommasterToresid_11_.peek() != null ) {
								monitor.notifyAll();
								state = 454;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_11_.take());
							}
							monitor.wait();
							break;
						case 476:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 477;
									queueFromresid_11_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_1_": return new IEnvironment() {
				
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
						case 80:
							if (queueFrommasterToresid_1_.peek() != null ) {
								monitor.notifyAll();
								state = 81;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_1_.take());
							}
							monitor.wait();
							break;
						case 81:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 82;
									queueFromresid_1_Tomaster.put(box.get());
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
						case 328:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 329;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 433:
							if (queueFrommasterToresid_1_.peek() != null ) {
								monitor.notifyAll();
								state = 434;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_1_.take());
							}
							monitor.wait();
							break;
						case 456:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 457;
									queueFromresid_1_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_2_": return new IEnvironment() {
				
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
						case 96:
							if (queueFrommasterToresid_2_.peek() != null ) {
								monitor.notifyAll();
								state = 97;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_2_.take());
							}
							monitor.wait();
							break;
						case 97:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 98;
									queueFromresid_2_Tomaster.put(box.get());
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
						case 329:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 330;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 435:
							if (queueFrommasterToresid_2_.peek() != null ) {
								monitor.notifyAll();
								state = 436;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_2_.take());
							}
							monitor.wait();
							break;
						case 458:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 459;
									queueFromresid_2_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_3_": return new IEnvironment() {
				
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
						case 112:
							if (queueFrommasterToresid_3_.peek() != null ) {
								monitor.notifyAll();
								state = 113;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_3_.take());
							}
							monitor.wait();
							break;
						case 113:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 114;
									queueFromresid_3_Tomaster.put(box.get());
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
						case 330:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 331;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 437:
							if (queueFrommasterToresid_3_.peek() != null ) {
								monitor.notifyAll();
								state = 438;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_3_.take());
							}
							monitor.wait();
							break;
						case 460:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 461;
									queueFromresid_3_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_4_": return new IEnvironment() {
				
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
						case 128:
							if (queueFrommasterToresid_4_.peek() != null ) {
								monitor.notifyAll();
								state = 129;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_4_.take());
							}
							monitor.wait();
							break;
						case 129:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 130;
									queueFromresid_4_Tomaster.put(box.get());
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
						case 331:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 332;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 439:
							if (queueFrommasterToresid_4_.peek() != null ) {
								monitor.notifyAll();
								state = 440;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_4_.take());
							}
							monitor.wait();
							break;
						case 462:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 463;
									queueFromresid_4_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_5_": return new IEnvironment() {
				
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
						case 144:
							if (queueFrommasterToresid_5_.peek() != null ) {
								monitor.notifyAll();
								state = 145;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_5_.take());
							}
							monitor.wait();
							break;
						case 145:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 146;
									queueFromresid_5_Tomaster.put(box.get());
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
						case 332:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 333;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 441:
							if (queueFrommasterToresid_5_.peek() != null ) {
								monitor.notifyAll();
								state = 442;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_5_.take());
							}
							monitor.wait();
							break;
						case 464:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 465;
									queueFromresid_5_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_6_": return new IEnvironment() {
				
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
						case 160:
							if (queueFrommasterToresid_6_.peek() != null ) {
								monitor.notifyAll();
								state = 161;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_6_.take());
							}
							monitor.wait();
							break;
						case 161:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 162;
									queueFromresid_6_Tomaster.put(box.get());
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
						case 333:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 334;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 443:
							if (queueFrommasterToresid_6_.peek() != null ) {
								monitor.notifyAll();
								state = 444;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_6_.take());
							}
							monitor.wait();
							break;
						case 466:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 467;
									queueFromresid_6_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_7_": return new IEnvironment() {
				
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
						case 176:
							if (queueFrommasterToresid_7_.peek() != null ) {
								monitor.notifyAll();
								state = 177;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_7_.take());
							}
							monitor.wait();
							break;
						case 177:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 178;
									queueFromresid_7_Tomaster.put(box.get());
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
						case 334:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 335;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 469 :
						case 470 :
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
							monitor.wait();
							break;
						case 445:
							if (queueFrommasterToresid_7_.peek() != null ) {
								monitor.notifyAll();
								state = 446;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_7_.take());
							}
							monitor.wait();
							break;
						case 468:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 469;
									queueFromresid_7_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_8_": return new IEnvironment() {
				
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
						case 194 :
						case 195 :
						case 196 :
						case 197 :
						case 198 :
						case 199 :
							monitor.wait();
							break;
						case 192:
							if (queueFrommasterToresid_8_.peek() != null ) {
								monitor.notifyAll();
								state = 193;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_8_.take());
							}
							monitor.wait();
							break;
						case 193:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 194;
									queueFromresid_8_Tomaster.put(box.get());
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
						case 335:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 336;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 471 :
						case 472 :
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
							monitor.wait();
							break;
						case 447:
							if (queueFrommasterToresid_8_.peek() != null ) {
								monitor.notifyAll();
								state = 448;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_8_.take());
							}
							monitor.wait();
							break;
						case 470:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 471;
									queueFromresid_8_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "resid_9_": return new IEnvironment() {
				
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
						case 208:
							if (queueFrommasterToresid_9_.peek() != null ) {
								monitor.notifyAll();
								state = 209;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_9_.take());
							}
							monitor.wait();
							break;
						case 209:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 210;
									queueFromresid_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 336:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 337;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
						case 473 :
						case 474 :
						case 475 :
						case 476 :
						case 477 :
							monitor.wait();
							break;
						case 449:
							if (queueFrommasterToresid_9_.peek() != null ) {
								monitor.notifyAll();
								state = 450;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterToresid_9_.take());
							}
							monitor.wait();
							break;
						case 472:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 473;
									queueFromresid_9_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_0_": return new IEnvironment() {
				
				@Override
				public String getName(){
					return environmentName;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_0_199(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 0 :
						case 1 :
						case 2 :
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
						case 3:
							if (queueFrommasterTorprj_0_.peek() != null ) {
								monitor.notifyAll();
								state = 386;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_0_.take());
							}
							monitor.wait();
							break;
						case 60:
							if (queueFrommasterTorprj_0_.peek() != null ) {
								monitor.notifyAll();
								state = 61;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_0_.take());
							}
							monitor.wait();
							break;
						case 61:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 62;
									queueFromrprj_0_Tomaster.put(box.get());
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
						case 303:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 304;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
						case 407 :
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
							monitor.wait();
							break;
						case 408:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 409;
									queueFromrprj_0_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_10_": return new IEnvironment() {
				
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
						case 220:
							if (queueFrommasterTorprj_10_.peek() != null ) {
								monitor.notifyAll();
								state = 221;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_10_.take());
							}
							monitor.wait();
							break;
						case 221:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 222;
									queueFromrprj_10_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 313:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 314;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
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
							monitor.wait();
							break;
						case 405:
							if (queueFrommasterTorprj_10_.peek() != null ) {
								monitor.notifyAll();
								state = 406;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_10_.take());
							}
							monitor.wait();
							break;
						case 428:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 429;
									queueFromrprj_10_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_11_": return new IEnvironment() {
				
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
						case 236:
							if (queueFrommasterTorprj_11_.peek() != null ) {
								monitor.notifyAll();
								state = 237;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_11_.take());
							}
							monitor.wait();
							break;
						case 237:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 238;
									queueFromrprj_11_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 314:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 315;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
						case 403 :
						case 404 :
						case 405 :
						case 406 :
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
							monitor.wait();
							break;
						case 407:
							if (queueFrommasterTorprj_11_.peek() != null ) {
								monitor.notifyAll();
								state = 408;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_11_.take());
							}
							monitor.wait();
							break;
						case 430:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 431;
									queueFromrprj_11_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_1_": return new IEnvironment() {
				
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
						case 76:
							if (queueFrommasterTorprj_1_.peek() != null ) {
								monitor.notifyAll();
								state = 77;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_1_.take());
							}
							monitor.wait();
							break;
						case 77:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 78;
									queueFromrprj_1_Tomaster.put(box.get());
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
						case 304:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 305;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 387:
							if (queueFrommasterTorprj_1_.peek() != null ) {
								monitor.notifyAll();
								state = 388;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_1_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 410:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 411;
									queueFromrprj_1_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_2_": return new IEnvironment() {
				
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
						case 92:
							if (queueFrommasterTorprj_2_.peek() != null ) {
								monitor.notifyAll();
								state = 93;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_2_.take());
							}
							monitor.wait();
							break;
						case 93:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 94;
									queueFromrprj_2_Tomaster.put(box.get());
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
						case 305:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 306;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 389:
							if (queueFrommasterTorprj_2_.peek() != null ) {
								monitor.notifyAll();
								state = 390;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_2_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 412:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 413;
									queueFromrprj_2_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_3_": return new IEnvironment() {
				
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
						case 108:
							if (queueFrommasterTorprj_3_.peek() != null ) {
								monitor.notifyAll();
								state = 109;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_3_.take());
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
									queueFromrprj_3_Tomaster.put(box.get());
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
						case 306:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 307;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 391:
							if (queueFrommasterTorprj_3_.peek() != null ) {
								monitor.notifyAll();
								state = 392;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_3_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 414:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 415;
									queueFromrprj_3_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_4_": return new IEnvironment() {
				
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
							if (queueFrommasterTorprj_4_.peek() != null ) {
								monitor.notifyAll();
								state = 125;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_4_.take());
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
									queueFromrprj_4_Tomaster.put(box.get());
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
						case 394 :
						case 395 :
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 307:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 308;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 393:
							if (queueFrommasterTorprj_4_.peek() != null ) {
								monitor.notifyAll();
								state = 394;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_4_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 416:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 417;
									queueFromrprj_4_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_5_": return new IEnvironment() {
				
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
						case 140:
							if (queueFrommasterTorprj_5_.peek() != null ) {
								monitor.notifyAll();
								state = 141;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_5_.take());
							}
							monitor.wait();
							break;
						case 141:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 142;
									queueFromrprj_5_Tomaster.put(box.get());
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
						case 396 :
						case 397 :
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 308:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 309;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 395:
							if (queueFrommasterTorprj_5_.peek() != null ) {
								monitor.notifyAll();
								state = 396;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_5_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 418:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 419;
									queueFromrprj_5_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_6_": return new IEnvironment() {
				
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
						case 156:
							if (queueFrommasterTorprj_6_.peek() != null ) {
								monitor.notifyAll();
								state = 157;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_6_.take());
							}
							monitor.wait();
							break;
						case 157:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 158;
									queueFromrprj_6_Tomaster.put(box.get());
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
						case 398 :
						case 399 :
							monitor.wait();
							break;
						case 309:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 310;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 397:
							if (queueFrommasterTorprj_6_.peek() != null ) {
								monitor.notifyAll();
								state = 398;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_6_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 420:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 421;
									queueFromrprj_6_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_7_": return new IEnvironment() {
				
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
						case 172:
							if (queueFrommasterTorprj_7_.peek() != null ) {
								monitor.notifyAll();
								state = 173;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_7_.take());
							}
							monitor.wait();
							break;
						case 173:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 174;
									queueFromrprj_7_Tomaster.put(box.get());
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
							monitor.wait();
							break;
						case 310:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 311;
								return Optional.empty();
							}
							monitor.wait();
							break;
						case 399:
							if (queueFrommasterTorprj_7_.peek() != null ) {
								monitor.notifyAll();
								state = 400;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_7_.take());
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
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
							monitor.wait();
							break;
						case 422:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 423;
									queueFromrprj_7_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_8_": return new IEnvironment() {
				
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
						case 188:
							if (queueFrommasterTorprj_8_.peek() != null ) {
								monitor.notifyAll();
								state = 189;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_8_.take());
							}
							monitor.wait();
							break;
						case 189:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 190;
									queueFromrprj_8_Tomaster.put(box.get());
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
						case 311:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 312;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
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
							monitor.wait();
							break;
						case 401:
							if (queueFrommasterTorprj_8_.peek() != null ) {
								monitor.notifyAll();
								state = 402;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_8_.take());
							}
							monitor.wait();
							break;
						case 424:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 425;
									queueFromrprj_8_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
								if(result != null)
								  return (Optional<Any>) result;
							}
						}
					}
					
				}
			};
			case "rprj_9_": return new IEnvironment() {
				
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
						case 204:
							if (queueFrommasterTorprj_9_.peek() != null ) {
								monitor.notifyAll();
								state = 205;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_9_.take());
							}
							monitor.wait();
							break;
						case 205:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 206;
									queueFromrprj_9_Tomaster.put(box.get());
									return Optional.empty();
								}
							}
							monitor.wait();
							break;
						case 312:
							if (isCloseAction) {
								monitor.notifyAll();
								state = 313;
								return Optional.empty();
							}
							monitor.wait();
							break;
					}
					return null;
				}
				
				public <Any, AnyInput> Optional<Any> exchange_400_478(Optional<AnyInput> box, String receiver, boolean isCloseAction) throws Exception{
					switch (state){
						case 400 :
						case 401 :
						case 402 :
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
							monitor.wait();
							break;
						case 403:
							if (queueFrommasterTorprj_9_.peek() != null ) {
								monitor.notifyAll();
								state = 404;
								// Disabling unchecked inspection: We did check the class in the if statement above
								//noinspection unchecked
								return Optional.of((Any)queueFrommasterTorprj_9_.take());
							}
							monitor.wait();
							break;
						case 426:
							if (box.isPresent() && box.get().getClass() == discourje.examples.npb3.impl.DoneMessage.class ) {
								if (receiver == null) {
									receiver = "master";
								}
								if (receiver.equals("master")) {
									monitor.notifyAll();
									state = 427;
									queueFromrprj_9_Tomaster.put(box.get());
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
							if (state >=400 && state <= 478){
								var result = exchange_400_478(box, receiver, isCloseAction);
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
		return new String[] { "interpd_8_","interpd_0_","psinv_2_","rprj_5_","interpd_4_","psinv_8_","resid_5_","psinv_4_","resid_11_","psinv_3_","rprj_2_","interpd_10_","psinv_5_","psinv_6_","rprj_7_","interpd_1_","interpd_11_","rprj_10_","resid_4_","psinv_9_","psinv_10_","resid_3_","resid_0_","resid_9_","interpd_7_","master","psinv_7_","rprj_0_","psinv_0_","interpd_2_","rprj_6_","resid_7_","psinv_11_","resid_1_","resid_6_","rprj_9_","psinv_1_","interpd_3_","interpd_9_","resid_10_","rprj_4_","resid_8_","resid_2_","rprj_11_","rprj_3_","interpd_6_","rprj_1_","interpd_5_","rprj_8_" };
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
