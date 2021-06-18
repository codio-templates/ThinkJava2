One way to keep track of variables is to draw a **stack diagram**, which is a memory diagram (see Section 2.3) that shows currently running methods. For each method there is a box, called a **frame**, that contains the method's parameters and local variables. The name of the method appears outside the frame; the variables and parameters appear inside.

As with memory diagrams, stack diagrams show variables and methods at a particular point in time. Figure 4.1 is a stack diagram at the beginning of the `printTime` method. Notice that `main` is on top, because it executed first.

![Figure 4.1 Stack diagram for `printTime(hour + 1, 0)`.](figs/stack1.jpg)

**Figure 4.1 Stack diagram for `printTime(hour + 1, 0)`.**


Stack diagrams help you to visualize the **scope** of a variable, which is the area of a program where a variable can be used.


Stack diagrams are a good mental model for how variables and methods work at run-time. Learning to trace the execution of a program on paper (or on a whiteboard) is a useful skill for communicating with other programmers.

Educational tools can automatically draw stack diagrams for you. For example, Java Tutor ([https://thinkjava.org/javatutor](https://thinkjava.org/javatutor)) allows you to step through an entire program, both forward and backward, and see the stack frames and variables at each step. If you haven't already, you should check out the Java examples on that website.