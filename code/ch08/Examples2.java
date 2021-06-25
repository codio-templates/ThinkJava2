public class Examples2 {

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void main(String[] args) {
        forever("Ha!");
    }

}
