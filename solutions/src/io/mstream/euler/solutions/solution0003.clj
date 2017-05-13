(ns io.mstream.euler.solutions.solution0003
  (:gen-class))

(defn solution
  [number]
  (loop [n number m 2]
    (if (= n m)
      n
      (if (zero? (mod n m))
        (recur (/ n m) m)
        (recur n (inc m))))))

(defn -main
  []
  (println
    (solution 600851475143)))

