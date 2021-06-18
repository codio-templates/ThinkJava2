Remember that when you assign an object to a variable, you are assigning a *reference* to an object. It is possible to have multiple variables that refer to the same object. For example, this code creates two variables that refer to the same `Rectangle`:

```code
Rectangle box1 = new Rectangle(0, 0, 100, 200);
Rectangle box2 = box1;
```

Figure 10.4 shows the result: `box1` and `box2` refer to the same object, so any changes that affect one variable also affect the other.

![Figure 10.4 Memory diagram showing two variables that refer to the same `Rectangle` object.](figs/aliasing.jpg)

**Figure 10.4 Memory diagram showing two variables that refer to the same `Rectangle` object.**

For example, the following code uses `grow` to make `box1` bigger by 50 units in all directions. It decreases `x` and `y` by 50, and it increases `height` and `width` by 100:

```code
box1.grow(50, 50);                // grow box1 (alias)
```

The result is shown in Figure 10.5.

![Figure 10.5 Memory diagram showing the effect of invoking `grow`.](figs/aliasing2.jpg)

**Figure 10.5 Memory diagram showing the effect of invoking `grow`.**

Now, if we print `box1`, we are not surprised to see that it has changed:

```code
java.awt.Rectangle[x=-50,y=-50,width=200,height=300]
```

And if we print `box2`, we should not be surprised to see that it has changed too, because it refers to the same object:

```code
java.awt.Rectangle[x=-50,y=-50,width=200,height=300]
```


This scenario is called “aliasing” because a single object has multiple names, or aliases, that refer to it.

As you can tell from this simple example, code that involves aliasing can get confusing fast, and it can be difficult to debug.