In the previous section, we said that attributes exist as long as the object exists. But when does an object cease to exist? Here is a simple example:


```code
Point blank = new Point(3, 4);
blank = null;
```

The first line creates a new `Point` object and makes `blank` refer to it. The second line changes `blank` so that instead of referring to the object, it refers to nothing. As shown in Figure 10.7, after the second assignment, there are no references to the `Point` object.


![Figure 10.7 Memory diagram showing the effect of setting a variable to `null`.](figs/reference3.jpg)

**Figure 10.7 Memory diagram showing the effect of setting a variable to `null`.**

If there are no references to an object, there is no way to access its attributes or invoke a method on it. From the program's point of view, it ceases to exist. However, it's still present in the computer's memory, taking up space.


As your program runs, the system automatically looks for stranded objects and deletes them; then the space can be reused for new objects. This process is called **garbage collection**.

You don't have to do anything to make garbage collection happen, and in general, you don't have to be aware of it. But in high-performance applications, you may notice a slight delay every now and then while Java reclaims space from discarded objects.