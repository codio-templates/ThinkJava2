This exercise is about aliasing. Recall that aliases are two variables that refer to the same object. The following code uses `findCenter` and `printPoint` as defined in this chapter.



1. Draw a diagram that shows the state of the program just before the end of `main`. Include all local variables and the objects they refer to.
1. What is the output of the program?
1. At the end of `main`, are `p1` and `p2` aliased? Why or why not?



```code
public static void main(String[] args) {
    Rectangle box1 = new Rectangle(2, 4, 7, 9);
    Point p1 = findCenter(box1);
    printPoint(p1);

    box1.grow(1, 1);
    Point p2 = findCenter(box1);
    printPoint(p2);
}
```