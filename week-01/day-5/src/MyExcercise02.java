import java.util.Scanner;

public class MyExcercise02 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("To what number you want to count?");
        int maxNum = read.nextInt();
        int i, j, k;

        for (i = 0; i < maxNum; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            for (k = 0; k < maxNum-i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
