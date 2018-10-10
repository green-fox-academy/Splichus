import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
    Map dictionary = new HashMap<>();

    @Before
    public void testMap () {
        dictionary.put("a", 2);
        dictionary.put("b", 1);
        dictionary.put("c", 3);
    }

    @Test
    public void returnsTheRightMap () {
        assertEquals(dictionary, CountLetters.countLetters("abccac"));
    }


}