To represent a grid of cells, we can use a **multidimensional array**. To create a 2D array, we specify the number of rows and columns:

```code
int rows = 4;
int cols = 3;
Cell[][] array = new Cell[rows][cols];
```

The result is an array with four rows and three columns. Initially, the elements of the array are `null`. We can fill the array with `Cell` objects like this:

```code
for (int r = 0; r < rows; r++) {
    int y = r * size;
    for (int c = 0; c < cols; c++) {
        int x = c * size;
        array[r][c] = new Cell(x, y, size);
    }
}
```

The loop variables `r` and `c` are the row and column indexes of the cells. The variables `x` and `y` are the coordinates, respectively. For example, if `size` is 10 pixels, the cell at index (1, 2) would be at coordinates (10, 20) on the screen.

In Java, a 2D array is really an array of arrays. You can think of it as an array of rows, where each row is an array. Figure 15.3 shows what it looks like.

![Figure 15.3 Storing rows and columns with a 2D array.](figs/2D-array.jpg)

**Figure 15.3 Storing rows and columns with a 2D array.**


When we write `array[r][c]`, Java uses the first index to select a row and the second index to select an element from the row. This way of representing 2D data is known as **row-major order**.