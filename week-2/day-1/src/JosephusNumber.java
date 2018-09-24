import java.util.Scanner;

public class JosephusNumber {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give me the size of the group you want to find the survivor in: ");
        int groupInt = scan.nextInt();
        int[] group = new int[groupInt];

        for (int i = 0; i < groupInt; i++) {
            group [i] = i;
        }

        for (int each : group) {
            System.out.print(each);
        }

        while (group.length > 1) {
            if (group.length % 2 == 0) {
                for (int i = 0; i < group.length; i++) {

                }
            }
        }

    }
}
