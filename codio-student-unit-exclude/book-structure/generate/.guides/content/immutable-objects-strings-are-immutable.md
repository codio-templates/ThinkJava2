If the Java library didn't have a `String` class, we would have to use character arrays to store and manipulate text. Operations like concatenation (`+`), `indexOf`, and `substring` would be difficult and inconvenient. Fortunately, Java does have a `String` class that provides these and other methods.


For example, the methods `toLowerCase` and `toUpperCase` convert uppercase letters to lowercase, and vice versa. These methods are often a source of confusion, because it sounds like they modify strings. But neither these methods nor any others can change a string, because strings are **immutable**.

When you invoke `toUpperCase` on a string, you get a new `String` object as a result. For example, consider [this code on the left.](open_file code/ch09/Objects.java panel=0 ref="immutable" count=4)

```
 String name = "Alan Turing";
 String upperName = name.toUpperCase();
```

You'll need to remove the comments from these lines of code in order to run the next steps. (You'll also need to re-comment out the NullPointerException lines.)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)



After these statements run, `upperName` refers to the string `"ALAN TURING"`. But `name` still refers to `"Alan Turing"`. A common mistake is to assume that `toUpperCase` somehow affects the original string, as in [this code on the left.](open_file code/ch09/Objects.java panel=0 ref="ignores" count=2)

```
 name.toUpperCase();           // ignores the return value
 System.out.println(name);
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 2)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)
 The previous code displays `"Alan Turing"`, because the value of `name`, which refers to the original `String` object, never changes. If you want to change `name` to be uppercase, then you need to assign the return value: as in [this code on the left.](open_file code/ch09/Objects.java panel=0 ref="references" count=2)

```
 name = name.toUpperCase();    // references the new string
 System.out.println(name);
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 3)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)



A similar method is `replace`, which finds and replaces instances of one string within another. [This example](open_file code/ch09/Objects.java panel=0 ref="Computer Science" count=2) replaces `"Computer Science"` with `"CS"`.

```
 String text = "Computer Science is fun!";
 text = text.replace("Computer Science", "CS");
```

Remove the comments from this code and press "Run!" to see what happens. 
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 4)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)



As with `toUpperCase`, assigning the return value (to `text`) is important. If you don't assign the return value, invoking `text.replace` has no effect.

Strings are immutable by design, because it simplifies passing them as parameters and return values. And since the contents of a string can never change, two variables can reference the same string without one accidentally corrupting the other.