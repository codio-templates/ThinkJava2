/**
 * A standard playing card.
 */
public class CardClass {
    private int rank;
    private int suit;

    public CardClass(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
  
  public static void main(String[] args) {
    CardClass threeOfClubs = new CardClass(3, 0);
  }
}