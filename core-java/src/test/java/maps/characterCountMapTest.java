package maps;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;

public class characterCountMapTest {

    @Test
    public void testCountingMap() {
        // Test case 1: Empty string
        String input1 = "";
        HashMap<Character, Integer> result1 = characterCountMap.countingMap(input1);
        assertTrue(result1.isEmpty());
        assertFalse(result1.containsKey("x"));
    }
    @Test
    public void teststringCountingMap(){

        String input2 = "hello";
        HashMap<Character, Integer> result2 = characterCountMap.countingMap(input2);
        assertEquals(4, result2.size());
        assertEquals(1, result2.get('h'));
        assertEquals(1, result2.get('e'));
        assertEquals(2, result2.get('l'));
        assertEquals(1, result2.get('o'));
        assertFalse(result2.containsKey("x"));


        String input4 = "hello world";
        HashMap<Character, Integer> result4 = characterCountMap.countingMap(input4);
        assertEquals(8, result4.size());
        assertEquals(1, result4.get('h'));
        assertEquals(1, result4.get('e'));
        assertEquals(3, result4.get('l'));
        assertEquals(2, result4.get('o'));
        assertEquals(1, result4.get('w'));
        assertEquals(1, result4.get('r'));
        assertEquals(1, result4.get('d'));
        assertFalse(result4.containsKey("x"));


    }
    @Test
    public void testCasesensitivecountMap(){
        String input3 = "helLO world";
        HashMap<Character, Integer> result3 = characterCountMap.countingMap(input3);
        assertEquals(10, result3.size());
        assertEquals(1, result3.get('h'));
        assertEquals(1, result3.get('e'));
        assertEquals(2, result3.get('l'));
        assertEquals(1, result3.get('o'));
        assertEquals(1, result3.get('w'));
        assertEquals(1, result3.get('r'));
        assertEquals(1, result3.get('d'));
        assertEquals(1, result3.get('O'));
        assertEquals(1, result3.get('L'));
        assertFalse(result3.containsKey("x"));

    }
}