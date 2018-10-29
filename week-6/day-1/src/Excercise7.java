import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Excercise7 {
    public static void main(String[] args) {
        String s = "aaabbbsssso";
        List<Character> string = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            string.add(s.charAt(i));
//            if (characters.containsKey(s.charAt(i))){
//                characters.put(s.charAt(i), characters.get(s.charAt(i))+1);
//            } else {
//                characters.put(s.charAt(i), 1);
//            }
        }


        Map<Character, Long> characters = string.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characters.get('b'));
    }
}
