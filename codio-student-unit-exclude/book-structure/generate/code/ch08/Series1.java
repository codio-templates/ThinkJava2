public class Series1 {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int recurse = factorial(n - 1);
        int result = n * recurse;
        return result;
    }

    public static void main(String[] args) {

        System.out.println("factorial");
        System.out.println(factorial(3));

    }

}
