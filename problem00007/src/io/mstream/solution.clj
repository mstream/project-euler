(ns io.mstream.solution
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn is-prime
  [n]
  (let [dividers (range 2 (inc (math/floor (math/sqrt n))))]
    (every?
      false?
      (map
        #(zero? (mod n %))
        dividers))))

(defn -main
  []
  (println
    (loop [n 2 primes-found 0]
      (if (is-prime n)
        (if (= 10000 primes-found)
          n
          (recur (inc n) (inc primes-found)))
        (recur (inc n) primes-found)))))
