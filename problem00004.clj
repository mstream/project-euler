(def serie (range 10 1000))

(apply
 max
 (filter
  #(= (seq (str %)) (reverse (str %)))
  (for [x serie y serie]
    (* x y))))
