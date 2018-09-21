import java.util.Scanner;

public class SubStr {

    public static int subStr(String input, String q) {
        int index = input.indexOf(q);
        return index;
    }
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
        Scanner reader = new Scanner(System.in);

        System.out.println("Please write your first string");
        String whereLookingFor = reader.nextLine();
        System.out.println("Please write what we are searching for:");
        String search = reader.nextLine();

        System.out.println(subStr(whereLookingFor, search));
    }
}