Not everything in Java is an object: `int`, `double`, `char`, and `boolean` are **primitive** types. When you declare a variable with a primitive type, Java reserves a small amount of memory to store its value. Figure 9.1 shows how the following values are stored in memory:

```code
int number = -2;
char symbol = '!';
```

![Figure 9.1 Memory diagram of two primitive variables.](figs/mem1.jpg)

**Figure 9.1 Memory diagram of two primitive variables.**


As you learned in Section 7.2, an array variable stores a *reference* to an array. For example, the following line declares a variable named `array` and creates an array of three characters:

```code
    char[] array = {'c', 'a', 't'};
```

Figure 9.2 shows them both, with a box to represent the location of the variable and an arrow pointing to the location of the array.

![Figure 9.2 Memory diagram of an array of characters.](figs/mem2.jpg)

**Figure 9.2 Memory diagram of an array of characters.**

Objects work in a similar way. For example, this line declares a `String` variable named `word` and creates a `String` object, as shown in Figure 9.3:

```code
String word = "dog";
```

![Figure 9.3 Memory diagram of a `String` object.](figs/mem3.jpg)

**Figure 9.3 Memory diagram of a `String` object.**

Objects and arrays are usually created with the `new` keyword, which allocates memory for them.  For convenience, you don't have to use `new` to create strings:

```code
String word1 = new String("dog");  // creates a string object
String word2 = "dog";   // implicitly creates a string object
```


Recall from Section 6.10 that you need to use the `equals` method to compare strings. The `equals` method traverses the `String` objects and tests whether they contain the same characters.

To test whether two integers or other primitive types are equal, you can simply use the `==` operator. But two `String` objects with the same characters would not be considered equal in the `==` sense. The `==` operator, when applied to string variables, tests only whether they refer to the *same* object.