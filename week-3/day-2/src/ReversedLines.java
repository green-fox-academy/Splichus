import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        decrypt("reversed-lines.txt");


    }
    public static void decrypt (String source) {
        Path path = Paths.get(source);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                ArrayList<Character> chars = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    chars.add(line.charAt(line.length()-1-i));
                }
                for (int i = 0; i < chars.size(); i++) {
                    System.out.print(chars.get(i));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}