At the left is the beginning of a `Deck` class that encapsulates an array of `Card` objects. We still need to fill in most of its methods.



Figure 13.1 shows what a `Deck` looks like with no cards.

![Figure 13.1 Memory diagram of an unpopulated `Deck` object.](figs/deckobject.jpg)

**Figure 13.1 Memory diagram of an unpopulated `Deck` object.**

[This constructor](open_file code/ch13/Deck.java panel=0 ref="int n" count=3) initializes the instance variable with an array of `n` cards, but it doesn't create any `Card` objects. Figure 13.1 shows what a `Deck` looks like with no cards.
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)


Instead, we can use [our other constructor](open_file code/ch13/Deck.java panel=0 ref="public Deck" count=10) to create a standard 52-card array and populate it with `Card` objects.
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)
 This method is similar to the example in Section 12.6; we just turned it into a constructor. We can use it to create a complete `Deck` like this:

```code
Deck deck = new Deck();
```


Now that we have a `Deck` class, we have a logical place to put methods that pertain to decks. Looking at the methods we have written so far, one obvious candidate is `printDeck` from Section 12.6. [Here's how it looks](open_file code/ch13/Deck.java panel=0 ref="print" count=5), rewritten as an instance method of `Deck`.
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)



Notice that when we transform a static method into an instance method, the code is shorter. Here's how we invoke it:

```code
deck.print();
```