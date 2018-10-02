import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

    public static void main(String[] args) {
        decrypt("encoded-lines.txt");

//        char a = 'Z';
//
//        System.out.println((char)(a-1));
    }

    public static void decrypt (String source) {
        Path path = Paths.get(source);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                ArrayList<Integer> charsToAscii = new ArrayList<>();
                for (int i = 0; i < line.length(); i++) {
                    charsToAscii.add((int)line.charAt(i));
                    if (charsToAscii.get(i) != 32) {
                        charsToAscii.set(i, (charsToAscii.get(i) - 1));
                    }
                    System.out.print((((char)(int)charsToAscii.get(i))));
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
