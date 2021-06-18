Now we're ready to implement the game. To encapsulate the rules of GoL, we define a class named `Conway`. The `Conway` class “has a” `GridCanvas` that represents the state of the game.

This constructor makes a `GridCanvas` with 5 rows and 10 columns, with cells that are 20 pixels wide and high. It then sets up the initial conditions:

```code
public class Conway {
    private GridCanvas grid;

    public Conway() {
        grid = new GridCanvas(5, 10, 20);
        grid.turnOn(2, 1);
        grid.turnOn(2, 2);
        grid.turnOn(2, 3);
        grid.turnOn(1, 7);
        grid.turnOn(2, 7);
        grid.turnOn(3, 7);
    }
}
```

Before we implement the rest of the game, we'll write a `main` method that creates a `Conway` object and displays it. We can use this method to test `Cell` and `GridCanvas`, and to develop the other methods we need:

```code
public static void main(String[] args) {
    String title = "Conway's Game of Life";
    Conway game = new Conway();
    JFrame frame = new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(game.grid);
    frame.pack();
    frame.setVisible(true);
    game.mainloop();
}
```


After constructing the `game` object, `main` constructs a `JFrame`, which creates a window on the screen. The `JFrame` is configured\footnotemark{} to exit the program when closed. Resizing the window is disabled.

\footnotetext{ We are using `JFrame` (in `javax.swing`) instead of `Frame` (in `java.awt`) for simplicity. `Frame` does not provide a default close operation; it requires you to implement a method to be called when the user closes the window. }

`main` then adds the `GridCanvas` inside the frame, resizes (“packs”) the frame to fit the canvas, and makes the frame visible. Figure 15.4 shows the result.

![Figure 15.4 Screenshot of the initial `Conway` application.](figs/conway.png)

**Figure 15.4 Screenshot of the initial `Conway` application.**