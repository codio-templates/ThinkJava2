To summarize what you've learned so far, `Point` and `Rectangle` objects have attributes and methods. Attributes are an object's *data*; methods are an object's *code*. An object's *class* definition specifies the attributes and methods that it has.


**Unified Modeling Language** (UML) defines a graphical way to summarize this information. Figure 10.6 shows two examples, the UML **class diagrams** for the `Point` and `Rectangle` classes.

![Figure 10.6 UML class diagrams for `Point` and `Rectangle`.](figs/point-rect.jpg)

**Figure 10.6 UML class diagrams for `Point` and `Rectangle`.**


Each class is represented by a box with the name of the class, a list of attributes, and a list of methods.


To identify the types of attributes and parameters, UML uses a language-independent syntax, like `x: int` rather than Java syntax, `int x`.

The plus sign (`+`) identifies `public` attributes and methods. A minus sign (`-`) identifies `private` attributes and methods, which we discuss in the next chapter.

Both `Point` and `Rectangle` have additional methods; we show only the ones introduced in this chapter.

In contrast to memory diagrams, which visualize objects (and variables) at run-time, a class diagram visualizes the source code at compile-time.