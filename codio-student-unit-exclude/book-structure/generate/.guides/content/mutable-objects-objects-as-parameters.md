You can pass objects as parameters in the usual way. [For example:](open_file code/ch10/ObjectPar.java panel=0 ref="printPoint" count=3)



```code
public static void printPoint(Point p) {
    System.out.println("(" + p.x + ", " + p.y + ")");
}
```

[Click to remove the highlight](open_file code/ch10/ObjectPar.java panel=0 count=1)
 This method takes a point as an argument and displays its attributes in parentheses. If you invoke `printPoint(blank)`, it displays `(3, 4)`.

As another example, we can rewrite the ```distance``` method from Section 4.6 so that it takes two ```Point```s as parameters instead of [ four doubles:](open_file code/ch10/ObjectPar.java panel=0 ref="double distance" count=4)


```code
public static double distance(Point p1, Point p2) {
    int dx = p2.x - p1.x;
    int dy = p2.y - p1.y;
    return Math.sqrt(dx * dx + dy * dy);
}
```

[Click to remove the highlight](open_file code/ch10/ObjectPar.java panel=0 count=4)
 Passing objects as parameters makes the source code more readable and less error-prone because related values are bundled together.

You actually don't need to write a `distance` method, because `Point` objects already have one. To compute the distance between two points, we invoke ```distance``` on one and pass the other as [ an argument:](open_file code/ch10/ObjectPar.java panel=0 ref="Point p1" count=5)


```code
Point p1 = new Point(0, 0);
Point p2 = new Point(3, 4);
double dist = p1.distance(p2);  // dist is 5.0
```

[Click to remove the highlight](open_file code/ch10/ObjectPar.java panel=0 count=5)
 To compile and run the highlighted statement, press "Run!"
{Run!}(sh .guides/bg.sh javac code/ch10/ObjectPar.java java -cp code/ch10/ ObjectPar )
 It turns out you don't need the `printPoint` method either. If you invoke `System.out.println(blank)`, it prints the type of the object and the values of the attributes:

```code
java.awt.Point[x=3,y=4]
```


`Point` objects provide a method called `toString` that returns a string representation of a point. When you call `println` with objects, it *automatically* calls `toString` and displays the result.