(ns io.mstream.euler.solutions.solution0014
  (:require [io.mstream.euler.utils.primes :as primes])
  (:gen-class))

(defn collatz
  [n]
  (if (even? n)
    (/ n 2)
    (inc (* 3 n))))

(defn collatz-length
  [n]
  (loop [n n length 1]
    (if (= 1 n)
      length
      (recur (collatz n) (inc length)))))

(defn solution
  [limit]
  (key
    (apply
      max-key val
      (into
        {}
        (map #(vector % (collatz-length %))
             (range 2 limit))))))


