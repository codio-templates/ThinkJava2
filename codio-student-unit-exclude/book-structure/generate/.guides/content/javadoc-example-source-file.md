Now let's take a look at a more complete example.

Professional-grade source files often begin with a copyright statement. This text spans multiple lines, but it is not part of the documentation. So we use a multiline comment (`/*`) rather than a documentation comment (`/**`). Our example source file, `Convert.java`, includes [the MIT License](https://opensource.org/licenses/MIT)
The MIT License is also mentioned [at the start of the code file](open_file code/appb/Convert.java panel=0 ref="*" count=22)
[Click to remove highlight](open_file code/appb/Convert.java panel=0)



```code
/*
 * Copyright (c) 2019 Allen Downey and Chris Mayfield
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
```

Import statements generally follow the copyright text. After that, we can define the class itself and begin writing the documentation (`**`), as shown [at the left](open_file code/appb/Convert.java panel=0 ref="import" count=10)
[Click to remove highlight](open_file code/appb/Convert.java panel=0)


```code
import java.util.Scanner;

/**
 * Methods for converting to/from the metric system.
 *
 * @author Allen Downey
 * @author Chris Mayfield
 * @version 6.1.5
 */
public class Convert {
```

A common mistake that beginners make is to put `import` statements between the documentation and the `public class` line. Doing so separates the documentation from the class itself. To avoid this issue, always make the end of the comment (the `*/`) 'touch' the word \java{public}.


This class has two constants and three methods. There is no need to write documentation for the constants -- the code [at the left](open_file code/appb/Convert.java panel=0 ref="final" count=3) is self-explanatory.
[Click to remove highlight](open_file code/appb/Convert.java panel=0)


```code
public static final double CM_PER_INCH = 2.54;

public static final int IN_PER_FOOT = 12;
```

The methods, on the other hand, could use some explanation. Each documentation comment includes a description, followed by a blank line, followed by a `@param` tag for each parameter, followed by a `@return` tag:

```code
/**
 * Converts a measurement in centimeters to inches.
 *
 * @param cm length in centimeters
 * @return length in inches
 */
public static double toImperial(double cm) {
    return cm / CM_PER_INCH;
}
```

```code
/**
 * Converts a length in feet and inches to centimeters.
 *
 * @param feet how many feet
 * @param inches how many inches
 * @return length in centimeters
 */
public static double toMetric(int feet, int inches) {
    int total = feet * IN_PER_FOOT + inches;
    return total * CM_PER_INCH;
}
```

The `main` method has a similar documentation comment, except there is no `@return` tag since the method is `void`: The `main` method can also be viewed [here](open_file code/appb/Convert.java panel=0 ref="Tests" count=24)
[Click to remove highlight](open_file code/appb/Convert.java panel=0)


```code
/**
 * Tests the conversion methods.
 *
 * @param args command-line arguments
 */
public static void main(String[] args) {
    double cm, result;
    int feet, inches;
    Scanner in = new Scanner(System.in);

    // test the Imperial conversion
    System.out.print("Exactly how many cm? ");
    cm = in.nextDouble();
    result = toImperial(cm);
    System.out.printf("That's %.2f inches\n", result);
    System.out.println();

    // test the Metric conversion
    System.out.print("Now how many feet? ");
    feet = in.nextInt();
    System.out.print("And how many inches? ");
    inches = in.nextInt();
    result = toMetric(feet, inches);
    System.out.printf("That's %.2f cm\n", result);
}
```

Click the button below to run the Javadoc tool on this example program.

{Document!}(javadoc -d doc code/appb/Convert.java)

For reference, the command being run is below. When using this command in the future, make sure you're in the same directory as the file you wish to document.

```
javadoc -d doc Convert.java
```

[View document](open_preview doc/Convert.html panel=0)


For more examples of what you can do with Javadoc comments, see the source code of any Java library class (e.g., *Scanner.java*). Section 10.6 explains how to find the source files for the Java library on your computer.