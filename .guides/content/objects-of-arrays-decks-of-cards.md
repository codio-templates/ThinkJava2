Here is the beginning of a `Deck` class that encapsulates an array of `Card` objects:

```code
public class Deck {
    private Card[] cards;

    public Deck(int n) {
        this.cards = new Card[n];
    }

    public Card[] getCards() {
        return this.cards;
    }
}
```


The constructor initializes the instance variable with an array of `n` cards, but it doesn't create any `Card` objects. Figure 13.1 shows what a `Deck` looks like with no cards.

![Figure 13.1 Memory diagram of an unpopulated `Deck` object.](figs/deckobject.jpg)

**Figure 13.1 Memory diagram of an unpopulated `Deck` object.**

We'll add another constructor that creates a standard 52-card array and populates it with `Card` objects:

```code
public Deck() {
    this.cards = new Card[52];
    int index = 0;
    for (int suit = 0; suit <= 3; suit++) {
        for (int rank = 1; rank <= 13; rank++) {
            this.cards[index] = new Card(rank, suit);
            index++;
        }
    }
}
```

This method is similar to the example in Section 12.6; we just turned it into a constructor. We can use it to create a complete `Deck` like this:

```code
Deck deck = new Deck();
```


Now that we have a `Deck` class, we have a logical place to put methods that pertain to decks. Looking at the methods we have written so far, one obvious candidate is `printDeck` from Section 12.6. Here's how it looks, rewritten as an instance method of `Deck`:

```code
public void print() {
    for (Card card : this.cards) {
        System.out.println(card);
    }
}
```


Notice that when we transform a static method into an instance method, the code is shorter. Here's how we invoke it:

```code
deck.print();
```