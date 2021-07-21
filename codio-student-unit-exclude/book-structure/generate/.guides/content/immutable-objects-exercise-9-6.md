The code to the left traverses a string and checks whether it has the same number of opening and closing parentheses. However, it is currently in the main method.



1. Move the code out of the main method. Instead, encapsulate it in a method that takes a string argument and returns the final value of `count`.
1. Test your method with multiple strings, including some that are balanced and some that are not.
1. Generalize the code so that it works on any string. What could you do to generalize it more?



{Run!}(sh .guides/bg.sh javac code/ch09/Parens.java java -cp code/ch09/ Parens 1)