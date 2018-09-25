import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list, 4, 8,12,16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
    }
    public static boolean checkNums (ArrayList<Integer> arrayList, int int1, int int2, int int3, int int4) {
        boolean toReturn = arrayList.containsAll(new ArrayList<>(Arrays.asList(int1, int2, int3, int4)));
        return toReturn;
    }
}
