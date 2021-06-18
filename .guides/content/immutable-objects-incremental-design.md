One challenge of programming, especially for beginners, is figuring out how to divide a program into methods. In this section, we present a **design process** that allows you to divide a program into methods as you go along. The process is called “encapsulation and generalization”. The essential steps are as follows:



1. Write a few lines of code in `main` or another method, and test them.
1. When they are working, wrap them in a new method and test again.
1. If it's appropriate, replace literal values with variables and parameters.




To demonstrate this process, we'll develop methods that display multiplication tables. We begin by writing and testing a few lines of code. Here is a loop that displays the multiples of two, all on one line:

```code
for (int i = 1; i <= 6; i++) {
    System.out.printf("%4d", 2 * i);
}
System.out.println();
```


Each time through the loop, we display the value of `2 * i`, padded with spaces so it's four characters wide. Since we use `System.out.printf`, the output appears on a single line.

After the loop, we call `println` to print a newline character. Remember that in some environments, none of the output is displayed until the line is complete. The output of the code so far is shown here:

```code
   2   4   6   8  10  12
```


The next step is to **encapsulate** the code; that is, we “wrap” the code in a method:

```code
public static void printRow() {
    for (int i = 1; i <= 6; i++) {
        System.out.printf("%4d", 2 * i);
    }
    System.out.println();
}
```


Finally, we **generalize** the method to print multiples of other numbers by replacing the constant value `2` with a parameter `n`. This step is called “generalization”, because it makes the method more general (less specific):

```code
public static void printRow(int n) {
    for (int i = 1; i <= 6; i++) {
        System.out.printf("%4d", n * i);  // generalized n
    }
    System.out.println();
}
```

Invoking this method with the argument `2` yields the same output as before. With the argument `3`, the output is as follows:

```code
   3   6   9  12  15  18
```


By now, you can probably guess how we are going to display a multiplication table: we'll invoke `printRow` repeatedly with different arguments. In fact, we'll use another loop to iterate through the rows:

```code
for (int i = 1; i <= 6; i++) {
    printRow(i);
}
```

And the output looks like this:

```code
   1   2   3   4   5   6
   2   4   6   8  10  12
   3   6   9  12  15  18
   4   8  12  16  20  24
   5  10  15  20  25  30
   6  12  18  24  30  36
```