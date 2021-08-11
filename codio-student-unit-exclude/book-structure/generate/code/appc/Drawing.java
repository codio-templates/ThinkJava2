import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Drawing extends Canvas {
  
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas drawing = new Drawing();
        drawing.setSize(400, 400);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
      
        g.setColor(Color.RED);
      
        Color purple = new Color(128, 0, 128);
      
        g.setColor(purple);
      
        g.fillOval(100, 100, 200, 200);
      
        this.setBackground(Color.WHITE);
        
    }

}
