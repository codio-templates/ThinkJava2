To write useful programs, we almost always need to check conditions and react accordingly. **Conditional statements** give us this ability. The simplest conditional statement in Java is the `if` statement: [Click here to see an example on the left.](open_file code/ch05/IfElse.java panel=0 ref="if" count=3)



The expression in parentheses is called the *condition*. If it is true, the statements in braces get executed. If the condition is false, execution skips over that **block** of code. The condition in parentheses can be any `boolean` expression.


A second form of conditional statement has two possibilities, indicated by `if` and `else`. The possibilities are called **branches**, and the condition determines which branch gets executed: [Click here to see an example on the left.](open_file code/ch05/IfElse.java panel=0 ref="x % 2" count=5)



If the remainder when `x` is divided by 2 is 0, we know that `x` is even, and the program displays a message to that effect. If the condition is false, the second print statement is executed instead. Since the condition must be true or false, exactly one of the branches will run.

The braces are optional for branches that have only one statement. So we could have written the previous example [this way.](open_file code/ch05/IfElse.java panel=0 ref="//" count=6)


However, it's better to use braces---even when they are optional---to avoid making the mistake of adding statements to a one-line `if` or `else` block. [This code](open_file code/ch05/IfElse.java panel=0 ref="x is not zero" count=-3) is misleading because it's not indented correctly.


Since there are no braces, only the first `println` is part of the `if` statement. Here is what the compiler actually sees:

```code
if (x > 0) {
    System.out.println("x is positive");
}
    System.out.println("x is not zero");
```

As a result, the second `println` runs no matter what. Even experienced programmers make this mistake; search the web for Apple's “goto fail” bug.


In all previous examples, notice that there is no semicolon at the end of the `if` or `else` lines. Instead, a new block should be defined using braces. Another common mistake is to put a semicolon after the condition, like [this.](open_file code/ch05/IfElse.java panel=0 ref="incorrect semicolon" count=3)


This code will compile, but the program will output `"x is even"` regardless of the value of `x`. Here is the same incorrect code with better formatting:

```code
int x = 1;
if (x % 2 == 0)
    ;  // empty statement
{
    System.out.println("x is even");
}
```

Because of the semicolon, the `if` statement compiles as if there are no braces, and the subsequent block runs independently. As a general rule, each line of Java code should end with a semicolon or brace---but not both.

The compiler won't complain if you omit optional braces or write empty statements. Doing so is allowed by the Java language, but it often results in bugs that are difficult to find. Development tools like Checkstyle (see Appendix 18.5) can warn you about these and other kinds of programming mistakes.