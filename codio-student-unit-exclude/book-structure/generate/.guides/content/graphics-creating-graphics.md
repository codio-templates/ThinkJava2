There are several ways to create graphics in Java; the simplest way is to use `java.awt.Canvas` and `java.awt.Graphics`. A `Canvas` is a blank rectangular area of the screen onto which the application can draw. The `Graphics` class provides basic drawing methods such as `drawLine`, `drawRect`, and `drawString`.

At the left and below, we can see an example program that draws a circle by using the `fillOval` method:


```code
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Drawing drawing = new Drawing();
        drawing.setSize(400, 400);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }
}
```

The `Drawing` class extends `Canvas`, so it has all the methods provided by `Canvas`, including `setSize`. You can read about the other methods in the documentation, which you can find by doing a web search for "Java Canvas".


In the `main` method, we do the following:
1. [Create a `JFrame` object](open_file code/appc/Drawing.java panel=0 ref="new JFrame" count=2), which is the window that will contain the canvas.
1. [Create a `Drawing` object](open_file code/appc/Drawing.java panel=0 ref="Canvas drawing" count=2) (which is the canvas), set its width and height, and add it to the frame.
1. [Pack the frame](open_file code/appc/Drawing.java panel=0 ref="frame.add" count=3) (resize it) to fit the canvas, and display it on the screen.
[Click to remove highlights](open_file code/appc/Drawing.java panel=0)


Once the frame is visible, the `paint` method is called whenever the canvas needs to be drawn; for example, when the window is moved or resized. If you run this code, you should see a black circle on a gray background.

The application doesn't end after the `main` method returns; instead, it waits for the `JFrame` to close. When the `JFrame` closes, it calls `System.exit`, which ends the program.