It's possible to display multiple lines of output with only one line of code. You just have to tell Java where to put the line breaks. For example, take a look at [line 4 on the code on the left (click).](open_file code/ch01/Hello3.java panel=0 ref="System" count=1)
```
 public class Hello3 {

     public static void main(String[] args) {
         System.out.print("Hello!\nHow are you doing?\n");
     }
 }
``` 
[Click to remove the highlight.](open_file code/ch01/Hello3.java panel=0)
To compile and run the code, comment out line 5 using a `//` and press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/ch01/Hello3.java java -cp code/ch01/ Hello3 1)




The output is two lines, each ending with a newline character: 
```java
 Hello!
 How are you doing?
 ```



Each `\n` is an **escape sequence**, or two characters of source code that represent a single character. (The backslash allows you to *escape* the string to write special characters.) Notice there is no space between `\n` and `How`. If you add a space there, there will be a space at the beginning of the second line.


<center>
|`\n`|newline|
|-|-|
|`\t`|tab|
|`\"`|double quote|
|`\`|backslash|

</center>
**Table: Common escape sequences**


Java has a total of eight escape sequences, and the four most commonly used ones are listed in Table 1.7. For example, to write quotation marks inside of strings, you need to escape them with a backslash, as in [line 5](open_file code/ch01/Hello3.java panel=0 ref="println" count=1) on the code on the left. 

```
System.out.println("She said \"Hello!\" to me.");
```

[Click to remove the highlight.](open_file code/ch01/Hello3.java panel=0)
To compile and run the code, remove the comment from line 5, comment out line 4 using a `//` and press the "Run!" button. 
{Run!}(sh .guides/bg.sh javac code/ch01/Hello3.java java -cp code/ch01/ Hello3 2)


The result is as follows:

```code
She said "Hello!" to me.
```