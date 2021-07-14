To see how binary search works, it's helpful to add the following print statement at the beginning of the loop:

```code
System.out.println(low + ", " + high);
```

Using a sorted deck of cards, we can search for the Jack of Clubs like this:

```code
Card card = new Card(11, 0);
System.out.println(binarySearch(cards, card));
```

We expect to find this card at position 10 (since the Ace of Clubs is at position 0). Here is the output of `binarySearch`:

```code
0, 51
0, 24
0, 11
6, 11
9, 11
10
```

You can see the range of cards shrinking as the `while` loop runs, until eventually index 10 is found. If we search for a card that's not in the array---like `new Card(15, 1)`, or the 15 of Diamonds---we get the following:

```code
0, 51
26, 51
26, 37
26, 30
26, 27
-1
```


Each time through the loop, we cut the distance between `low` and `high` in half. After $k$ iterations, the number of remaining cards is $52 / 2^k$. To find the number of iterations it takes to complete, we set $52 / 2^k = 1$ and solve for $k$. The result is $\log_2 52$, which is about 5.7. So we might have to look at 5 or 6 cards, as opposed to all 52 if we did a sequential search.

More generally, if the array contains $n$ elements, binary search requires $\log_2 n$ comparisons, and sequential search requires $n$. For large values of $n$, binary search is substantially faster.

Give it a shot here and see how ``binarySearch`` works here. Add the print statement from above to your code to better understand how ``binarySearch()`` works.
{Run!}(sh .guides/bg.sh javac code/ch12/*.java java -cp code/ch12/ Search )
