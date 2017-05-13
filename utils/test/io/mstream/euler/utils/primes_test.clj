(ns io.mstream.euler.utils.primes_test
  (:require [io.mstream.euler.utils.primes :refer [prime? primes]]
            [clojure.test
             :refer [deftest is testing]]))

(deftest prime?-test
  (testing "produces expected results"
    (is (prime? 2))
    (is (prime? 3))
    (is (not (prime? 4)))
    (is (prime? 5))
    (is (not (prime? 6)))
    (is (prime? 7))
    (is (not (prime? 8)))
    (is (not (prime? 9)))
    (is (not (prime? 10)))
    (is (prime? 11))
    (is (not (prime? 12)))
    (is (prime? 13))
    (is (not (prime? 14)))
    (is (not (prime? 15)))
    (is (not (prime? 16)))
    (is (prime? 17))
    (is (not (prime? 18)))
    (is (prime? 19))
    (is (not (prime? 20)))))

(deftest primes-test
  (testing "produces expected results"
    (is (= [11 13 17 19] (primes 10 20)))))




