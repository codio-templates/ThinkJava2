import java.util.Scanner;

public class Strings3 {

    public static void main(String[] args) {

        String fruit = "banana";
        char letter0 = fruit.charAt(0);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        while (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            System.out.print("Enter a number: ");
        }
        double number = in.nextDouble();
        in.nextLine();  // read the newline        
    }
}
