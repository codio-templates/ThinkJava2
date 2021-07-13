When you create a new class, the first step is to declare the instance variables and write constructors. A good next step is to write `toString`, which is useful for debugging and incremental development.


To display `Card` objects in a way that humans can read easily, we need to “decode” the integer values as words. A natural way to do that is with an array of `String`s. For example, we can create the array like this:

```code
String[] suits = new String[4];
```

And then assign values to the elements:

```code
suits[0] = "Clubs";
suits[1] = "Diamonds";
suits[2] = "Hearts";
suits[3] = "Spades";
```

Or we can [create the array and initialize the elements at the same time,](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0 ref="public static final String[] SUITS" count=2) as you saw in Section 7.3.
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0)


```code
String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
```


The memory diagram in Figure 12.1 shows the result. Each element of the array is a reference to a `String`.

![Figure 12.1 Memory diagram of an array of strings.](figs/stringarray.jpg)

**Figure 12.1 Memory diagram of an array of strings.**

[We also need an array to decode the ranks:](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0 ref="public static final String[] RANKS" count=3)
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0)


```code
String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
           "7", "8", "9", "10", "Jack", "Queen", "King"};
```

The zeroth element should never be used, because the only valid ranks are 1--13. We set it to `null` to indicate an unused element.

Using these arrays [we can create a meaningful String](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0 ref="return RANKS[this.rank]" count=1) by using ``suit`` and ``rank`` as indexes.
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0)


```code
String s = ranks[this.rank] + " of " + suits[this.suit];
```

The expression `ranks[this.rank]` means “use the instance variable `rank` from `this` object as an index into the array `ranks`.” We select the string for `this.suit` in a similar way.

[Now we can wrap all the previous code in a toString method:](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0 ref="public String toString" count=3)
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0)


```code
public String toString() {
    String[] ranks = {null, "Ace", "2", "3", "4", "5", "6",
               "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String s = ranks[this.rank] + " of " + suits[this.suit];
    return s;
}
```

When we display a card, `println` automatically calls `toString`. The output of the [following code](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0 ref="Card card" count=2) is ``Jack`` of ``Diamonds``.
[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java panel=0)


```code
Card card = new Card(11, 1);
System.out.println(card);
```

Give it a shot here.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch12/Card1.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch12/ Card1 )
