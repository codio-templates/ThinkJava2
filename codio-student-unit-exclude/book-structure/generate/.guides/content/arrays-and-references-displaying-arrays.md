You can use `println` to display an array, but it probably doesn't do what you would like. For example, say you print an array [like this:](open_file code/ch07/ArrayExamples3.java panel=0 ref="// displaying" count=3)


```code
int[] a = {1, 2, 3, 4};
System.out.println(a);
```

The output is something like this:

```code
[I@bf3f7e0
```

[Click to remove the highlight.](open_file code/ch07/ArrayExamples3.java panel=0)
 Try it out here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples3.java java -cp code/ch07/ ArrayExamples3 )
 The bracket indicates that the value is an array, `I` stands for “integer”, and the rest represents the address of the array in memory.

If we want to [display the elements of the array](open_file code/ch07/ArrayExamples3.java panel=0 ref="* Prints the elements of an array." count=9), we can do it ourselves:



```code
public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}
```

Given the previous array, the output of `printArray` is as follows:

```code
{1, 2, 3, 4}
``` [Click to remove the highlight.](open_file code/ch07/ArrayExamples3.java panel=0)


Try out the `printArray` function here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples3.java java -cp code/ch07/ ArrayExamples3 )


The Java library includes a class, `java.util.Arrays`, that provides methods for working with arrays. One of them, `toString`, returns a string representation of an array. After importing `Arrays`, we can invoke `toString` [like this:](open_file code/ch07/ArrayExamples3.java panel=0 ref="// printing with Arrays class" count=2)


```code
System.out.println(Arrays.toString(a));
```

And the output is shown here:

```code
[1, 2, 3, 4]
```

[Click to remove the highlight.](open_file code/ch07/ArrayExamples3.java panel=0)
 Run your code here.
{Run!}(sh .guides/bg.sh javac code/ch07/ArrayExamples3.java java -cp code/ch07/ ArrayExamples3 )
 Notice that `Arrays.toString` uses square brackets instead of curly braces. But it beats writing your own `printArray` method.