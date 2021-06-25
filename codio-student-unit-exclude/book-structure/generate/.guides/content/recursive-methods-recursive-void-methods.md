[Consider the following example:](open_file codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java panel=0 ref="public static void countdown" count=8)


```code
public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}
```

The name of the method is `countdown`; it takes a single integer as a parameter. If the parameter is 0, it displays the word `Blastoff!`. Otherwise, it displays the number and then invokes itself, passing `n - 1` as the argument.

What happens if we invoke `countdown(3)` from `main`?



> The execution of `countdown` begins with `n == 3`, and since `n` is not 0, it displays the value 3, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 2`, and since `n` is not 0, it displays the value 2, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 1`, and since `n` is not 0, it displays the value 1, and then invokes itself...
> \begin{quote}
> The execution of `countdown` begins with `n == 0`, and since `n` is 0, it displays the word `Blastoff!`\ and then returns.

The `countdown` that got `n == 1` returns.
\end{quote}
The `countdown` that got `n == 2` returns.
\end{quote}
The `countdown` that got `n == 3` returns.
\end{quote}

And then you're back in `main`. So the total output looks like this:

```code
3
2
1
Blastoff!
```

[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java panel=0)
Give the function a try here.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch08/ Examples1 )
 As a second example, we'll rewrite the methods `newLine` and `threeLine` from Section 4.1. Here they are again:

```code
public static void newLine() {
    System.out.println();
}

public static void threeLine() {
    newLine();
    newLine();
    newLine();
}
```


Although these methods work, they would not help if we wanted to display two newlines, or maybe 100. A more general alternative would be [the following:](open_file codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java panel=0 ref="public static void nLines" count=6)


```code
public static void nLines(int n) {
    if (n > 0) {
        System.out.println();
        nLines(n - 1);
    }
}
```

[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java panel=0)
Give the `nLines` function a try here.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch08/Examples1.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch08/ Examples1 )
 This method takes an integer, `n`, as a parameter and displays `n` newlines. The structure is similar to `countdown`. As long as $n$ is greater than 0, it displays a newline and then invokes itself to display $(n-1)$ additional newlines. The total number of newlines is $1 + (n - 1)$, which is just what we wanted: $n$.