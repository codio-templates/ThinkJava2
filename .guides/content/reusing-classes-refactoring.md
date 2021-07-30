Whenever you see repeated code like `main`, you should think about ways to remove it. In Chapter 14, we used inheritance to eliminate repeated code. We'll do something similar with `Conway` and `Langton`.

First, we define a superclass named `Automaton`, in which we will put the code that `Conway` and `Langton` have in common, as seen at the left.


```code
public class Automaton {
    private GridCanvas grid;

    public void run(String title, int rate) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(this.grid);
        frame.pack();
        frame.setVisible(true);
        this.mainloop(rate);
    }
}
```


`Automaton` declares `grid` as an instance variable, as seen [at the left](open_file code/misc/Automaton.java panel=0 ref="GridCanvas grid" count=1), so every `Automaton` "has~a" `GridCanvas`. 
[Click to remove highlight](open_file code/misc/Automaton.java panel=0)
 It also provides `run`, which contains the code that creates and configures the `JFrame`.

The `run` method takes two parameters: the window `title` and the frame `rate`; that is, the number of time steps to show per second. It uses `title` when creating the `JFrame`, and it passes `rate` to `mainloop`, which is shown [at the left](open_file code/misc/Automaton.java panel=0 ref="void mainloop" count=14).
[Click to remove highlight](open_file code/misc/Automaton.java panel=0)


```code
private void mainloop(int rate) {
    while (true) {

        // update the drawing
        this.update();
        grid.repaint();

        // delay the simulation
        try {
            Thread.sleep(1000 / rate);
        } catch (InterruptedException e) {
            // do nothing
        }
    }
}
```

`mainloop` contains the code you first saw in Section 15.7. It runs a `while` loop forever (or until the window closes), as shown [here](open_file code/misc/Automaton.java panel=0 ref="while" count=1).
[Click to remove highlight](open_file code/misc/Automaton.java panel=0)
 Each time through the loop, it [runs](open_file code/misc/Automaton.java panel=0 ref="this.update" count=1) `update` to update `grid` and then [runs](open_file code/misc/Automaton.java panel=0 ref="repaint" count=1) `repaint` to redraw the grid.
[Click to remove highlight](open_file code/misc/Automaton.java panel=0)


Then it [calls](open_file code/misc/Automaton.java panel=0 ref="Thread.sleep" count=1) `Thread.sleep` with a delay that depends on `rate`.
[Click to remove highlight](open_file code/misc/Automaton.java panel=0)

Test the code by pressing the following 2 buttons: 

{Compile Add'l Classes | terminal}(javac code/misc/Cell.java code/misc/GridCanvas.java)

{Try it!}(bash .guides/swing.sh cd code/misc javac Automaton.java java Automaton )

[View display](open_preview https://{{domain3000}} panel=1)

 For example, if `rate` is 2, we should draw two frames per second, so the delay is a half second, or 500 milliseconds.


This process of reorganizing existing code, without changing its behavior, is known as **refactoring**. We're almost finished; we just need to redesign `Conway` and `Langton` to extend `Automaton`.