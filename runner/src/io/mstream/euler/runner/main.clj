(ns io.mstream.euler.runner.main
  (:require [io.mstream.euler.solutions.solution0001
             :refer [solution]
             :rename {solution solution0001}]
            [io.mstream.euler.solutions.solution0002
             :refer [solution]
             :rename {solution solution0002}]
            [io.mstream.euler.solutions.solution0003
             :refer [solution]
             :rename {solution solution0003}]
            [io.mstream.euler.solutions.solution0004
             :refer [solution]
             :rename {solution solution0004}]
            [io.mstream.euler.solutions.solution0005
             :refer [solution]
             :rename {solution solution0005}]
            [io.mstream.euler.solutions.solution0006
             :refer [solution]
             :rename {solution solution0006}]
            [io.mstream.euler.solutions.solution0007
             :refer [solution]
             :rename {solution solution0007}]
            [io.mstream.euler.solutions.solution0010
             :refer [solution]
             :rename {solution solution0010}])
  (:gen-class))

(def solutions {"0001" {:function solution0001
                        :params   [1000]}
                "0002" {:function solution0002
                        :params   [4000000]}
                "0003" {:function solution0003
                        :params   [600851475143]}
                "0004" {:function solution0004
                        :params   [100 1000]}
                "0005" {:function solution0005
                        :params   [20]}
                "0006" {:function solution0006
                        :params   [101]}
                "0007" {:function solution0007
                        :params   [10000]}
                "0010" {:function solution0010
                        :params   [2000000]}})

(defn -main
  [solution-id]
  (let [solution (solutions solution-id)]
    (if (nil? solution)
      (println "solution not found")
      (println (str "solution: "
                    (apply (solution :function) (solution :params)))))))

