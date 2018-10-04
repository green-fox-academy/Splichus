import java.util.ArrayList;

public class String1 {
    public static void main(String[] args) {
        // Given a string, compute recursively (no loops) a new string where all the
        // lowercase 'x' chars have been changed to 'y' chars.

        System.out.println(changeXWithY("axbxcxdx"));
    }

    public static String changeXWithY(String word) {
        String helper = "";
        if (word.length()==0) {
            return "";
        } else {
            char lastChar = word.charAt(word.length()-1);
            if (lastChar == 'x') {
                return changeXWithY(word.substring(0, word.length()-1)) + "y";
            } else {
                return changeXWithY(word.substring(0, word.length()-1)) + lastChar;
            }

        }

    }
}
