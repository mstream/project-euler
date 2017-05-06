(apply 
 +
 (filter
  even?
  (loop [serie [1 2] max 4000000] 
    (let [next (apply + (take-last 2 serie))] 
      (if (<= next max) 
        (recur (concat serie [next]) max) 
        serie)))))
