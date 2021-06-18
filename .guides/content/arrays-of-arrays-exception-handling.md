So far, the only exceptions you have seen are run-time errors like “array index out of bounds” and “null pointer”. When one of these exceptions occurs, Java displays a message and ends the program.

If you don't want the program to end, you can handle exceptions with a `try`-`catch` statement. The syntax is similar to an `if`-`else` statement, and the logic is, too. Here's what it looks like:


```code
try {
    Thread.sleep(500);
} catch (InterruptedException e) {
    // do nothing
}
```

First, Java runs the code in the try block, which calls `Thread.sleep` in this example. If an `InterruptedException` occurs during the try block, Java executes the catch block. In this example, the catch block contains a comment, so it doesn't do anything.

If a different exception occurs during the try block, Java does whatever it would do otherwise, which is probably to display a message and end the program. If no exceptions occur during the try block, the catch block doesn't run and the program continues.

In this example, the effect of the `try`-`catch` statement is to ignore an “interrupted” exception if it occurs. As an alternative, we could use the catch block to display a customized message, end the program, or handle the exception in whatever way is appropriate. For example, if user input causes an exception, we could catch the exception and prompt the user to try again later.

There's more to learn about exception handling. You can read about exceptions in the Java tutorials (see [https://thinkjava.org/exceptions](https://thinkjava.org/exceptions)).