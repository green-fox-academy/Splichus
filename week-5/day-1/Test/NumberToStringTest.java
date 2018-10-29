import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToStringTest {

    @Before
    public void startOnes() {
        NumberToString.startOnes();
        NumberToString.startTens();
    }
    @Test
    public void convertNumberToString() {

    }

    @Test
    public void tens() {
        assertEquals(NumberToString.tens(23), "Twenty Three");
    }
    @Test
    public void tensWithZero() {
        assertEquals(NumberToString.tens(0), "Zero");
    }
    @Test
    public void tensWithThousand() {
        assertEquals(NumberToString.hundreds(31234), "Only hundreds plox");
    }

    @Test
    public void hundreds() {
    }
}