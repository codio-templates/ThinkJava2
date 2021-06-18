Now that we have a `Cell` class and a way to represent a 2D array of cells, we can write a class to represent a grid of cells. We encapsulate the code from the previous section and generalize it to construct a grid with any number of rows and columns:

```code
public class GridCanvas extends Canvas {
    private Cell[][] array;

    public GridCanvas(int rows, int cols, int size) {
        array = new Cell[rows][cols];
        for (int r = 0; r < rows; r++) {
            int y = r * size;
            for (int c = 0; c < cols; c++) {
                int x = c * size;
                array[r][c] = new Cell(x, y, size);
            }
        }

        // set the canvas size
        setSize(cols * size, rows * size);
    }
}
```


Using vocabulary from the previous chapter, `GridCanvas` “is a” `Canvas` that “has a” 2D array of cells. By extending the `Canvas` class from `java.awt`, we inherit methods for drawing graphics on the screen.


In fact, the code is surprisingly straightforward: to draw the grid, we simply draw each cell. We use nested `for` loops to traverse the 2D array:

```code
public void draw(Graphics g) {
    for (Cell[] row : array) {
        for (Cell cell : row) {
            cell.draw(g);
        }
    }
}
```

The outer loop traverses the rows; the inner loop traverses the cells in each row. You can almost read this method in English: “For each `row` in the `array`, and for each `cell` in the `row`, draw the `cell` in the graphics context.” Each cell contains its coordinates and size, so it knows how to draw itself.

Classes that extend `Canvas` are supposed to provide a method called `paint` that “paints” the contents of the `Canvas`. It gets invoked when the `Canvas` is created and anytime it needs to be redrawn; for example, when its window is moved or resized.

Here's the `paint` method for `GridCanvas`. When the window management system calls `paint`, `paint` calls `draw`, which draws the cells:

```code
public void paint(Graphics g) {
    draw(g);
}
```