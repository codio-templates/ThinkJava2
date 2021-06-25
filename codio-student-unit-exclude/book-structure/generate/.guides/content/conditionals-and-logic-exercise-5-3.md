Fermat's Last Theorem says that there are no integers $a$, $b$, $c$, and $n$ such that $a^n + b^n = c^n$, except when $n \leq 2$.

Write a program named *Fermat.java* that inputs four integers (`a`, `b`, `c`, and `n`) and checks to see if Fermat's theorem holds. If $n$ is greater than 2 and $a^n + b^n = c^n$, the program should display “Holy smokes, Fermat was wrong!” Otherwise, the program should display “No, that doesn't work.”

*Hint:* You might want to use `Math.pow`.

{Run!|terminal}(sh .guides/bg.sh javac code/ch05/Fermat.java java -cp code/ch05/ Fermat 4)