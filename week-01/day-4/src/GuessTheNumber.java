import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the maximum number for the range for guessing");
        int rangeUpTo = reader.nextInt();
        double ran = (int)(Math.random()*rangeUpTo+1);

        while (true) {
            System.out.println("Please guess the number: ");
            int guess = reader.nextInt();
            if (guess == ran) {
                System.out.println("Great job! You guessed right!");
                break;
            } else if (guess < ran) {
                System.out.println("The number is higher");
            } else {
                System.out.println("The number is smaller");
            }
            System.out.println();
        }
    }
}
