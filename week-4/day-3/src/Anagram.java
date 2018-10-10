import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anagram {


    public static boolean isAnagram(String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }
        ArrayList<Character> char1array = new ArrayList<>();
        for (int i = 0; i < string1.length(); i++) {
            char1array.add(string1.charAt(i));
        }
        ArrayList<Character> char2array = new ArrayList<>();
        for (int i = 0; i < string2.length(); i++) {
            char2array.add(string2.charAt(i));
        }
        Collections.sort(char1array);
        Collections.sort(char2array);
        if (char1array.equals(char2array)) {
            return true;
        }
        return false;
    }
}
