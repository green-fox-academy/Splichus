import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        Scanner reader = new Scanner(System.in);
        System.out.println("How many lines your diamond shall have?");
        int lines = reader.nextInt();

        int i, k, m;

        double j, l;

        for (i = 0; i < lines; i++) {
            if (i < lines/2) {
                for (j = lines/2.0; j > i+1; j--) {
                    System.out.print(" ");
                }
                for (k = 0; k < (2*i+1); k++) {
                    System.out.print("*");
                }
            } else {
                for (l = lines/2.0; l < i; l++ ) {
                    System.out.print(" ");
                }
                for (m = 0; m < (lines-i)*2-1; m++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
