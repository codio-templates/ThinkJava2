Sometimes you want to check related conditions and choose one of several actions. One way to do this is by **chaining** a series of `if` and `else` blocks: [Click here to see an example on the left.](open_file code/ch05/ChainNest.java panel=0 ref="if" count=7) 

```
 if (x > 0) {
     System.out.println("x is positive");
 } else if (x < 0) {
     System.out.println("x is negative");
 } else {
     System.out.println("x is zero");
 }
```

[Click here to remove highlight](open_file code/ch05/ChainNest.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/ChainNest.java java -cp code/ch05/ ChainNest 1)



These chains can be as long as you want, although they can be difficult to read if they get out of hand. One way to make them easier to read is to use standard indentation, as demonstrated in these examples. If you keep all the statements and braces lined up, you are less likely to make syntax errors.

Notice that the last branch is simply `else`, not `else if (x == 0)`. At this point in the chain, we know that `x` is not positive and `x` is not negative. There is no need to test whether `x` is 0, because there is no other possibility.


In addition to chaining, you can also make complex decisions by **nesting** one conditional statement inside another. [We could have written it this way instead.](open_file code/ch05/ChainNest.java panel=0 ref="alternate way" count=10)

```
 //alternate way
 if (x > 0) {
     System.out.println("x is positive");
 } else {
     if (x < 0) {
         System.out.println("x is negative");
     } else {
         System.out.println("x is zero");
     }
 }
```

[Click here to remove highlight](open_file code/ch05/ChainNest.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/ChainNest.java java -cp code/ch05/ ChainNest 2)


The outer conditional has two branches. The first branch contains a print statement, and the second branch contains another conditional statement, which has two branches of its own. These two branches are also print statements, but they could have been conditional statements as well.


These kinds of nested structures are common, but they can become difficult to read very quickly. Good indentation is essential to make the structure (or intended structure) apparent to the reader.