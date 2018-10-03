import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Lottery {

    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
    bestNumbers("lottery.csv");

    }
    public static void bestNumbers(String source) {
        Path path = Paths.get(source);

        try {
            List<String> lines = Files.readAllLines(path);
            ArrayList<Integer> numbersFromLines = new ArrayList<>();
            for (String line : lines) {
                for (int i = line.lastIndexOf("Ft;")+2; i < line.length()-1; i++) {
                    if (Character.isDigit(line.charAt(i)) && Character.isDigit(line.charAt(i+1))){
                        String numberToTake = ""+line.charAt(i)+line.charAt(i+1);
                        numbersFromLines.add(Integer.valueOf(numberToTake));
                        i++;
                    } else if (Character.isDigit(line.charAt(i))) {
                        String numberToTake = ""+line.charAt(i);
                        numbersFromLines.add(Integer.valueOf(numberToTake));
                    }

                }
            }

            ArrayList<Integer> frequency = new ArrayList<>();
            frequency.add(0);
            for (int i = 1; i <= 90 ; i++) {
                frequency.add(Collections.frequency(numbersFromLines, i));
            }
            ArrayList<Integer> finalFive = new ArrayList<>();
            for (int i = 0; i < 5 ; i++) {
                finalFive.add(frequency.indexOf(Collections.max(frequency)));
                frequency.set(frequency.indexOf(Collections.max(frequency)), 0);
            }
            System.out.println(finalFive);
//            Map<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i <= 90 ; i++) {
//                map.put(i+1, Collections.frequency(numbersFromLines, i+1));
//                System.out.println(i+" = "+map.get(i));
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}