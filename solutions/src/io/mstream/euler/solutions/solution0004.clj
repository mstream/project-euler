(ns io.mstream.euler.solutions.solution0004
  (:gen-class))

(defn solution
  [from to]
  (let [serie (range from to)]
    (apply
      max
      (filter
        #(= (seq (str %)) (reverse (str %)))
        (for [x serie y serie]
          (* x y))))))

(defn -main
  []
  (println
    (solution 100 1000)))

