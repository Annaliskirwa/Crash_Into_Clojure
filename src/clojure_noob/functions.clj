(ns clojure-noob.functions)

(defn x-chop
  "Describe the kind of chop I wil be using"
  ([name chop-type]
   (println (str "I " chop-type " chop " name "! Take that"))))

(defn -main
  []
  (x-chop "Annalis" "slap"))
