(defproject cljfmt-defrecord-formatting-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :plugins [[lein-cljfmt "0.5.7"]]
  :cljfmt {:indents {defcomponent [[:block 1] [:inner 1]]
                     s/defrecord [[:block 1] [:inner 1]]}})
