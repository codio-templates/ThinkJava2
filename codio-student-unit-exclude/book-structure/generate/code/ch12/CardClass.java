/**
 * A standard playing card.
 */
public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
  
  public static void main(String[] args) {
    Card threeOfClubs = new Card(3, 0);
  }
}