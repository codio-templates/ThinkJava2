When you create an array with the `new` operator, the elements are initialized to zero. Figure 7.1 shows a memory diagram of the `counts` array so far.

![Figure 7.1 Memory diagram of an `int` array.](figs/array.jpg)

**Figure 7.1 Memory diagram of an `int` array.**


The arrow indicates that the value of `counts` is a **reference** to the array. You should think of *the array* and *the variable* that refers to it as two different things. As you'll soon see, we can assign a different variable to refer to the same array, and we can change the value of `counts` to refer to a different array.


The boldface numbers inside the boxes are the elements of the array. The lighter numbers outside the boxes are the **indexes** used to identify each location in the array. As with strings, the index of the first element is 0, not 1. For this reason, we sometimes refer to the first element as the “zeroth” element.

The `[]` operator selects elements from an array: See how the `printArray` function works by pressing "Run!".
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples3.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch07/ ArrayExamples3 )


```code
System.out.println("The zeroth element is " + counts[0]);
```

You can use the `[]` operator anywhere in an [expression:](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0 ref="counts[0]" count=4)
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0)


```code
counts[0] = 7;
counts[1] = counts[0] * 2;
counts[2]++;
counts[3] -= 60;
```

Figure 7.2 shows the result of these statements.

![Figure 7.2 Memory diagram after several assignment statements.](figs/array2.jpg)

**Figure 7.2 Memory diagram after several assignment statements.**

You can use any expression as an index, as long as it has type `int`. One of the most common ways to index an array is with a loop variable. [For example:](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0 ref="// traversal with a while loop" count=6)
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0)


```code
int i = 0;
while (i < 4) {
    System.out.println(counts[i]);
    i++;
}
```

This `while` loop counts up from 0 to 4. When `i` is 4, the condition fails and the loop terminates. So the body of the loop is executed only when `i` is 0, 1, 2, or 3. In this context, the variable name `i` is short for “index”.


Each time through the loop, we use `i` as an index into the array, displaying the $i$th element. This type of array processing is usually written as a [for loop:](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0 ref="// traversal with a for loop" count=4)
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/ArrayExamples2.java panel=0)


```code
for (int i = 0; i < 4; i++) {
    System.out.println(counts[i]);
}
```


For the `counts` array, the only legal indexes are 0, 1, 2, and 3. If the index is negative or greater than 3, the result is an `ArrayIndexOutOfBoundsException`.