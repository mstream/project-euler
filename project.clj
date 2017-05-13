(defproject io.mstream.euler/euler "1.0.0"
  :description ""
  :packaging "pom"
  :plugins [[lein-modules "0.3.11"]]
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :modules {:versions {io.mstream.euler               :version
                       org.clojure/clojure            "1.8.0"
                       org.clojure/math.numeric-tower "0.0.4"}})
