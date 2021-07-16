In Section 4.5, we used a stack diagram to represent the state of a program during a method invocation. The same kind of diagram can make it easier to interpret a recursive method.

Remember that every time a method gets called, Java creates a new frame that contains the method's parameters and variables. Figure 8.1 is a stack diagram for `countdown`, called with `n == 3`.

![Figure 8.1 Stack diagram for the `countdown` program.](figs/stack2.jpg)

**Figure 8.1 Stack diagram for the `countdown` program.**

By convention, the frame for `main` is at the top, and the stack of other frames grows down. That way, we can draw stack diagrams on paper without needing to guess how far they will grow. The frame for `main` is empty because `main` does not have any variables. (It has the parameter `args`, but since we're not using it, we left it out of the diagram.)


There are four frames for `countdown`, each with a different value for the parameter `n`. The last frame, with `n == 0`, is called the **base case**. It does not make a recursive call, so there are no more frames below it.


If there is no base case in a recursive method, or if the base case is never reached, the stack would grow forever---at least in theory. In practice, the size of the stack is limited. If you exceed the limit, you get a `StackOverflowError`.

For example, [here](open_file code/ch08/Examples2.java panel=0 ref="public static void forever" count=4) is a recursive method without a base case:


```code
public static void forever(String s) {
    System.out.println(s);
    forever(s);
}
```


[Click to remove the highlight.](open_file code/ch08/Examples2.java panel=0)
 This method displays the given string until the stack overflows, at which point it throws an error. Try this example on your computer---you might be surprised by how long the error message is! Give the `nLines` function a try here.
{Run!}(sh .guides/bg.sh javac code/ch08/Examples2.java java -cp code/ch08/ Examples2 )
