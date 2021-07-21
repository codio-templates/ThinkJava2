In Java source code, some spaces are required. For example, you need at least one space between words, so this program is not legal:

```code
publicclassGoodbye{

    publicstaticvoidmain(String[] args) {
        System.out.print("Goodbye, ");
        System.out.println("cruel world");
    }
}
```

But most other spaces are optional.

For example, the code to the upper left is legal. To compile and run the code, press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/1/Goodbye.java java -cp code/1/ Goodbye )



The newlines are optional, too.

So even the code on the lower left is legal. To compile and run the code, press the "Run!" button.
{Run!}(sh .guides/bg.sh javac code/2/Goodbye.java java -cp code/2/ Goodbye )



It still works, but the program is getting harder and harder to read. Newlines and spaces are important for visually organizing your program, making it easier to understand the program and find errors when they occur.

Many editors will automatically format source code with consistent indenting and line breaks.






Organizations that do a lot of software development usually have strict guidelines on how to format source code. For example, Google publishes its Java coding standards for use in open source projects: [click here](open_preview https://google.github.io/styleguide/javaguide.html panel=0) to learn more.


You probably won't understand these guidelines now, because they refer to language features you haven't yet seen. But you might want to refer to them periodically as you read this book.