/**
 * A standard playing card.
 */
public class Card1 {

    public static final String[] RANKS = {
        null, "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] SUITS = {
        "Clubs", "Diamonds", "Hearts", "Spades"};
  
  // instance variables and constructors go here
  
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
  
  
}
