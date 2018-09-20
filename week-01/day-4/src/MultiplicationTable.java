import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What number you want to multiplicate?");
        int multi = reader.nextInt();
        System.out.println("How many prints?");
        int prints = reader.nextInt();

        for (int i = 1; i <= prints; i++) {
            System.out.println(i+ " * " +multi+ " = " +i*multi);
        }
    }
}
