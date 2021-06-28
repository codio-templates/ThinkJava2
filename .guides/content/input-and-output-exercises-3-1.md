When you use `printf`, the Java compiler does not check your format string. See what happens if you try to display a value with type `int` using `%f`. And what happens if you display a `double` using `%d`? What if you use two format specifiers, but then provide only one value?


See the example java code in the left pane. To compile and run the code, press the "Run"! {Run!}(sh .guides/bg.sh javac code/ch03/Exercises.java java -cp code/ch04/ Exercises)