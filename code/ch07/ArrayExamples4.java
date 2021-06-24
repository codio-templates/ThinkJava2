import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples4 {

    /**
     * Example code from Chapter 7.
     */
    public static void main(String[] args) {
        // copying an array
        double[] a = {1.0, 2.0, 3.0};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // copying with Arrays class
        double[] c = Arrays.copyOf(a, a.length);
    }

    /**
     * Prints the elements of an array.
     */
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

}
