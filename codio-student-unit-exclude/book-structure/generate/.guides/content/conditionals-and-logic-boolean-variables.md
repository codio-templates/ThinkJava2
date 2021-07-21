To store a `true` or `false` value, you need a `boolean` variable. You can declare and assign them like other variables. In the example at the left, the first line is a variable declaration, the second is an assignment, and the third is both. [Click to view.](open_file code/ch05/LogicalOpers.java panel=0 ref="boolean" count=4)

```
 // boolean variables
 boolean flag;
 flag = true;
 boolean testResult = false;
```

[Click here to remove highlights](open_file code/ch05/LogicalOpers.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/LogicalOpers.java java -cp code/ch05/ LogicalOpers 1) This won't print anything because there are no print statements: the code is only saving boolean values into memory and labeling them. 



Since relational and logical operators evaluate to a `boolean` value, you can store the result of a comparison in a variable, as is done [here at the left.](open_file code/ch05/LogicalOpers.java panel=0 ref="even" count=2)

```
boolean evenFlag = (x % 2 == 0);    // true if x is even
boolean positiveFlag = (x > 0);     // true if x is positive
```

[Click here to remove highlights](open_file code/ch05/LogicalOpers.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/LogicalOpers.java java -cp code/ch05/ LogicalOpers 2) This still doesn't print anything. Be sure **NOT** to re-comment these lines out before moving on to the next code snippet. 


The parentheses are unnecessary, but they make the code easier to understand. A variable defined in this way is called a **flag**, because it signals, or “flags”, the presence or absence of a condition.

You can even use flag variables as part of a conditional statement, [like this.](open_file code/ch05/LogicalOpers.java panel=0 ref="evenFlag)" count=3) 

```
if (evenFlag) {
    System.out.println("n was even when I checked it");
}
```

[Click here to remove highlights](open_file code/ch05/LogicalOpers.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/LogicalOpers.java java -cp code/ch05/ LogicalOpers 3)
 Flags may not seem that useful at this point, but they will help simplify complex conditions later. Each part of a condition can be stored in a separate flag, and these flags can be combined with logical operators.

Notice that we didn't have to write  `if (evenFlag == true)`. Since `evenFlag` is a `boolean`, it's already a condition. To check if a flag is `false`, we simply negate the flag [like this.](open_file code/ch05/LogicalOpers.java panel=0 ref="!evenFlag" count=3) 

```
 if (!evenFlag) {
     System.out.println("n was odd when I checked it");
 }
```

[Click here to remove highlights](open_file code/ch05/LogicalOpers.java panel=0)
Remove the comment symbols in front of the code and then press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch05/LogicalOpers.java java -cp code/ch05/ LogicalOpers 4)
 In general, you should never compare anything to `true` or `false`. Doing so makes the code more verbose and awkward to read out loud.