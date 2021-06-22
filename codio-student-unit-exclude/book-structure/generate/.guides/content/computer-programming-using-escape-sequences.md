It's possible to display multiple lines of output with only one line of code. You just have to tell Java where to put the line breaks. For example, take a look at Hello3.java on the left. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch01/Hello3.java java -cp code/ch01/ Hello3 1)




The output is two lines, each ending with a newline character:

```code
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


Java has a total of eight escape sequences, and the four most commonly used ones are listed in Table 1.7. For example, to write quotation marks inside of strings, you need to escape them with a backslash, as in line 5 on the code on the left. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch01/Hello3.java java -cp code/ch01/ Hello3 2)


The result is as follows:

```code
She said "Hello!" to me.
```