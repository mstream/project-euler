(ns io.mstream.euler.solutions.solution0002_test
  (:require [io.mstream.euler.solutions.solution0002
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0002-test
  (testing "produces expected result"
    (is (= 44 (solution 90)))))

