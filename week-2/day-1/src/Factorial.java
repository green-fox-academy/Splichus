public class Factorial {

    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        System.out.println(factorio(4));
    }

    public static int factorio (int num) {

        int fact = 1;
        for (int i = 1; i <=num ; i++) {

            fact *= i;

        }
        return fact;
    }
}
