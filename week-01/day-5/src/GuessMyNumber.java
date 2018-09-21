import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the maximum number from one you want to guess?");
        int maxNum = scan.nextInt();
        double ran = (Math.random()*maxNum)+1;

        System.out.println("I have number between 1-" +maxNum+ ". You have 5 lives.");
        System.out.println();


        for (int i = 0; i < 5; i++) {
            System.out.println("Guess your " +(i+1)+ " number.");
            int guess = scan.nextInt();
            if (guess == (int)ran) {
                System.out.println("Congrats, You have guessed right!!!");
                break;
            } else if (guess < (int)ran && i != 4) {
                System.out.println("The number is higher, you have " +(5-(i+1))+ " lives left.");
            } else if (guess > (int)ran && i != 4) {
                System.out.println("The number is lower, you have " +(5-(i+1))+ " lives left.");
            }
            System.out.println();
            if (i == 4) {
                System.out.println("You are dead, better luck next time. The number guessed was: "+(int)ran);
            }
        }
    }
}
