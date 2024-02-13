package streamandlamda;

import java.util.Arrays;

public class StringsContainingVowels {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "apple", "banana", "orange"};

        // Iterate over the array of strings using streams
        Arrays.stream(strings)
                // Filter strings that contain at least one vowel
                .filter(str -> containsVowels(str))
                // Print each string along with the vowel count
                .forEach(str -> {
                    int vowelCount = countVowels(str);
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });
    }

    // Function to check if a string contains at least one vowel
    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    // Function to count the number of vowels in a string
    private static int countVowels(String str) {
        return (int) str.chars().mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiou".contains(String.valueOf(ch)))
                .count();
    }
}
