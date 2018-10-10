import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    static String string1 = "poklop";
    static String string2 = "olpokp";

    @Test
    public void isAnagram() {
        assertTrue(Anagram.isAnagram(string1, string2));
    }


}