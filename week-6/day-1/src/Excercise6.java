import java.util.ArrayList;
import java.util.Arrays;

public class Excercise6 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the strings which starts with `A` and ends with `I` in the following array:

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

        cities.stream()
                .filter(city -> city.substring(0,1).equals("A"))
                .filter(city -> city.substring(city.length()-1).equals("I"))
                .forEach(city -> System.out.println(city));

    }
}
