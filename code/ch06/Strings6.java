import java.util.Scanner;

public class Strings6 {

    public static void main(String[] args) {

        System.out.print("Play again? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
      
        if (answer.equals("yes")) {            // correct
            System.out.println("Let's go!");
        }

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1.equals(name2)) {
            System.out.println("The names are the same.");
        }

        int diff = name1.compareTo(name2);
        if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        } else {
            System.out.println("The names are the same.");
        }
    }

    /**
     * Reverses a string, returns a new String.
     */
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

}
