import java.util.Arrays;

public class Unique {

    public static void main(String[] args) {

        double v = 37.9;


        int[] test1 = {1, 11, 34, 11, 52, 61, 1, 34};
        int[] test = unique(test1);

        for (int i = 0; i < test.length ; i++) {
            System.out.print(test[i]+", ");
        }
    }
    // The clearing function - sorts the array and checks if item on index i is the same as item on index i+1, add the last one
    public static int[] unique (int[] newList) {
        Arrays.sort(newList);
        int[] unique = new int[0];

        for (int i = 0; i < newList.length-1; i++) {
                if (newList[i] != newList [i+1]) {
                unique = arrAdd(unique, newList[i]);
            }
        }
        unique = arrAdd(unique, newList[newList.length-1]);
        return unique;
    }
    // add array function - takes the current array and increases is by the number in parameter
    public static int [] arrAdd (int[] array, int number) {
        int[] addArray = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            addArray[i] = array[i];
        }
        addArray[addArray.length-1] = number;
        return addArray;
    }

}
