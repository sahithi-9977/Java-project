package additional;
import java.util.HashMap;
import java.util.Map;

public class Uniquewords {

    public static void main(String[] args) {
        String inputString = "Hello world! This is a sample string. Hello world!";

        Map<String, Integer> wordCountMap = countUniqueWords(inputString);

        System.out.println("Number of unique words: " + wordCountMap.size());
        System.out.println("Word count map: " + wordCountMap);
    }

    public static Map<String, Integer> countUniqueWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the words and update the word count in the map
        for (String word : words) {
            // Convert the word to lowercase to ignore case sensitivity
            String lowercaseWord = word.toLowerCase();


            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        return wordCountMap;
    }
}