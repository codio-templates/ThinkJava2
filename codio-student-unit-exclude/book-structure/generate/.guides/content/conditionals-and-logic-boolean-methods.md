Methods can return `boolean` values, just like any other type, which is often convenient for hiding tests inside methods. [Click to see an example at the left.](open_file code/ch05/DigitUtil.java panel=0 ref="isSingleDigit" count=7)

```
 public static boolean isSingleDigit(int x) {
     if (x > -10 && x < 10) {
         return true;
     } else {
         return false;
     }
 }
```

[Click here to remove highlights](open_file code/ch05/DigitUtil.java panel=0)


The name of this method is `isSingleDigit`. It is common to give `boolean` methods names that sound like yes/no questions. Since the return type is `boolean`, the return statement has to provide a boolean expression.

The code itself is straightforward, although it is longer than it needs to be. Remember that the expression `x > -10 && x < 10` has type `boolean`, so there is nothing wrong with returning it directly (without the `if` statement):

[Click to see an example at the left.](open_file code/ch05/DigitUtil.java panel=0 ref="isSingleDigit2" count=3)

```
public static boolean isSingleDigit2(int x) {
    return x > -10 && x < 10;
}
```

[Click here to remove highlights](open_file code/ch05/DigitUtil.java panel=0)


In `main`, you can invoke the method in the usual ways:

[Click to see an example at the left.](open_file code/ch05/DigitUtil.java panel=0 ref="main" count=3) 

```
public static void main(String[] args) {
   System.out.println(isSingleDigit(2));
   boolean bigFlag = !isSingleDigit(17);
   //...
}

```

[Click here to remove highlights](open_file code/ch05/DigitUtil.java panel=0)
To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch05/DigitUtil.java java -cp code/ch05/ DigitUtil 3)
 The first line displays `true` because 2 is a single-digit number. The second line sets `bigFlag` to `true`, because 17 is *not* a single-digit number.

Conditional statements often invoke `boolean` methods and use the result as the condition:

[Click to see an example at the left.](open_file code/ch05/DigitUtil.java panel=0 ref="z" count=6)

```
 int z = 9;
 if (isSingleDigit(z)) {
     System.out.println("z is small");
 } else {
     System.out.println("z is big");
 }
```
[Click here to remove highlights](open_file code/ch05/DigitUtil.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch05/DigitUtil.java java -cp code/ch05/ DigitUtil 4)
 Examples like this one almost read like English: “If is single digit z, print z is small else print z is big.”