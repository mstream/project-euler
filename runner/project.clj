(defproject io.mstream.euler/runner "1.0.0"
  :description "Runner for solutions."
  :packaging "jar"
  :aot :all
  :main io.mstream.euler.runner.main
  :plugins [[lein-modules "0.3.11"]]
  :dependencies [[io.mstream.euler/solutions _]
                 [org.clojure/clojure _]])
