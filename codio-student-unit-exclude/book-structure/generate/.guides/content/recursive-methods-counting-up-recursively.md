The `countdown` example in Section 8.1 has three parts: (1) it checks the base case, (2) it displays something, and (3) it makes a recursive call. What do you think happens if you reverse steps 2 and 3, making the recursive call *before* displaying?

```code
public static void countup(int n) {
    if (n == 0) {
        System.out.println("Blastoff!");
    } else {
        countup(n - 1);
        System.out.println(n);
    }
}
```

The stack diagram is the same as before, and the method is still called $n$ times. But now the `System.out.println` happens just before each recursive call returns. As a result, it counts *up* instead of down:

```code
Blastoff!
1
2
3
```

Keep this in mind for the next example, which displays numbers in binary.