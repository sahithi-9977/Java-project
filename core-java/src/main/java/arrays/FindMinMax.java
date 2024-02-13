package arrays;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        System.out.println("Enter the array elements:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the largest and smallest numbers
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            } else if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the results
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
