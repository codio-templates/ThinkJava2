When comparing strings, it might be tempting to use the `==` and `!=` operators. But that will almost never work. The following code compiles and runs, but it always displays `Goodbye!`\ regardless what the user types.

```code
System.out.print("Play again? ");
String answer = in.nextLine();
if (answer == "yes") {                 // wrong!
    System.out.println("Let's go!");
} else {
    System.out.println("Goodbye!");
}
```

The problem is that the `==` operator checks whether the two operands refer to the *same object*. Even if the answer is `"yes"`, it will refer to a different object in memory than the literal string `"yes"` in the code. You'll learn more about objects and references in the next chapter.

The correct way to compare strings is with the ```equals``` method, [ like this:](open_file code/ch06/Strings6.java panel=0 ref="answer.equals" count=3)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings6.java panel=0 count=3)


```code
if (answer.equals("yes")) {
    System.out.println("Let's go!");
}
```

This example invokes `equals` on `answer` and passes `"yes"` as an argument. The `equals` method returns `true` if the strings contain the same characters; otherwise, it returns `false`.


If two strings differ, we can use ```compareTo``` to see which comes first in [ alphabetical order:](open_file code/ch06/Strings6.java panel=0 ref="Alan Turing" count=14)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings6.java panel=0 count=14)


```code
String name1 = "Alan Turing";
String name2 = "Ada Lovelace";
int diff = name1.compareTo(name2);
if (diff < 0) {
    System.out.println("name1 comes before name2.");
} else if (diff > 0) {
    System.out.println("name2 comes before name1.");
} else {
    System.out.println("The names are the same.");
}
```

The return value from `compareTo` is the difference between the first characters in the strings that are not the same. In the preceding code, `compareTo` returns positive `8`, because the second letter of `"Ada"` comes before the second letter of `"Alan"` by eight letters.

If the first string (the one on which the method is invoked) comes earlier in the alphabet, the difference is negative. If it comes later in the alphabet, the difference is positive. If the strings are equal, their difference is zero.


Both `equals` and `compareTo` are case-sensitive. In Unicode, uppercase letters come before lowercase letters. So `"Ada"` comes before `"ada"`.

To compile and run this statement, press "Try It!"
{try it|terminal}(javac code/ch06/Strings6.java &&java -cp code/ch06 Strings6 ) 
