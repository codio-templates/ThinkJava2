import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples2 {

    /**
     * Example code from Chapter 7.
     */
    public static void main(String[] args) {
        int size = 10;
        int[] counts = new int[4];
        double[] values = new double[size];

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        // traversal with a while loop
        int j = 0;
        while (j < 4) {
            System.out.println(counts[j]);
            j++;
        }

        // traversal with a for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }
    }
}