One of the most powerful features of a programming language is the ability to define and manipulate variables. A **variable** is a named location in memory that stores a **value**. Values may be numbers, text, images, sounds, and other types of data. To store a value, you first have to [declare a variable:](open_file code/ch02/DeclareAssign.java panel=0 ref="String message;" count=1)


```code
String message;
```

[Click to remove the highlight](open_file code/ch02/DeclareAssign.java panel=0 count=1)


This statement is called a **declaration**, because it declares that the variable `message` has the type `String`. Each variable has a **type** that determines what kind of values it can store. For example, the `int` type can store integers like `1` and `-5`, and the `char` type can store characters like `'A'` and `'z'`.

Some types begin with a capital letter and some with lowercase. You will learn the significance of this distinction later, but for now you should take care to get it right. There is no such type as `Int` or `string`. To declare an integer variable named x, see the [left panel ](open_file code/ch02/DeclareAssign.java panel=0 ref="int x;" count=1)



```code
int x;
```

[Click to remove the highlight](open_file code/ch02/DeclareAssign.java panel=0 count=1)
 Note that `x` is an arbitrary name for the variable. In general, you should use names that indicate what the variables [ mean.](open_file code/ch02/DeclareAssign.java panel=0 ref="String firstName;" count=3)


```code
String firstName;
String lastName;
int hour, minute;
```

[Click to remove the highlight](open_file code/ch02/DeclareAssign.java panel=0 count=3)
 This example declares two variables with type `String` and two with type `int`. The last line shows how to declare multiple variables with the same type: `hour` and `minute` are both integers. Note that each declaration statement ends with a semicolon (`;`).


Variable names usually begin with a lowercase letter, in contrast to class names (like `Hello`) that start with a capital letter. When a variable name contains more than one word (like `firstName`), it is conventional to capitalize the first letter of each subsequent word. Variable names are case-sensitive, so `firstName` is not the same as `firstname` or `FirstName`.


You can use any name you want for a variable. But there are about 50 reserved words, called **keywords**, that you are not allowed to use as variable names. These words include `public`, `class`, `static`, `void`, and `int`, which are used by the compiler to analyze the structure of the program.

You can see the full list of keywords at [https://thinkjava.org/keywords](open_preview https://thinkjava.org/keywords panel=0). Most programming editors provide “syntax highlighting”, which makes different parts of the program appear in different colors. And the compiler will complain even if one does sneak past you and your editor.