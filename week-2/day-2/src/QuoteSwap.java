import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
        String print = "";
        for (int i = 0; i < list.size(); i++) {
            print += list.get(i) + " ";
        }
        System.out.println(print);

    }
    public static ArrayList<String> quoteSwap (ArrayList<String> arrayList) {

        String temp = arrayList.get(2);
        arrayList.set(2, arrayList.get(5));
        arrayList.set(5, temp);
        return arrayList;
    }
}
