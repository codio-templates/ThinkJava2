Following the flow of execution is one way to read programs, but it can quickly become overwhelming. Another way to understand recursion is the **leap of faith**: when you come to a method invocation, instead of following the flow of execution, you *assume* that the method works correctly and returns the appropriate value.

In fact, you are already practicing this leap of faith when you use methods in the Java library. When you invoke `Math.cos` or `System.out.println`, you don't think about the implementations of those methods. You just assume that they work properly.

The same is true of other methods. For example, consider the method from Section 5.8 that determines whether an integer has only one digit:

```code
public static boolean isSingleDigit(int x) {
    return x > -10 && x < 10;
}
```

Once you convince yourself that this method is correct---by examining and testing the code---you can just use the method without ever looking at the implementation again.

Recursive methods are no different. When you get to a recursive call, don't think about the flow of execution. Instead, *assume* that the recursive call produces the desired result.

For example, “Assuming that I can find the factorial of $n-1$, can I compute the factorial of $n$?” Yes you can, by multiplying by $n$. Here's an implementation of `factorial` with the temporary variables removed:

```code
public static int factorial(int n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
```

Notice how similar this version is to the original mathematical definition:
$$
0! = 1 \\
n! = n \cdot(n-1)!
$$
Of course, it is strange to assume that the method works correctly when you have not finished writing it. But that's why it's called a leap of faith!




Another common recursively defined mathematical function is the Fibonacci sequence, which has the following definition:
$$
&& fibonacci(1) = 1 \\
&& fibonacci(2) = 1 \\
&& fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
$$
Notice that each Fibonacci number is the sum of the two preceding Fibonacci numbers. Translated into Java, [this function is as follows:](open_file code/ch08/Series2.java panel=0 ref="public static int fibonacci" count=6)
[Remove highlighting](open_file code/ch08/Series2.java panel=0)


```code
public static int fibonacci(int n) {
    if (n == 1 || n == 2) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

If you try to follow the flow of execution here, even for small values of `n`, your head will explode. But if we take a leap of faith and assume that the two recursive invocations work correctly, then it is clear, looking at the definition, that our implementation is correct.

Run the complete example java code and fibonacci function in the left pane. To compile and run the code, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch08/Series2.java java -cp code/ch08/ Series2 )
