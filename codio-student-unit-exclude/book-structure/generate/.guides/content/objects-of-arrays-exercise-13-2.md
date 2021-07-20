[If the Deck class does not appear on the left, click here to view and edit it on the left.](open_file code/ch13/Deck.java panel=0)

The goal of this exercise is to implement the shuffling algorithm from this chapter.

1. Implement the `randomInt` method. You can use the `nextInt` method provided by `java.util.Random`, which you saw in Section 7.6. *Hint:* To avoid creating a `Random` object every time `randomInt` is invoked, consider defining a class variable.
1. Write a `swapCards` method that takes two indexes and swaps the cards at the given locations.
1. Fill in the `shuffle` method by using the algorithm in Section 13.2.

[Click to view tester class](open_file code/ch13/Test.java panel=0)
[Click to return to Deck class](open_file code/ch13/Deck.java panel=0)

{Run!}(sh .guides/bg2.sh javac code/ch13/Test.java code/ch13/Deck.java code/ch13/Card.java java -cp code/ch13/ Test 1)
