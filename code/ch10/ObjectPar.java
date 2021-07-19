import java.awt.Point;

public class ObjectPar {
  
  public static void main(String[] args){
      
    Point p1 = new Point(0, 0);
    Point p2 = new Point(3, 4);
    double temp = distance(p1, p2);
    double dist = p1.distance(p2);  // dist is 5.0
    System.out.println(dist);

  }


/**
     * Prints the attributes of a Point object.
     */
    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    /**
     * Computes the distance between two points.
     */
    public static double distance(Point p1, Point p2) {
        int dx = p2.x - p1.x;
        int dy = p2.y - p1.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}