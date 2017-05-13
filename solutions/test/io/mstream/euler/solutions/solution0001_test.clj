(ns io.mstream.euler.solutions.solution0001_test
  (:require [io.mstream.euler.solutions.solution0001
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0001-test
  (testing "produces expected result"
    (is (= 23 (solution 10)))))
