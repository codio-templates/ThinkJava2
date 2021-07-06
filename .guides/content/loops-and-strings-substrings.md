In addition to searching strings, we often need to extract parts of strings. The ```substring``` method returns a new string that copies letters from an existing string, given a [ pair of indexes:](open_file code/ch06/Strings5.java panel=0 ref="fruit.substring" count=3)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings5.java panel=0 count=3)




* `fruit.substring(0, 3)` returns `"ban"`
* `fruit.substring(2, 5)` returns `"nan"`
* `fruit.substring(6, 6)` returns `""`



Notice that the character indicated by the second index is *not* included. Defining `substring` this way simplifies some common operations. For example, to select a substring with length `len`, starting at index `i`, you could write `fruit.substring(i, i + len)`.


Like most string methods, `substring` is **overloaded**. That is, there are other versions of `substring` that have different parameters. If it is invoked with one argument, it returns the letters from that index [ to the end:](open_file code/ch06/Strings5.java panel=0 ref="fruit.substring" count=7)
 [REMOVE HIGHLIGHT](open_file code/ch06/Strings5.java panel=0 count=7)




* `fruit.substring(0)` returns `"banana"`
* `fruit.substring(2)` returns `"nana"`
* `fruit.substring(6)` returns `""`



The first example returns a copy of the entire string. The second example returns all but the first two characters. As the last example shows, `substring` returns the empty string if the argument is the length of the string.

We could also use `fruit.substring(2, fruit.length())` to get the result `"nana"`. But calling `substring` with one argument is more convenient when you want the end of the string. To compile and run this statement, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch06/Strings5.java java -cp code/ch06/ Strings5 )
