As explained in Section 7.2, array variables contain *references* to arrays. When you make an assignment to an array variable, it simply copies the reference. But it doesn't copy the array itself. For example:

```code
double[] a = new double[3];
double[] b = a;
```

These statements create an array of three `double`s and make two different variables refer to it, as shown in Figure 7.3.


![Figure 7.3 Memory diagram of two variables referring to the same array.](figs/array3.jpg)

**Figure 7.3 Memory diagram of two variables referring to the same array.**


Any changes made through either variable will be seen by the other. For example, if we set `a[0] = 17.0`, and then display `b[0]`, the result is `17.0`. Because `a` and `b` are different names for the same thing, they are sometimes called **aliases**.

Try adding the code snippets above to the editor on the left to see how the mechanics of copying arrays work. To print the arrays and see what changes you are making you can use the `printArray` method. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples4.java java -cp code/ch07/ ArrayExamples4 )
 If you actually want to copy the array, not just the reference, you have to create a new array and copy the elements from one to the other, like this:

```code
double[] b = new double[3];
for (int i = 0; i < 3; i++) {
    b[i] = a[i];
}
```


`java.util.Arrays` provides a method named `copyOf` that performs this task for you. So you can replace the previous code with one line:

```code
double[] b = Arrays.copyOf(a, 3);
```

Copy both of these methods to the panel on the left within the `main` method to give them a try. To print the arrays and see what changes you are making you can use the `printArray` method. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples4.java java -cp code/ch07/ ArrayExamples4 )
 The second parameter is the number of elements you want to copy, so `copyOf` can also be used to copy part of an array. Figure 7.4 shows the state of the array variables after invoking `Arrays.copyOf`.

![Figure 7.4 Memory diagram of two variables referring to different arrays.](figs/array4.jpg)

**Figure 7.4 Memory diagram of two variables referring to different arrays.**




The examples so far work only if the array has three elements. It is better to generalize the code to work with arrays of any size. We can do that by replacing the magic number, `3`, [with a.length:](open_file code/ch07/ArrayExamples4.java panel=0 ref="// copying an array" count=6)


```code
double[] b = new double[a.length];
for (int i = 0; i < a.length; i++) {
    b[i] = a[i];
}
```

All arrays have a built-in constant, `length`, that stores the number of elements. In contrast to `String.length()`, which is a method, `a.length` is a constant. The expression `a.length` may look like a method invocation, but there are no parentheses and no arguments.

The last time the loop gets executed, `i` is `a.length - 1`, which is the index of the last element. When `i` is equal to `a.length`, the condition fails and the body is not executed---which is a good thing, because trying to access `a[a.length]` would throw an exception. Of course, we can replace the loop altogether by using `Arrays.copyOf` and `a.length` [for the second argument.](open_file code/ch07/ArrayExamples4.java panel=0 ref="// copying with Arrays class" count=2)
[Remove highlighting](open_file code/ch07/ArrayExamples4.java panel=0)


The following line produces the same result shown in Figure 7.4:

```code
double[] b = Arrays.copyOf(a, a.length);
```

Give both of the code snippets above a try by copying them to the `main` method on the left. To print the arrays and see what changes you are making you can use the `printArray` method. Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples4.java java -cp code/ch07/ ArrayExamples4 )
 The `Arrays` class provides many other useful methods like `Arrays.compare`, `Arrays.equals`, `Arrays.fill`, and `Arrays.sort`. Take a moment to read the documentation by searching the web for `java.util.Arrays`.