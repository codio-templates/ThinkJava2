public class Strings1 {

    public static void main(String[] args) {

         String fruit = "banana";
        char letter0 = fruit.charAt(0);

        if (letter0 == 'a') {
            System.out.println("It's an A!");
        }
      
        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();
       
    }
    
}
