The point of this exercise is to explore Java types and fill in some of the details that aren't covered in the chapter.




1. In the program to the left, `Test.java`, write a `main` method that contains expressions that combine various types using the `+` operator. For example, what happens when you “add” a `String` and a `char`? Does it perform character addition or string concatenation? What is the type of the result? {Run!}(sh .guides/bg.sh javac code/ch09/Test.java java -cp code/ch09/ Test 1)
1. Make a bigger copy of the following table and fill it in. At the intersection of each pair of types, you should indicate whether it is legal to use the `+` operator with these types by indicating `Yes` or `No` in the table. (For the `String` type, exclude empty-string concatenation for now. This is a special case that you should try in #5.) Also, consider for each case - is this addition or concatenation? What is the data type of the result? {Check It!|assessment}(fill-in-the-blanks-2087744111)
1. Think about some of the choices the designers of Java made, based on this table. How many of the entries seem unavoidable, as if there was no other choice? How many seem like arbitrary choices from several equally reasonable possibilities? Which entries seem most problematic?
1. Here's a puzzler: normally, the statement `x++` is exactly equivalent to `x = x + 1`. But if `x` is a `char`, it's not exactly the same! In that case, `x++` is legal, but `x = x + 1` causes an error. Try it out. See what the error message is, and then see if you can figure out what is going on. {Run!}(sh .guides/bg.sh javac code/ch09/Test.java java -cp code/ch09/ Test 2)
1. What happens when you add `""` (the empty string) to the other types; for example, `"" + 5`?