Figure 13.3 shows a UML class diagram for `Deck`, including the instance variable, `cards`, and the methods we have so far. In UML diagrams, `private` attributes and methods begin with a minus sign (`-`) and `static` methods are underlined.


![Figure 13.3 UML diagram for the `Deck` class.](figs/deck.jpg)

**Figure 13.3 UML diagram for the `Deck` class.**

The helper methods `randomInt` and `merge` are `static`, because they do not read or write any instance variables. All other methods are instance methods, because they access the instance variable, `cards`.

When you have static methods and instance methods in the same class, it is easy to get them confused.

To invoke an instance method, you need an instance, as shown [at the left.](open_file code/ch13/Deck.java panel=0 ref="Deck deck" count=2)
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)


```code
Deck deck = new Deck();
deck.print();  // correct
```

`Deck` with a capital `D` is a class, and `deck` with a lowercase `d` is an object.

Say you try to invoke `print` like [this.](open_file code/ch13/Deck.java panel=0 ref="Deck.print" count=1)
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)


```code
Deck.print();  // wrong!
```

Press the "Run!" button below to see what happens. You can comment out the code afterwards so that future buttons run as intended.
{Run!}(sh .guides/bg4.sh javac code/ch13/Deck.java code/ch13/Card.java java -cp code/ch13/ Deck 1)


You get a compiler error like this:

```code
Non-static method print() cannot be referenced from a
static context.
```

By “static context”, the compiler means you are trying to invoke a method in a context that requires a static method.

On the other hand, if you have a `Deck` object, you can use it to invoke a static method, as shown [here.](open_file code/ch13/Deck.java panel=0 ref="deck.randomInt" count=1)
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)


```code
Deck deck = new Deck();
int i = deck.randomInt(0, 51);  // legal, but not good style
```

This is legal, but it is not considered good style, because someone reading this code would expect `randomInt` to be an instance method.


Another common error is to use `this` in a static method.
For example, our `merge` method has yet to be implemented, but if we want to test other parts of our class, we'll need to have it return something so as not to throw an error. 
If we returned `this.cards`, as in [this line on the left](open_file code/ch13/Deck.java panel=0 ref="Wrong" count=1), we'll end up with the compilation error below.
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)

Remove the comment symbols from the code and press the "Run!" button below to see what happens.
{Run!}(sh .guides/bg4.sh javac code/ch13/Deck.java code/ch13/Card.java java -cp code/ch13/ Deck 2)


```code
private static Deck merge(Deck d1, Deck d2) {
    return this.cards;  // wrong!
}
```

You get a compiler error like this:

```code
Non-static variable this cannot be referenced from a
static context.
```

The problem is that `cards` is an instance variable, so it is *non-static*; therefore, you can't access it from a static method. In general, you can't use `this` in a static method, because a static method is not invoked on an object. 
Instead, for our stub method, we'll return a new Deck, as in [this line on the left](open_file code/ch13/Deck.java panel=0 ref="return new Deck" count=1), we'll end up with the compilation error below.
[Click to remove highlight](open_file code/ch13/Deck.java panel=0)

Remove the comment symbols from the code (commenting out the previous line again) and press the "Run!" button below to see what happens.
{Run!}(sh .guides/bg4.sh javac code/ch13/Deck.java code/ch13/Card.java java -cp code/ch13/ Deck 3)


For beginners, error messages about non-static context can be confusing and frustrating. We hope this section helps.