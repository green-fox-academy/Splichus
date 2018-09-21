import java.util.Scanner;

public class MyExcercise01 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("How many lines?");
        int lines = read.nextInt();

        int i, j;

        for (i = 0; i < lines; i++) {
            for (j = lines; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
