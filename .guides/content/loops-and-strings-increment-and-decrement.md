Here is another ```while``` loop example; this one displays the numbers
[ 1 to 5:](open_file code/ch06/Loops.java panel=0 ref="plusplus" count=7)


```code
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;  // add 1 to i
}
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=7)
 To see the output of this function, comment out all other code in the main function besides lines 73 and 74. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )


Assignments like `i = i + 1` don't often appear in loops, because Java provides a more concise way to add and subtract by one. Specifically, `++` is the **increment** operator; it has the same effect as `i = i + 1`. And `--` is the **decrement** operator; it has the same effect as `i = i - 1`.


If you want to increment or decrement a variable by an amount other than `1`, you can use `+=` and `-=`. For example, ```i += 2``` increments 
[ i by 2:](open_file code/ch06/Loops.java panel=0 ref="appreciate" count=9)


```code
int i = 2;
while (i <= 8) {
    System.out.print(i + ", ");
    i += 2;  // add 2 to i
}
System.out.println("Who do we appreciate?");
```

[Click to remove the highlight](open_file code/ch06/Loops.java panel=0 count=9)
 To see the output of this function, comment out all other code in the main function besides lines 76 and 77. Press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Loops.java java -cp code/ch06/ Loops )
