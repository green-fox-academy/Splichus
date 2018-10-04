public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(adder(5));
    }
    public static int adder (int number) {
        if (number == 0) {
            return 0;
        } else {
            return number+=adder(number-1);
        }
    }
}
