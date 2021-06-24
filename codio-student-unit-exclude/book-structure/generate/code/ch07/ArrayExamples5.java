import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples5 {

    /**
     * Example code from Chapter 7.
     */
    public static void main(String[] args) {
        // displaying arrays
        int[] a = {1, 2, 3, 4, 5};

        // traversing arrays
        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
      printArray(a);
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

    /**
     * Returns the index of the target in the array, or -1 if not found.
     */
    public static int search(double[] array, double target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;  // not found
    }

    /**
     * Returns the total of the elements in an array.
     */
    public static double sum(double[] array) {
        double total = 0.0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

}
