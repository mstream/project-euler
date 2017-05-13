(defproject io.mstream.euler/solutions "1.0.0"
  :description "Solutions for problems from the project euler website."
  :packaging "jar"
  :aot :all
  :plugins [[lein-modules "0.3.11"]]
  :dependencies [[io.mstream.euler/utils _]
                 [org.clojure/clojure _]
                 [org.clojure/math.numeric-tower _]])
