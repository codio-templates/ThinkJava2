
Before you do anything else, make sure you know how to run a Java program within the platform.

* At the left is the Hello World program from the beginning of this chapter. Press the "Run!" and make sure it works.
  {Run!}(sh .guides/bg.sh javac code/ch01/Hello4.java java -cp code/ch01/ Hello4 1)

* Add a print statement that displays a second message after the `Hello, World!`.
  Say something witty like, `How are you?`.
  Press the "Run!" to see how it worked.
  {Run!}(sh .guides/bg.sh javac code/ch01/Hello4.java java -cp code/ch01/ Hello4 2)

* Add a comment to the program (anywhere).
  Press the "Run!" to see how it worked.
  {Run!}(sh .guides/bg.sh javac code/ch01/Hello4.java java -cp code/ch01/ Hello4 3)
  The new comment should not affect the result.

This exercise may seem trivial, but it is the starting place for many of the programs we will work with.
To debug with confidence, you will need to have confidence in your programming environment.

In some environments, it is easy to lose track of which program is executing.
You might find yourself trying to debug one program while you are accidentally running another.
Adding (and changing) print statements is a simple way to be sure that the program you are looking at is the program you are running. 
