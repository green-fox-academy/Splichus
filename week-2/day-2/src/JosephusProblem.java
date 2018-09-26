import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the Group: ");
        int group = scan.nextInt();
        System.out.println(josephusNumber(group));

    }

    public static int josephusNumber (int group) {
        ArrayList<Integer> groupArray = new ArrayList<>();
        for (int i = 0; i < group; i++) {
            groupArray.add(i,i+1);
        }

        if ((groupArray.size()%2 == 0)) {
            for (int i = 0; i < groupArray.size(); i++) {
                groupArray.remove(i+1);
            }
        } else {
            for (int i = 0; i < groupArray.size()-1; i++) {
                groupArray.remove(i+1);
            }
        }
        while (groupArray.size()!= 1) {
            if ((groupArray.size()%2 == 0)) {
                for (int i = 0; i < groupArray.size(); i++) {
                    groupArray.remove(i);
                }
            } else {
                for (int i = 0; i < groupArray.size()-1; i++) {
                    groupArray.remove(i+1);
                }
            }
        }
        return groupArray.size();
    }

}
