import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please type a number: ");
        int num = reader.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

}
