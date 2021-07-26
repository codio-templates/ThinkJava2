In Chapter 15, we developed classes to implement Conway's Game of Life. We can reuse the `Cell` and `GridCanvas` classes to implement other simulations. One of the most interesting zero-player games is *Langton's Ant*, which models an “ant” that walks around a grid. The ant follows only two simple rules:



1. If the ant is on a white cell, it turns to the right, makes the cell black, and moves forward.
1. If the ant is on a black cell, it turns to the left, makes the cell white, and moves forward.



Because the rules are simple, you might expect the ant to do something simple, like make a square or repeat a simple pattern. But starting on a grid with all white cells, the ant makes more than 10,000 steps in a seemingly random pattern before it settles into a repeating loop of 104 steps. You can read more about it at [this site](open_preview https://en.wikipedia.org/wiki/Langtons_ant panel=0)



In this chapter, we present an implementation of Langton's Ant and use it to demonstrate more advanced object-oriented techniques.