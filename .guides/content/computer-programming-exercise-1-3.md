It is a good idea to commit as many errors as you can think of, so that you see what error messages the compiler produces.
Sometimes the compiler tells you exactly what is wrong, and all you have to do is fix it.
But sometimes the error messages are misleading.
Over time you will develop a sense for when you can trust the compiler and when you have to figure things out yourself.

Starting with the Hello World program, try out each of the following errors.
After you make each change, compile the program, read the error message (if there is one), and then fix the error.

* Remove one of the opening curly braces.
* Remove one of the closing curly braces.
* Instead of `main`, write `mian`.
* Remove the word `static`.
* Remove the word `public`.
* Remove the word `System`.
* Replace `println` with `Println`.
* Replace `println` with `print`.
* Delete one parenthesis.
* Add an extra parenthesis.

Press the "Run!" to see how these changes, and any others you can think of, work.
{Run!}(sh .guides/bg.sh javac code/ch01/Hello4.java java -cp code/ch01/ Hello4 3)