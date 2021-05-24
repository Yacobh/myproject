(ns scramble-ui.core)

  (println "hello world")
;(.render js/ReactDOM
;  (.createElement js/React "h2" nil "Hello, React!")
;  (.getElementById js/document "app"))

;(.render js/ReactDOM
;  (.createElement js/React "p" nil "Writing some more HTML. Cool")
;  (.getElementById js/document "app"))


;(def input-element (.getElementById js/document "str1"))
;(def button-element (.getElementById js/document "submit"))
;(def result-element (.getElementById js/document "result"))

;(defn submit [evt]
;  (let [years (js/parseInt (.-value input-element))
;        days (* 365 years)]
;    (set! (.-innerHTML result-element)
;      (str "You are about " days " days old."))))

;(set! (.-onclick button-element) submit)
