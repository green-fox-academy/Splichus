public class Counter {
    public static void main(String[] args) {
        countingDown(5);
    }
    public static void countingDown (int number) {
        System.out.println(number);
        if (number == 0) {

        } else {
            countingDown(number-1);
        }
    }
}
