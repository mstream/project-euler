(ns io.mstream.solution
  (:gen-class))

(defn -main
  []
  (println
    (let [serie (range 10 1000)]
      (apply
        max
        (filter
          #(= (seq (str %)) (reverse (str %)))
          (for [x serie y serie]
            (* x y)))))))


