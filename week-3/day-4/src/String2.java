public class String2 {

    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the 'x' chars have been removed.
        System.out.println(removeX("axbxcxdx"));
    }

    public static String removeX (String word) {
        if (word.length() == 0) {
            return "";
        } else {
            char lastChar = word.charAt(word.length()-1);
            if (lastChar == 'x') {
                return removeX(word.substring(0, word.length()-1));
            } else {
                return removeX(word.substring(0, word.length()-1)) + lastChar;
            }
        }
    }

}
