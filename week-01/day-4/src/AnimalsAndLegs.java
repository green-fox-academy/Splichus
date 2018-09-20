import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        Scanner reader = new Scanner(System.in);

        System.out.println("How many chicken farmer has?");
        int chicken = reader.nextInt();
        System.out.println("How many pigs farmer has?");
        int pig = reader.nextInt();
        int legs = 2*chicken + 4*pig;
        System.out.println("The animals have " +legs+ " legs.");
    }
}