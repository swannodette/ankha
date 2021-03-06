(defproject ankha "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156" :scope "provided"]
                 [om "0.4.2" :scope "provided"]]
  :plugins [[lein-cljsbuild "1.0.2"]]
  :source-paths ["src"]
  :profiles {:dev {:source-paths ["src" "dev"]
                   :dependencies [[compojure "1.1.6"]
                                  [ring "1.2.1"]
                                  [enlive "1.1.5"]]
                   :plugins [[com.cemerick/austin "0.1.3"]]}
             :build {:source-paths ["src"]}}
  :cljsbuild {:builds [{:id "a"
                        :source-paths ["src" "examples/a/src"]
                        :compiler {:preamble ["react/react.min.js"]
                                   :output-to "examples/a/ankha.js"
                                   :output-dir "examples/a/out"
                                   :source-map "examples/a/ankha.js.map"
                                   :optimizations :whitespace}}]})
