Here is an example of a method that takes two parameters:

```code
public static void printTime(int hour, int minute) {
    System.out.print(hour);
    System.out.print(":");
    System.out.println(minute);
}
```


To invoke this method, we have to provide two integers as arguments:

```code
int hour = 11;
int minute = 59;
printTime(hour, minute);
```

Beginners sometimes make the mistake of declaring the arguments:

```code
int hour = 11;
int minute = 59;
printTime(int hour, int minute);  // syntax error
```

That's a syntax error, because the compiler sees `int hour` and `int minute` as variable declarations, not expressions that represent values. You wouldn't declare the types of the arguments if they were simply integers:

```code
printTime(int 11, int 59);  // syntax error
```

Pulling together the code fragments, here is the complete program:




`printTime` has two parameters, named `hour` and `minute`. And `main` has two variables, also named `hour` and `minute`. Although they have the same names, these variables are *not* the same. The `hour` in `printTime` and the `hour` in `main` refer to different memory locations, and they can have different values.

For example, you could invoke `printTime` like this:

```code
int hour = 11;
int minute = 59;
printTime(hour + 1, 0);
```

Before the method is invoked, Java evaluates the arguments; in this example, the results are `12` and `0`. Then it assigns those values to the parameters. Inside `printTime`, the value of `hour` is `12`, not `11`, and the value of `minute` is `0`, not `59`. Furthermore, if `printTime` modifies one of its parameters, that change has no effect on the variables in `main`.