In math, 2D points are often written in parentheses with a comma separating the coordinates. For example, $(0,0)$ indicates the origin, and $(x,y)$ indicates the point $x$ units to the right and $y$ units up from the origin.



The `java.awt` package provides a class named `Point` that represents a location in a Cartesian plane. In order to use the ```Point``` class, you have to [ import it:](open_file code/ch10/PointObjects.java panel=0 ref="java.awt.Point" count=1)


```code
import java.awt.Point;
```

[REMOVE HIGHLIGHT](open_file code/ch10/PointObjects.java panel=0 count=1)


Then, to create a new point, you use the ```new``` [ operator:](open_file code/ch10/PointObjects.java panel=0 ref="Point blank" count=2)


```code
Point blank;
blank = new Point(3, 4);
```

[REMOVE HIGHLIGHT](open_file code/ch10/PointObjects.java panel=0 count=1)


The first line declares that `blank` has type `Point`. The second line creates the new `Point` with the coordinates $x=3$ and $y=4$. The result of the `new` operator is a *reference* to the object. Figure 10.1 shows the result.


![Figure 10.1 Memory diagram showing a variable that refers to a `Point` object.](figs/reference.jpg)

**Figure 10.1 Memory diagram showing a variable that refers to a `Point` object.**

As usual, the name of the variable `blank` appears outside the box, and its value appears inside the box. In this case, the value is a reference, which is represented with an arrow. The arrow points to the `Point` object, which contains two variables, `x` and `y`.




Variables that belong to an object are called **attributes**. In some documentation, you also see them called “fields”. To access an attribute of an object, Java uses **dot notation**. [For example:](open_file code/ch10/PointObjects.java panel=0 ref="int x" count=1)


```code
int x = blank.x;
```

[REMOVE HIGHLIGHT](open_file code/ch10/PointObjects.java panel=0 count=1)
 The expression `blank.x` means “go to the object `blank` refers to, and get the value of the attribute `x`.” In this case, we assign that value to a local variable named `x`.

There is no conflict between the local variable `x` and the attribute `x`. The purpose of dot notation is to identify *which* variable you are referring to unambiguously.

You can use dot notation as part of an expression. [For example:](open_file code/ch10/PointObjects.java panel=0 ref="System" count=2)


```code
System.out.println(blank.x + ", " + blank.y);
int sum = blank.x * blank.x + blank.y * blank.y;
```

[REMOVE HIGHLIGHT](open_file code/ch10/PointObjects.java panel=0 count=1)
 To compile and run this statement, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch10/PointObjects.java java -cp code/ch10/ PointObjects )
 The first line displays `3, 4`. The second line calculates the value `25`.