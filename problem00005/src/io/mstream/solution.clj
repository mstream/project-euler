(ns io.mstream.solution
  (:require [clojure.math.numeric-tower :as math])
  (:gen-class))

(defn prime-factors
  [n]
  (loop [n n m 2 p []]
    (if (= n m)
      (concat p [m])
      (if (zero? (mod n m))
        (recur (/ n m) m (concat p [m]))
        (recur n (inc m) p)))))

(defn -main
  []
  (println
    (reduce
      *
      (map
        (fn [[k v]] (math/expt k v))
          (apply
            merge-with max
            (map
              frequencies
              (map prime-factors (range 2 20))))))))
