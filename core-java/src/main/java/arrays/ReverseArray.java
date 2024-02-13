package arrays;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Reverse the array
        reverseArray(array);

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    // Method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end positions
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move to the next pair
            start++;
            end--;
        }
    }
}

