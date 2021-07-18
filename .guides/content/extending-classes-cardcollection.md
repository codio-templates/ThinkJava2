To implement Crazy Eights, we need to represent a deck of cards, a discard pile, a draw pile, and a hand for each player. And we need to be able to deal, draw, and discard cards.

The `Deck` and `Pile` classes from the previous chapter meet some of these requirements. But unless we make some changes, neither of them represents a hand of cards very well.


Furthermore, `Deck` and `Pile` are essentially two versions of the same code: one based on arrays, and the other based on `ArrayList`. It would be helpful to combine their features into one class that meets the needs of both.

We will define a class named `CardCollection` and add the code we want one step at a time. Since this class will represent different piles and hands of cards, we'll add a `label` attribute to tell [ them apart:](open_file code/ch14/CardCollection.java panel=0 ref="CardCollection " count=12)



```code
public class CardCollection {

    private String label;
    private ArrayList<Card> cards;

    public CardCollection(String label) {
        this.label = label;
        this.cards = new ArrayList<Card>();
    }
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)


As with the `Pile` class, we need a way to add cards to the collection. Here is the `addCard` method from the previous chapter:

```code
public void addCard(Card card) {
    this.cards.add(card);
}
```


Until now, we have used `this` explicitly to make it easy to identify attributes. Inside `addCard` and other instance methods, you can access instance variables without using the keyword `this`. So from here on, we will [ drop it:](open_file code/ch14/CardCollection.java panel=0 ref="addCard" count=3)


```code
public void addCard(Card card) {
    cards.add(card);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 We also need to be able to remove cards from the collection. The following method takes an index, removes the card at that location, and shifts the following cards left to [ fill the gap:](open_file code/ch14/CardCollection.java panel=0 ref="popCard" count=3)


```code
public Card popCard(int i) {
    return cards.remove(i);
}
```


[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 If we are dealing cards from a shuffled deck, we don't care which card gets removed. It is most efficient to choose the last one, so we don't have to shift any cards left. Here is an overloaded version of `popCard` that removes and returns [ the last card:](open_file code/ch14/CardCollection.java panel=0 ref="popCard" count=11)


```code
public Card popCard() {
    int i = cards.size() - 1;    // from the end of the list
    return popCard(i);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 The class `CardCollection` also provides `isEmpty`, which returns `true` if there are no cards left, and `size`, which returns the [ number of cards:](open_file code/ch14/CardCollection.java panel=0 ref="isEmpty" count=10)


```code
public boolean isEmpty() {
    return cards.isEmpty();
}
```

```code
public int size() {
    return cards.size();
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 To access the elements of an `ArrayList`, you can't use the array `[]` operator. Instead, you have to use the methods `get` and `set`. Here is a wrapper [ for get:](open_file code/ch14/CardCollection.java panel=0 ref="getCard" count=3)


```code
public Card getCard(int i) {
    return cards.get(i);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 The method `lastCard` gets the last card [ (but doesn’t remove it):](open_file code/ch14/CardCollection.java panel=0 ref="lastCard" count=4)


```code
public Card lastCard() {
    int i = cards.size() - 1;
    return cards.get(i);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)


In order to control the ways card collections are modified, we don't provide a wrapper for `set`. The only modifiers we provide are the two versions of `popCard` and the following version of [ swapCards:](open_file code/ch14/CardCollection.java panel=0 ref="swapCards" count=5)


```code
public void swapCards(int i, int j) {
    Card temp = cards.get(i);
    cards.set(i, cards.get(j));
    cards.set(j, temp);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 Finally, we use `swapCards` to implement `shuffle`, which we described in [  Section 13.2:](open_file code/ch14/CardCollection.java panel=0 ref="shuffle" count=7)


```code
public void shuffle() {
    Random random = new Random();
    for (int i = cards.size() - 1; i > 0; i--) {
        int j = random.nextInt(i + 1);
        swapCards(i, j);
    }
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
