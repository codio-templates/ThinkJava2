import java.util.Random;

/**
 * Example code related to histograms.
 */
public class RandomNum {

    /**
     * Returns an array of random integers.
     */
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] array = randomArray(8);
        ArrayExamples.printArray(array);
    }

}
