Primitive types like `int`, `double`, and `char` cannot be `null`, and they do not provide methods. For example, you can't invoke `equals` on an `int`:

```code
int i = 5;
System.out.println(i.equals(5));  // compiler error
```


But for each primitive type, there is a corresponding **wrapper class** in the Java library. The wrapper class for `int` is named `Integer`, with a capital `I`. The above example works when you change the data type to `Integer`, as seen [on the left.](open_file code/ch09/Objects.java panel=0 ref="Integer" count=2)

```
  Integer i = Integer.valueOf(5);
  System.out.println(i.equals(5));  // displays true
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 5)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)
 


Other wrapper classes include `Boolean`, `Character`, `Double`, and `Long`. They are in the `java.lang` package, so you can use them without importing them.

Like strings, objects from wrapper classes are immutable, and you have to use the `equals` method to compare them, as in the example [on the left.](open_file code/ch09/Objects.java panel=0 ref="Integer x" count=8)

```
  Integer x = Integer.valueOf(123);
  Integer y = Integer.valueOf(123);
  if (x == y) {                     // false
      System.out.println("x and y are the same object");
  }
  if (x.equals(y)) {                // true
      System.out.println("x and y have the same value");
  }
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 6)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)
**Note**: for some reason this is printing out the first statement even though the first condition should be false.
 


Because `x` and `y` refer to different objects, this code displays only “x and y have the same value”.

Each wrapper class defines the constants `MIN_VALUE` and `MAX_VALUE`. For example, `Integer.MIN_VALUE` is `-2147483648`, and `Integer.MAX_VALUE` is `2147483647`. Because these constants are available in wrapper classes, you don't have to remember them, and you don't have to write them yourself.


Wrapper classes also provide methods for converting strings to and from primitive types. For example, `Integer.parseInt` converts a string to an `int`. In this context, **parse** means “read and translate”.

For an example usage of `parseInt()`, look at the example [on the left.](open_file code/ch09/Objects.java panel=0 ref="String str" count=2)

```
String str = "12345";
int num = Integer.parseInt(str);
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 7)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)
 
 Other wrapper classes provide similar methods, like `Double.parseDouble` and `Boolean.parseBoolean`. They also provide `toString`, which returns a string representation of a value, as seen [on the left.](open_file code/ch09/Objects.java panel=0 ref="toString" count=3)

```
  num = 12345;
  str = Integer.toString(num);
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 8)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)
 


The result is the `String` object `"12345"`.


It's always possible to convert a primitive value to a string, but not the other way around.  For example, say we try to parse an invalid string like this:

```code
String str = "five";
int num = Integer.parseInt(str);  // NumberFormatException
```

`parseInt` throws a `NumberFormatException`, because the characters in the string `"five"` are not digits.