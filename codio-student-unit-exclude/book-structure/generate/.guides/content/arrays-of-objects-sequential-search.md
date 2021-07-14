[The next method we’ll write is search](open_file code/ch12/Search.java panel=0 ref="* Sequential search" count=10) , which takes an array of cards and a Card object as parameters. 
[Remove highlighting](open_file code/ch12/Search.java panel=0)
 It returns the index where the `Card` appears in the array, or `-1` if it doesn't. This version of `search` uses the algorithm in Section 7.5, which is called **sequential search**:


```code
public static int search(Card[] cards, Card target) {
    for (int i = 0; i < cards.length; i++) {
        if (cards[i].equals(target)) {
            return i;
        }
    }
    return -1;
}
```


The method returns as soon as it discovers the card, which means we don't have to traverse the entire array if we find the target. If we get to the end of the loop, we know the card is not in the array.


If the cards in the array are not in order, there is no way to search faster than sequential search. We have to look at every card, because otherwise we can't be certain the card we want is not there. But if the cards are in order, we can use better algorithms.

Sequential search is relatively inefficient, especially for large arrays. If you pay the price to keep the array sorted, finding elements becomes much easier.

See how sequential ``search`` works here. See the test cases in the ``main`` class to understand what is being outputted. Add test cases for yourself to see how it works.
{Run!}(sh .guides/bg.sh javac code/ch12/*.java java -cp code/ch12/ Search )
