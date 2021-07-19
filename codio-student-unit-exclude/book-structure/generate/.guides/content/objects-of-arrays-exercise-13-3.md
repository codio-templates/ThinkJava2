The goal of this exercise is to implement the sorting algorithms from this chapter. Use the *Deck.java* file from the previous exercise or create a new one from scratch.

1. Implement the `indexLowest` method. Use the `Card.compareTo` method to find the lowest card in a given range of the deck, from `lowIndex` to `highIndex`, including both.
1. Fill in `selectionSort` by using the algorithm in Section 13.3.
1. Using the pseudocode in Section 13.4, implement the `merge` method. The best way to test it is to build and shuffle a deck. Then use `subdeck` to form two small subdecks, and use selection sort to sort them. Finally, pass the two halves to `merge` and see if it works.
1. Fill in `almostMergeSort`, which divides the deck in half, then uses `selectionSort` to sort the two halves, and uses `merge` to create a new, sorted deck. You should be able to reuse code from the previous step.
1. Implement `mergeSort` recursively. Remember that `selectionSort` is `void` and `mergeSort` returns a new `Deck`, which means that they get invoked differently: 
```code
deck.selectionSort();      // modifies an existing deck
deck = deck.mergeSort();   // replaces old deck with new
```
[Click to view tester class](open_file code/ch13/Test.java panel=0)
[Click to return to Deck class](open_file code/ch13/Deck.java panel=0)

{Run!}(sh .guides/bg2.sh javac code/ch13/Test.java code/ch13/Deck.java code/ch13/Card.java java -cp code/ch13/ Test 2)
 
