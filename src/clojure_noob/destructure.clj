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

(defn try-this
  [variable [[1 2 3]]])

(defn -main
  []
  (destructure))
