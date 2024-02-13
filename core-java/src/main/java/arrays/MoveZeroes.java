package arrays;
import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 0, 3, 12, 0, 8, 0, 5};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        moveZerosToEnd(numbers);
        System.out.println("Array after moving zeros to the end: " + Arrays.toString(numbers));
    }
    private static void moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
