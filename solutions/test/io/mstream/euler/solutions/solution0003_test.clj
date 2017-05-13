(ns io.mstream.euler.solutions.solution0003_test
  (:require [io.mstream.euler.solutions.solution0003
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0003-test
  (testing "produces expected result"
    (is (= 29 (solution 13195)))))

