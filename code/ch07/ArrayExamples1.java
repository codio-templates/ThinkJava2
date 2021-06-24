import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples1 {

    /**
     * Example code from Chapter 7.
     */
    public static void main(String[] args) {
        int size = 10;
        int[] counts = new int[4];
        double[] values = new double[size];

        // displaying arrays
        int[] array = {1, 2, 3, 4};
        printArray(array);  
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