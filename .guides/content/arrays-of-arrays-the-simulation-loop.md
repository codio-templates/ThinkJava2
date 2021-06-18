At the end of `main`, we call `mainloop`, which uses a `while` loop to simulate the time steps of the Game of Life. Here's a rough draft of this method:

```code
private void mainloop() {
    while (true) {
        this.update();
        grid.repaint();
        Thread.sleep(500);    // compiler error
    }
}
```

During each time step, we update the state of the game and repaint the `grid`. We will present the `update` method in Section 15.10.

`repaint` comes from the `Canvas` class. By default, it calls the `paint` method we provided, which calls `draw`. The reason we use it here is that `repaint` does not require a `Graphics` object as a parameter.


`Thread.sleep(500)` causes the program to “sleep” for 500 milliseconds, or a half second. Otherwise, the program would run so fast we would not be able to see the animation.


There's just one problem: compiling this code results in the error “unreported exception InterruptedException”. This message means we need to do some exception handling.