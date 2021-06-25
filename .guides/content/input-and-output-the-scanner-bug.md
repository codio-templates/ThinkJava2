Now that you've had some experience with `Scanner`, we want to warn you about an unexpected behavior. The following code fragment asks users for their name and age:

```code
System.out.print("What is your name? ");
name = in.nextLine();
System.out.print("What is your age? ");
age = in.nextInt();
System.out.printf("Hello %s, age %d\n", name, age);
```

The output might look something like this:

```code
Hello Grace Hopper, age 45
```

When you read a `String` followed by an `int`, everything works just fine. But when you read an `int` followed by a `String`, something strange happens:

[View the highlighted the code](open_file code/ch03/ScannerBug.java panel=0 ref="System.out.print" count=5)
[Remove the Highlight](open_file code/ch03/ScannerBug.java panel=0 ref=)
 ```code
System.out.print("What is your age? ");
age = in.nextInt();
System.out.print("What is your name? ");
name = in.nextLine();
System.out.printf("Hello %s, age %d\n", name, age);
```

See the example java code in the left pane. To compile and run the code, press the "Run"!
{Run!|terminal}(sh .guides/bg.sh javac code/ch03/ScannerBug.java java -cp code/ch03/ ScannerBug )
 Try running this example code. It doesn't let you input your name, and it immediately displays the output:

```code
What is your name? Hello , age 45
```

To understand what is happening, you need to realize that `Scanner` doesn't see input as multiple lines as we do. Instead, it gets a *stream of characters* as shown in Figure 3.3.

![Figure 3.3 A stream of characters as seen by a `Scanner`.](figs/hopper1.jpg)

**Figure 3.3 A stream of characters as seen by a `Scanner`.**


The arrow indicates the next character to be read by `Scanner`. When you run `nextInt`, it reads characters until it gets to a non-digit. Figure 3.4 shows the state of the stream after `nextInt` runs.

![Figure 3.4 A stream of characters after `nextInt` runs.](figs/hopper2.jpg)

**Figure 3.4 A stream of characters after `nextInt` runs.**

At this point, `nextInt` returns the value `45`. The program then displays the prompt `"What is your name? "` and runs `nextLine`, which reads characters until it gets to a newline. But since the next character is already a newline, `nextLine` returns the empty string `""`.

To solve this problem, you need an extra `nextLine` after `nextInt`:

```code
System.out.print("What is your age? ");
age = in.nextInt();
in.nextLine();  // read the newline
System.out.print("What is your name? ");
name = in.nextLine();
System.out.printf("Hello %s, age %d\n", name, age);
```

This technique is common when reading `int` or `double` values that appear on their own line. First you read the number, and then you read the rest of the line, which is just a newline character.