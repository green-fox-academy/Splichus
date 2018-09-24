import java.util.Scanner;

public class Sum {

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        System.out.println(sum(7));

    }

    public static int sum (int last) {
        int sum = 0;

        for (int i = 0; i <= last ; i++) {
            sum += i;
        }
        return sum;
    }



}
