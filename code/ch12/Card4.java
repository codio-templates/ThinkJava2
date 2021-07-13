/**
 * A standard playing card.
 */
public class Card4 {

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
    public Card4(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Returns a negative integer if this card comes before
     * the given card, zero if the two cards are equal, or
     * a positive integer if this card comes after the card.
     */
    public int compareTo(Card4 that) {
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

    /**
     * Returns true if the given card has the same
     * rank AND same suit; otherwise returns false.
     */
    public boolean equals(Card4 that) {
        return this.rank == that.rank
            && this.suit == that.suit;
    }

    /**
     * Returns a string representation of the card.
     */
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
  
  public static void main(String[] args) {
    Card4 card1 = new Card4(11, 1);
    Card4 card2 = new Card4(13, 2);
    System.out.println(card1.compareTo(card2));
  }

}
