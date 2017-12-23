(ns core
  (:require [schema.core :as s]))

(s/defrecord Complicated
  [attr1 attr2 attr3 attr4
   attr5 attr6 attr7 attr8]
  component/Lifecycle
  (start [component]
    component)
  (stop [component]
    component))

(defcomponent empty-component
  [_ owner _]
  (:mixins [])

  (init-state [_]
    {})

  (render-state [_ state]
    (html [:div])))
