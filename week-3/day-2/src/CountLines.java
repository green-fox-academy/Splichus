import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        System.out.println(countLines("my-file.txt"));
    }

    public static int countLines(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            return lines.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
