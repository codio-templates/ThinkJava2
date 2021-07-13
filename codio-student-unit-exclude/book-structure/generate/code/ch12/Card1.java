/**
 * A standard playing card.
 */
public class Card1 {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;

    private final int suit;

    /**
     * Constructs a card of the given rank and suit.
     */
    public Card1(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
  
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
  
  public static void main(String[] args) {
    Card1 card = new Card1(11, 1);
    System.out.println(card);
  }
}
