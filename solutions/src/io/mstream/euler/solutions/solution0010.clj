(ns io.mstream.euler.solutions.solution0010
  (:gen-class))

(defn solution
  [limit]
  (dec
    (apply
      +
      (loop [serie (vec (concat (range 0 limit)))
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

(defn -main
  []
  (println
    (solution 2000000)))

