(defproject gorilla-test  "0.1.0-SNAPSHOT"
  :description  "A test project for Gorilla REPL."
  :dependencies  [[org.clojure/clojure  "1.10.0"]
                  [hellonico/clojure-tensorflow "0.3.0"]]
  :main ^:skip-aot gorilla-test.core
  :target-path  "target/%s"
  :plugins  [[lein-gorilla  "0.4.0"]]
  :profiles  {:uberjar  {:aot :all}})
