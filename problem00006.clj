(def serie (range 1 101))

(-
 (let [sum (apply + serie)]
   (* sum sum))
 (apply
  +
  (map
   #(* % %)
   serie)))
