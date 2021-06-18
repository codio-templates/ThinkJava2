When drawing a cell, we'll need to know its location on the screen and size in pixels. To represent the location, we use the `x` and `y` coordinates of the upper-left corner. And to represent the size, we use an integer, `size`.


To represent the state of a cell, we use an integer, `state`, which is `0` for dead cells and `1` for live cells. We could use a `boolean` instead, but it's good practice to design classes to be reusable (e.g., for other games that have more states).

Here is a `Cell` class that declares these instance variables:

```code
public class Cell {
    private final int x;
    private final int y;
    private final int size;
    private int state;
}
```

Notice that `x`, `y`, and `size` are constants. Once the cell is created, we don't want it to move or change size. But `state` can and should change, so it is not a constant.

The next step is to write a constructor. Here's one that takes `x`, `y`, and `size` as parameters, and sets `state` to a default value:

```code
public Cell(int x, int y, int size) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.state = 0;
}
```


The following method draws a cell. Like the `paint` method in Appendix 20, it takes a graphics context as a parameter:

```code
public static final Color[] COLORS = {Color.WHITE, Color.BLACK};

public void draw(Graphics g) {
    g.setColor(COLORS[state]);
    g.fillRect(x + 1, y + 1, size - 1, size - 1);
    g.setColor(Color.LIGHT_GRAY);
    g.drawRect(x, y, size, size);
}
```

The `draw` method uses the state of the cell to select a color from an array of `Color` objects. Then it uses to `fillRect` to draw the center of the cell and `drawRect` to draw a light-gray border.

We also need methods to get and set the cell's state. We could just provide `getState` and `setState`, but the code will be more readable if we provide methods customized for the Game of Life:

```code
public boolean isOff() {
    return state == 0;
}

public boolean isOn() {
    return state == 1;
}

public void turnOff() {
    state = 0;
}

public void turnOn() {
    state = 1;
}
```