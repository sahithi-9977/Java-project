package string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class stringAnagramTest{
    //anagramStrings anagramStrings=new anagramStrings();

    @Test
    public void testAreAnagrams() {
        Assert.assertTrue(stringAnagram.areAnagrams("listen", "silent"));
        Assert.assertTrue(stringAnagram.areAnagrams("triangle", "integral"));

    }

    @Test
    public void testNotAnagrams() {
        assertFalse(stringAnagram.areAnagrams("hello", "world"));
        assertFalse(stringAnagram.areAnagrams("abc", "def"));
        assertFalse(stringAnagram.areAnagrams("Anagram", "NotAnagram"));
    }

    @Test
    public void testAnagramsIgnoreCase() {
        Assert.assertTrue(stringAnagram.areAnagrams("State", "Taste"));
        Assert.assertTrue(stringAnagram.areAnagrams("Car", "Rac"));
        Assert.assertTrue(stringAnagram.areAnagrams("Eleven plus two", "Twelve plus one"));
    }

    @Test
    public void testEmptyStrings() {
        Assert.assertTrue(stringAnagram.areAnagrams("", ""));
    }

    @Test
    public void testSpacesOnly() {
        Assert.assertTrue(stringAnagram.areAnagrams("   ", "   "));
    }

}
