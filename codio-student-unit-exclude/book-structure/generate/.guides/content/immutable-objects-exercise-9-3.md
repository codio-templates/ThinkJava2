Many encryption algorithms depend on the ability to raise large integers to a power. The class on the left contains a method `pow(int x, int n)` that implements an efficient algorithm for integer exponentiation.

The problem with this method is that it works only if the result is small enough to be represented by an `int`. Rewrite it so that the result is a `BigInteger`. The parameters should still be integers, though.

You should use the `BigInteger` methods `add` and `multiply`. But don't use `BigInteger.pow`; that would spoil the fun.

Add a main method and some function calls, then test your code using the class below.

{Run!}(sh .guides/bg.sh javac code/ch09/Pow.java java -cp code/ch09/ Pow 1)