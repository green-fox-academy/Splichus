import java.util.HashMap;
import java.util.Map;

public class CountLetters {


    public static Map countLetters(String string) {
        Map letters = new HashMap<>();

        for (int i = 0; i < string.length() ; i++) {
            if (!letters.containsKey(string.charAt(i))) {
                letters.put(string.charAt(i),1);
            } else {
                letters.put(string.charAt(i), (Integer)letters.get(string.charAt(i))+1);
            }
        }
        return letters;
    }
}
