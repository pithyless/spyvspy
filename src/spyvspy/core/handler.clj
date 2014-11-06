(ns spyvspy.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [clojure.edn :as edn]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(def world (atom {}))

(defroutes app-routes
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
