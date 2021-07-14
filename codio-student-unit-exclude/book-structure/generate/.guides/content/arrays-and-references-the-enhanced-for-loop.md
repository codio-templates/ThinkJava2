Since traversing arrays is so common, Java provides an alternative syntax that makes the code more compact. Consider a `for` loop that displays the elements of an array on separate lines:

```code
for (int i = 0; i < values.length; i++) {
    int value = values[i];
    System.out.println(value);
}
```

We could rewrite the loop like this:

```code
for (int value : values) {
    System.out.println(value);
}
```


This statement is called an **enhanced for loop**, also known as the “for each” loop. You can read the code as, “for each `value` in `values`”. It's conventional to use plural nouns for array variables and singular nouns for element variables.

Notice how the single line `for (int value : values)` replaces the first two lines of the standard `for` loop. It hides the details of iterating each index of the array, and instead, focuses on the values themselves. Give the above enhanced for loop a try by pressing run and see what is printed.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples6.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch07/ ArrayExamples6 )


Using the enhanced `for` loop, and removing the temporary variable, [we can write the histogram code](open_file code/ch07/Histogram.java panel=0 ref="// histogram" count=5) from the previous section more concisely:
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples6.java panel=0)


```code
int[] counts = new int[100];
for (int score : scores) {
    counts[score]++;
}
```

Enhanced `for` loops often make the code more readable, especially for accumulating values. But they are not helpful when you need to refer to the index, as in search operations:

```code
for (double d : array) {
    if (d == target) {
        // array contains d, but we don't know where
    }
}
```