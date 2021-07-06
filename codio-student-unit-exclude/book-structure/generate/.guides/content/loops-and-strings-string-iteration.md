Strings provide a method called `length` that returns the number of characters in the string. The following loop iterates the characters in ```fruit``` and displays them, one on [ each line:](open_file code/ch06/Strings4.java panel=0 ref=" for " count=4)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings4.java panel=0 count=4)


```code
for (int i = 0; i < fruit.length(); i++) {
    char letter = fruit.charAt(i);
    System.out.println(letter);
}
```


Because `length` is a method, you have to invoke it with parentheses (there are no arguments). When `i` is equal to the length of the string, the condition becomes `false` and the loop terminates.

To find the last letter of a string, you might be tempted to do something like the following:

```code
int length = fruit.length();
char last = fruit.charAt(length);      // wrong!
```


This code compiles and runs, but invoking the `charAt` method throws a `StringIndexOutOfBoundsException`. The problem is that there is no sixth letter in `"banana"`. Since we started counting at 0, the six letters are indexed from 0 to 5. To get the last character, you have to [ subtract 1:](open_file code/ch06/Strings4.java panel=0 ref=" length " count=2)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings4.java panel=0 count=2)
 from ```length``` .

```code
int length = fruit.length();
char last = fruit.charAt(length - 1);  // correct
```

Many string algorithms involve reading one string and building another. For example, to reverse a string, we can concatenate one character [ at a time:](open_file code/ch06/Strings4.java panel=0 ref="String reverse" count=7)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings4.java panel=0 count=7)


```code
public static String reverse(String s) {
    String r = "";
    for (int i = s.length() - 1; i >= 0; i--) {
        r += s.charAt(i);
    }
    return r;
}
```


To compile and run this statement, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Strings4.java java -cp code/ch06/ Strings4 )
 The initial value of `r` is `""`, which is an **empty string**. The loop iterates the indexes of `s` in reverse order. Each time through the loop, the `+=` operator appends the next character to `r`. When the loop exits, `r` contains the characters from `s` in reverse order. So the result of `reverse("banana")` is `"ananab"`.