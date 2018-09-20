import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        Scanner reader = new Scanner(System.in);

        System.out.println("How many levels should the pyramid have?");
        int level = reader.nextInt();
        int i,j,k,l,m;

        for (i = 1; i <= level; i++) {
            for (j = level; j>i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k<=(i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 0; i <= level; i++) {
            for (l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (m = 0; m < ((level-i)*2)-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
