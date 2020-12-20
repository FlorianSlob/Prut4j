(ns discourje.core.main
  (:gen-class)
  (:refer-clojure :exclude [disj cat * let empty? loop + count recur])
  (:require [discourje.core.spec.lts :as lts]
            [discourje.core.spec :as s]
            [clojure.core :as c]
            ))




(defn -spec-to-lts-token-directed-ring [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-directed-ring.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-directed-ring [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-directed-ring")
(try
  (-spec-to-lts-token-directed-ring 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-directed-ring")

(defn -spec-to-lts-token-undirected-ring [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-undirected-ring.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-undirected-ring [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-undirected-ring")
(try
  (-spec-to-lts-token-undirected-ring 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-undirected-ring")

(defn -spec-to-lts-token-star [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-star.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-star [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-star")
(try
  (-spec-to-lts-token-star 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-star")


(defn -spec-to-lts-token-binary-tree [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-binary-tree.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-binary-tree [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-binary-tree")
(try
  (-spec-to-lts-token-binary-tree 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-binary-tree")


(defn -spec-to-lts-token-full-mesh [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-full-mesh.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-full-mesh [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-full-mesh")
(try
  (-spec-to-lts-token-full-mesh 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-full-mesh")


(defn -spec-to-lts-token-2d-mesh [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          _ (require '[clojure.core :as c])
          s (slurp "../code-generator/protocol_definitions/network_topologies/token-2d-mesh.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::token-2d-mesh [n 0])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start token-2d-mesh")
(try
  (-spec-to-lts-token-2d-mesh 1)
  (catch Exception e (.printStackTrace e)))
(println "Done token-2d-mesh")

(defn -spec-to-lts-ring [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
                     _ (require '[discourje.core.spec :as s])
                     s (slurp "../code-generator/protocol_definitions/network_topologies/ring.dcj" )
                     s (str "(do " s ")")
                     _ (eval (read-string s))
                     ast (s/session ::ring [n])
                     lts (lts/lts ast)
                     ]
    lts
))

(println "Start ring")
(try
  (-spec-to-lts-ring 1)
  (catch Exception e (.printStackTrace e)))
(println "Done ring")

(defn -spec-to-lts-mesh [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/mesh.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::mesh [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start mesh")
(try
  (-spec-to-lts-mesh 1)
  (catch Exception e (.printStackTrace e)))
(println "Done mesh")

(defn -spec-to-lts-star [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/network_topologies/star.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::star [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start star")
(try
  (-spec-to-lts-star 1)
  (catch Exception e (.printStackTrace e)))
(println "Done star")

(defn -spec-to-lts-rock-paper-scissors [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/games/rock-paper-scissors.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::rock-paper-scissors [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start rock-paper-scissors")
(try
  (-spec-to-lts-rock-paper-scissors 1)
  (catch Exception e (.printStackTrace e)))
(println "Done rock-paper-scissors")


(defn -spec-to-lts-go-fish [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/games/go-fish.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::go-fish [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start go-fish")
(try
  (-spec-to-lts-go-fish 1)
  (catch Exception e (.printStackTrace e)))
(println "Done go-fish")

(defn -spec-to-lts-tic-tac-toe [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/games/tic-tac-toe.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::tic-tac-toe [])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start tic-tac-toe")
(try
  (-spec-to-lts-tic-tac-toe 1)
  (catch Exception e (.printStackTrace e)))
(println "Done tic-tac-toe")

(defn -spec-to-lts-chess [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/games/chess.dcj" )
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::chess [])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start chess")
(try
  (-spec-to-lts-chess 1)
  (catch Exception e (.printStackTrace e)))
(println "Done chess")

(defn -spec-to-lts-cg [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/npb/cg/strict/cg.dcj")
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::cg [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start CG")
(try
  (-spec-to-lts-cg 1)
  (catch Exception e (.printStackTrace e)))
(println "Done CG")


(defn -spec-to-lts-is [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/npb/is/strict/is.dcj")
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::is [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start IS")
(try
  (-spec-to-lts-is 1)
  (catch Exception e (.printStackTrace e)))
(println "Done IS")

(defn -spec-to-lts-ft [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/npb/ft/strict/ft.dcj")
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::ft [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start FT")
(try
  (-spec-to-lts-ft 1)
  (catch Exception e (.printStackTrace e)))
(println "Done FT")

(defn -spec-to-lts-mg [^Integer n]
  (c/let [_ (require '[discourje.core.spec :refer :all])
          _ (require '[discourje.core.spec :as s])
          s (slurp "../code-generator/protocol_definitions/npb/mg/strict/mg.dcj")
          s (str "(do " s ")")
          _ (eval (read-string s))
          ast (s/session ::mg [n])
          lts (lts/lts ast)
          ]
    lts
    ))

(println "Start mg")
(try
  (-spec-to-lts-mg 1)
  (catch Exception e (.printStackTrace e)))
(println "Done mg")


