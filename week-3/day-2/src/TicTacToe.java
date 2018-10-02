import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.

        System.out.println(ticTacResult("win-o.txt"));
        // should print O

        System.out.println(ticTacResult("win-x.txt"));
        // should print X

        System.out.println(ticTacResult("draw.txt"));
        // should print draw
    }

    public static String ticTacResult (String path) {
        Path source = Paths.get(path);
        try {
            List<String> lines = Files.readAllLines(source);
            for (int i = 0; i < lines.size(); i++) {
                if (lines.get(i).charAt(0) == lines.get(i).charAt(1) && lines.get(i).charAt(0) == lines.get(i).charAt(2)) {
                    return String.valueOf(lines.get(i).charAt(0));
                }
                else if (lines.get(0).charAt(i) == lines.get(1).charAt(i) && lines.get(0).charAt(i) == lines.get(2).charAt(0)) {
                    return String.valueOf(lines.get(0).charAt(i));
                }
            }
            if (lines.get(0).charAt(0) == lines.get(1).charAt(1) && lines.get(2).charAt(2) == lines.get(0).charAt(0) ||
                lines.get(0).charAt(2) == lines.get(1).charAt(1) && lines.get(2).charAt(0) == lines.get(0).charAt(2)) {
                    return String.valueOf(lines.get(1).charAt(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "draw";
    }
}