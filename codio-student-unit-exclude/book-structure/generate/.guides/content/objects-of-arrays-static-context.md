Figure 13.3 shows a UML class diagram for `Deck`, including the instance variable, `cards`, and the methods we have so far. In UML diagrams, `private` attributes and methods begin with a minus sign (`-`) and `static` methods are underlined.


![Figure 13.3 UML diagram for the `Deck` class.](figs/deck.jpg)

**Figure 13.3 UML diagram for the `Deck` class.**

The helper methods `randomInt` and `merge` are `static`, because they do not read or write any instance variables. All other methods are instance methods, because they access the instance variable, `cards`.

When you have static methods and instance methods in the same class, it is easy to get them confused.

To invoke an instance method, you need an instance:

```code
Deck deck = new Deck();
deck.print();  // correct
```

`Deck` with a capital `D` is a class, and `deck` with a lowercase `d` is an object.

Say you try to invoke `print` like this:

```code
Deck.print();  // wrong!
```


You get a compiler error like this:

```code
Non-static method print() cannot be referenced from a
static context.
```

By “static context”, the compiler means you are trying to invoke a method in a context that requires a static method.

On the other hand, if you have a `Deck` object, you can use it to invoke a static method:

```code
Deck deck = new Deck();
int i = deck.randomInt(0, 51);  // legal, but not good style
```

This is legal, but it is not considered good style, because someone reading this code would expect `randomInt` to be an instance method.

Another common error is to use `this` in a static method. For example, say you write something like this:

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

For beginners, error messages about non-static context can be confusing and frustrating. We hope this section helps.