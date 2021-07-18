The `Deck` and `Hand` classes we have defined so far could be used for any card game; we have not yet implemented any of the rules specific to Crazy Eights. And that's probably a good thing, since it makes it easy to reuse these classes if we want to make another game in the future.


But now it's time to implement the rules. Here is the beginning of the `Player` [  definition:](open_file code/ch14/Player.java panel=0 ref="public class Player" count=12)



```code
public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand(name);
    }
```

[Click to remove the highlight](open_file code/ch14/Player.java panel=0 count=5)
 A `Player` has two `private` attributes: a name and a hand. The constructor takes the player's name as a string and saves it in an instance variable. In this example, we have to use `this` to distinguish between the instance variable and the parameter with the same name.

The primary method that `Player` provides is `play`, which decides which card to discard during The primary method that `Player` provides is `play`, which decides which card to discard during each turn: [  each turn:](open_file code/ch14/Player.java panel=0 ref="public Card play" count=7)


```code
public Card play(Eights eights, Card prev) {
    Card card = searchForMatch(prev);
    if (card == null) {
        card = drawForMatch(eights, prev);
    }
    return card;
}
```

[Click to remove the highlight](open_file code/ch14/Player.java panel=0 count=5)
 The first parameter is a reference to the `Eights` object that encapsulates the state of the game (coming up in the next section). The second parameter, `prev`, is the card on top of the discard pile.

`play` invokes two helper methods: `searchForMatch` and `drawForMatch`. Since we have not written them yet, this is an example of top-down design.

Here’s searchForMatch, which looks in the player’s hand for a card that matches the previously [  played card:](open_file code/ch14/Player.java panel=0 ref="public Card searchForMatch" count=9)


```code
public Card searchForMatch(Card prev) {
    for (int i = 0; i < hand.size(); i++) {
        Card card = hand.getCard(i);
        if (cardMatches(card, prev)) {
            return hand.popCard(i);
        }
    }
    return null;
}
```

[Click to remove the highlight](open_file code/ch14/Player.java panel=0 count=5)
 The strategy is pretty simple: the `for` loop searches for the first card that's legal to play and returns it. If there are no cards that match, it returns `null`. In that case, we have to draw cards until we get a match, which is what `drawForMatch` [ does:](open_file code/ch14/Player.java panel=0 ref="public Card drawForMatch" count=9)


```code
public Card drawForMatch(Eights eights, Card prev) {
    while (true) {
        Card card = eights.drawCard();
        System.out.println(name + " draws " + card);
        if (cardMatches(card, prev)) {
            return card;
        }
        hand.addCard(card);
    }
}
```

[Click to remove the highlight](open_file code/ch14/Player.java panel=0 count=5)
 The `while` loop runs until it finds a match (we'll assume for now that it always finds one). The loop uses the `Eights` object to draw a card. If it matches, `drawForMatch` returns the card. Otherwise it adds the card to the player's hand and repeats.

Both `searchForMatch` and `drawForMatch` use `cardMatches`, which is a static method, also defined in `Player`. This method is a straightforward translation of the rules [ of the game:](open_file code/ch14/Player.java panel=0 ref="public static boolean cardMatches" count=5)


```code
public static boolean cardMatches(Card card1, Card card2) {
    return card1.getSuit() == card2.getSuit()
        || card1.getRank() == card2.getRank()
        || card1.getRank() == 8;
}
```

[Click to remove the highlight](open_file code/ch14/Player.java panel=0 count=5)
 Finally, `Player` provides a `score` method, which computes penalty points for cards left in a player's hand at the end of the game.