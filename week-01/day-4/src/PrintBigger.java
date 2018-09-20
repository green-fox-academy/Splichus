import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please give me first number: ");
        int a = reader.nextInt();
        System.out.println("Please give me second number: ");
        int b = reader.nextInt();

        if (a>b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
