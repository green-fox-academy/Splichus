import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner reader = new Scanner(System.in);

        System.out.println("How many kilometres? You can use a double!");
        double km = reader.nextDouble();
        System.out.println(km+" km is " +km*0.6214+ " miles.");
    }
}