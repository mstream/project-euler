(ns io.mstream.euler.solutions.solution0010_test
  (:require [io.mstream.euler.solutions.solution0010
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0010-test
  (testing "produces expected result"
    (is (= 17 (solution 10)))))


