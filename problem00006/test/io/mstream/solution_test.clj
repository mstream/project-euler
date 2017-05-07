(ns io.mstream.solution-test
  (:require [io.mstream.solution :refer [solution]]
            [clojure.test :refer [deftest is testing]]))

(deftest solution-test
  (testing "solution"
    (is (= 2640 (solution 11)))))
