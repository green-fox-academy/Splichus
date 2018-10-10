import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    ArrayList<Integer> test = new ArrayList<>();
    @Before
    public void testAdd() {
        test.add(1);
        test.add(2);
    }

    @Test
    public void sumingCorrectly () {
        assertEquals(3, Sum.sum(test));
    }

}