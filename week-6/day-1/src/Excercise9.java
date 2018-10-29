import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Excercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to convert a char array to a string!

        String s = "poklop";
        char[] array = s.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            characterList.add(array[i]);
        }

        String s1 = characterList.stream()
                .map(ch -> ch.toString())
                .collect(Collectors.joining());
        System.out.println(s1);

    }
}
