import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {

    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches (ArrayList<String> array1, ArrayList<String> array2) {
        ArrayList<String> toReturn = new ArrayList<>();

        if(array1.size()<array2.size()) {
            for (int i = 0; i < array1.size() ; i++) {
                toReturn.add(2 * i, array1.get(i));
                toReturn.add(2 * i + 1, array2.get(i));
            }
        } else {
            for (int i = 0; i < array2.size() ; i++) {
                toReturn.add(2 * i, array1.get(i));
                toReturn.add(2 * i + 1, array2.get(i));
            }
        }
        return toReturn;
    }
}
