If we were not planning to implement any other zero-person games, we could leave well enough alone. But there are a few problems with the current design:



* The `grid` attribute is `private`, making it inaccessible in `Conway` and `Langton`. We could make it `public`, but then other (unrelated) classes would have access to it as well.
* The `Automaton` class has no constructors, and even if it did, there would be no reason to create an instance of this class.
* The `Automaton` class does not provide an implementation of `update`. In order to work properly, subclasses need to provide one.




Java provides language features to solve these problems:

\end{itemize}
* We can make the `grid` attribute `protected` (shown [here](open_file code/ch16/Automaton.java panel=0 ref="protected" count=1)), which means it's accessible to subclasses but not other classes.
* We can make the class `abstract` (shown [here](open_file code/ch16/Automaton.java panel=0 ref="abstract" count=1)), which means it cannot be instantiated. If you attempt to create an object for an abstract class, you will get a compiler error.
* We can declare `update` as an `abstract` method (shown [here](open_file code/ch16/Automaton.java panel=0 ref="abstract void update" count=1)), meaning that it must be overridden in subclasses. If the subclass does not override an abstract method, you will get a compiler error.
[Click to remove highlights](open_file code/ch16/Automaton.java panel=0)


Here's what `Automaton` looks like as an abstract class (using the methods `mainloop` and `run` from Section 16.2):

```code
public abstract class Automaton {
    protected GridCanvas grid;

    public abstract void update();

    private void mainloop(int rate) {
        // this method invokes update
    }

    public void run(String title, int rate) {
        // this method invokes mainloop
    }
}
```

Notice that the `update` method has no body. The declaration specifies the name, arguments, and return type. But it does not provide an implementation, because it is an abstract method.

Notice also the word `abstract` on the first line, which declares that `Automaton` is an abstract class. In order to have any abstract methods, a class must be declared as abstract.

Any class that extends `Automaton` must provide an implementation of `update`; the declaration here allows the compiler to check.

Here's what `Conway` looks like as a subclass of `Automaton`, shown below and [to the left](open_file code/ch16/Conway.java panel=0)

Test the code by pressing the following 3 buttons: 

{Compile Add'l Classes | terminal}(javac code/ch16/Automaton.java)

{Try it!}(bash .guides/swing.sh cd code/ch16 javac Conway.java java Conway )

[View display](open_preview https://{{domain3000}} panel=1)


```code
public class Conway extends Automaton {

    // same methods as before, except mainloop is removed

    public static void main(String[] args) {
        String title = "Conway's Game of Life";
        Conway game = new Conway();
        game.run(title, 2);
    }
}
```

`Conway` extends `Automaton`, so it inherits the `protected` instance variable `grid` and the methods `mainloop` and `run`. But because `Automaton` is abstract, `Conway` has to provide `update` and a constructor (which it has already).

Abstract classes are essentially “incomplete” class definitions that specify methods to be implemented by subclasses. But they also provide attributes and methods to be inherited, thus eliminating repeated code.