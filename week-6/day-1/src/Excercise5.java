import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise5 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the uppercase characters in a string!

        String s = "pjfOIHgFpohUGpHigoigFPHF";
        List<String> string = new ArrayList<>();
        for (int i = 0; i < s.length() ; i++) {
            string.add(s.substring(i, i+1));
        }
        string.stream()
                .filter(ch -> ch.equals(ch.toUpperCase()))
                .forEach(ch -> System.out.println(ch));
    }
}
