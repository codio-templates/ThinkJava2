You don't always have to write new methods to get work done. As a reminder, the Java library contains thousands of classes you can use. For example, the `Math` class provides common mathematical operations:

```code
double root = Math.sqrt(17.0);
double angle = 1.5;
double height = Math.sin(angle);
```

The first line sets `root` to the square root of 17. The third line finds the sine of 1.5 (the value of `angle`). `Math` is in the `java.lang` package, so you don't have to import it.


Values for the trigonometric functions---`sin`, `cos`, and `tan`---must be in *radians*. To convert from degrees to radians, you divide by 180 and multiply by $\pi$. Conveniently, the `Math` class provides a constant named `PI` that contains an approximation of $\pi$:

```code
double degrees = 90;
double angle = degrees / 180.0 * Math.PI;
```

Notice that `PI` is in capital letters. Java does not recognize `Pi`, `pi`, or `pie`. Also, `PI` is the name of a constant, not a method, so it doesn't have parentheses. The same is true for the constant `Math.E`, which approximates Euler's number.

Converting to and from radians is a common operation, so the `Math` class provides methods that do that for you:

```code
double radians = Math.toRadians(180.0);
double degrees = Math.toDegrees(Math.PI);
```


See the example java code in the left pane. To compile and run the code, press the "Run"!
{Run!}(sh .guides/bg.sh javac code/ch04/MathMethods.java java -cp code/ch04/ MathMethods)
 Another useful method is `round`, which rounds a floating-point value to the nearest integer and returns a `long`. The following result is 63 (rounded up from 62.8319):

```code
long x = Math.round(Math.PI * 20.0);
```

A `long` is like an `int`, but bigger. More specifically, an `int` uses 32 bits of memory; the largest value it can hold is $2^{31}-1$, which is about 2 billion. A `long` uses 64 bits, so the largest value is $2^{63}-1$, which is about 9 quintillion.