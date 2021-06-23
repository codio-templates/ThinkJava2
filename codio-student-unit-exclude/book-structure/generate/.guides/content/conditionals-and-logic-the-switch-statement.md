If you need to make a series of decisions, chaining `else if` blocks can get long and redundant.

For example, consider the first part of the program on the left. [Click to view.](open_file code/ch05/Switch.java panel=0 ref="if" count=12) It converts integers like `1`,`2`, and `3` into words like `"one"`, `"two"`, and `"three"`.
 
An alternative way to evaluate many possible values of an expression is to use a ```switch``` statement:, as shown [on the left.](open_file code/ch05/Switch.java panel=0 ref="same" count=16)
  This chain could go on and on, especially for banking programs that write numbers in long form (e.g., “one hundred twenty-three and 45/100 dollars”). The body of a `switch` statement is organized into one or more `case` blocks. Each `case` ends with a `break` statement, which exits the `switch` body. The `default` block is optional and executed only if none of the cases apply. 

Although `switch` statements appear longer than chained `else if` blocks, they are particularly useful when multiple cases can be grouped, as seen [on the left.](open_file code/ch05/Switch.java panel=0 ref="fall" count=15)
