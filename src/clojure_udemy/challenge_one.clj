(ns clojure-udemy.challenge-one
  (:gen-class))

;; We want a function that gives us the age of a pet in human years
;; for a dog we multiply x7
;; for cats we multiply x5
;; for a goldfish we multiply x10
;; use pet-to-age map
;; use a keyword get


(def pet-to-age 
  {:cat 5, :dog 7, :goldfish 10})
pet-to-age

(:cat pet-to-age)

(def cat-age 3)
(def cat-type :cat)

(defn get-human-years
  "Return number of human years for a pet of age 'age and type 'pet-type"
  [age pet-type]
  (* (pet-type pet-to-age) age))

(get-human-years 7 :cat)
(get-human-years 7 :dog)

(get-human-years cat-age cat-type)

;; seems to be working for now right?