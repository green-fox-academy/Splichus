import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give me your first  word");
        String word1 = scan.nextLine();
        System.out.println("Give me your second word");
        String word2 = scan.nextLine();

        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();

        Arrays.sort(word1Char);
        Arrays.sort(word2Char);
        
            if (Arrays.equals(word1Char, word2Char)) {
                System.out.println("Is palindrome");
            } else {
                System.out.println("Not pslindromes");
        }

    }
}