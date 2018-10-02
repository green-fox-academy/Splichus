import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        decrypt("reversed-order.txt");

    }
    public static void decrypt (String source) {
        Path path = Paths.get(source);

        try {
            List<String> lines = Files.readAllLines(path);
            Collections.reverse(lines);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}