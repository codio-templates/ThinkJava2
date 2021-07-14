We now return to the example from the beginning of the chapter and present a solution to Exercise 6.5 using arrays. Here is the problem again:



> A word is said to be a “doubloon” if every letter that appears in the word appears exactly twice.
> Write a method called `isDoubloon` that takes a string and checks whether it is a doubloon.
> To ignore case, invoke the `toLowerCase` method before checking.


Based on the approach from Section 7.7, we will create an array of 26 integers to count how many times each letter appears. [We convert the string to lowercase,](open_file code/ch07/Doubloon.java panel=0 ref="// count the number" count=3) so that we can treat `'A'` and `'a'` (for example) as the same letter.
[Remove highlighting](open_file code/ch07/Doubloon.java panel=0)


```code
int[] counts = new int[26];
String lower = s.toLowerCase();
```

We can use a `for` loop to iterate each character in the string. To update the `counts` array, we need to compute the index that corresponds to each character. Fortunately, Java allows you to perform arithmetic on characters:

```code
for (int i = 0; i < lower.length(); i++) {
    char letter = lower.charAt(i);
    int index = letter - 'a';
    counts[index]++;
}
```

If `letter` is `'a'`, the value of `index` is `0`; if `letter` is `'b'`, the value of `index` is `1`, and so on.

Then we use `index` to increment the corresponding element of `counts`. At the end of the loop, `counts` contains a histogram of the letters in the string `lower`.


We can simplify this code with an enhanced for loop, but it doesn’t work with strings; we have to convert lower to an array of characters, [like this:](open_file code/ch07/Doubloon.java panel=0 ref="// count the number" count=7)
[Remove highlighting](open_file code/ch07/Doubloon.java panel=0)


```code
for (char letter : lower.toCharArray()) {
    int index = letter - 'a';
    counts[index]++;
}
```

Once we have the counts, [we can use a second for loop](open_file code/ch07/Doubloon.java panel=0 ref="// determine whether the given word is a doubloon" count=8) to check whether each letter appears zero or two times:
[Remove highlighting](open_file code/ch07/Doubloon.java panel=0)


```code
for (int count : counts) {
    if (count != 0 && count != 2) {
        return false;  // not a doubloon
    }
}
return true;  // is a doubloon
```

If we find a count that is neither 0 or 2, we know the word is not a doubloon and we can return immediately. If we make it all the way through the `for` loop, we know that all counts are 0 or 2, which means the word is a doubloon.

Pulling together the code fragments, and adding some comments and test cases, see the complete example java code in the left pane. To compile and run the code, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch07/Doubloon.java java -cp code/ch07/ Doubloon )






This example uses methods, `if` statements, `for` loops, arithmetic and logical operators, integers, characters, strings, booleans, and arrays. We hope you'll take a second to appreciate how much you've learned!