For most card games, you have to shuffle the deck; that is, put the cards in a random order. In Section 7.6 you saw how to generate random numbers, but it is not obvious how to use them to shuffle a deck.

One possibility is to model the way humans shuffle; for example, we could divide the deck in two halves and then choose alternately from each one. Humans usually don't shuffle perfectly, so after about seven iterations, the order of the deck is pretty well randomized.

But a computer program would have the annoying property of doing a perfect shuffle every time, which is not very random. In fact, after eight perfect shuffles, you would find the deck back in the order you started in! For more on this, see [https://en.wikipedia.org/wiki/Faro_shuffle](https://en.wikipedia.org/wiki/Faro_shuffle).


A better shuffling algorithm is to traverse the deck one card at a time, and at each iteration, choose two cards and swap them. To outline this algorithm, we'll use a combination of Java statements and English comments. This technique is sometimes called **pseudocode**:


```code
public void shuffle() {
    for each index i {
        // choose a random number between i and length - 1
        // swap the ith card and the randomly-chosen card
    }
}
```


The nice thing about pseudocode is that it often makes clear what other methods you are going to need. In this case, we need a method that chooses a random integer in a given range and a method that takes two indexes and swaps the cards at those positions. [These stub methods are in the code file on the left](open_file code/ch13/Deck.java panel=0 ref="randomInt" count=10)


```code
private static int randomInt(int low, int high) {
    // return a random number between low and high,
    // including both
}

private void swapCards(int i, int j) {
    // swap the ith and the jth cards in the array
}
```


Methods like `randomInt` and `swapCards` are called **helper methods**, because they help you solve parts of the problem. Helper methods are often `private`, because they are used only by methods in the class and are not needed by methods in other classes.


The process of writing pseudocode first and then writing helper methods to make it work is a kind of **top-down design** (see [https://en.wikipedia.org/wiki/Top-down_and_bottom-up_design](https://en.wikipedia.org/wiki/Top-down_and_bottom-up_design)). It is an alternative to “incremental development” and “encapsulation and generalization”, the other design processes you have seen in this book.

One of the exercises at the end of the chapter asks you to write the helper methods `randomInt` and `swapCards`, and use them to implement `shuffle`.

When you do the exercise, notice that `randomInt` is a class method and `swapCards` is an instance method. Do you understand why?