public class String3 {

    public static void main(String[] args) {
        // Given a string, compute recursively a new string where all the
        // adjacent chars are now separated by a "*".
        System.out.println(separateByStar("abcdefgh"));
    }

    public static String separateByStar (String string) {
        if (string.length() == 0) {
            return "";
        } else {
            if (string.length() > 1) {
                return separateByStar(string.substring(0, string.length()-1))+"*"+string.charAt(string.length()-1);
            } else {
                return String.valueOf(string.charAt(0));
            }
        }
    }
}
