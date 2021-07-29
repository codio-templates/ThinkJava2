We begin by defining a `Langton` class that has a grid and information about the ant, as seen [at the left.](open_file code/ch16/Langton.java panel=0 ref="public class Langton" count=19)
[Click to remove highlight](open_file code/ch16/Langton.java panel=0)
 The constructor takes the grid dimensions as parameters:

```code
public class Langton {
    private GridCanvas grid;
    private int xpos;
    private int ypos;
    private int head; // 0=North, 1=East, 2=South, 3=West

    public Langton(int rows, int cols) {
        grid = new GridCanvas(rows, cols, 10);
        xpos = rows / 2;
        ypos = cols / 2;
        head = 0;
    }
}
```


`grid` is a `GridCanvas` object, which represents the state of the cells. `xpos` and `ypos` are the coordinates of the ant, and `head` is the “heading” of the ant; that is, which direction it is facing. `head` is an integer with four possible values, where `0` means the ant is facing “north” (i.e., toward the top of the screen), `1` means “east”, etc.

Here's an `update` method that implements the rules for Langton's Ant, also seen [at the left.](open_file code/ch16/Langton.java panel=0 ref="void update" count=4)
[Click to remove highlight](open_file code/ch16/Langton.java panel=0)


```code
public void update() {
    flipCell();
    moveAnt();
}
```

The `flipCell` method gets the `Cell` at the ant's location, figures out which way to turn, and changes the state of the cell, as seen [at the left.](open_file code/ch16/Langton.java panel=0 ref="flipCell" count=11)
[Click to remove highlight](open_file code/ch16/Langton.java panel=0)


```code
private void flipCell() {
    Cell cell = grid.getCell(xpos, ypos);
    if (cell.isOff()) {
        head = (head + 1) % 4;    // turn right
        cell.turnOn();
    } else {
        head = (head + 3) % 4;    // turn left
        cell.turnOff();
    }
}
```

We use the remainder operator, `%`, to make `head` wrap around: if `head` is 3 and we turn right, it wraps around to 0; if `head` is 0 and we turn left, it wraps around to 3.

Notice that to turn right, we add 1 to `head`. To turn left, we could subtract 1, but `-1 % 4` is `-1` in Java. So we add 3 instead, since one left turn is the same as three right turns.

The `moveAnt` method moves the ant forward one square, using `head` to determine which way is forward, as shown below and [at the left.](open_file code/ch16/Langton.java panel=0 ref="moveAnt" count=10)
[Click to remove highlight](open_file code/ch16/Langton.java panel=0)


```code
private void moveAnt() {
    if (head == 0) {
        ypos -= 1;
    } else if (head == 1) {
        xpos += 1;
    } else if (head == 2) {
        ypos += 1;
    } else {
        xpos -= 1;
    }
}
```

Here is the `main` method we use to create and display the `Langton` object, also shown [at the left.](open_file code/ch16/Langton.java panel=0 ref="public static void main" count=10)
[Click to remove highlight](open_file code/ch16/Langton.java panel=0)

{Run!}(sudo bash .guides/bg2.sh javac code/ch16/Langton.java code/ch16/Cell.java code/ch16/GridCanvas.java java -cp code/ch16/ Langton) 

{Compile Add'l Classes | terminal}(javac code/ch16/Cell.java code/ch16/GridCanvas.java)

{Try it}(bash .guides/swing.sh cd code/ch16 javac Langton.java java Langton )


```code
public static void main(String[] args) {
    String title = "Langton's Ant";
    Langton game = new Langton(61, 61);
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(game.grid);
    frame.pack();
    frame.setVisible(true);
    game.mainloop();
}
```

Most of this code is the same as the `main` we used to create and run `Conway`, in Section 15.6. It creates and configures a `JFrame` and runs `mainloop`.

And that's everything! If you run this code with a grid size of \mbox{61 x 61} or larger, you will see the ant eventually settle into a repeating pattern.

Because we designed `Cell` and `GridCanvas` to be reusable, we didn't have to modify them at all. However, we now have two copies of `main` and `mainloop`---one in `Conway`, and one in `Langton`.