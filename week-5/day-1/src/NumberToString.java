import java.util.ArrayList;

public class NumberToString {

    private static ArrayList<String> ONES = new ArrayList<>();
    private static ArrayList<String> TENS = new ArrayList<>();

    public static void main(String[] args) {
        startOnes();
        startTens();

        System.out.println(convertNumberToString(123998790));
    }

    public static String convertNumberToString(int number) {
        ArrayList<String> decimals = new ArrayList<>();
        decimals.add("");
        decimals.add("Thousand ");
        decimals.add("Million ");
        decimals.add("Billion ");

        String stringNumber = String.valueOf(number);

         if (stringNumber.length() > 3 && stringNumber.length() <= 6) {
            return hundreds(number / 1000) + decimals.get(1) + hundreds(number % 1000);
        } else if (stringNumber.length() > 6 && stringNumber.length() <=9) {
             return hundreds(number/1000000) + decimals.get(2) + hundreds((number%1000000/1000))+decimals.get(1)+hundreds(number%1000);
         } else if (stringNumber.length() > 9 && stringNumber.length() <=12) {
             return hundreds(number/1000000000) + decimals.get(3) + hundreds((number%1000000))+decimals.get(2)+hundreds(number%1000)+decimals.get(1);

         }
        return "";
    }

    public static String tens (int number) {
        String toReturn = "";
        if (number==0) {
            return "Zero";
        }
        if (number>=20) {
            for (int i = number; i >= 1; i/=10) {
                if (i<10) {
                    toReturn = TENS.get(i%10)+ " " + toReturn;
                } else {
                    toReturn = ONES.get(i%10);
                }
            }
        } else {
            toReturn = ONES.get(number);
        }
        return toReturn;
    }

    public static String hundreds (int number) {
        String stringNumber = String.valueOf(number);
        if (stringNumber.length() < 3) {
            return tens(number);
        }
        else return ONES.get(number/100)+" hundred "+tens(number%100);

    }

    public static void startOnes() {
        ONES.add("");
        ONES.add("One");
        ONES.add("Two");
        ONES.add("Three");
        ONES.add("Four");
        ONES.add("Five");
        ONES.add("Six");
        ONES.add("Seven");
        ONES.add("Eight");
        ONES.add("Nine");
        ONES.add("Ten");
        ONES.add("Eleven");
        ONES.add("Twelve");
        ONES.add("Thirteen");
        ONES.add("Fourteen");
        ONES.add("Fifteen");
        ONES.add("Sixteen");
        ONES.add("Seventeen");
        ONES.add("Eighteen");
        ONES.add("Nineteen");
    }
    public static void startTens() {
        TENS.add("");
        TENS.add("Ten");
        TENS.add("Twenty");
        TENS.add("Thirty");
        TENS.add("Forty");
        TENS.add("Fifty");
        TENS.add("Sixty");
        TENS.add("Seventy");
        TENS.add("Eighty");
        TENS.add("Ninety");
    }
}
