import java.util.ArrayList;

public class SubInt {

    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
    }

    public static ArrayList<Integer> subInt (int number, int[] array) {
        String numberHelper = Integer.toString(number);
        ArrayList<String> helper = new ArrayList<>();
        ArrayList<Integer> toReturn = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            helper.add(i, Integer.toString(array[i]));
        }
        for (int i = 0; i < helper.size() ; i++) {
            if (helper.get(i).contains(numberHelper)) {
                    toReturn.add(toReturn.size(),i);
                }
            }
        return toReturn;
        }

    }

