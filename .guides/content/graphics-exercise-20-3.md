In this exercise, you will draw “Moire&#x301; patterns” that seem to shift around as you move. For an explanation of what is going on, see [https://en.wikipedia.org/wiki/Moire_pattern](https://en.wikipedia.org/wiki/Moire_pattern).



1. Open *Moire.java* and read the `paint` method. Draw a sketch of what you expect it to do. Now run it. Did you get what you expected?
1. Modify the program so that the space between the circles is larger or smaller. See what happens to the image.
1. Modify the program so that the circles are drawn in the center of the screen and concentric, as in Figure 20.5 (left). The distance between the circles should be small enough that the Moire&#x301; interference is apparent. ![Figure 20.5 Graphical patterns that can exhibit Moire&#x301; interference.](figs/moire.jpg)

**Figure 20.5 Graphical patterns that can exhibit Moire&#x301; interference.**
1. Write a method named `radial` that draws a radial set of line segments as shown in Figure 20.5 (right), but they should be close enough together to create a Moire&#x301; pattern.
1. Just about any kind of graphical pattern can generate Moire&#x301;-like interference patterns. Play around and see what you can create.



Test the code using the "Try It!" button below.

{Try It!}(bash .guides/swing.sh cd code/appc javac Moire.java java Moire )

If the display doesn't appear in the bottom left corner, click [here.](open_preview https://{{domain3000}} panel=1)