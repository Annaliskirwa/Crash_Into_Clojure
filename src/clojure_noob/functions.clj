(ns clojure-noob.functions)

(defn x-chop
  "Describe the kind of chop I wil be using"
  ([name chop-type]
   (println (str "I " chop-type " chop " name "! Take that"))))

(defn favorite-things
  [name & things]
  (println (str "Hi " name " here are my favorite things: "
                  (clojure.string/join "," things))))

(defn number-comment
  [x]
  (if (> x 6)
    "Oh my gosh! What a big number!"
    "That number's OK, I guess"))

(defn -main
  []
  (x-chop "Annalis" "slap")
  (favorite-things "Annalis" "iphone" "mac" "ipad")
  (number-comment 7)
  )
