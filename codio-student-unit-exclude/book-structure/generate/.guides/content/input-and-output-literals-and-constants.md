Although most of the world has adopted the metric system for weights and measures, some countries are stuck with imperial units. For example, when talking with friends in Europe about the weather, people in the United States might have to convert from Celsius to Fahrenheit and back. Or they might want to convert height in inches to centimeters.


We can write a program to help. We'll use a `Scanner` to input a measurement in inches, convert to centimeters, and then display the results. The following lines declare the variables and create the `Scanner`:

[click here!](open_file code/ch03/Literals.java panel=0 ref="int inch" count=3)
 ```code
int inch;
double cm;
Scanner in = new Scanner(System.in);
```


The next step is to prompt the user for the input. We'll use `print` instead of `println` so the user can enter the input on the same line as the **prompt**. And we'll use the `Scanner` method `nextInt`, which reads input from the keyboard and converts it to an integer:

[click here](open_file code/ch03/Literals.java panel=0 ref="cm =" count=3)
 ```code
System.out.print("How many inches? ");
inch = in.nextInt();
```

Next we multiply the number of inches by 2.54, since that's how many centimeters there are per inch, and display the results:

[click here](open_file code/ch03/Literals.java panel=0 ref="cm" count=3)
 ```code
cm = inch * 2.54;
System.out.print(inch + " in = ");
System.out.println(cm + " cm");
```

This code works correctly, but it has a minor problem. If another programmer reads this code, they might wonder where 2.54 comes from. For the benefit of others (and yourself in the future), it would be better to assign this value to a variable with a meaningful name.




A value that appears in a program, like the number 2.54, is called a **literal**. In general, there's nothing wrong with literals. But when numbers like 2.54 appear in an expression with no explanation, they make the code hard to read. And if the same value appears many times and could change in the future, it makes the code hard to maintain.


Values like 2.54 are sometimes called **magic numbers** (with the implication that being magic is not a good thing). A good practice is to assign magic numbers to variables with meaningful names, like this:

```code
double cmPerInch = 2.54;
cm = inch * cmPerInch;
```

This version is easier to read and less error-prone, but it still has a problem. Variables can vary (hence the term), but the number of centimeters in an inch does not. Once we assign a value to `cmPerInch`, it should never change. Java provides the keyword `final`, a language feature that enforces this rule:

```code
final double CM_PER_INCH = 2.54;
```


Declaring that a variable is `final` means that it cannot be reassigned once it has been initialized. See the example java code in the left pane. This is a random sentence. To compile and run the code, press the "Run!"
{Run!|terminal}(sh .guides/bg.sh javac code/ch03/Literals.java java -cp code/ch03/ Literals)
 If you try, the compiler gives an error.

Variables declared as `final` are called **constants**. By convention, names for constants are all uppercase, with the underscore character (`_`) between words.