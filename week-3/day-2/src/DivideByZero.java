public class DivideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0
        divisor(0);
    }
    public static void divisor (int number) {
        try {
            System.out.println(10/number);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }

}
