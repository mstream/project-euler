(ns io.mstream.euler.solutions.solution0005_test
  (:require [io.mstream.euler.solutions.solution0005
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0005-test
  (testing "produces expected result"
    (is (= 2520 (solution 10)))))

