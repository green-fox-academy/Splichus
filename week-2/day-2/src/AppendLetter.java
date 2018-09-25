import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppendLetter {

    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));
    }
    public static List<String> appendA (List<String> List) {
        for (int i = 0; i < List.size(); i++) {
            List.set(i, List.get(i)+"a");
        }
        return List;
    }
}
