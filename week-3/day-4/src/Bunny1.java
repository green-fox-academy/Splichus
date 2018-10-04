public class Bunny1 {
    public static void main(String[] args) {

        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
        System.out.println(numberOfEars(6));
    }

    public static int numberOfEars(int numberOfBunies) {
        if (numberOfBunies == 1) {
            return 2;
        } else {
            return 2+numberOfEars(numberOfBunies-1);
        }
    }
}
