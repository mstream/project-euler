(ns io.mstream.euler.solutions.solution0006
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn solution
  [limit]
  (let [serie (range 1 limit)]
    (-
      (math/expt (apply + serie) 2)
      (apply
        +
        (map
          #(math/expt % 2)
          serie)))))

(defn -main
  []
  (println
    (solution 101)))
