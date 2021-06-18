The Game of Life, or GoL for short, was developed by John Conway and popularized in 1970 in Martin Gardner's column in *Scientific American*. Conway calls it a “zero-player game” because no players are needed to choose strategies or make decisions. After you set up the initial conditions, you watch the game play itself. That turns out to be more interesting than it sounds; you can read about it at [https://en.wikipedia.org/wiki/Conway's_Game_of_Life](https://en.wikipedia.org/wiki/Conway's_Game_of_Life).

The game board is a 2D grid of square cells. Each cell is either “alive” or “dead”; the color of the cell indicates its state. Figure 15.1 shows an example grid configuration; the five black cells are alive.

![Figure 15.1 A “Glider” in the Game of Life.](figs/glider.png)

**Figure 15.1 A “Glider” in the Game of Life.**


The game proceeds in time steps, during which each cell interacts with its neighbors in the eight adjacent cells. At each time step, the following rules are applied:



\small
* A live cell with fewer than two live neighbors dies, as if by underpopulation.
* A live cell with more than three live neighbors dies, as if by overpopulation.
* A dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.




Notice some consequences of these rules. If you start with a single live cell, it dies. If all cells are dead, no cells come to life. But if you have four cells in a square, they keep each other alive, so that's a “stable” configuration.

Another initial configuration is shown in Figure 15.2. If you start with three horizontal cells, the center cell lives, the left and right cells die, and the top and bottom cells come to life. The result after the first time step is three vertical cells.

During the next time step, the center cell lives, the top and bottom cells die, and the left and right cells come to life. The result is three horizontal cells, so we're back where we started, and the cycle repeats forever.

![Figure 15.2 A “Blinker” in the Game of Life.](figs/figure15-2.png)

**Figure 15.2 A “Blinker” in the Game of Life.**

Patterns like this are called “periodic”, because they repeat after a period of two or more time steps. But they are also considered stable, because the total number of live cells doesn't grow over time.

Most simple starting configurations either die out quickly or reach a stable configuration. But there are a few starting conditions that display remarkable complexity. One of those is the R-pentomino ([https://www.conwaylife.com/wiki/R-pentomino](https://www.conwaylife.com/wiki/R-pentomino)), which starts with only five cells, runs for 1,103 time steps, and ends in a stable configuration with 116 live cells.

In the following sections, we'll implement the Game of Life in Java. We'll first implement the cells, then the grid of cells, and finally the game itself.