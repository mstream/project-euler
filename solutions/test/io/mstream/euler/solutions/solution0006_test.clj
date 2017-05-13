(ns io.mstream.euler.solutions.solution0006_test
  (:require [io.mstream.euler.solutions.solution0006
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0006-test
  (testing "produces expected result"
    (is (= 2640 (solution 11)))))

