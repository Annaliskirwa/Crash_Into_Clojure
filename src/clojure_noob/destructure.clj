(ns clojure-noob.destructure)

(def my-vector [:a :b :c :d])

(def my-vector1 [:1 :2 :3 :4 :5])

(def my-vector2 [:a :b :c :d [:q :w]])

(def my-nested-vector [:a :b :c :d [:x :y :z]])


(defn destructure
  []
  (let [[a _ _ d [x y z]] my-nested-vector]
    (println a d x y z))

  (let [[a] my-vector]
    (println a ))

  (let [[a _ b] my-vector1]
    (println 1 2))

  (let [[& the-rest] my-vector]
    (println the-rest))

  (let [[:as all] my-vector2]
    (println all))
  )

;(defn try-this
;  [variable [[1 2 3]]])

;; Return the first element of a collection
(defn my-first
  [[first-thing]] ; Notice that first-thing is within a vector
  (println first-thing))

(defn chooser
  [{:keys [name age city] :as args}
   [first-choice second-choice & unimportant-choices]]
  ;[{:keys [name age city] :as args}]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " (clojure.string/capitalize second-choice)))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case you need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))
;(chooser {:name "Annalis" :age 25 :city "Nairobi"})

(defn other-fn
  "docstring"
  [{:keys [name city] :as args} b]
  )
(other-fn {:name "Annalis" :age 25 :city "Nairobi"} "me")

(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))
(defn -main
  []
  (destructure)
  (my-first ["Annalis" "Kirwa"])
  (println (str "----The next method---" (:name chooser)))
  (chooser {:name "Annalis" :age 25 :city "Nairobi"} ["a" "b" "c" "d" "e"])
  (announce-treasure-location{:lat 28.22 :lng 81.33})
  )
