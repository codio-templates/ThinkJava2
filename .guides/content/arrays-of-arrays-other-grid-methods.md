In addition to `draw` and `paint`, the `GridCanvas` class provides methods for working with the grid itself. `numRows` and `numCols` return the number of rows and columns. We can get this information from the 2D array, using `length`:

```code
public int numRows() {
    return array.length;
}

public int numCols() {
    return array[0].length;
}
```

Because we are using row-major order, the 2D array is an array of rows. `numRows` simply returns the length of the rows array. `numCols` returns the length of the first row, which is the number of columns. Since the rows all have the same length, we have to check only one.

`GridCanvas` also provides a method that gets the `Cell` at a given location, and for convenience when starting the game, a method that turns on the `Cell` at a given location.

```code
public Cell getCell(int r, int c) {
    return array[r][c];
}

public void turnOn(int r, int c) {
    array[r][c].turnOn();
}
```