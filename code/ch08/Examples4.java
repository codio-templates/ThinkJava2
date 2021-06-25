public class Examples4 {

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }

    public static void main(String[] args) {
       
        System.out.println("displayBinary");
        displayBinary(23);
        System.out.println();
    }

}
