import java.util.ArrayList;
import java.util.List;

public class Excercise10 {
    public static void main(String[] args) {
//        Create a Fox class with 3 properties(name, type, color)
//         Fill a list with at least 5 foxes, it's up to you how you name/create them!
//        Write a Stream Expression to find the foxes with green color!
//         Write a Stream Expression to find the foxes with green color and pallida type!

        List<Fox> foxes = new ArrayList<>();
        foxes.add(new Fox("Zrzka", "Blue", "pallida"));
        foxes.add(new Fox("Koule", "Red", "vulpes"));
        foxes.add(new Fox("Krychle", "Green", "pallida"));
        foxes.add(new Fox("Kvadr", "Yellow", "vulpes"));
        foxes.add(new Fox("Valec", "Orange", "pallida"));

        foxes.stream()
                .filter(fox -> fox.getColor().equals("Green"))
                .filter(fox -> fox.getType().equals("pallida"))
                .forEach(fox -> System.out.println(fox));
    }
}
