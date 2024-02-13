package sets;
import java.util.LinkedHashSet;

public class duplicateCharacters {
    public static void main(String[] args) {
        String inputString = "hello world";
        String resultString = removeDuplicates(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String after removing duplicates: " + resultString);
    }

    public static String removeDuplicates(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Use LinkedHashSet to maintain insertion order and remove duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : charArray) {
            set.add(c);
        }

        // Convert the set back to a string
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }
}
