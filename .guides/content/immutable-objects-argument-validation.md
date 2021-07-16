As we discussed in Section 5.9, you should never assume that program input will be in the correct format. Sometimes users make mistakes, such as pressing the wrong key or misreading instructions.


Or even worse, someone might make intentional “mistakes” to see what your program will do. One way hackers break into computer systems is by entering malicious input that causes a program to fail.

Programmers can make mistakes too. It's difficult to write bug-free software, especially when working in teams on large projects.


For all of these reasons, it's good practice to validate arguments passed to methods, including the `main` method. In the previous section, we did this by ensuring that `args.length` was not 0.


As a further example, consider a method that checks whether the first word of a sentence is capitalized. We can write this method using the `Character` wrapper class, as [in the original version of the method at the left.](open_file code/ch09/ArgValid.java panel=0 ref="Old" count=4)

```
public static boolean isCapitalized(String str) {
  return Character.isUpperCase(str.charAt(0));
}
```

[Click to remove highlight](open_file code/ch09/ArgValid.java panel=0)
 


The expression `str.charAt(0)` makes two assumptions: the string object referenced by `str` exists, and it has at least one character. What if these assumptions don't hold at run-time?




* If `str` is `null`, invoking `charAt` will cause a `NullPointerException`, because you can't invoke a method on `null`.
* If `str` refers to an empty string, which is a `String` object with no characters, `charAt` will cause a `StringIndexOutOfBoundsException`, because there is no character at index `0`.




We can prevent these exceptions by validating `str` *at the start* of the method. If it's invalid, we return before executing the rest of the method, [as shown in the new version of the method at the left.](open_file code/ch09/ArgValid.java panel=0 ref="New" count=7)
```
  public static boolean isCapitalized(String str) {
      if (str == null || str.isEmpty()) {
          return false;
      }
      return Character.isUpperCase(str.charAt(0));
  }
```               

[Click to remove highlight](open_file code/ch09/ArgValid.java panel=0)
Press "Run!" to see what happens on the four test cases in the `main` method. 
{Run!}(sh .guides/bg.sh javac code/ch09/ArgValid.java java -cp code/ch09/ ArgValid 1)


Notice that `null` and *empty* are different concepts, as shown in Figure 9.5. The variable `str1` is `null`, meaning that it doesn't reference an object. The variable `str2` refers to the empty string, an object that exists.

![Figure 9.5 Memory diagram of `null` and empty string.](figs/nullempty.jpg)

**Figure 9.5 Memory diagram of `null` and empty string.**

Beginners sometimes make the mistake of checking for empty first. Doing so causes a `NullPointerException`, because you can't invoke methods on variables that are `null`:

```code
if (str.isEmpty() || str == null) {    // wrong!
```


Checking for `null` first prevents the `NullPointerException`. If `str` is `null`, the `||` operator will short circuit (see Section 5.5) and evaluate to `true` immediately. As a result, `str.isEmpty()` will not be called.