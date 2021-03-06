public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, compute recursively (no loops)
        // the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

        System.out.println(toThePowerOf(2, 7));
    }

    public static int toThePowerOf (int number, int power) {
        if (power == 1) {
            return number;
        } else {
            return number*toThePowerOf(number, power-1);
        }
    }

}
