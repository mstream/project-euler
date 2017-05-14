(ns io.mstream.euler.solutions.solution0014_test
  (:require [io.mstream.euler.solutions.solution0014
             :refer [solution]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest solution0014-test
  (testing "produces expected result"
    (is (= 3 (solution 5)))
    (is (= 9 (solution 10)))
    (is (= 9 (solution 15)))
    (is (let [result (solution 20)] (or (= 18 result) (= 19 result))))))
