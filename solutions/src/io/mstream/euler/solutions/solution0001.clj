(ns io.mstream.euler.solutions.solution0001
  (:gen-class))

(defn solution
  [limit]
  (apply
    +
    (set (concat
           (range 0 limit 3)
           (range 0 limit 5)))))

