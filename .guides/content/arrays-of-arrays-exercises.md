The code for this chapter is in the *ch15* directory of *ThinkJavaCode2*. See page in section Using the Code Examples for instructions on how to download the repository. Before you start the exercises, we recommend that you compile and run the examples.


**Exercise 15.1:**
In `GridCanvas`, write a method named `countOn` that returns the total number of cells that are “on”. This method can be used, for example, to track the population in Game of Life over time.


**Exercise 15.2:**
In our version of the Game of Life, the grid has a finite size. As a result, moving objects such as Gliders either crash into the wall or go out of bounds.

An interesting variation of the Game of Life is a “toroidal” grid, meaning that the cells “wrap around” on the edges. Modify the `test` method of `GridCanvas` so that the coordinates `r` and `c` map to the opposite side of the grid if they are too low or two high.

Run your code with a Glider (see Figure 15.1) to see if it works. You can initialize the Glider by modifying the constructor in the `Conway` class, or by reading it from a file (see the next exercise).





**Exercise 15.3:**
The LifeWiki site ([https://conwaylife.com/wiki/](https://conwaylife.com/wiki/)) has a fascinating collection of patterns for the Game of Life. These patterns are stored in a file format that is easy to read, in files with the suffix “.cells”.

For example, here is an \mbox{8 x 10} grid with a Glider near the upper-left corner:

```code
!Name: Glider
..........
..O.......
...O......
.OOO......
..........
..........
..........
..........
```

Lines that begin with `!` are comments and should be ignored. The rest of the file describes the grid, row by row. A period represents a dead cell, and an uppercase `O` represents a live cell. See [https://conwaylife.com/wiki/Plaintext](https://conwaylife.com/wiki/Plaintext) for more examples.



1. Create a plain text file with the contents shown above, and save the file as *glider.cells* in the same directory as your code.
1. Define a constructor for the `Conway` class that takes a string representing the name (or path) of a “.cells” file. Here is a starting point: ```code
public Conway(String path) {
    File file = new File(path);
    Scanner scan = new Scanner(file);
}
```
1. Modify the `main` method to invoke the constructor as follows: ```code
Conway game = new Conway("glider.cells");
```
1. Handle the `FileNotFoundException` that may be thrown when creating a `Scanner` for a `File` by invoking `printStackTrace` on the exception object and calling `System.exit()` with a status of `1`, indicating an error.
1. Continue implementing the constructor by reading all non-comment lines into an `ArrayList` via `hasNextLine` and `nextLine` of the `Scanner`.
1. Determine the number of rows and columns of the grid by examining the `ArrayList` contents.
1. Create and initialize a `GridCanvas` based on the `ArrayList`.



Once your constructor is working, you will be able to run many of the patterns on the LifeWiki. You might want to add a margin of empty cells around the initial pattern, to give it room to grow.


**Exercise 15.4:**
Some files on the LifeWiki use “run-length encoding” (RLE) instead of plain text. The basic idea of RLE is to describe the number of dead and alive cells, rather than type out each individual cell.

For example, *glider.cells* from the previous exercise could be represented this way with RLE:

```code
#C Name: Glider
x = 10, y = 8
$2bo$3bo$b3o!
```

The first line specifies \verb|x| (the number of columns) and \verb|y| (the number of rows). Subsequent lines consist of the letters \verb|b| (dead), \verb|o| (alive), and \verb|$| (end of line), optionally preceded by a count. The pattern ends with \verb|!|, after which any remaining file contents are ignored.

Lines beginning with \verb|#| have special meaning and are not part of the pattern. For example, \verb|#C| is a comment line. You can read more about RLE format on [https://conwaylife.com/wiki/RLE](https://conwaylife.com/wiki/RLE).



1. Create a plain text file with the preceding contents, and save the file as *glider.rle* in the same directory as your code.
1. Modify your constructor from the previous exercise to check the last three characters of the `path`. If they are `"rle"`, then you will need to process the file as RLE. Otherwise, assume the file is in “.cells” format.
1. In the end, your constructor should be able to read and initialize grids in both formats. Test your constructor by modifying the `main` method to read different files.