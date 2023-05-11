(ns clojure-noob.core
  (:gen-class))
(defrecord Person [name age])

( defn create-person []
  (Person. "Alice" 25))

(defn print-person [person]
  (println (str "Name: " (:name person) ", Age: " (:age person))))

(defn error-message
  [severity]
  (println (str "OH GOD! IT IS A DISASTER! WE ARE "
                (if (= severity :mild)
                  "MILDY INCONVINIENCED!"
                  "DOOOMMED!"))))

(defn check-age [age]
  (if (>= age 18)
    (println "You are an adult.")
    (println "You are a minor.")))

(def my-map {:name "Annalis" :age 25 :city "Nairobi"})

(defn hello []
  "Goodbye, Mars!"
  (println (str "\"Hello, World!\"")))

(defn conditionals []
  (if true
    (println (str "Hello, " (:name my-map)))
    (println (str "Never see this")))
    (when true
    (println "Success")))

(defn -main []
  (check-age 16)
  (error-message :mild)
  (let [person (create-person)]
    (print-person person))
  (conditionals)
  (hello)

  )


