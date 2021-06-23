In addition to the relational operators, Java also has three **logical operators**: `&&`, `||`, and `!`, which respectively stand for *and*, *or*, and *not*. The results of these operators are similar to their meanings in English. For example:



* `x > 0 && x < 10` is true when `x` is greater than 0 *and* less than 10.
* `x < 0 || x > 10` is true if either condition is true; that is, if `x` is less than 0 *or* greater than 10.
* `!(x > 0)` is true if `x` is *not* greater than 0. The parentheses are necessary in this example because, in the order of operations, `!` comes before `>`.



In order for an expression with `&&` to be true, both sides of the `&&` operator must be true. And in order for an expression with `||` to be false, both sides of the `||` operator must be false.

The `&&` operator can be used to simplify nested `if` statements. For example, [this code at the left](open_file code/ch05/LogicalOpers.java panel=0 ref="nested" count=6) can be rewritten with a single condition, to look [like this](open_file code/ch05/LogicalOpers.java panel=0 ref="combined" count=4)
 Likewise, the `||` operator can simplify chained `if` statements, such as the one [at the left](open_file code/ch05/LogicalOpers.java panel=0 ref="chained" count=6). Since the branches are the same, there is no need to duplicate [this line of code](open_file code/ch05/LogicalOpers.java panel=0 ref="Either" count=1).  
Therefore, we can combine them [like this](open_file code/ch05/LogicalOpers.java panel=0 ref="0 || y" count=3)


But it's useful to explore different ways of representing the same logic, especially when it's complex.


Logical operators evaluate the second expression *only when necessary*. For example, `true || anything` is always true, so Java does not need to evaluate the expression `anything`. Likewise, `false && anything` is always false.

Ignoring the second operand, when possible, is called **short-circuit** evaluation, by analogy with an electrical circuit. Short-circuit evaluation can save time, especially if `anything` takes a long time to evaluate. It can also avoid unnecessary errors, if `anything` might fail.