(ns io.mstream.solution
  (:gen-class))

(defn -main
  []
  (println
    (loop [n 600851475143 m 2]
      (if (= n m)
        n
        (if (zero? (mod n m))
          (recur (/ n m) m)
          (recur n (inc m)))))))
