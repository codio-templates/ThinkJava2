public class Examples3 {

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        System.out.println("countdown");
        countdown(3);

        System.out.println("countup");
        countup(3);
    }

}
