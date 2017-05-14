(ns io.mstream.euler.runner.main
  (:gen-class))

(def params {"0001" [1000]
             "0002" [4000000]
             "0003" [600851475143]
             "0004" [100 1000]
             "0005" [20]
             "0006" [101]
             "0007" [10000]
             "0010" [2000000]
             "0014" [1000001]
             "0015" [20]})

(defn -main
  [solution-id]
  (let [solution-ns-name (str "io.mstream.euler.solutions.solution" solution-id)
        function-name (str solution-ns-name "/solution")]
    (require (symbol namespace))
    (print (apply (resolve (symbol function-name)) (params solution-id)))))


