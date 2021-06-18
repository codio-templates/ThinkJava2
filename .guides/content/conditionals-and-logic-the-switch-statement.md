If you need to make a series of decisions, chaining `else if` blocks can get long and redundant. For example, consider a program that converts integers like `1`, `2`, and `3` into words like `"one"`, `"two"`, and `"three"`:

```code
if (number == 1) {
    word = "one";
} else if (number == 2) {
    word = "two";
} else if (number == 3) {
    word = "three";
} else {
    word = "unknown";
}
```


This chain could go on and on, especially for banking programs that write numbers in long form (e.g., “one hundred twenty-three and 45/100 dollars”). An alternative way to evaluate many possible values of an expression is to use a `switch` statement:

```code
switch (number) {
    case 1:
        word = "one";
        break;
    case 2:
        word = "two";
        break;
    case 3:
        word = "three";
        break;
    default:
        word = "unknown";
        break;
}
```

The body of a `switch` statement is organized into one or more `case` blocks. Each `case` ends with a `break` statement, which exits the `switch` body. The `default` block is optional and executed only if none of the cases apply.

Although `switch` statements appear longer than chained `else if` blocks, they are particularly useful when multiple cases can be grouped:

```code
switch (food) {
    case "apple":
    case "banana":
    case "cherry":
        System.out.println("Fruit!");
        break;
    case "asparagus":
    case "broccoli":
    case "carrot":
        System.out.println("Vegetable!");
        break;
}
```