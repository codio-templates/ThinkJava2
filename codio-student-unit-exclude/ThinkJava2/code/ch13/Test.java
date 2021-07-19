/**
 * Test sorting algorithms for decks of cards.
 */
public class Test {

    /**
     * Checks that the deck is sorted.
     */
    public static void checkSorted(Deck deck) {
        Card[] cards = deck.getCards();
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i].compareTo(cards[i + 1]) >= 0) {
                System.out.println("Card #" + i + " not sorted!");
            }
        }
    }

    /**
     * Demonstrates how to call the sorting methods.
     */
    public static void main(String[] args) {
        Deck deck;
      
        int section = Integer.parseInt(args[0]);
      
        System.out.println("Testing toString()");
        deck = new Deck();
        System.out.println(deck.toString());

        if (section != 0) {
          
          System.out.println("Testing shuffle... if no unsorted cards listed below, shuffle was not performed.");
          deck = new Deck();
          deck.shuffle();
          checkSorted(deck);
          
          if (section != 1) {
            
            System.out.println("Testing selection...");
            deck = new Deck();
            deck.shuffle();
            deck.selectionSort();
            checkSorted(deck);

            System.out.println("Testing mergesort...");
            deck = new Deck();
            deck.shuffle();
            deck = deck.mergeSort();
            checkSorted(deck);

            System.out.println("Testing insertion...");
            deck = new Deck();
            deck.shuffle();
            deck.insertionSort();
            checkSorted(deck);
            
          }
        
        }
          
        
    }

}
