import java.util.Scanner;

public class PalindromeBuilder {

    public static String Palindrome (String word) {
        int l = word.length();
        String pali = "";
        int i;
        for (i = 0; i < l; i++) {
            String letter = String.valueOf(word.charAt(l-i-1));
            pali = pali + letter;
        }
        return pali;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me a word");
        String word = scan.nextLine();

        System.out.println(word+Palindrome(word));
    }
}
