(ns io.mstream.euler.solutions.solution0010
  (:require [io.mstream.euler.utils.primes :as primes])
  (:gen-class))

(defn solution
  [limit]
  (apply + (primes/primes 2 limit)))


