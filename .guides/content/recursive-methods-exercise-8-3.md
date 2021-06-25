**Exercise 8.3:**
In this exercise, you will use a stack diagram to understand the execution of the following recursive method:

```code
public static void main(String[] args) {
    System.out.println(prod(1, 4));
}

public static int prod(int m, int n) {
    if (m == n) {
        return n;
    } else {
        int recurse = prod(m, n - 1);
        int result = n * recurse;
        return result;
    }
}
```



1. Draw a stack diagram showing the state of the program just before the last invocation of `prod` completes.
1. What is the output of this program? (Try to answer this question on paper first; then run the code to check your answer.)
1. Explain in a few words what `prod` does (without getting into the details of how it works).
1. Rewrite `prod` without the temporary variables `recurse` and `result`. *Hint:* You need only one line for the `else` branch.

{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch08/ExerciseScript.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch08/ ExerciseScript )
