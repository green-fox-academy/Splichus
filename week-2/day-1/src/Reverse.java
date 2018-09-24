import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

        int[] aj = {3, 4, 5, 6, 7};
        int[] copy = Arrays.copyOf(aj, aj.length);


        for (int i = 0; i <aj.length ; i++) {
            aj [i] = copy [copy.length-i-1];
        }

        for (int anAj : aj) {
            System.out.println(anAj);
        }
    }
}
