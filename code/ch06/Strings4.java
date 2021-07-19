import java.util.Scanner;

public class Strings4 {

    public static void main(String[] args) {

        String fruit = "banana";
        /*
        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }
        */
      
        int length = fruit.length();
        char last = fruit.charAt(length - 1);  // correct

        //System.out.println(reverse(fruit)); 
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
