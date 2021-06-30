It might not be clear at this point why you would ever need an integer object when you can just use an `int` or `long`. One advantage is the variety of methods that `Integer` and `Long` provide. But there is another reason: when you need very large integers that exceed `Long.MAX_VALUE`.


`BigInteger` is a Java class that can represent arbitrarily large integers. There is no upper bound except the limitations of memory size and processing speed. Take a minute to read the documentation, which you can find by doing a web search for “Java BigInteger”.



To use BigIntegers, you have to `import java.math.BigInteger` at the beginning of your program. There are several ways to create a BigInteger, but the simplest uses `valueOf`. The [code on the left](open_file code/ch09/BigInt.java panel=0 ref="long" count=3) converts a `long` to a `BigInteger`.
Press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/BigInt.java java -cp code/ch09/ BigInt 1)
[Click to remove highlight](open_file code/ch09/BigInt.java panel=0)
  


You can also create BigIntegers from strings. The [code on the left](open_file code/ch09/BigInt.java panel=0 ref="String s" count=3) shows how this feature can help us handle a 20-digit integer that is too big to store using a `long`.
Remove the comment symbols and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/BigInt.java java -cp code/ch09/ BigInt 2)
[Click to remove highlight](open_file code/ch09/BigInt.java panel=0)
  


Notice the difference in the previous two examples: you use `valueOf` to convert integers, and `new BigInteger` to convert strings.

Since BigIntegers are not primitive types, the usual math operators don't work. Instead, we have to use methods like `add`. To add two BigIntegers, we invoke `add` on one and pass the other as an argument, as in the [code on the left.](open_file code/ch09/BigInt.java panel=0 ref="BigInteger a" count=4)
Remove the comment symbols and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/BigInt.java java -cp code/ch09/ BigInt 3)
[Click to remove highlight](open_file code/ch09/BigInt.java panel=0)
  


Like strings, `BigInteger` objects are immutable. Methods like `add`, `multiply`, and `pow` all return new BigIntegers, rather than modify an existing one.

Internally, a `BigInteger` is implemented using an array of `int`s, similar to the way a string is implemented using an array of `char`s. Each `int` in the array stores a portion of the BigInteger. The methods of `BigInteger` traverse this array to perform addition, multiplication, etc.

For very long floating-point values, take a look at `java.math.BigDecimal`. Interestingly, `BigDecimal` objects represent floating-point numbers internally by using a `BigInteger`!