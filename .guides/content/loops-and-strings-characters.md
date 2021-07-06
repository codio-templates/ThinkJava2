Some of the most interesting problems in computer science involve searching and manipulating text. In the next few sections, we'll discuss how to apply loops to strings. Although the examples are short, the techniques work the same whether you have one word or one million words.


Strings provide a method named `charAt`. It returns a ```char```, a data type that stores [ an individual character (as opposed to strings of them):](open_file code/ch06/Strings1.java panel=0 ref="fruit" count=2)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings1.java panel=0 count=2)


```code
String fruit = "banana";
char letter = fruit.charAt(0);
```

The argument `0` means that we want the character at **index** 0. String indexes range from 0 to $n-1$, where $n$ is the length of the string. So the character assigned to `letter` is `'b'`:




| b  | a  | n  | a  | n  | a  |
|----|----|----|----|----|----|
|  0 |  1 |  2 |  3 |  4 | 5  |
 Characters work like the other data types you have seen. You can compare them using [ relational operators:](open_file code/ch06/Strings1.java panel=0 ref="if" count=3)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings1.java panel=0 count=3)


```code
if (letter == 'A') {
    System.out.println("It's an A!");
}
```

To compile and run this statement, press "Run!". Edit the index value for ```fruit.charAt(0);``` to see how the output may change.
{Run!}(sh .guides/bg.sh javac code/ch06/Strings1.java java -cp code/ch06/ Strings1 )


Character literals, like `'A'`, appear in single quotes. Unlike string literals, which appear in double quotes, character literals can contain only a single character. Escape sequences, like `'\t'`, are legal because they represent a single character.

The increment and decrement operators also work with characters. So this loop displays the letters of the [ alphabet:](open_file code/ch06/Strings2.java panel=0 ref="Roman" count=5)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings2.java panel=0 count=5)


```code
System.out.print("Roman alphabet: ");
for (char c = 'A'; c <= 'Z'; c++) {
    System.out.print(c);
}
System.out.println();
```



Java uses **Unicode** to represent characters, so strings can store text in other alphabets like Cyrillic and Greek, and non-alphabetic languages like Chinese. You can read more about it at the Unicode website [https://unicode.org/](open_preview https://unicode.org/ panel=0) .

In Unicode, each character is represented by a “code point”, which you can think of as an integer. The code points for uppercase Greek letters run from 913 to 937, so we can display the Greek alphabet [ like this:](open_file code/ch06/Strings2.java panel=0 ref="Greek" count=5)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings2.java panel=0 count=5)


```code
System.out.print("Greek alphabet: ");
for (int i = 913; i <= 937; i++) {
    System.out.print((char) i);
}
System.out.println();
```

To compile and run this statement, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Strings2.java java -cp code/ch06/ Strings2 )
 This example uses a type cast to convert each integer (in the range) to the corresponding character. Try running the code and see what happens.