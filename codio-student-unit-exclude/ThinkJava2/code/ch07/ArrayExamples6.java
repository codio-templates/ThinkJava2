import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples6 {

    /**
     * Example code from Chapter 7.
     */
    public static void main(String[] args) {
      int[] values = {1, 2, 3, 4, 5};
      for (int value : values) {
        System.out.println(value);
      }
 
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
