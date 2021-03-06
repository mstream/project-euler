(ns io.mstream.euler.solutions.solution0002
  (:gen-class))

(defn solution
  [limit]
  (apply
    +
    (filter
      even?
      (loop [serie [1 2]]
        (let [next (apply + (take-last 2 serie))]
          (if (<= next limit)
            (recur (concat serie [next]))
            serie))))))
