import java.util.Random;

/**
 * A deck of playing cards (of fixed length).
 */
public class Deck {

    // This is a class variable so we don't have to create
    // a new Random object every time we call randomInt.
    private static Random random = new Random();

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (all null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return "TODO";
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        //for each index i 
            // choose a random number between i and length - 1
            // swap the ith card and the randomly-chosen card
        
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    private static int randomInt(int low, int high) {
        return 0;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    private void swapCards(int i, int j) {
        
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        //for each index i {
            // find the lowest card at or to the right of i
            // swap the ith card and the lowest card found
        //}
    }
    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    private int indexLowest(int low, int high) {
        // find the lowest card between low and high
      return 0;
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    private static Deck merge(Deck d1, Deck d2) {
        // create a new deck, d3, big enough for all the cards

        // use the index i to keep track of where we are at in
        // the first deck, and the index j for the second deck
        int i = 0;
        int j = 0;

        // the index k traverses the result deck
        //for (int k = 0; k < d3.length; k++) {
            // if d1 is empty, use top card from d2
            // if d2 is empty, use top card from d1
            // otherwise, compare the top two cards

            // add lowest card to the new deck at k
            // increment i or j (depending on card)
        //}
        // return the new deck
        return new Deck();
    }

    /**
     * Returns a sorted copy of the deck using selection sort.
     */
    public Deck almostMergeSort() {
      // divide the deck into two subdecks
      // sort the subdecks using selectionSort
      // merge the subdecks, return the result
      return this;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
      // if the deck has 0 or 1 cards, return it
      // otherwise, divide the deck into two subdecks
      // sort the subdecks using mergeSort
      // merge the subdecks
      // return the result
      return this;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }

    /**
     * Helper method for insertion sort.
     */
    private void insert(Card card, int i) {
    }

}
