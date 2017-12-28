(ns conditional
  #?@(:cljs
      [(:require
        [cljs.reader :as reader])]
      :clj
      [(:require
        [clojure.tools.reader :as reader])]))

(reader/some-fake-macro arg1
  [arg2 arg3]
  arg4
  arg5)
