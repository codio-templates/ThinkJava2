Often when you declare an object variable, you assign it to reference an object. But sometimes you want to declare a variable that doesn't refer to an object, at least initially.


In Java, the keyword `null` is a special value that means “no object”. You can initialize object and array variables using `null` as shown [on the left.](open_file code/ch09/Objects.java panel=0 ref="null" count=4)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)


The value `null` is represented in memory diagrams by a small box with no arrow, as in Figure 9.4.

![Figure 9.4 Memory diagram showing variables that are `null`.](figs/mem4.jpg)

**Figure 9.4 Memory diagram showing variables that are `null`.**


If you try to use a variable that is `null` by invoking a method or accessing an element, Java throws a `NullPointerException`, as in the two cases [on the left.](open_file code/ch09/Objects.java panel=0 ref="NullPointerException" count=2)
To see what a NullPointerException looks like, try removing the comments from the two lines of code and clicking "Run!" below.
{Run!}(sh .guides/bg.sh javac code/ch09/Objects.java java -cp code/ch09/ Objects 0)
[Click to remove highlight](open_file code/ch09/Objects.java panel=0)


On the other hand, it is perfectly fine to pass a `null` reference as an argument to a method, or to receive one as a return value. In these situations, `null` is often used to represent a special condition or indicate an error.