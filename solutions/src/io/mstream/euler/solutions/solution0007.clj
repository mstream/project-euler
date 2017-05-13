(ns io.mstream.euler.solutions.solution0007
  (:require [io.mstream.euler.utils.primes :as primes])
  (:gen-class))

(defn solution
  [index]
  (loop [n 2 primes-found 0]
    (if (primes/prime? n)
      (if (= index primes-found)
        n
        (recur (inc n) (inc primes-found)))
      (recur (inc n) primes-found))))

