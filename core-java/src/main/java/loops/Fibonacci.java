package loops;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Print Fibonacci Series up to N
        System.out.println("Fibonacci Series up to " + N + " terms:");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate Fibonacci number
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

