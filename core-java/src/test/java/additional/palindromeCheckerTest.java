package additional;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


public class palindromeCheckerTest
{
    @Test

    public void testIsPalindrome(){
        assertTrue(palindromeChecker.isPalindome(12121));
        assertFalse(palindromeChecker.isPalindome(123));
        assertTrue(palindromeChecker.isPalindome(5));
        assertFalse(palindromeChecker.isPalindome(-12121));
        assertTrue(palindromeChecker.isPalindome(0));
    }
}
