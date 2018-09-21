import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me you number");
        int num = scan.nextInt();
        String numS = String.valueOf(num);
        int l = numS.length();
        int i;
        int sum = 0;
        System.out.println(l);

        for (i = 0; i < l; i++) {
            int currentI = Integer.parseInt(String.valueOf(numS.charAt(i)));
            double powered = Math.pow(currentI, l);
            sum += powered;
        }
        if (num == sum) {
            System.out.println("The " +num+ " is an Armstrong Number");
        } else {
            System.out.println("The " +num+ " is not an Armstrong Number");
        }
    }
}
