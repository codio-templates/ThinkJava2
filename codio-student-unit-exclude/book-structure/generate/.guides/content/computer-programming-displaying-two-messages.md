You can put as many statements as you like in the `main` method. For example, take a look at Hello2.java in the top left corner. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch01/Hello2.java java -cp code/ch01/ Hello2 )




As this example also shows, you can put comments at the end of a line as well as on lines all by themselves.


Phrases that appear in quotation marks are called **strings**, because they contain a sequence of characters strung together in memory. Characters can be letters, numbers, punctuation marks, symbols, spaces, tabs, etc.


`System.out.println` appends a special character, called a **newline**, that moves to the beginning of the next line. If you don't want a newline at the end, you can use `print` instead of `println`:

For example, take a look at Goodbye.java in the bottom left corner. To compile and run the code, press the "Run!"
{Run!}(sh .guides/bg.sh javac code/ch01/Goodbye.java java -cp code/ch01/ Goodbye )





In this example, the first statement does not add a newline, so the output appears on a single line:

```code
Goodbye, cruel world
```

Notice that there is a space at the end of the first string, which appears in the output just before the word `cruel`.