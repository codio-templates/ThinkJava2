The `System` class also provides the special value `System.in`, which is an `InputStream` that has methods for reading input from the keyboard. These methods are not convenient to use, but fortunately Java provides other classes that make it easy to handle common input tasks.


For example, `Scanner` is a class that provides methods for inputting words, numbers, and other data. `Scanner` is provided by `java.util`, which is a package that contains various “utility classes”. Before you can use `Scanner`, you have to import it like this:

```code
import java.util.Scanner;
```


This **import statement** tells the compiler that when you refer to `Scanner`, you mean the one defined in `java.util`. Using an import statement is necessary because there might be another class named `Scanner` in another package.

Next you have to initialize the `Scanner`. This line declares a `Scanner` variable named `in` and creates a `Scanner` that reads input from `System.in`:


[View the highlighted the code](open_file code/ch03/Echo.java panel=0 ref="Scanner in" count=3)
[Remove the highlight](open_file code/ch03/Echo.java panel=0)
 ```code
Scanner in = new Scanner(System.in);
```

The `Scanner` class provides a method called `nextLine` that reads a line of input from the keyboard and returns a `String`. Here's a complete example that reads two lines and repeats them back to the user:




See the example java code in the left pane. This is a random sentence. To compile and run the code, press the "Run!"
{Run!| terminal}(sh .guides/bg.sh javac code/ch03/Echo.java java -cp code/ch03/ Echo )
 Import statements can't be inside a class definition. By convention, they are usually at the beginning of the file. If you omit the import statement, you get a compiler error like “cannot find symbol”. That means the compiler doesn't know where to find the definition for `Scanner`.


You might wonder why we can use the `System` class without importing it. `System` belongs to the `java.lang` package, which is imported automatically. According to the documentation, `java.lang` “provides classes that are fundamental to the design of the Java programming language.” The `String` class is also part of `java.lang`.