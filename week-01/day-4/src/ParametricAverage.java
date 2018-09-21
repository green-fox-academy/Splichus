import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How many numbers would you like to add");
        int maxNum = reader.nextInt();
        System.out.println("Please enter the numbers: ");
        int sum = 0;

        for (int i = 0; i < maxNum; i++) {
            sum += reader.nextInt();
        }
        System.out.println("The sum is: " +sum);
        System.out.println("The avg is: " +sum/(double)maxNum);
    }
}
