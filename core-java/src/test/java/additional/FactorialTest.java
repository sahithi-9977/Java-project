package additional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FactorialTest {
    @Test
    public void testFactorialForZeroOne(){
        assertEquals(1,Factorial.factorialOfNumber(0));
        assertEquals(1,Factorial.factorialOfNumber(1));
    }

    @Test
    public void testFactorialForLessThanZero(){
        assertEquals(-1,Factorial.factorialOfNumber(-1));
        assertEquals(-1,Factorial.factorialOfNumber(-10));
    }

    @Test
    public void testFactorialForNumber(){
        assertEquals(120,Factorial.factorialOfNumber(5));
        assertEquals(3628800,Factorial.factorialOfNumber(10));
    }

}