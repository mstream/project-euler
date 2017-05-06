(ns io.mstream.solution
  (:gen-class))

(defn -main
  []
  (println
    (apply
      +
      (set (concat
             (range 0 1000 3)
             (range 0 1000 5))))))


