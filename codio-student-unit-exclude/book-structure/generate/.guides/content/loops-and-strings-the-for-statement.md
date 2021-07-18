The loops we have written so far have three parts in common. They start by initializing a variable, they have a condition that depends on that variable, and they do something inside the loop to update that variable.


Running the same code multiple times is called **iteration**. It's so common that there is another statement, the `for` loop, that expresses it more concisely. For example, we can rewrite the 2-4-6-8 loop [ this way:](open_file code/ch06/Loops.java panel=0 ref="appreciate2" count=6)


```code
for (int i = 2; i <= 8; i += 2) {
    System.out.print(i + ", ");
}
System.out.println("Who do we appreciate?");
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=6)
 To see the output of this function, comment out all other code in the main function besides lines 79 and 80. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )
 `for` loops have three components in parentheses, separated by semicolons: the initializer, the condition, and the update:



1. The *initializer* runs once at the very beginning of the loop. It is equivalent to the line before the `while` statement.
1. The *condition* is checked each time through the loop. If it is `false`, the loop ends. Otherwise, the body of the loop is executed (again).
1. At the end of each iteration, the *update* runs, and we go back to step 2.



The `for` loop is often easier to read because it puts all the loop-related statements at the top of the loop. Doing so allows you to focus on the statements inside the loop body. Figure 6.2 illustrates `for` loops with a flowchart.


![Figure 6.2 Flow of execution for a `for` loop.](figs/for.jpg)

**Figure 6.2 Flow of execution for a `for` loop.**

There is another difference between `for` loops and `while` loops: if you declare a variable in the initializer, it exists only *inside* the `for` loop. For example:

```code
for (int n = 3; n > 0; n--) {
    System.out.println(n);
}
System.out.println("n is now " + n);  // compiler error
```

The last line tries to display `n` (for no reason other than demonstration), but it won't work. If you need to use a loop variable outside the loop, you have to declare it {\em outside} the loop, [ like this:](open_file code/ch06/Loops.java panel=0 ref="loopvar" count=7)


```code
int n;
for (n = 3; n > 0; n--) {
    System.out.println(n);
}
System.out.println("n is now " + n);
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=7)
 To see the output of this function, comment out all other code in the main function besides lines 82 and 83. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )
 Notice that the `for` statement does not say `int n = 3`. Rather, it simply initializes the existing variable `n`.