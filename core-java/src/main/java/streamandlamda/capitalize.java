package streamandlamda;

import java.util.Arrays;

public class capitalize {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry", "date", "grape"};

        // Capitalize the first letter of each string using streams and lambda
        String[] capitalizedArray = Arrays.stream(stringArray)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toArray(String[]::new);

        // Sort the strings in alphabetical order
        Arrays.sort(capitalizedArray);

        // Print the capitalized and sorted strings
        System.out.println("Capitalized and Sorted Strings:");

        Arrays.stream(capitalizedArray).forEach(System.out::println);
    }
}

