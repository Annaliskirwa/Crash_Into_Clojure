(ns clojure-noob.destructure)

(def my-vector [:a :b :c :d])

(def my-nested-vector [:a :b :c :d [:x :y :z]])


(defn destructure
  []
  (let [[a _ _ d [x y z]] my-nested-vector]
    (println a d x y z))

  (let [[a] my-vector]
    (println a ))
  )

(defn -main
  []
  (destructure))
