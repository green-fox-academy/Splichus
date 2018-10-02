import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        copyFile("my-file.txt", "my-file2.txt");
    }

    public static boolean copyFile(String copyFrom, String copyTo) {
        Path originalFile = Paths.get(copyFrom);
        Path destinationFile = Paths.get(copyTo);

        try {
            List<String> lines = Files.readAllLines(originalFile);
            Files.write(destinationFile, lines);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
