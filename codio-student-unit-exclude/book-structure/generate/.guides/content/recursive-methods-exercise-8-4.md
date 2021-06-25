**Exercise 8.4:**
The goal of this exercise is to translate a recursive definition into a Java method. The Ackermann function is defined for non-negative integers as follows:
$$
A(m, n) = \begin{cases}
              n+1 & \mbox{if } m = 0 \\
        A(m-1, 1) & \mbox{if } m > 0 \mbox{ and } n = 0 \\
A(m-1, A(m, n-1)) & \mbox{if } m > 0 \mbox{ and } n > 0
\end{cases}
$$

Write a recursive method called `ack` that takes two `int`s as parameters and that computes and returns the value of the Ackermann function.

Test your implementation of Ackermann by invoking it from `main` and displaying the return value.
Note the return value gets very big very quickly.
You should try it only for small values of $m$ and $n$ (not bigger than 3).
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch08/ExerciseScript.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch08/ ExerciseScript )
