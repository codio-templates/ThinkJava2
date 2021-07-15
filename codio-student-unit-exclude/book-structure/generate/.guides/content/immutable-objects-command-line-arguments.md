Now that you know about strings, arrays, and wrapper classes, we can *finally* explain the `args` parameter of the `main` method, which we have been ignoring since Chapter 1. If you are unfamiliar with the command-line interface, please read Appendix 18.3.

Let's write a program to find the maximum value in a sequence of numbers. Rather than read the numbers from `System.in` by using a `Scanner`, we'll pass them as command-line arguments. For a starting point, consider the program on the upper left, noting that any command line instructions will be typed into the terminal on the lower left. 
 


You can run this program from the command line by typing this:

```code
java Max
```


The output indicates that `args` is an **empty array**; that is, it has no elements:

```code
[]
```

If you provide additional values on the command line, they are passed as arguments to `main`. For example, say you run the program like this:

```code
java Max 10 -3 55 0 14
```

The first line of output, representing the initial array of arguments, is shown here: 


```code
[10, -3, 55, 0, 14]
```

It's not clear from the output, but the elements of `args` are strings. So `args` is the array `{"10", "-3", "55", "0", "14"\`}. To find the maximum number, we have to convert the arguments to integers.

The code [on the left](open_file code/ch09/Max.java panel=0 ref="int max" count=7) uses an enhanced `for` loop (see Section 7.8) to parse the arguments and find the largest value.
```
int max = Integer.MIN_VALUE;
for (String arg : args) {
    int value = Integer.parseInt(arg);
    if (value > max) {
        max = value;
    }
}
System.out.println("The max is " + max);
```


We begin by initializing `max` to the smallest (most negative) number an `int` can represent. That way, the first value we parse will replace `max`. As we find larger values, they will replace `max` as well.

If `args` is empty, the result will be `MIN_VALUE`. We can prevent this situation from happening by checking `args` at the beginning of the program, as seen [on the left.](open_file code/ch09/Max.java panel=0 ref="length" count=4)



It's customary for programs that require command-line arguments to display a “usage” message if the arguments are not valid. For example, if you run `javac` or `java` from the command line without any arguments, you will get a very long message.