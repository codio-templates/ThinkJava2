import java.awt.Point;
import java.awt.Rectangle;

public class ObjectReturn {
  
  public static void main(String[] args){
        Rectangle box = new Rectangle(0, 0, 100, 200);
        Point center = findCenter(box);
  }
  
   public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }
}

