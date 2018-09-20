import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter 5 integers in a row: ");
        int one = reader.nextInt();
        int two = reader.nextInt();
        int three = reader.nextInt();
        int four = reader.nextInt();
        int five = reader.nextInt();

        int sum = one+two+three+four+five;
        int avg = sum/5;

        System.out.println("Sum: " +sum+ ", Average: " +avg);

    }
}
