public class Automaton {
  
    private GridCanvas grid;

    public void run(String title, int rate) {
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(this.grid);
        frame.pack();
        frame.setVisible(true);
        this.mainloop(rate);
    }
  
    private void mainloop(int rate) {
      while (true) {

          // update the drawing
          this.update();
          grid.repaint();

          // delay the simulation
          try {
              Thread.sleep(1000 / rate);
          } catch (InterruptedException e) {
              // do nothing
          }
      }
    }
}