import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void returnsRightFibonacci () {
        assertEquals(1597, Fibonacci.fibonacci(17));
    }


}