Now, to display a number in binary, we can combine the algorithm from the previous section and the “count up” pattern from Section 8.5.

[Here](open_file code/ch08/Examples4.java panel=0 ref="public static void displayBinary" count=6) is a recursive method that displays any positive integer in binary:
[Click to remove the highlight.](open_file code/ch08/Examples4.java panel=0)


```code
public static void displayBinary(int value) {
    if (value > 0) {
        displayBinary(value / 2);
        System.out.print(value % 2);
    }
}
```

If `value` is `0`, `displayBinary` does nothing (that's the base case). If the argument is positive, the method divides it by 2 and calls `displayBinary` recursively. When the recursive call returns, the method displays one digit of the result and returns (again). Figure 8.3 illustrates this process.


![Figure 8.3 Stack diagram for the `displayBinary` method.](figs/stack4.jpg)

**Figure 8.3 Stack diagram for the `displayBinary` method.**

The leftmost digit is near the bottom of the stack, so it gets displayed first. The rightmost digit, near the top of the stack, gets displayed last. After invoking `displayBinary`, we use `println` to complete the output:

```code
displayBinary(23);      // output is 10111
System.out.println();
```

Test and run the code here.
{Run!}(sh .guides/bg.sh javac code/ch08/Examples4.java java -cp code/ch08/ Examples4 )
