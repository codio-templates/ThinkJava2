The code for this chapter is in the *ch17* directory of *ThinkJavaCode2*. See page in section Using the Code Examples for instructions on how to download the repository. Before you start the exercises, we recommend that you compile and run the examples.

The following exercises give you a chance to practice using the features in this chapter by extending the example code.


**Exercise 17.1:**
The `Polygon` class does not provide a `toString` method; it inherits the default `toString` from `java.lang.Object`, which includes only the class's name and memory location. Write a more useful `toString` method for `DrawablePolygon` that includes its $(x, y)$ points.


**Exercise 17.2:**
Write a class `MovingPolygon` that extends `RegularPolygon` and implements `Actor`. It should have instance variables `posx` and `posy` that specify its position, and `dx` and `dy` that specify its velocity (and direction). During each time step, it should update its position. If it gets to the edge of the `Drawing`, it should reverse direction by changing the sign of `dx` or `dy`.


**Exercise 17.3:**
Modify the `VideoGame` class so it displays a `Sprite` and a `MovingPolygon` (from the previous exercise). Add code that detects collisions between `Actor` objects in the same `Drawing`, and invoke a method on both objects when they collide.

*Hint:* You might want to add a method to the `Actor` interface, guaranteeing that all `Actor` objects know how to handle collisions.


**Exercise 17.4:**
Java provides other event listeners that you can implement to make your programs interactive. For example, the interfaces `MouseListener`, `MouseMotionListener`, and `MouseWheelListener` allow you to respond to mouse input. Use the `MouseListener` interface to implement an `Actor` that can respond to mouse clicks.