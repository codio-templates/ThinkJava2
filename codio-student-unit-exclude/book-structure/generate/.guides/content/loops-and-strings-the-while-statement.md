Using a ```while``` statement, we can repeat the same code [ multiple times:](open_file code/ch06/Loops.java panel=0 ref="countdown" count=7)


```code
int n = 3;
while (n > 0) {
    System.out.println(n);
    n = n - 1;
}
System.out.println("Blastoff!");
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=7)
 To see the output of this function, comment out all other code in the main function besides lines 67 and 68. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )
 Reading the code in English sounds like this: “Start with `n` set to 3. While `n` is greater than 0, print the value of `n`, and reduce the value of `n` by 1. When you get to 0, print Blastoff!”


The flow of execution for a `while` statement is as follows:



1. Evaluate the condition in parentheses, yielding `true` or `false`.
1. If the condition is `false`, skip the following statements in braces.
1. If the condition is `true`, execute the statements and go back to step 1.




This type of flow is called a **loop**, because the last step “loops back around” to the first. Figure 6.1 shows this idea using a flowchart.

![Figure 6.1 Flow of execution for a `while` loop.](figs/while.jpg)

**Figure 6.1 Flow of execution for a `while` loop.**


The **body** of the loop should change the value of one or more variables so that, eventually, the condition becomes `false` and the loop terminates. Otherwise, the loop will repeat forever, which is called an **infinite loop**:

```code
int n = 3;
while (n > 0) {
    System.out.println(n);
    // n never changes
}
```

This example will print the number `3` forever, or at least until you terminate the program. An endless source of amusement for computer scientists is the observation that the directions on shampoo, “Lather, rinse, repeat,” are an infinite loop.

In the first example, we can prove that the loop terminates when `n` is positive. But in general, it is not so easy to tell whether a loop terminates. For example, this loop continues until ```n``` is 1 (which makes the condition [ false):](open_file code/ch06/Loops.java panel=0 ref="sequence" count=11)


```code
while (n != 1) {
    System.out.println(n);
    if (n % 2 == 0) {         // n is even
        n = n / 2;
    } else {                  // n is odd
        n = 3 * n + 1;
    }
}
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=11)
 To see the output of this function, comment out all other code in the main function besides lines 70 and 71. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )
 Each time through the loop, the program displays the value of `n` and then checks whether it is even or odd. If it is even, the value of `n` is divided by 2. If it is odd, the value is replaced by $3n+1$. For example, if the starting value is 3, the resulting sequence is 3, 10, 5, 16, 8, 4, 2, 1.

Since `n` sometimes increases and sometimes decreases, there is no obvious proof that `n` will ever reach 1 and that the program will ever terminate. For some values of `n`, such as the powers of two, we can prove that it terminates. The previous example ends with such a sequence, starting when `n` is 16 (or $2^4$).

The hard question is whether this program terminates for *all* values of `n`. So far, no one has been able to prove it *or* disprove it! For more information, see [https://en.wikipedia.org/wiki/Collatz_conjecture](open_preview https://en.wikipedia.org/wiki/Collatz_conjecture) .