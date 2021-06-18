Every object has a method called `toString` that returns a string representation of the object. When you display an object using `print` or `println`, Java invokes the object's `toString` method.


By default, it simply displays the type of the object and its address in hexadecimal. So, say you create a `Time` object and display it with `println`:

```code
public static void main(String[] args) {
    Time time = new Time(11, 59, 59.9);
    System.out.println(time);
}
```


The output looks something like this:

```code
Time@80cc7c0
```


This address can be useful for debugging, if you want to keep track of individual objects.


But you can **override** this behavior by providing your own `toString` method. For example, here is a `toString` method for `Time`:

```code
public String toString() {
    return String.format("%02d:%02d:%04.1f\n",
        this.hour, this.minute, this.second);
}
```


The definition does not have the keyword `static`, because it is not a static method. It is an **instance method**, so called because when you invoke it, you invoke it on an instance of the class. Instance methods are sometimes called “non-static”; you might see this term in an error message.

The body of the method is similar to `printTime` in the previous section, with two changes:



* Inside the method, we use `this` to refer to the current instance; that is, the object the method is invoked on.
* Instead of `printf`, it uses `String.format`, which returns a formatted `String` rather than displaying it.




Now you can call `toString` directly:

```code
Time time = new Time(11, 59, 59.9);
String s = time.toString();
```

The value of `s` is the string `"11:59:59.9"`. You can also invoke `toString` indirectly by invoking `print` or `println`:

```code
System.out.println(time);
```

This code displays the string `"11:59:59.9"`. Either way, when you use `this` inside `toString`, it refers to the same object as `time`.