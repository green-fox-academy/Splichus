import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArgumentHandler {

    Path database = Paths.get("database.txt");
    List<String> lines;
    {
        try {
            lines = Files.readAllLines(database);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String blankArgument () {
        return "Command line todo application\n" +
                "===========================\n" +
                "\n" +
                "Command line arguments: \n" +
                "-l  Lists all new tasks\n" +
                "-a [Task Name] Adds new task\n" +
                "-r [index] Removes a task\n" +
                "-c [index] Completes a task\n";
    }
    public void aArgument (String task) {
        try {
            this.lines.add(task);
            Files.write(database, this.lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String lArgument() {
        String toReturn = "";
        if (lines.size()==0) {
            toReturn="No todos for today! :)";
        }
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length()>7) {
                if (lines.get(i).subSequence(lines.get(i).length()-7, lines.get(i).length()).equals(";j3p2n1")){
                    toReturn+=i+1+" - [x] "+lines.get(i).subSequence(0, lines.get(i).length()-7)+"\n";
                } else {
                    toReturn += i + 1 + " - [ ] " + lines.get(i) + "\n";
                }
            } else {
                toReturn += i + 1 + " - [ ] " + lines.get(i) + "\n";
            }
        }
        return toReturn;
    }
    public void cArgument(int index) {
        try {
            String task = lines.get(index);
            task+=";j3p2n1";
            lines.set(index, task);
            Files.write(database, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void rArgument(int index) {
        lines.remove(index);
        try {
            Files.write(database, this.lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
