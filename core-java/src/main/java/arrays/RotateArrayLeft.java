package arrays;
import java.util.Arrays;
public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int positionsToRotate = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateLeft(arr, positionsToRotate);

        System.out.println("Array after rotating left by " + positionsToRotate + " positions: " + Arrays.toString(arr));
    }

    // Method to rotate the array left by x positions using reversal algorithm
    private static void rotateLeft(int[] arr, int x) {
        int n = arr.length;

        // Rotate the array using reversal algorithm
        reverseArray(arr, 0, x - 1);
        reverseArray(arr, x, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Method to reverse a subarray within the specified range
    private static void reverseArray(int[] arr, int start, int end) {
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
