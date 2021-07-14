/**
 * A standard playing card.
 */
public class Card2 {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};
  
  // instance variables and constructors go here
  
  private final int rank;

    private final int suit;
  
  public Card2(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
  
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
  
  
}
