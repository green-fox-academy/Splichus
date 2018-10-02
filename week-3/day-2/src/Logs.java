import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        System.out.println(uniqueIP("log.txt"));
        System.out.println(getPostRatio("log.txt"));

    }
    public static List uniqueList (List list) {

        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    public static List uniqueIP (String path) {
        Path originalFile = Paths.get(path);
        ArrayList<String> ipSeparated = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(originalFile);
            for (String line : lines) {
                ipSeparated.add(ipSeparated.size(), line.substring(27, 39));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueList(ipSeparated);
    }

    public static double getPostRatio (String path) {
        Path originalFile = Paths.get(path);
        int get = 0;
        int post = 0;
        try {
            List<String> lines = Files.readAllLines(originalFile);
            for (String line : lines) {
                if (line.substring(41, 44).equals("GET")) {
                    get++;
                } else if (line.substring(41, 45).equals("POST")) {
                    post++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return get/(double)post;
    }
}
