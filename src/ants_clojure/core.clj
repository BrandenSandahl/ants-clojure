(ns ants-clojure.core
  (:require [clojure.java.io :as io])
  (:import [javafx.application Application]
           [javafx.fxml FXMLLoader]
           [javafx.scene Scene])
  (:gen-class :extends javafx.application.Application))

(defn -start [app stage]
  (let [root (FXMLLoader/load (io/resource "main.fxml"))
        scene (Scene. root 800 600)]
    (.setTitle stage "Ants")
    (.setScene stage scene)
    (.show stage)))

(defn -main []
  (Application/launch ants_clojure.core (into-array String [])))
