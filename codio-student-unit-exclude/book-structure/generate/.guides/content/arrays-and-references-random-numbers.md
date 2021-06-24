Most computer programs do the same thing every time they run; programs like that are called **deterministic**. Usually, determinism is a good thing, since we expect the same calculation to yield the same result. But for some applications, we want the computer to be unpredictable. Games are an obvious example, but there are many others, like scientific simulations.



Making a program **nondeterministic** turns out to be hard, because it's impossible for a computer to generate truly random numbers. But there are algorithms that generate unpredictable sequences called **pseudorandom** numbers. For most applications, they are as good as random.



If you did Exercise 3.4, you have already seen `java.util.Random`, which generates pseudorandom numbers. The method `nextInt` takes an integer argument, `n`, and returns a random integer between `0` and `n - 1` (inclusive).

If you generate a long series of random numbers, every value should appear, at least approximately, the same number of times. One way to test this behavior of `nextInt` is to generate a large number of values, store them in an array, and count the number of times each value occurs.

[The following method](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/RandomNum.java panel=0 ref="* Returns an array of random integers." count=10) creates an `int` array and fills it with random numbers between 0 and 99.
 [Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/RandomNum.java panel=0)
Try it out here.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch07/*.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch07/ RandomNum )
 The argument specifies the desired size of the array, and the return value is a reference to the new array:

```code
public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
}
```

[The following main method](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/RandomNum.java panel=0 ref="public static void main" count=4) generates an array and displays it by using the `printArray` method from Section 7.3. 
 We could have used `Arrays.toString`, but we like seeing curly braces instead of square brackets:

```code
public static void main(String[] args) {
    int[] array = randomArray(8);
    printArray(array);
}
```

Each time you run the program, you should get different values. The output will look something like this:

```code
{15, 62, 46, 74, 67, 52, 51, 10}
```

[Remove highlighting](open_file codio-student-unit-exclude/ThinkJava2/code/ch07/RandomNum.java panel=0)
Try it out yourself here.
{Run!}(sh .guides/bg.sh javac codio-student-unit-exclude/ThinkJava2/code/ch07/*.java java -cp codio-student-unit-exclude/ThinkJava2/code/ch07/ RandomNum )
