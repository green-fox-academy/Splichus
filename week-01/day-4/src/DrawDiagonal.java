import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner reader = new Scanner(System.in);
        System.out.println("What is the size of the square?");
        int side = reader.nextInt();

        for (int i = 0; i < side; i++) {
            if (i==0 || i == side-1) {
                for (int j = 0; j < side; j++) {
                    System.out.print("%");
                }
            } else {
                System.out.print("%");
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                for (int l = 1; l < side-i-1; l++) {
                    System.out.print(" ");
                }
                System.out.print("%");
            }
            System.out.println();
        }
    }
}
