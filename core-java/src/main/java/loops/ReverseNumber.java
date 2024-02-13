package loops;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the digits of the number
        int reversedNumber = reverseDigits(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Method to reverse the digits of a number
    private static int reverseDigits(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}

