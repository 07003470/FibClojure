;; define function- fib with 1 argument- n
(defn fib [n]
;; create anonymous function- fn with 4 arguments- a,b,c, seq
  ((fn [a b c seq]
  ;; anonymous function pass to conditional statement before recursion look through line 8
    (cond (= 1 n) [1]
      (= c n) seq
      :else (recur b (+ a b) (inc c) (conj seq (+ a b)))))
      ;; numbers passed as arguments through anonymous function ie a-[1] b-[1] c-[2] and vector sequence [1 1] -> line 4
  1 1 2 [1 1])) 
(defn -main [& args]
  (println "20 Fibonacci numbers"))
  (println (fib 20))

  ;; conditional statement- 
;; if n is equal to 1 produce vector of [1] line 6
;; if n is equal to c[2] return seq [1 1] line 7

;; else recursion

;; return b[1]
;; add a & b - 1 + 1 [2]
;; inc c - 2 [3]
;; conj on vector seq a - [1] b - [1]
;; add a & b - 1 + 1 [2]

;; increment arguments and vector seq-
;; first loop-
;; a - [1] b - [2] c - [3] seq [1 1 2] 
;; second loop-
;; a - [2] b - [3] c - [4] seq [1 1 2 3]
;; third loop-
;; a - [3] b - [5] c - [5] seq [1 1 2 3 5]
;; fourth loop-
;; a - [5] b - [8] c - [6] seq [1 1 2 3 5 8]
;; ++


