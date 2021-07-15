As you saw in Section 11.7, it’s helpful [to create an equals method to test whether two objects are equivalent:](open_file code/ch12/Card4.java panel=0 ref="public boolean equals" count=4)
[Click to remove the highlight.](open_file code/ch12/Card4.java panel=0)


```code
public boolean equals(Card that) {
    return this.rank == that.rank
        && this.suit == that.suit;
}
```


It would also be nice to have a method for comparing cards, so we can tell if one is higher or lower than another. For primitive types, we can use comparison operators like `<` and `>` to compare values. But these operators don't work for object types.

For strings, Java provides a `compareTo` method, as you saw in Section 6.10. We can write our own version of `compareTo` for the classes that we define, as we did for the `equals` method.


Some types are “totally ordered”, which means that you can compare any two values and tell which is bigger. Integers and strings are totally ordered. Other types are “unordered”, which means that there is no meaningful way to say that one element is bigger than another. In Java, the `boolean` type is unordered; if you try to compare `true < false`, you get a compiler error.

The set of playing cards is “partially ordered”, which means that sometimes we can compare cards and sometimes not. For example, we know that the 3 of Clubs is higher than the 2 of Clubs, and the 3 of Diamonds is higher than the 3 of Clubs. But which is better, the 3 of Clubs or the 2 of Diamonds? One has a higher rank, but the other has a higher suit.


To make cards comparable, we have to decide which is more important: rank or suit. The choice is arbitrary, and it might be different for different games. But when you buy a new deck of cards, it comes sorted with all the Clubs together, followed by all the Diamonds, and so on. So for now, let's say that suit is more important. [With that decided, we can write compareTo as follows:](open_file code/ch12/Card4.java panel=0 ref="public int compareTo" count=15)
[Click to remove the highlight.](open_file code/ch12/Card4.java panel=0)


```code
public int compareTo(Card that) {
    if (this.suit < that.suit) {
        return -1;
    }
    if (this.suit > that.suit) {
        return 1;
    }
    if (this.rank < that.rank) {
        return -1;
    }
    if (this.rank > that.rank) {
        return 1;
    }
    return 0;
}
```

`compareTo` returns `-1` if `this` is a lower card, `+1` if `this` is a higher card, and `0` if `this` and `that` are equivalent. It compares suits first. If the suits are the same, it compares ranks. If the ranks are also the same, it returns `0`.

Try it out here.
{Run!}(sh .guides/bg.sh javac code/ch12/Card4.java java -cp code/ch12/ Card4 )
