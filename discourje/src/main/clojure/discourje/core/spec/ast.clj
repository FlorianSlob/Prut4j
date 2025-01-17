(ns discourje.core.spec.ast
  (:refer-clojure :exclude [send cat loop]))

;;;;
;;;; Registries
;;;;

(def role-names (atom (hash-map)))

(defn put-role-name! [k name]
  {:pre [(keyword? k)
         (string? name)]}
  (swap! role-names (fn [m] (into m {k name}))))

(defn get-role-name [k]
  {:pre [(keyword? k)]}
  (if-let [name (get @role-names k)]
    name
    (throw (Exception. (str "Unable to resolve key: " k " in registry of role names")))))

(def asts (atom (hash-map)))

(defn put-ast! [k vars body]
  {:pre [(keyword? k)]}
  (swap! asts
         (fn [m]
           (if (contains? m k)
             (update m k #(into % {(count vars) {:vars vars, :body body}}))
             (into m {k {(count vars) {:vars vars, :body body}}})))))

(defn get-ast
  [k n]
  {:pre [(keyword? k)
         (number? n)]}
  (if-let [m (get @asts k)]
    (if-let [ast (get m n)]
      ast
      (throw (Exception. (str "Wrong number of args (" n ") passed to: " k))))
    (throw (Exception. (str "Unable to resolve key: " k " in registry of sessions")))))

;;;;
;;;; Predicates
;;;;

(defrecord Predicate [expr])

(defn predicate? [x]
  (instance? Predicate x))

(defn predicate [expr]
  {:pre []}
  (->Predicate expr))

;;;;
;;;; Roles
;;;;

(defrecord Role [name-expr index-exprs])

(defn role? [x]
  (instance? Role x))

(defn role
  ([expr]
   {:pre [(or (not (coll? expr)) (seq? expr))]}
   (cond
     (not (coll? expr)) (role expr [])
     (seq? expr) (role (first expr) (vec (rest expr)))))
  ([name-expr index-exprs]
   {:pre [(or (string? name-expr) (symbol? name-expr) (keyword? name-expr))
          (vector? index-exprs)]}
   (->Role name-expr index-exprs)))

;;;;
;;;; Actions
;;;;

(defrecord Action [op predicate sender receiver])

(defn action? [x]
  (= (type x) Action))

(defn action [op predicate sender receiver]
  {:pre [(contains? #{:handshake :send :receive :close} op)
         (or (predicate? predicate) (symbol? predicate))
         (or (role? sender) (symbol? sender))
         (or (role? receiver) (symbol? receiver))]}
  (->Action op predicate sender receiver))

(defn handshake [predicate sender receiver]
  (action :handshake predicate sender receiver))

(defn send [predicate sender receiver]
  (action :send predicate sender receiver))

(defn receive [sender receiver]
  (action :receive (predicate '(fn [__] true)) sender receiver))

(defn close [sender receiver]
  (action :close (predicate '(fn [__] true)) sender receiver))

;;;;
;;;; Nullary operators
;;;;

(defrecord Nullary [op])

(defn skip []
  (->Nullary :skip))

;;;;
;;;; Multiary operators
;;;;

(defrecord Multiary [op branches])

(defn cat [branches]
  (->Multiary :cat branches))
(defn alt [branches]
  (->Multiary :alt branches))
(defn par [branches]
  (->Multiary :par branches))
(defn async [branches]
  (->Multiary :async branches))

(defrecord Every [op ast-f vars exprs branch])

(defn every
  ([ast-f bindings branch]
   (let [vars (take-nth 2 bindings)
         exprs (take-nth 2 (rest bindings))]
     (every ast-f vars exprs branch)))
  ([ast-f vars exprs branch]
   (->Every :every ast-f vars exprs branch)))

;;;;
;;;; "Special forms" operators
;;;;

(defrecord If [op test-expr then else])

(defn if [test-expr then else]
  (->If :if test-expr then else))

(defrecord Loop [op name vars exprs body])

(defn loop
  ([name bindings body]
   (let [vars (take-nth 2 bindings)
         exprs (take-nth 2 (rest bindings))]
     (loop name vars exprs body)))
  ([name vars exprs body]
   (->Loop :loop name vars exprs body)))

(defrecord Recur [op name exprs])

(defn recur [name exprs]
  (->Recur :recur name exprs))

;;;;
;;;; Misc operators
;;;;

(defn- parse-predicate [s]
  (predicate (read-string s)))

(defn- parse-role [s]
  (if (clojure.string/includes? s "[")
    (let [name-expr (subs s 0 (clojure.string/index-of s "["))
          index-exprs (mapv read-string
                            (clojure.string/split (subs s
                                                        (inc (clojure.string/index-of s "["))
                                                        (dec (count s)))
                                                  #"\]\["))]
      (role name-expr index-exprs))
    (role s)))

(defn- parse-action
  ([s]
   (parse-action (case (first s)
                   \‽ :handshake
                   \! :send
                   \? :receive
                   \C :close
                   (throw (Exception.)))
                 (subs s 2 (dec (count s)))))
  ([op s]
   (let [s (if (contains? #{:handshake :send} op)
             s
             (str "(fn [_] true)," s))
         tokens (clojure.string/split s #"\,")
         predicate (parse-predicate (nth tokens 0))
         sender (parse-role (nth tokens 1))
         receiver (parse-role (nth tokens 2))]
     (action op predicate sender receiver))))

(defrecord Graph [op v edges])

(defn graph [v0 edges]
  (->Graph :graph
           v0
           (clojure.core/loop [edges edges
                               source->action->targets {}]
             (if (empty? edges)
               source->action->targets
               (recur (rest edges)
                      (let [transition (first edges)
                            source (nth transition 0)
                            label (nth transition 1)
                            target (nth transition 2)
                            action (parse-action label)]
                        (if-let [action->targets (get source->action->targets source)]
                          (if-let [targets (get action->targets action)]
                            (assoc source->action->targets source (assoc action->targets action (conj targets target)))
                            (assoc source->action->targets source (assoc action->targets action [target])))
                          (assoc source->action->targets source {action [target]}))))))))

;;;;
;;;; Sessions
;;;;

(defrecord Session [op name exprs])

(defn session [name exprs]
  (->Session :session name exprs))