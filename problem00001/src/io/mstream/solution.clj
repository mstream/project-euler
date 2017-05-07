(ns io.mstream.solution
  (:gen-class))

(defn solution
  [limit]
  (apply
    +
    (set
      (concat
        (range 0 limit 3)
        (range 0 limit 5)))))

(defn -main
  []
  (println
    (solution 1000)))


