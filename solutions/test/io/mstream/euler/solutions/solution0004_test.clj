(ns io.mstream.euler.solutions.solution0004_test
  (:require [io.mstream.euler.solutions.solution0004
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0004-test
  (testing "produces expected result"
    (is (= 9009 (solution 10 100)))))

