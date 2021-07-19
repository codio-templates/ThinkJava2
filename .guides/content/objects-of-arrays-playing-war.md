Now we can use `Deck` and `Pile` to implement the game. We'll start by creating a deck and shuffling, as shown [on the left.](open_file code/ch13/War.java panel=0 ref="create" count=3)
[Click to remove highlight](open_file code/ch13/War.java panel=0)


```code
Deck deck = new Deck();
deck.shuffle();
```

Then we divide the \java{Deck} into two piles, as seen [on the left.](open_file code/ch13/War.java panel=0 ref="divide" count=5)
[Click to remove highlight](open_file code/ch13/War.java panel=0)


```code
Pile p1 = new Pile();
p1.addDeck(deck.subdeck(0, 25));

Pile p2 = new Pile();
p2.addDeck(deck.subdeck(26, 51));
```

The game itself is a loop that repeats until one of the piles is empty. At each iteration, we draw a card from each pile and compare their ranks, as shown [on the left.](open_file code/ch13/War.java panel=0 ref="while" count=17)
[Click to remove highlight](open_file code/ch13/War.java panel=0)


```code
while (!p1.isEmpty() && !p2.isEmpty()) {
    // pop a card from each pile
    Card c1 = p1.popCard();
    Card c2 = p2.popCard();

    // compare the cards
    int diff = c1.getRank() - c2.getRank();
    if (diff > 0) {
        p1.addCard(c1);
        p1.addCard(c2);
    } else if (diff < 0) {
        p2.addCard(c1);
        p2.addCard(c2);
    } else {
        // it's a tie
    }
```

If the two cards have the same rank, it's a tie. In that case, each player draws four more cards. Whoever has the higher fourth card takes all cards in play. If there's another tie, they draw another four cards, and so on.

One of the exercises at the end of this chapter asks you to implement the `else` block when there's a tie.

After the \java{while} loop ends, we display the winner based on which pile is not empty, as shown [on the left.](open_file code/ch13/War.java panel=0 ref="display" count=6)
[Click to remove highlight](open_file code/ch13/War.java panel=0)


```code
if (p2.isEmpty()) {
    System.out.println("Player 1 wins!");
} else {
    System.out.println("Player 2 wins!");
}
```

`ArrayList` provides many other methods that we didn't use for this example. Take a minute to read the documentation, which you can find by doing a web search for “Java ArrayList”.