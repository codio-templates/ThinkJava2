When you output a `double` by using `print` or `println`, it displays up to 16 decimal places:

```code
System.out.print(4.0 / 3.0);
```

See the example java code in the left pane. To compile and run the code, press the "Run"!
{Run!}(sh .guides/bg.sh javac code/ch03/Formatting.java java -cp code/ch03/ Formatting)
 The result is as follows:

```code
1.3333333333333333
```


That might be more than you want. `System.out` provides another method, called `printf`, that gives you more control of the format. The “f” in `printf` stands for “formatted”. Here's an example:

```code
System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
```


See the example java code in the left pane. To compile and run the code, press the "Run"!
{Run!}(sh .guides/bg.sh javac code/ch03/Formatting.java java -cp code/ch03/ Formatting)
 The first value in the parentheses is a **format string** that specifies how the output should be displayed. This format string contains ordinary text followed by a **format specifier**, which is a special sequence that starts with a percent sign. The format specifier `%.3f` indicates that the following value should be displayed as floating-point, rounded to three decimal places:

```code
Four thirds = 1.333
```

The format string can contain any number of format specifiers; here's an example with two of them:

[View the highlighted the code](open_file code/ch03/Formatting.java panel=0 ref="int inch" count=3)
[Remove the highlight](open_file code/ch03/Formatting.java panel=0)
 ```code
int inch = 100;
double cm = inch * CM_PER_INCH;
System.out.printf("%d in = %f cm\n", inch, cm);
```

See the example java code in the left pane. To compile and run the code, press the "Run"!
{Run!}(sh .guides/bg.sh javac code/ch03/Formatting.java java -cp code/ch03/ Formatting)
 The result is as follows:

```code
100 in = 254.000000 cm
```

Like `print`, `printf` does not append a newline. So format strings often end with a newline character.

The format specifier `%d` displays integer values (“d” stands for “decimal”, meaning base 10 integer). The values are matched up with the format specifiers in order, so `inch` is displayed using `%d`, and `cm` is displayed using `%f`.

Learning about format strings is like learning a sublanguage within Java. There are many options, and the details can be overwhelming. Table 3.5 lists a few common uses, to give you an idea of how things work.



<center>
|`%d`|Integer in base 10 (“decimal”)|`12345`|
|-|-|-|
|`%,d`|Integer with comma separators|`12,345`|
|`%08d`|Padded with zeros, at least 8 digits wide|`00012345`|
|`%f`|Floating-point number|`6.789000`|
|`%.2f`|Rounded to 2 decimal places|`6.79`|
|`%s`|String of characters|`"Hello"`|
|`%x`|Integer in base 16 (“hexadecimal”)|`bc614e`|

</center>
**Table: Example format specifiers**


For more details, refer to the documentation of `java.util.Formatter`. The easiest way to find documentation for Java classes is to do a web search for “Java” and the name of the class.