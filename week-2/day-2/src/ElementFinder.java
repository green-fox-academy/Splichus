import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!
    }
    public static String containsSeven (ArrayList<Integer> arrayList) {
        String toReturn = "";

        //Solution 2
//      ----------------------------------------------
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == 7) {
                toReturn = "Hooray";
                break;
            } else if (i == arrayList.size()-1) {
                toReturn = "Noooooo";
            }
        }
//        Solution 1
//        --------------------------
//        if (arrayList.contains(7)) {
//            toReturn = "Hoorray";
//        } else {
//            toReturn = "Noooooo";
//        }
        return toReturn;
    }
}
