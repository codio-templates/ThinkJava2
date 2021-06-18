You can use `println` to display an array, but it probably doesn't do what you would like. For example, say you print an array like this:

```code
int[] a = {1, 2, 3, 4};
System.out.println(a);
```

The output is something like this:

```code
[I@bf3f7e0
```

The bracket indicates that the value is an array, `I` stands for “integer”, and the rest represents the address of the array in memory.

If we want to display the elements of the array, we can do it ourselves:


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
```


The Java library includes a class, `java.util.Arrays`, that provides methods for working with arrays. One of them, `toString`, returns a string representation of an array. After importing `Arrays`, we can invoke `toString` like this:

```code
System.out.println(Arrays.toString(a));
```

And the output is shown here:

```code
[1, 2, 3, 4]
```

Notice that `Arrays.toString` uses square brackets instead of curly braces. But it beats writing your own `printArray` method.