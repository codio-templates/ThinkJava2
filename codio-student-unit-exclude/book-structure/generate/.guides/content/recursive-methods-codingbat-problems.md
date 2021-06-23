In the past several chapters, you've seen methods, conditions, loops, strings, arrays, and recursion. A great resource for practicing all of these concepts is [https://codingbat.com/](https://codingbat.com/).


*CodingBat* is a free website of programming problems developed by Nick Parlante, a computer science lecturer at Stanford University. As you work on these problems, CodingBat saves your progress (if you create an account).

To conclude this chapter, we consider two problems in the **Recursion-1** section of CodingBat. One of them deals with strings, and the other deals with arrays. Both of them have the same recursive idea: check the base case, look at the current index, and recursively handle the rest.

The first problem is available at [https://codingbat.com/prob/p118230](https://codingbat.com/prob/p118230):



> **Recursion-1  noX**
> 
> Given a string, compute recursively a new string where all the `'x'` chars have been removed.
> 
> noX("xaxb") $\rightarrow$ "ab" <br/>
> noX("abc") $\rightarrow$ "abc" <br/>
> noX("xx") $\rightarrow$ ""


When solving recursive problems, it helps to think about the base case first. The base case is the easiest version of the problem; for `noX`, it's the empty string. If the argument is an empty string, there are no `x`'s to be removed:

```code
if (str.length() == 0) {
    return "";
}
```


Next comes the more difficult part. To solve a problem recursively, you need to think of a simpler instance of the same problem. For `noX`, it's removing all the `x`'s from a shorter string.

So let's split the string into two parts, the first letter and the rest:

```code
char first = str.charAt(0);
String rest = str.substring(1);
```

Now we can make a recursive call to remove the `x`'s from `rest`:

```code
String recurse = noX(rest);
```

If `first` happens to be an `x`, we're done; we just have to return `recurse`. Otherwise, we have to concatenate `first` and `recurse`. Here's the `if` statement we need:

```code
if (first == 'x') {
    return recurse;
} else {
    return first + recurse;
}
```

You can run this solution on CodingBat by pasting these snippets into the provided method definition.

The second problem is available at [https://codingbat.com/prob/p135988](https://codingbat.com/prob/p135988):



> **Recursion-1  array11**
> 
> Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
> 
> array11([1, 2, 11], 0) $\rightarrow$ 1 <br/>
> array11([11, 11], 0) $\rightarrow$ 2 <br/>
> array11([1, 2, 3, 4], 0) $\rightarrow$ 0


This problem uses the convention of passing the index as an argument. So the base case is when we've reached the end of the array. At that point, we know there are no more `11`s:

```code
if (index >= nums.length) {
    return 0;
}
```

Next we look at the current number (based on the given index), and check if it's an `11`. After that, we can recursively check the rest of the array. Similar to the `noX` problem, we look at only one integer per method call:

```code
int recurse = array11(nums, index + 1);
if (nums[index] == 11) {
    return recurse + 1;
} else {
    return recurse;
}
```

Again, you can run this solutions on CodingBat by pasting the snippets into the method definition.


To see how these solutions actually work, you might find it helpful to step through them with a debugger (see Appendix 18.6) or Java Tutor ([https://thinkjava.org/javatutor](https://thinkjava.org/javatutor)). Then try solving other CodingBat problems on your own.

Learning to think recursively is an important part of learning to think like a computer scientist. Many algorithms can be written concisely with recursive methods that perform computations on the way down, on the way up, or both.

See both solved CodingBat problems in java in the left pane. To compile and run the code, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch08/CodingBat.java java -cp code/ch08/ CodingBat )
