Many computations can be implemented by looping through the elements of an array and performing an operation on each element. Looping through the elements of an array is called a [traversal:](open_file code/ch07/ArrayExamples5.java panel=0 ref="// traversing arrays" count=4)


```code
int[] a = {1, 2, 3, 4, 5};
for (int i = 0; i < a.length; i++) {
    a[i] *= a[i];
}
```

[Click to remove the highlight.](open_file code/ch07/ArrayExamples5.java panel=0)
 This example traverses an array and squares each element. Try it out yourself and don't forget to print the array using the `printArray` method. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples5.java java -cp code/ch07/ ArrayExamples5 )
 At the end of the loop, the array has the values `{1, 4, 9, 16, 25}`.


Another common pattern is a **search**, which involves traversing an array and “searching” for a particular element. For example, [the following method](open_file code/ch07/ArrayExamples5.java panel=0 ref="* Returns the index" count=11) takes an array and a value, and it returns the index where the value appears:



```code
public static int search(double[] array, double target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i;
        }
    }
    return -1;  // not found
}
```

[Click to remove the highlight.](open_file code/ch07/ArrayExamples5.java panel=0)
 If we find the target value in the array, we return its index immediately. If the loop exits without finding the target, it returns `-1`, a special value chosen to indicate a failed search. (This code is essentially what the `String.indexOf` method does.)

The following code searches an array for the value `1.23`, which is the third element. Because array indexes start at 0, the output is `2`:

```code
double[] array = {3.14, -55.0, 1.23, -0.8};
int index = search(array, 1.23);
System.out.println(index);
```

Test it out in the main method of the code on the left. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples5.java java -cp code/ch07/ ArrayExamples5 )


Another common traversal is a **reduce** operation, which “reduces” an array of values down to a single value. Examples include the sum or product of the elements, the minimum, and the maximum. [The following method](open_file code/ch07/ArrayExamples5.java panel=0 ref="* Returns the total" count=10) takes an array and returns the sum of its elements:


```code
public static double sum(double[] array) {
    double total = 0.0;
    for (int i = 0; i < array.length; i++) {
        total += array[i];
    }
    return total;
}
```

[Click to remove the highlight.](open_file code/ch07/ArrayExamples5.java panel=0)


Before the loop, we initialize `total` to `0`. Each time through the loop, we update `total` by adding one element from the array. At the end of the loop, `total` contains the sum of the elements. A variable used this way is sometimes called an **accumulator**, because it “accumulates” the running total.

Test it out in the main method of the code on the left. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples5.java java -cp code/ch07/ ArrayExamples5 )
