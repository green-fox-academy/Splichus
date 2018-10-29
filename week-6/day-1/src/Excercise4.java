import java.util.ArrayList;
import java.util.Arrays;

public class Excercise4 {
    public static void main(String[] args) {
        //Write a Stream Expression to find which number squared value is more then 20 from the following array:

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

        numbers.stream()
                .filter(n -> Math.pow((double)n, 2) > 20)
                .forEach(n -> System.out.println((int)n));

        for (int i = 0; i < numbers.size() ; i++) {
            if (Math.pow(numbers.get(i), 2) > 20) {
                System.out.println(numbers.get(i));
            }
        }
    }
}
