Here's an example in which mutable objects are efficient and arguably more natural: building a long string by concatenating lots of small pieces.

Strings are particularly inefficient for this operation. For example, consider the following program, which reads 10 lines from `System.in` and concatenates them into [ a single String:](open_file code/ch10/builder.java panel=0 ref="String slow " count=6)


```code
String text = "";
for (int i = 0; i < 10; i++) {
    String line = in.nextLine();        // new string
    text = text + line + '\n';    // two more strings
}
System.out.print("You entered:\n" + text);
```

[Click to remove the highlight](open_file code/ch10/builder.java panel=0 count=5)
 Inside the `for` loop, `in.nextLine()` returns a new string each time it is invoked. To compile and run the statement, remove the comment and press "Run!"
{Run!|terminal}(sh .guides/bg.sh javac code/ch10/builder.java java -cp code/ch10/ builder 1)
 The next line of code concatenates `text` and `line`, which creates another string, and then appends the newline character, which creates yet another string.

As a result, this loop creates 30 `String` objects! At the end, `text` refers to the most recent `String`. Garbage collection deletes the rest, but that's a lot of garbage for a seemingly simple program.


The Java library provides the `StringBuilder` class for just this reason. It's part of the `java.lang` package, so you don't need to import it. Because `StringBuilder` objects are mutable, they can implement concatenation more efficiently.

Here's a version of the program that uses [ StringBuilder:](open_file code/ch10/builder.java panel=0 ref="StringBuilder text " count=7)


```code
StringBuilder text = new StringBuilder();
for (int i = 0; i < 10; i++) {
    String line = in.nextLine();
    text.append(line);
    text.append('\n');
}
System.out.print("You entered:\n" + text);
```

[Click to remove the highlight](open_file code/ch10/builder.java panel=0 count=5)
 To compile and run the statement, remove the comment and press "Run!"
{Run!|terminal}(sh .guides/bg.sh javac code/ch10/builder.java java -cp code/ch10/ builder 2)
 The `append` method takes a `String` as a parameter and appends it to the end of the `StringBuilder`. Each time it is invoked, it modifies the `StringBuilder`; it doesn't create any new objects.

If needed, you can return the StringBuilder's contents as a string by calling the [ toString method:](open_file code/ch10/builder.java panel=0 ref="result" count=1)


```code
String result = text.toString();
```

[Click to remove the highlight](open_file code/ch10/builder.java panel=0 count=5)
 The `StringBuilder` class also provides methods for inserting and deleting parts of strings efficiently. Programs that manipulate large amounts of text run much faster if you use `StringBuilder` instead of `String`.