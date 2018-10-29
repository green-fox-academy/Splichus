import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Excercise2 {
    public static void main(String[] args) {

       // Write a Stream Expression to get the average value of the odd numbers from the following array:
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
        int sum = 0;
        OptionalDouble avg = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> n)
                .average();
        System.out.println(avg.getAsDouble());
    }
}
