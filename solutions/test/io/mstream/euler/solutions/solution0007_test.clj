(ns io.mstream.euler.solutions.solution0007_test
  (:require [io.mstream.euler.solutions.solution0007
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0007-test
  (testing "produces expected result"
    (is (= 13 (solution 5)))))


