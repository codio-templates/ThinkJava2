To begin the game, we need to deal cards to each of the players. And during the game, we need to move cards between hands and piles. If we add the following method to CardCollection, it can meet both of these [ requirements:](open_file code/ch14/CardCollection.java panel=0 ref="deal" count=6)


```code
public void deal(CardCollection that, int n) {
    for (int i = 0; i < n; i++) {
        Card card = popCard();
        that.addCard(card);
    }
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 The `deal` method removes cards from the collection it is invoked on, `this`, and adds them to the collection it gets as a parameter, `that`. The second parameter, `n`, is the number of cards to deal. We will use this method to implement `dealAll`, which deals (or moves) all of the [  remaining cards:](open_file code/ch14/CardCollection.java panel=0 ref="dealAll" count=4)


```code
public void dealAll(CardCollection that) {
    int n = cards.size();
    deal(that, n);
}
```

[Click to remove the highlight](open_file code/ch14/CardCollection.java panel=0 count=5)
 At this point, we can create a `Deck` and start dealing cards. We will use this method to implement `dealAll`, which deals (or moves) all of the [  remaining cards:](open_file code/ch14/Test.java panel=1 ref="new Deck" count=11)


```code
Deck deck = new Deck("Deck");
deck.shuffle();

Hand hand = new Hand("Hand");
deck.deal(hand, 5);
hand.display();

Hand drawPile = new Hand("Draw Pile");
deck.dealAll(drawPile);
System.out.printf("Draw Pile has %d cards.\n",
                  drawPile.size());
```

[Click to remove the highlight](open_file code/ch14/Test.java panel=0 count=5)
 Because the deck is shuffled randomly, you should get a different hand each time you run this example. The output will look something like this:

```code
Hand:
5 of Diamonds
Ace of Hearts
6 of Clubs
6 of Diamonds
2 of Clubs

Draw Pile has 47 cards.
```

If you are a careful reader, you might notice something strange about this example. Take another look at the definition of `deal`. Notice that the first parameter is supposed to be a `CardCollection`. But we invoked it [ like this:](open_file code/ch14/Test.java panel=1 ref="new Hand" count=2)


```code
Hand hand = new Hand("Hand");
deck.deal(hand, 5);
```

[Click to remove the highlight](open_file code/ch14/Test.java panel=1 count=5)
 The argument is a `Hand`, not a `CardCollection`. So why is this example legal?

It's because `Hand` is a subclass of `CardCollection`, so a `Hand` object is also considered to be a `CardCollection` object. If a method expects a `CardCollection`, you can give it a `Hand`, a `Deck`, or a `CardCollection`.

But it doesn't work the other way around: not every `CardCollection` is a `Hand`, so if a method expects a `Hand`, you have to give it a `Hand`, not a `CardCollection` or a `Deck`.

If it seems strange that an object can belong to more than one type, remember that this happens in real life too. Every cat is also a mammal, and every mammal is also an animal. But not every animal is a mammal, and not every mammal is a cat.