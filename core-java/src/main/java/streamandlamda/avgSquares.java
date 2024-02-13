package streamandlamda;

import java.util.Arrays;
import java.util.OptionalDouble;
//Given an array of Integers, write a program to find the average of squares of all the odd numbers.
public class avgSquares {
    public static OptionalDouble averageOfSquaresOfOddNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) // Filter odd numbers
                .map(n -> n * n) // Square each odd number
                .average(); // Calculate average
    }
}