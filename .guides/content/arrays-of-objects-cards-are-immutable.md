The instance variables of `Card` are `private`, so they can't be accessed from other classes. We can provide [getters](open_file code/ch12/Card.java panel=0 ref="* Gets the card's rank." count=12) to allow other classes to read the rank and suit values:
[Click to remove the highlight.](open_file code/ch12/Card.java panel=0)


```code
public int getRank() {
    return this.rank;
}

public int getSuit() {
    return this.suit;
}
```


Whether or not to provide setters is a design decision. If we did, cards would be mutable, so you could transform one card into another. That is probably not a feature we want, and in general, mutable objects are more error-prone. So it might be better to make cards immutable. To do that, all we have to do is *not* provide any modifier methods (including setters).


That's easy enough, but it is not foolproof, because a fool might come along later and add a modifier. We can prevent that possibility by declaring the instance variables [final:](open_file code/ch12/Card.java panel=0 ref="private final int" count=3)
[Click to remove the highlight.](open_file code/ch12/Card.java panel=0)


```code
public class Card {
    private final int rank;
    private final int suit;

    ...
}
```

You can initialize these variables inside a constructor, but if someone writes a method that tries to modify them, they'll get a compiler error. This kind of safeguard helps prevent future mistakes and hours of debugging.