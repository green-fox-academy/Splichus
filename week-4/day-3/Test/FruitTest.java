import org.junit.Test;

import static org.junit.Assert.*;

public class FruitTest {
    Fruit apple = new Fruit();

    @Test
    public void isApple() {
        assertEquals("apple", apple.getFruit());
    }
}