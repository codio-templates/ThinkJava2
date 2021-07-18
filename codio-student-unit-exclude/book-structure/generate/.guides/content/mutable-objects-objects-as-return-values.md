The `java.awt` package also provides a class named `Rectangle`. To use it, you have to [  import it:](open_file code/ch10/ObjectReturn.java panel=0 ref="Rectangle" count=1)


```code
import java.awt.Rectangle;
```

[Click to remove the highlight](open_file code/ch10/ObjectReturn.java panel=0 count=5)
 `Rectangle` objects are similar to points, but they have four attributes: `x`, `y`, `width`, and `height`. The following example creates a `Rectangle` object and makes the variable `box` [  refer to it:](open_file code/ch10/ObjectReturn.java panel=0 ref="Rectangle box" count=1)


```code
Rectangle box = new Rectangle(0, 0, 100, 200);
```

[Click to remove the highlight](open_file code/ch10/ObjectReturn.java panel=0 count=5)
 Figure 10.2 shows the effect of this assignment.

![Figure 10.2 Memory diagram showing a `Rectangle` object.](figs/rectangle.jpg)

**Figure 10.2 Memory diagram showing a `Rectangle` object.**

If you run `System.out.println(box)`, you get this:

```code
java.awt.Rectangle[x=0,y=0,width=100,height=200]
```

Again, `println` uses the `toString` method provided by `Rectangle`, which knows how to represent `Rectangle` objects as strings.


You can also write methods that return new objects. For example, `findCenter` takes a `Rectangle` as an argument and returns a `Point` with the coordinates of the center of [  the rectangle:](open_file code/ch10/ObjectReturn.java panel=0 ref="Point findCenter" count=5)


```code
public static Point findCenter(Rectangle box) {
    int x = box.x + box.width / 2;
    int y = box.y + box.height / 2;
    return new Point(x, y);
}
```

[Click to remove the highlight](open_file code/ch10/ObjectReturn.java panel=0 count=5)
 The return type of this method is `Point`. The last line creates a new `Point` object and returns a reference to it.