(apply 
 max
 (filter
  #(= (seq (str %)) (reverse (str %)))  
  (for [x (range 10 1000) y (range 10 1000)] 
    (* x y))))
