So far we have used several classes from the Java library, including `System`, `String`, `Scanner`, `Math`, and `Random`. These classes are written in Java, so you can read the source code to see how they work.


The Java library contains thousands of files, many of which are thousands of lines of code. That's more than one person could read and understand fully, but don't be intimidated!

Because it's so large, the library source code is stored in a ZIP archive named *src.zip*. If you have Java installed on your computer, you should already have this file somewhere:



* On Linux, it's likely under: `/usr/lib/jvm/.../lib` <br/> If not, you might have to install the *openjdk-...-source* package.
* On macOS, it's likely under: <br/> `/Library/Java/JavaVirtualMachines/.../Contents/Home/lib`
* On Windows, it's likely under: `C:\Program Files\Java\...\lib`



When you open (or unzip) the file, you will see folders that correspond to Java packages. For example, open the *java* folder, and then open the *awt* folder. (If you don't see a *java* folder at first, open the *java.desktop* folder.) You should now see *Point.java* and *Rectangle.java*, along with the other classes in the `java.awt` package.

Open *Point.java* in your editor and skim through the file. It uses language features we haven't discussed yet, so you probably won't understand every line. But you can get a sense of what professional Java source code looks like by browsing through the library.


Notice how much of *Point.java* is documentation (see Appendix 19). Each method includes comments and tags like `@param` and `@return`. Javadoc reads these comments and generates documentation in HTML. You can see the same documentation online by doing a web search for “Java Point”.

Now take a look at the `grow` and `translate` methods in the `Rectangle` class. There is more to them than you may have expected.