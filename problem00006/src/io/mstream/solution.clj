(ns io.mstream.solution
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn -main
  []
  (println
    (let [serie (range 1 101)]
      (-
        (let [sum (apply + serie)]
          (math/expt sum 2))
        (apply
          +
          (map
            #(math/expt % 2)
            serie))))))
