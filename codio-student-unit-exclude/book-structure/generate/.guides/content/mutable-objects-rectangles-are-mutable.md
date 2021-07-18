You can change the contents of an object by making an assignment to one of its attributes. For example, to “move” a rectangle without changing its size, you can modify the `x` and `y` values:

```code
Rectangle box = new Rectangle(0, 0, 100, 200);
box.x = box.x + 50;
box.y = box.y + 100;
```

The result is shown in Figure 10.3.

![Figure 10.3 Memory diagram showing updated attributes.](figs/rectangle2.jpg)

**Figure 10.3 Memory diagram showing updated attributes.**


We can encapsulate this code in a method and generalize it to move the rectangle by
[ any amount:](open_file code/ch10/PointRect.java panel=0 ref="Rectangle box, int dx, int dy" count=4)


```code
public static void moveRect(Rectangle box, int dx, int dy) {
    box.x = box.x + dx;
    box.y = box.y + dy;
}
```

[Click to remove the highlight](open_file code/ch10/PointRect.java panel=0 count=5)
 The variables `dx` and `dy` indicate how far to move the rectangle in each direction. Invoking this method has the effect of modifying the `Rectangle` that is passed as [ an argument:](open_file code/ch10/PointRect.java panel=0 ref="box, 50, 100" count=1)


```code
Rectangle box = new Rectangle(0, 0, 100, 200);
moveRect(box, 50, 100);  // now at (50, 100, 100, 200)
```

[Click to remove the highlight](open_file code/ch10/PointRect.java panel=0 count=5)


Modifying objects by passing them as arguments to methods can be useful. But it can also make debugging difficult, because it is not always clear which method invocations modify their arguments.

Java provides a number of methods that operate on `Point`s and `Rectangle`s. For example, `translate` has the same effect as `moveRect`, but instead of passing the rectangle as an argument, you use [ dot notation:](open_file code/ch10/PointRect.java panel=0 ref="box.translate" count=1)


```code
box.translate(50, 100);
```

[Click to remove the highlight](open_file code/ch10/PointRect.java panel=0 count=5)
 This line invokes the `translate` method on the object that `box` refers to, which modifies the object.


This syntax---using dot notation to invoke a method on an object, rather than passing it as a parameter---is more consistent with the style of object-oriented programming.