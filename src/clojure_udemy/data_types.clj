(ns clojure-udemy.data-types
  (:gen-class))

(defn -main
  []
;;   (identity 1)
  1)

(-main)

((defn data-types []
   (def a 1)
;;   shadowing
   (def a 1.25)
   (def a 1.25e-12)
;;   hexadecimal values
   (def a 0xfbfc)

   (def a nil)

   (def a true)

   (def a "string")
;;   keyword
   (def a 'thanks)
;;    other keys
   (def a :thanks)

   (println a)))
;; (data-types)

;; sorry im following some basic udemy for now
;; later on we'll trry to do something cooler like a simple webpage and mix it with some htmx frontend?
;; https://biffweb.com/

;; operators
;; in clj these are wrapped in functions like in any other functional language
;; I have some books on c++ and golang functional approaches as well... maybe one day
;; not really sure if c++ makes much sense to me nowadays.
;; though I got one project where I could use it instead of backend - it controls some serial ports to control arduino - but any lang can do that.

;; I want to learn emacs as well, started doing that recently - but it doesnt work too well on my windows, I got endevourOS install as well
;; so maybe i'll try there instead or recompilee macs with msys64

;; there seems to be some cool things with the notation in functional languages, and lisp as well
;; we dont have to worry about operator precedence

;; example
;; while in other languages it looks like the maths we learn in school, we dont usually use "polish notation" like functional 
;; languages do
;; 2 + 5 / 3 - 1, here we have to remember, division will be executed before addition and subtraction
;; below we dont have to worry about it
(- (/ (+ 2 5) 3) 1)

;; compound data types
;; dammit calva, stop messing with my alt button...
;; set
;; sets are tree based in clojure
;; not really a set now is it, I see a PersistentArrayMap heheehe
;; oooh what I've written is a representation of a set 
;; but we create it using (set '(a  b c))
;; (def myexamplishset {1, 42, 1.5, "pet", 'cat, 'sad})
(def myexamplishset (set '(1, 42, 1.5, "pet", 'cat, 'sad)))
(type myexamplishset)

;; so besides sets we also have hashmaps, vectors and lists
;; vectors are basically python lists (where you can pop and append from/to the end of the vector)
;; lists however you pop and appen from its head, watch
(def myvector [1 2 3])
(type myvector)
(pop myvector) ;; [ 1 2], we popped 3
(last myvector)
(second myvector)
(cons 1 myvector)
(conj [1] myvector)
;; (cons)

;; now we have a list
;; here: https://clojuredocs.org/search?q=list
(def mylist (list 1 2 3))
(type mylist)
(pop mylist) ;; (2, 3), we popped 1
(first mylist)

;; basically to get stuff semi-right 80% of time you should learn all the operations on sequences in clojure
;; does not sound that hard, does it?
;; lets do a challenge