Because Java uses the `=` symbol for assignment, it is tempting to interpret the statement `a = b` as a statement of equality. It is not!

Equality is commutative, and assignment is not. For example, in mathematics if $a = 7$, then $7 = a$. In Java `a = 7;` is a legal assignment statement, but `7 = a;` is not. The left side of an assignment statement has to be a variable name (storage location).

Also, in mathematics, a statement of equality is true for all time. If $a = b$ now, $a$ is always equal to $b$. In Java, an assignment statement can make two variables equal, but they don't have to stay [that way:](open_file code/ch02/MemoryDiagram.java panel=0 ref="int a" count=3)
 [REMOVE HIGHLIGHT](open_file code/ch02/MemoryDiagram.java panel=0 count=3)


```code
int a = 5;
int b = a;     // a and b are now equal
a = 3;         // a and b are no longer equal
```

The third line changes the value of `a`, but it does not change the value of `b`, so they are no longer equal.


Taken together, the variables in a program and their current values make up the program's **state**. Figure 2.1 shows the state of the program after these assignment statements run.

![Figure 2.1 Memory diagram of the variables `a` and `b`.](figs/state.jpg)

**Figure 2.1 Memory diagram of the variables `a` and `b`.**


Diagrams like this one that show the state of the program are called **memory diagrams**. Each variable is represented with a box showing the name of the variable on the outside and its current value inside.

As the program runs, the state of memory changes, so memory diagrams show only a particular point in time. For example, if we added the line ```int c = 0;``` [ to the previous example, ](open_file code/ch02/MemoryDiagram.java panel=0 ref="int c" count=1)
 [REMOVE HIGHLIGHT](open_file code/ch02/MemoryDiagram.java panel=0 count=1)
 the memory diagram would look like Figure 2.2.

![Figure 2.2 Memory diagram of the variables `a`, `b`, and `c`.](figs/state2.jpg)

**Figure 2.2 Memory diagram of the variables `a`, `b`, and `c`.**