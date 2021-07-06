`for` and `while` loops have the same capabilities; any `for` loop can be rewritten as a `while` loop, and vice versa. For example, we could have printed letters of the alphabet by using a `while` loop:

```code
System.out.print("Roman alphabet: ");
char c = 'A';
while (c <= 'Z') {
    System.out.print(c);
    c++;
}
System.out.println();
```

You might wonder when to use one or the other.  It depends on whether you know how many times the loop will repeat.

A `for` loop is “definite”, which means we know, at the beginning of the loop, how many times it will repeat. In the alphabet example, we know it will run 26 times. In that case, it's better to use a `for` loop, which puts all of the loop control code on one line.

A `while` loop is “indefinite”, which means we don't know how many times it will repeat. For example, when validating user input as in Section 5.9, it's impossible to know how many times the user will enter a wrong value. In this case, a ```while``` loop is more [ appropriate:](open_file code/ch06/Strings3.java panel=0 ref="Enter a number" count=7)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings3.java panel=0 count=7)


```code
System.out.print("Enter a number: ");
while (!in.hasNextDouble()) {
    String word = in.next();
    System.err.println(word + " is not a number");
    System.out.print("Enter a number: ");
}
double number = in.nextDouble();
```

It's easier to read the `Scanner` method calls when they're not all on one line of code. To compile and run this statement, press "Run!"
{try it|terminal}(javac code/ch06/Strings3.java &&java -cp code/ch06/ Strings3 )
