Now that we have declared some variables, we can use them to store values. We do that with an **assignment** [ statement:](open_file code/ch02/DeclareAssign.java panel=0 ref="message " count=3)
 [REMOVE HIGHLIGHT](open_file code/ch02/DeclareAssign.java panel=0 count=3)


```code
message = "Hello!";  // give message the value "Hello!"
hour = 11;           // assign the value 11 to hour
minute = 59;         // set minute to 59
```

This example shows three assignments, and the comments illustrate different ways people sometimes talk about assignment statements. The vocabulary can be confusing here, but the idea is straightforward:



* When you declare a variable, you create a named storage location.
* When you make an assignment to a variable, you update its value.



As a general rule, a variable has to have the same type as the value you assign to it. For example, you cannot store a string in `minute` or an integer in `message`. We will show some examples that seem to break this rule, but we'll get to that later.


A common source of confusion is that some strings *look* like integers, but they are not. For example, `message` can contain the string `"123"`, which is made up of the characters `'1'`, `'2'`, and `'3'`. But that is not the same thing as the integer ```123``` as shown below and [ here:](open_file code/ch02/DeclareAssign.java panel=0 ref=""123";" count=2)
 [REMOVE HIGHLIGHT](open_file code/ch02/DeclareAssign.java panel=0 count=2)


```code
message = "123";     // legal
message = 123;       // not legal
```


Variables must be **initialized** (assigned for the first time) before they can be used. You can declare a variable and then assign a value later, as in the previous example. You can also declare and initialize on the [ the same line:](open_file code/ch02/DeclareAssign.java panel=0 ref="String message2" count=3)
 [REMOVE HIGHLIGHT](open_file code/ch02/DeclareAssign.java panel=0 count=3)


```code
String message = "Hello!";
int hour = 11;
int minute = 59;
```