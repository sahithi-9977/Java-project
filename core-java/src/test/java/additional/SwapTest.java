package additional;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SwapTest {
    @Test
    public void testTwoNumbers(){
        int num1=10;
        int num2=5;
        Swap.swapTwoNumbersWithoutExternalVariable(num1,num2);
        assertEquals(5,num2);
        assertEquals(10,num1);
    }
}
