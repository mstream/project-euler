(ns io.mstream.euler.solutions.solution0007
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn prime?
  [n]
  (let [dividers (range 2 (inc (math/floor (math/sqrt n))))]
    (every?
      false?
      (map
        #(zero? (mod n %))
        dividers))))

(defn solution
  [index]
  (loop [n 2 primes-found 0]
    (if (prime? n)
      (if (= index primes-found)
        n
        (recur (inc n) (inc primes-found)))
      (recur (inc n) primes-found))))

(defn -main
  []
  (println
    (solution 10000)))
