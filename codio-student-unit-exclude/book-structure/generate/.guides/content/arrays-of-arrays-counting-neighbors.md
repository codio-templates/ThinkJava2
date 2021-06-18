Now that you know about `try` and `catch`, we can use them to implement a useful method in `GridCanvas`. Part of the GoL logic is to count the number of live neighbors. Most cells have eight neighbors, as shown in Figure 15.5.

However, cells on the edges and in the corners have fewer neighbors. If we try to count all possible neighbors, we'll go out of bounds. The following method uses a `try`-`catch` statement to deal with these special cases:

```code
public int test(int r, int c) {
    try {
        if (array[r][c].isOn()) {
            return 1;
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        // cell doesn't exist
    }
    return 0;
}
```

![Figure 15.5 Cells in the interior of the grid have eight neighbors. Cells in the corners and along the edges have fewer neighbors.](figs/grid.jpg)

**Figure 15.5 Cells in the interior of the grid have eight neighbors. Cells in the corners and along the edges have fewer neighbors.**

The `test` method takes a row index, `r`, and a column index, `c`. It tries to look up the `Cell` at that location. If both indexes are in bounds, the `Cell` exists. In that case, `test` returns `1` if the `Cell` is on. Otherwise, it skips the catch block and returns `0`.

If either index is out of bounds, the array lookup throws an exception, but the catch block ignores it. Then `test` resumes and returns `0`. So the non-existent cells around the perimeter are considered to be off.

Now we can use `test` to implement `countAlive`, which takes a grid location, `(r, c)`, and returns the number of live neighbors surrounding that location:

```code
private int countAlive(int r, int c) {
    int count = 0;
    count += grid.test(r - 1, c - 1);
    count += grid.test(r - 1, c);
    count += grid.test(r - 1, c + 1);
    count += grid.test(r, c - 1);
    count += grid.test(r, c + 1);
    count += grid.test(r + 1, c - 1);
    count += grid.test(r + 1, c);
    count += grid.test(r + 1, c + 1);
    return count;
}
```

Because `test` handles “out of bounds” exceptions, `countAlive` works for any values of `r` and `c`.