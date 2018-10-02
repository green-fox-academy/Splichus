import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
    decrypt("dublicated-chars.txt");

    }
    public static void decrypt (String source) {
        Path path = Paths.get(source);

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                ArrayList<Character> lineToChar = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    lineToChar.add(line.charAt(i));
                }
                for (int i = 0; i < lineToChar.size(); i++) {
                    lineToChar.remove(i);
                }
                for (int i = 0; i < lineToChar.size(); i++) {
                    System.out.print(lineToChar.get(i));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}