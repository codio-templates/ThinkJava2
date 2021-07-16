Now that we have shuffled the deck, we need a way to put it back in order. There is an algorithm for sorting that is ironically similar to the algorithm for shuffling. It's called **selection sort**, because it works by traversing the array repeatedly and selecting the lowest (or highest) remaining card each time.

During the first iteration, we find the lowest card and swap it with the card in the zeroth position. During the $i$th iteration, we find the lowest card to the right of $i$ and swap it with the $i$th card. Pseudocode for selection sort can be found [at the left.](open_file code/ch13/Deck.java panel=0 ref="selectionSort" count=6)


```code
public void selectionSort() {
    for each index i {
        // find the lowest card at or to the right of i
        // swap the ith card and the lowest card found
    }
}
```

Again, the pseudocode helps with the design of the helper methods. For this algorithm, we can reuse `swapCards` from the previous section, so we need only a method to find the lowest card; we'll call it `indexLowest`: The stub method can be seen [at the left.](open_file code/ch13/Deck.java panel=0 ref="indexLowest" count=3)


```code
private int indexLowest(int low, int high) {
    // find the lowest card between low and high
}
```

One of the exercises at the end of the chapter asks you to write `indexLowest`, and then use it and `swapCards` to implement `selectionSort`.