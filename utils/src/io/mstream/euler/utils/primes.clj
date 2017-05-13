(ns io.mstream.euler.utils.primes
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

(defn primes
  [from to]
  (filter
    #(not= 0 %)
    (drop
      from
      (loop [serie (vec (concat (range 0 to)))
             multiplicand 2
             multiplerIdx 2]
        (if (= multiplerIdx (dec (count serie)))
          serie
          (let [multiplier (nth serie multiplerIdx)]
            (if (zero? multiplier)
              (recur serie 2 (inc multiplerIdx))
              (let [product (* multiplicand multiplier)]
                (if (>= product (count serie))
                  (recur serie 2 (inc multiplerIdx))
                  (recur
                    (assoc serie product 0)
                    (inc multiplicand)
                    multiplerIdx))))))))))

