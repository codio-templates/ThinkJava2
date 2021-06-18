At the beginning of the chapter, we had three classes: `Cell`, `GridCanvas`, and `Conway`. We then developed `Langton`, which had almost the same `main` and `mainloop` methods as `Conway`. So we refactored the code and created `Automaton`. Figure 16.1 summarizes the final design.

![Figure 16.1 UML class diagram of `Conway` and `Langton` applications.](figs/uml2.png)

**Figure 16.1 UML class diagram of `Conway` and `Langton` applications.**


The diagram shows three examples of inheritance: `Conway` is an `Automaton`, `Langton` is an `Automaton`, and `GridCanvas` is a `Canvas`. It also shows two examples of composition: `Automaton` has a `GridCanvas`, and `GridCanvas` has a 2D array of `Cell`s.

The diagram also shows that `Automaton` uses `JFrame`, `GridCanvas` uses `Graphics`, and `Cell` uses `Graphics` and `Color`.

`Automaton` is in italics to indicate that it is an abstract class. As it happens, `Graphics` is an abstract class, too.


Conway and Langton are **concrete classes**, because they provide an implementation for all of their methods. In particular, they implement the `update` method that was declared `abstract` in `Automaton`.



One of the challenges of object-oriented programming is keeping track of a large number of classes and the relationships between them. UML class diagrams can help.