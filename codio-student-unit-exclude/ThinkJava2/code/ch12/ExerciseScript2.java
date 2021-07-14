/**
 * Exercise.
 */
public class ExerciseScript2 {
  // Modify the following function
  public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
  
  public static void main(String[] args) {
        //Test your code here
    
    }

}
