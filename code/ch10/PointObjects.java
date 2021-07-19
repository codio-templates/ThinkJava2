import java.awt.Point;

public class PointObjects {

    public static void main(String[] args) {
        Point blank;
        blank = new Point(3, 4);

        int x = blank.x;
        System.out.println(blank.x + ", " + blank.y);
        int sum = blank.x * blank.x + blank.y * blank.y;
      
    }
}
