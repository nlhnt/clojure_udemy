(ns clojure-udemy.functions-tutorial
  (:gen-class))

;; this is my 3rd attempt to write anything good with this language...
(defn -main
  "My docstring - optional"
  [] ;; params
  ;; body of the function
  (println "My name is xyz")
  (println "2nd function call in body")
  ;;   last part is the return
  (+ 2 5))

;; minus sign says this is available only for functions-tutorial namespace
(-main)

;; lambda functions
(#(println "Hello" %) "John")

((fn [% %2 %3] (println "Hello" % %2 %3)) "John" "Kerb" "Boots")

;; You might ask why would I even learn this, well I want to do some web frontend but don't want to learn JS

(def increment (fn [x] (+ 1 x)))

(increment 2)

;; ofc clojure has a built-in increment
(inc 2)

;; coll as in collection
(defn increment_set [coll] (
                        map increment coll
))
(increment_set [1 2 3])

;; for now this is simple
;; we'll see later on
;; I already tried haskell and f#, they seem to have a better syntax, not lisp-like
;; but I want to do some javascript and jvm and I don't trust MS with their vendor lock
;; i.e. ms doesn't allow dotnet core debugger to be used outside of their editors (VSC, VS etc.)
