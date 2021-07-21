Traditionally, the first program you write when learning a new programming language is called the “Hello World” program. All it does is output the words `Hello, World!` to the screen.




See the example java code in the left pane. To compile and run the code, press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch01/Hello.java java -cp code/ch01/ Hello )


When this program runs, it displays the following:

```code
Hello, World!
```

Notice that the output does not include the quotation marks.




Java programs are made up of *class* and *method* definitions, and methods are made up of *statements*. A **statement** is a line of code that performs a basic action. In the Hello World program, this line is a **print statement** that displays a message to the user:

```code
System.out.println("Hello, World!");
```


`System.out.println` displays results on the screen; the name `println` stands for “print line”. Confusingly, *print* can mean both “display on the screen” and “send to the printer”. In this book, we'll try to say “display” when we mean output to the screen. Like most statements, the print statement ends with a semicolon (`;`).


Java is “case-sensitive”, which means that uppercase and lowercase are not the same. In the Hello World program, `System` has to begin with an uppercase letter; `system` and `SYSTEM` won't work.


A **method** is a named sequence of statements. This program defines one method named `main`:

```code
public static void main(String[] args)
```


The name and format of `main` is special: when the program runs, it starts at the first statement in `main` and ends when it finishes the last statement. Later, you will see programs that define more than one method.


This program defines a class named `Hello`. For now, a **class** is a collection of methods; we'll have more to say about this later. You can give a class any name you like, but it is conventional to start with a capital letter. The name of the class has to match the name of the file it is in, so this class has to be in a file named *Hello.java*.


Java uses curly braces (`{` and `\`}) to group things together. In *Hello.java*, the outermost braces contain the class definition, and the inner braces contain the method definition.


The line that begins with two slashes (`//`) is a **comment**, which is a bit of English text that explains the code. When Java sees `//`, it ignores everything from there until the end of the line. Comments have no effect on the execution of the program, but they make it easier for other programmers (and your future self) to understand what you meant to do.