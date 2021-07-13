/**
 * Search algorithms for arrays of cards.
 */
public class Search6 {

    /**
     * Make an array of 52 cards.
     */
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }

    /**
     * Displays the given deck of cards.
     */
    public static void printDeck(Card[] cards) {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    /**
     * Demonstrates how to call the search methods.
     */
    public static void main(String[] args) {
        Card[] cards = makeDeck();
        Card jack = new Card(11, 0);
        Card fake = new Card(15, 1);
    }

}
