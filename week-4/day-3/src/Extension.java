import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {
    int add(int a, int b) {
        return a+b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (c > a && c > b)
            return c;
        else {
            return b;
        }
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        if (pool.size()%2 == 0) {
            return (pool.get((int)(pool.size()/2-1)) + pool.get((int)(pool.size()/2)))/2.0;
        } else {
            return pool.get((int)(pool.size()/2));
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i', 'y', 'A', 'E', 'I', 'O', 'U', 'Y').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                i+=2;
                length+=2;
                if (i == length-1){
                    teve = teve+"v"+c;
                } else {
                    teve = String.join(c + "v" + c, teve.split(""+c));
                }
            }
        }
        return teve;
    }
}