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

(def anonymous_function
  (fn [name] (println (str "Hi " name "!. How are you"))))

;returning functions
(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
 #(+ % inc-by))

(def inc3 (inc-maker 3))

(defn trying-loops
  []
  (loop [iteration 0]
    (println (str "Iteration " iteration))
    (if (> iteration 3)
      (println "Goodbye!")
      (recur (inc iteration))
      )
    )
  )

(defn -main
  []
  (x-chop "Annalis" "slap")
  (favorite-things "Annalis" "iphone" "mac" "ipad")
  (number-comment 7)
  (anonymous_function "Anna")
  (println (str "The answer is: " (inc3 7)))
  (trying-loops)
  )
