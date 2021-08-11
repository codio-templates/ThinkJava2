You are probably used to Cartesian **coordinates**, where $x$ and $y$ values can be positive or negative. In contrast, Java uses a coordinate system where the origin is in the upper-left corner. That way, $x$ and $y$ can always be positive integers. Figure 20.1 shows these coordinate systems side by side.

![Figure 20.1 The difference between Cartesian coordinates and Java graphical coordinates.](figs/coordinates.jpg)

**Figure 20.1 The difference between Cartesian coordinates and Java graphical coordinates.**


Graphical coordinates are measured in **pixels**; each pixel corresponds to a dot on the screen.

To draw on the canvas, you invoke methods on a `Graphics` object. You don't have to create the `Graphics` object; it gets created when you create the `Canvas`, and it gets passed as an argument to `paint`.

[The previous example](open_file code/appc/Drawing.java panel=0 ref="fillOval" count=1) used `fillOval`, which has the following signature:
[Click to remove highlight](open_file code/appc/Drawing.java panel=0)


```code
/**
 * Fills an oval bounded by the specified rectangle with
 * the current color.
 */
public void fillOval(int x, int y, int width, int height)
```


The four parameters specify a **bounding box**, which is the rectangle in which the oval is drawn. `x` and `y` specify the location of the upper-left corner of the bounding box. The bounding box itself is not drawn (see Figure 20.2).

![Figure 20.2 An oval inside its bounding box.](figs/circle.jpg)

**Figure 20.2 An oval inside its bounding box.**


To choose the color of a shape, invoke `setColor` on the `Graphics` object, as shown [at the left.](open_file code/appc/Drawing.java panel=0 ref="setColor" count=1)
[Click to remove highlight](open_file code/appc/Drawing.java panel=0)


```code
g.setColor(Color.RED);
```

The `setColor` method determines the color of everything that gets drawn afterward. `Color.red` is a constant provided by the `Color` class; to use it, you have to `import java.awt.Color`. Other colors include the following:

```code
BLACK       BLUE      CYAN     DARKGRAY   GRAY    LIGHTGRAY
GREEN       MAGENTA   ORANGE   PINK       WHITE   YELLOW
```


You can create your own colors by specifying the red, green, and blue (**RGB**) components. See the example [at the left.](open_file code/appc/Drawing.java panel=0 ref="purple" count=1)
[Click to remove highlight](open_file code/appc/Drawing.java panel=0)


```code
Color purple = new Color(128, 0, 128);
```

Each value is an integer in the range 0 (darkest) to 255 (lightest). The color `(0, 0, 0)` is black, and `(255, 255, 255)` is white.

You can set the background color of the `Canvas` by invoking `setBackground`, as shown [here](open_file code/appc/Drawing.java panel=0 ref="setBackground" count=1).
[Click to remove highlight](open_file code/appc/Drawing.java panel=0)


```
 this.setBackground(Color.WHITE);
```
Note that the keyword `this` is used to represent the `Canvas` object. This is correct because the `paint()` method is called on `Drawing` objects, which are a type of `Canvas`. The methods called from `main` work such that `paint` is called behind the scenes on the instance `drawing`. 
Test the code using the "Try It!" button below. 

{Try It!}(bash .guides/swing.sh cd code/appc javac Drawing.java java Drawing )

If the display doesn't appear in the bottom left corner, click [here.](open_preview https://{{domain3000}} panel=1)
