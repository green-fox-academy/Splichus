import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] test = {1, 3, 6, 4, 8, 3, 1, 6, 7};
        int[] test1 = sort(test, false);

        for (int i = 0; i < test1.length ; i++) {

            System.out.print(test1[i] + " ");

        }
    }

    public static int[] sort (int[] array, boolean descending) {

        if (!descending) {
            Arrays.sort(array);
            int[] toReturn = Arrays.copyOf(array, array.length);
            return toReturn;
        } else {
            Arrays.sort(array);
            int[] reverted = new int[array.length];
            for (int i = 0; i < reverted.length; i++) {
                reverted[i] = array[array.length-1-i];
            }
            return reverted;
        }
    }
}
